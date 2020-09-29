package com.soft1851.alibaba.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName ContentHello
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/23
 **/
@RestController
@RequestMapping(value = "/content")
public class ContentHello {
    @Resource
    private RestTemplate restTemplate;
    @GetMapping(value = "/call")
    public  String getHello(){
        return restTemplate.getForObject("http://localhost:9204/user/hello",String.class);
    }
}