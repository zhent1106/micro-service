package com.soft1851.study.service;


import com.soft1851.study.entity.Student;

import java.util.Optional;

/**
 * @author 田震
 * @version 1.0.0
 * @ClassName StudentService.java
 * @Description TODO
 * @createTime 2020年09月16日 14:49:00
 */
public interface StudentService {
    /**
     * 根据Id获取用户信息
     * @param id
     * @return
     */
    Optional<Student> findById(int id);
}
