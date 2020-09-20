package com.soft1851.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 田震
 * @Date 2020/9/13 15:45
 * @Description 启动主类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHelloApplication.class,args);

    }

    /**
     * 创建RestTemplate 实列并通过@Bean注解到IoC容器中
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
