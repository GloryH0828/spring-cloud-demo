package com.gloryh.controller;

import com.gloryh.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * 服务消费者前后端交互方法类
 *
 * @author 黄光辉
 * @since 2020/10/17
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        //调用服务提供者（eureka_client）模块 的 findAll方法
        //getForEntity()方法需要两个参数，一个是需要调用的url，另一个是返回的类型
        //由于getEntity（）方法会对返回类型进行对应实体类转换，所以需要使用其getBody()方法进行转换
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Student> findAll2() {
        //调用服务提供者（eureka_client）模块 的 findAll方法
        //getForObject()方法需要两个参数，一个是需要调用的url，另一个是返回的类型
        //由于getObject()方法的返回值就是泛型类，不需要调用getBody()方法
        return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id) {
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id).getBody();
    }

    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable("id") Long id) {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://localhost:8010/student/save", student, null).getBody();
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Student student) {
        restTemplate.postForObject("http://localhost:8010/student/save", student, Student.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://localhost:8010/student/update", student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        restTemplate.delete("http://localhost:8010/student/delete/{id}", id);
    }
}
