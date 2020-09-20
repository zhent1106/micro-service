package com.soft1851.study.repository;

import com.soft1851.study.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 田震
 * @version 1.0.0
 * @ClassName StudentRepository.java
 * @Description TODO
 * @createTime 2020年09月16日 14:52:00
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
