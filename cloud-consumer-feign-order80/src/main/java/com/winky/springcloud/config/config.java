package com.winky.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Logger;


/**
 * @auther Li Wenjie
 * @create 2022-01-12 15:35
 */
@Configuration
public class config {
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
