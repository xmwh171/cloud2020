package com.atguigu.springcloud;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther zzyy
 * @create 2020-02-20 9:40
 */
@Configuration
public class FeignConfig {
    /**
     * NONE,
     * BASIC,
     * HEADERS,
     * FULL;
     * <p>
     * 日志级别
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
