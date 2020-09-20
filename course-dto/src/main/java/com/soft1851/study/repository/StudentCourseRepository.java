package com.soft1851.study.repository;

import com.soft1851.study.entity.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 田震
 * @version 1.0.0
 * @ClassName StudentRepository.java
 * @Description TODO
 * @createTime 2020年09月16日 14:52:00
 */
public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer> {

    List<StudentCourse> findStudentCoursesByStudentIdEquals(int id);
}
