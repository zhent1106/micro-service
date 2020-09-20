package com.soft1851.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 田震
 */
@SpringBootApplication
@MapperScan(basePackages = "com.soft1851.usercenter.dao") // 注意，要换成 tk 提供的 @MapperScan 注解
public class UsercenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercenterApplication.class, args);
    }

}
