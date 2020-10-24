package com.gloryh.repository;

import com.gloryh.entity.Student;

import java.util.Collection;

/**
 * 学生实体类CRUD操作接口
 *
 * @author 黄光辉
 * @since 2020/10/16
 **/
public interface StudentRepository {
    /**
     * 查询所有学生信息
     *
     * @return Student集合
     */
    public Collection<Student> findAll();

    /**
     * 按照 id 查询学生信息
     *
     * @param id
     * @return 学生实体类
     */
    public Student findById(long id);

    /**
     * 对学生信息进行 添加和修改
     *
     * @param student
     */
    public void saveOrUpdate(Student student);

    /**
     * 按 id 删除学生信息
     *
     * @param id
     */
    public void delete(long id);
}
