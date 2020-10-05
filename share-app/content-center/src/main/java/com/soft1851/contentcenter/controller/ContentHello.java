package com.soft1851.contentcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName
 * @Description TODO
 * @Author zhent
 * @Date
 **/
@RestController
@RequestMapping(value = "/content")
public class ContentHello {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/call")
    public String getHello(){
        return restTemplate.getForObject("http://localhost:8082/user/hello",String.class);
    }
}
