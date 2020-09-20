package com.soft1851.cloud.study.controller;

import com.soft1851.cloud.study.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @Author 田震
 * @Date 2020/9/13 15:33
 * @Description
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @GetMapping(value = "/one")
    public Student getOneStudent() {
        return new Student(18, "田震");

    }
    @GetMapping(value = "/list")
    public List<Student> getStudentList() {
        Student[] students = new Student[] {
                new Student(1,"小明"),
                new Student(2, "张三"),
                new Student(3,"李四")
        };
        return Arrays.asList(students);
    }

}
