package com.gloryh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.HealthAggregator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * Zipkin 启动类
 *
 * @author 黄光辉
 * @since 2020/10/25
 **/
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class,args);
    }
}
