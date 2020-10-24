package com.gloryh.repository.impl;

import com.gloryh.entity.Student;
import com.gloryh.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 学生实体类CRUD操作接口实现类
 *
 * @author 黄光辉
 * @since 2020/10/16
 **/
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    /**
     * 使用 Map 集合的方式代替数据库
     */
    private static Map<Long, Student> studentMap;
    static {
        studentMap=new HashMap<>();
        studentMap.put(1L, new Student(1L,"张三",20));
        studentMap.put(2L, new Student(2L,"李四",21));
        studentMap.put(3L, new Student(3L,"王五",22));
    }
    /**
     * 查询所有学生信息
     *
     * @return Student集合
     */
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    /**
     * 按照 id 查询学生信息
     *
     * @param id
     * @return 学生实体类
     */
    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    /**
     * 对学生信息进行 添加和修改
     *
     * @param student
     */
    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    /**
     * 按 id 删除学生信息
     *
     * @param id
     */
    @Override
    public void delete(long id) {
        studentMap.remove(id);
    }
}
