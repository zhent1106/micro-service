package com.soft1851.coursecenter.service;

import com.soft1851.coursecenter.dao.CourseMapper;
import com.soft1851.coursecenter.domain.entity.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CourseService
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/18
 **/
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseMapper courseMapper;

    public List<Course> findAll(){
        return courseMapper.selectAll();
    }
}