package org.example.apifox_helper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * apifox helper api上传演示响应结果
 */
@Data
@AllArgsConstructor
public class ApifoxHelperDataDto {
    /**
     * id
     */
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
}
