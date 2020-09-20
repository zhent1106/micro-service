package com.soft1851.coursecenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PythonDto
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/20
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PythonDto {
    private  Integer helloId;
    private String info;

}