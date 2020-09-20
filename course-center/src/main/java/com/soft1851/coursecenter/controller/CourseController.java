package com.soft1851.coursecenter.controller;

import com.soft1851.coursecenter.common.ResponseResult;
import com.soft1851.coursecenter.domain.dto.CourseDto;
import com.soft1851.coursecenter.domain.dto.UserDto;
import com.soft1851.coursecenter.domain.entity.Course;
import com.soft1851.coursecenter.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseController
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/18
 **/
@RestController
@RequestMapping(value = "/course")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {

    private final CourseService courseService;

    private final RestTemplate restTemplate;


    @GetMapping(value = "/all")
    public ResponseResult getAll(){
        List<Course> courses = courseService.findAll();
        List<CourseDto> courseDtoList = new ArrayList<>();
        courses.forEach(course -> {
            int userId = course.getUserId();
            UserDto userDto = restTemplate.getForObject("http://localhost:8081/user/{id}", UserDto.class,userId);
            assert userDto != null;
            CourseDto courseDto = CourseDto.builder().course(course).userName(userDto.getUserName()).avatarUrl(userDto.getAvatarUrl()).build();
            courseDtoList.add(courseDto);
        });
        return new ResponseResult(200,"请求成功",courseDtoList);
    }
    @GetMapping(value = "python")
    public  ResponseResult getPython(){
        return  new ResponseResult(200,"请求成功",restTemplate.getForEntity("http://127.0.0.1:5001/hello", String.class).getBody());
    }
}