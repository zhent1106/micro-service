package com.soft1851.cloud.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/9
 **/
@RestController
@RequestMapping(value = "/hello")

public class HelloController {
 @GetMapping()
    public String getHello(){
     return "hello Spring Cloud ,I'm zhent";
 }
}