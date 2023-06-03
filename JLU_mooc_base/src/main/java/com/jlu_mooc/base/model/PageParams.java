package com.jlu_mooc.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 分页查询条件参数存储模型
 */
@Data
@ToString
public class PageParams {
    //当前页码
    @ApiModelProperty(value = "页码")
    private Long pageNo = 1L;

    //每页记录数默认值
    @ApiModelProperty(value = "单页显示数目")
    private Long pageSize =10L;

    public PageParams(){

    }
    public PageParams(long pageNo,long pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
