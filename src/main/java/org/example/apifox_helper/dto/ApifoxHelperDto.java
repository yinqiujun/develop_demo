package org.example.apifox_helper.dto;

import lombok.Data;

/**
 * apifox helper api上传演示dto
 */
@Data
public class ApifoxHelperDto {
    /**
     * id
     */
    private Long id;
    /**
     * apifox helper
     */
    private String apifoxHelper;
    /**
     * 详情
     */
    private String apifoxHelperDesc;
}
