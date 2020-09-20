package com.soft1851.study.controller;

import com.soft1851.study.entity.Student;
import com.soft1851.study.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author 田震
 * @version 1.0.0
 * @ClassName StudentController.java
 * @Description TODO
 * @createTime 2020年09月16日 15:55:00
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/find/{id}")
    public Optional<Student> findById(@PathVariable int id) {
        return studentService.findById(id);
    }

}
