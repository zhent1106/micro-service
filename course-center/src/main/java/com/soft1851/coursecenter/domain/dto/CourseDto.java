package com.soft1851.coursecenter.domain.dto;

import com.soft1851.coursecenter.domain.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CourseDto
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/18
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDto {
    private Course course;
    private String userName;
    private String avatarUrl;
}