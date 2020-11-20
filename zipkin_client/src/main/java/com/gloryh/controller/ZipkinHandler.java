package com.gloryh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Zipkin controller
 *
 * @author 黄光辉
 * @since 2020/10/25
 **/
@RestController
@RequestMapping("/zipkin")
public class ZipkinHandler {
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "端口号为："+this.port;
    }
}
