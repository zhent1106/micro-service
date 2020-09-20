package com.soft1851.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName CourseDtoMain
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/16
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CourseDtoMain {
    public static void main(String[] args) {
        SpringApplication.run(CourseDtoMain.class, args);

    }
    /**
     * 创建 RestTemplate 实例并通过 @Bean 注解注入到 Ioc 容器中
     *
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}