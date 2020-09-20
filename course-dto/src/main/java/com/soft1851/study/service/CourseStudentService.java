package com.soft1851.study.service;

import com.soft1851.study.entity.StudentCourse;

import java.util.List;

/**
 * @author 田震
 * @version 1.0.0
 * @ClassName CourseStudentService.java
 * @Description TODO
 * @createTime 2020年09月16日 16:12:00
 */
public interface CourseStudentService {
    /**
     * 根据学生Id查询对应的课程
     * @param id
     * @return
     */
    List<StudentCourse> findCourseByUserId(int id);
}
