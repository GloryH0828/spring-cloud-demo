package com.gloryh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Zipkin Client 启动类
 *
 * @author 黄光辉
 * @since 2020/10/25
 **/
@SpringBootApplication
public class ZipkinClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class,args);
    }
}
