package com.gloryh.controller;

import com.gloryh.entity.Student;
import com.gloryh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * 学生实体类前后端交互方法类
 *
 * @author 黄光辉
 * @since 2020/10/16
 **/
@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        studentRepository.delete(id);
    }

    @Value("${server.port}")
    private String port;
    /**
     * 返回当前的端口
     *
     * @return 端口号
     */
    @GetMapping("/index")
    public String index() {
        return "当前的端口号是："+this.port;
    }
}
