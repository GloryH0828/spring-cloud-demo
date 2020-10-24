package com.gloryh.entity.feign.impl;

import com.gloryh.entity.Student;
import com.gloryh.entity.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * FeignProviderClient 接口实现类
 *
 * @author 黄光辉
 * @since 2020/10/19
 **/
@Component
public class FeignError implements FeignProviderClient {
    /**
     * 查询所有学生信息
     *
     * @return 学生信息集合
     */
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    /**
     * 返回端口号
     *
     * @return String
     */
    @Override
    public String index() {
        return "服务器维护中...";
    }
}
