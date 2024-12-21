package com.xuecheng.base.model;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description 分页查询通用参数
 * @author sinarcsinx
 * @date 2024/12/21 14:02
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PageParams {
  @ApiModelProperty("当前页码")
  private Long pageNo = 1L;
  @ApiModelProperty("每页记录数默认值")
  private Long pageSize =30L;
}
