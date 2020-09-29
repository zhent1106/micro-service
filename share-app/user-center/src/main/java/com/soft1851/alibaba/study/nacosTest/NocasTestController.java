package com.soft1851.alibaba.study.nacosTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName NocasTestController
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/23
 **/
@RestController
@Slf4j
public class NocasTestController {
    @GetMapping("/nocas")
    public  String getNacos(){
        return  "hello nacos";
    }
}