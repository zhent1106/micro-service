package com.soft1851.study.service.impl;

import com.soft1851.study.entity.StudentCourse;
import com.soft1851.study.repository.StudentCourseRepository;
import com.soft1851.study.service.CourseStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 田震
 * @version 1.0.0
 * @ClassName CourseStudentServiceImpl.java
 * @Description TODO
 * @createTime 2020年09月16日 16:13:00
 */
@Service
public class CourseStudentServiceImpl implements CourseStudentService {

    @Resource
    private StudentCourseRepository studentCourseRepository;
    @Override
    public List<StudentCourse> findCourseByUserId(int id) {
        return studentCourseRepository.findStudentCoursesByStudentIdEquals(id);
    }
}
