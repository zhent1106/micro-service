package com.soft1851.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author 田震
 * @version 1.0.0
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2020年09月10日 08:07:00
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    /**
     * 课程序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pkCourseId;

    /**
     * 课程名称
     */
    @Column(nullable = false, length = 32)
    private String courseName;
}
