package com.soft1851.alibaba.study.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/23
 **/
@RestController
@Slf4j
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Resource
    private  RestTemplate restTemplate;
    @GetMapping("/discovery")
public List<ServiceInstance> getInstances(){
        return  this.discoveryClient.getInstances("user-center");

    }
    @GetMapping("/call/hello")
    public  String callUserCenter(){
        List<ServiceInstance> instances=discoveryClient.getInstances("user-center");
       //stream编程，lambda表达式，函数式编程
        String targetUrl=
                instances.stream().map(instance->instance.getUri().toString()+"/user/hello")
                        .findFirst().orElseThrow(()->new IllegalArgumentException("当前没有实例"));
        log.info("请求的目标地址：{}",targetUrl);
        return restTemplate.getForObject(targetUrl,String.class);
    }
@GetMapping("/call/random")
public String callRandom() {
    //用户中心所有的实例信息
    List<ServiceInstance> instances = discoveryClient.getInstances("user-center");
   List<String> targetUrls=instances.stream().map(instance->instance.getUri().toString()+"/user/hello").collect(Collectors.toList());
   int i= ThreadLocalRandom.current().nextInt(targetUrls.size());
    log.info("请求的目标地址：{}",targetUrls);
    return restTemplate.getForObject(targetUrls.get(i),String.class);
}
@GetMapping(value = "call/ribbon")
    public  String callByRibbon(){
        return  restTemplate.getForObject("http://user-center/user/hello",String.class);
}
}