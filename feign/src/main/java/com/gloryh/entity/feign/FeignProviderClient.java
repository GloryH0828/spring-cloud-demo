package com.gloryh.entity.feign;

import com.gloryh.entity.Student;
import com.gloryh.entity.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * Feign service interface
 *
 * @author 黄光辉
 * @since 2020/10/19
 **/
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {
    /**
     * 查询所有学生信息
     * @return 学生信息集合
     */
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    /**
     * 返回端口号
     * @return String
     */
    @GetMapping("/student/index")
    public String index();
}
