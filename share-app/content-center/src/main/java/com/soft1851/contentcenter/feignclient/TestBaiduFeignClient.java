package com.soft1851.contentcenter.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName TestBaiduFeignClient
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/30
 **/
@FeignClient(name = "baidu",url = "http://www.baidu.com")
public interface TestBaiduFeignClient {
    @GetMapping("")
    String index();
}