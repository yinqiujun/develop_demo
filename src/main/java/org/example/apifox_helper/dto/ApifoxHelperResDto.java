package org.example.apifox_helper.dto;

import lombok.Data;

/**
 * apifox helper返回结果封装类
 */
@Data
public class ApifoxHelperResDto<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 响应数据
     */
    private T data;
}
