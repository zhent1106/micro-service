package com.soft1851.study.controller;

import com.soft1851.study.entity.Course;
import com.soft1851.study.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author 田震
 * @version 1.0.0
 * @ClassName CourseController.java
 * @Description TODO
 * @createTime 2020年09月16日 16:21:00
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Resource
    private CourseService courseService;

    /**
     * 根据课程id查询课程信息
     * @param id
     * @return
     */
    @GetMapping("/findCoursesById/{id}")
    public Optional<Course> findCoursesById(@PathVariable int id) {
        return courseService.findById(id);
    }
}
