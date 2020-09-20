package com.soft1851.study.service.impl;

import com.soft1851.study.entity.Student;
import com.soft1851.study.repository.StudentRepository;
import com.soft1851.study.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author 田震
 * @version 1.0.0
 * @ClassName StudentServiceImpl.java
 * @Description TODO
 * @createTime 2020年09月16日 14:50:00
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;
    @Override
    public Optional<Student> findById(int id) {
        return studentRepository.findById(id);
    }
}
