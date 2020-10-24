package com.gloryh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Cloud Config 远程配置客户端启动类
 *
 * @author 黄光辉
 * @since 2020/10/24
 **/
@SpringBootApplication
public class ConfigurationClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigurationClientApplication.class,args);
    }
}
