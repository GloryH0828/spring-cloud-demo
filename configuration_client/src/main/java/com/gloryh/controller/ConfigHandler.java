package com.gloryh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用于对读取到的配置信息输入
 *
 * @author 黄光辉
 * @since 2020/10/24
 **/
@RestController
@RequestMapping("/config")
public class ConfigHandler {
    //读取端口号
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "该服务的端口号为："+this.port;
    }
}
