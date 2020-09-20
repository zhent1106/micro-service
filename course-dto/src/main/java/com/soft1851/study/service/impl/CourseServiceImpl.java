package com.soft1851.study.service.impl;

import com.soft1851.study.entity.Course;
import com.soft1851.study.repository.CourseRepository;
import com.soft1851.study.service.CourseService;
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
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseRepository courseRepository;

    @Override
    public Optional<Course> findById(int id) {
        return courseRepository.findById(id);
    }
}
