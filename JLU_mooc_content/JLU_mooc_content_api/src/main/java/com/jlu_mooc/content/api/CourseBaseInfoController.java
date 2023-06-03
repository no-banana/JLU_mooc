package com.jlu_mooc.content.api;

import com.jlu_mooc.base.model.PageParams;
import com.jlu_mooc.base.model.PageResult;
import com.jlu_mooc.content.model.dto.QueryCourseParamsDto;
import com.jlu_mooc.content.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "课程信息管理接口", tags = "课程信息管理接口") // 用于swagger接口文档的注解
@RestController //相当于整合@Responsebody和@Controller两个注解
public class CourseBaseInfoController {
    // RequestBody的参数不是必须要添加的，因为分页查询时可以不带具体课程信息的查询条件，因此将required改为false
    @ApiOperation(value = "课程查询接口")
    @PostMapping ("/course/list") // Restful请求注解
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto) {
        return null;
    }
}
