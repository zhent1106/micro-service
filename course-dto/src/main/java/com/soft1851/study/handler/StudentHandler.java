package com.soft1851.study.handler;

import com.soft1851.study.entity.Course;
import com.soft1851.study.entity.Student;
import com.soft1851.study.entity.StudentCourse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 田震
 * @version 1.0.0
 * @ClassName StudentHandler.java
 * @Description TODO
 * @createTime 2020年09月13日 16:29:00
 */

@RequestMapping()
@RestController
public class StudentHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/findCoursesByStudentId/{id}")
    public Map getCoursesByStudentId(@PathVariable int id){
        Map map = new HashMap();
        Map data = new HashMap();
        map.put("code", 200);
        map.put("msg", "成功");
        map.put("data", data);
        /**
         * 根据学生id查询学生信息
         * 根据学生id查询课表
         * 根据课表id查询课程名称
         */
        Student student = restTemplate.getForObject("http://zhent.com:8006/student/find/" + id, Student.class);
        data.put("name", student.getName());
        data.put("age", student.getAge());

        StudentCourse[] studentCourses = restTemplate.getForObject("http://zhent.com:8007/studentCourse/findStudentCoursesById/" + student.getPkStudentId(), StudentCourse[].class);
        List courses = new ArrayList();
        for (StudentCourse studentCourse : studentCourses) {
            Course course = restTemplate.getForObject("http://zhent.com:8007/course/findCoursesById/" + studentCourse.getCourseId(), Course.class);
            courses.add(course.getCourseName());
            courses.add(student.getName());
        }
        data.put("courses", courses);
        data.put("studentName",student.getName());

        return map;
    }
}
