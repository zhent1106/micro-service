package com.soft1851.contentcenter.feignclient;

import com.soft1851.contentcenter.domain.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName TestUserCenterFeignClient
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/30
 **/
@FeignClient(name = "user-center")
public interface TestUserCenterFeignClient {
    /**
     * 多参数查询
     * @param userDto
     * @return
     */
    @GetMapping("/users/q")
    UserDto query(@SpringQueryMap UserDto userDto);
}