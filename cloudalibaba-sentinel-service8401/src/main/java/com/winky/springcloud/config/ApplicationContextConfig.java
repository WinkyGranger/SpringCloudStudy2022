package com.winky.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther Li Wenjie
 * @create 2022-01-07 21:02
 */
@Configuration
public class ApplicationContextConfig {
    //applicationContrxt.xml <bean id="" class="">
    @Bean
    @LoadBalanced//该注解赋予负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
