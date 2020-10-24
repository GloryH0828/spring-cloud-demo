package com.gloryh.controller;

import com.gloryh.entity.Student;
import com.gloryh.entity.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Hystrix 数据监控 前后端交互方法类
 *
 * @author 黄光辉
 * @since 2020/10/19
 **/
@RestController
@RequestMapping("/hystrix")
public class FeignHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}
