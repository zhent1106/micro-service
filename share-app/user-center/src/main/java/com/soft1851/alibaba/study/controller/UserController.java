package com.soft1851.alibaba.study.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/23
 **/
@RestController
@Slf4j
@RequestMapping(value = "/user")
public class UserController {
    @GetMapping("/hello")
    public String getHello()
    {
        log.info(("我被调用了...."));
        return "Hello,this message is from user-center";
    }
}