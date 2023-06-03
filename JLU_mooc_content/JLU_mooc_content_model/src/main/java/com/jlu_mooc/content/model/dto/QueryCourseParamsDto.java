package com.jlu_mooc.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * dto 表示数据传输对象 data transfer object
 */
@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
