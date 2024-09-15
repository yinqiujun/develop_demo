package org.example.lombok_demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * LombokDemo dto
 */
@Data
public class LombokDemoDto {

    private String name;
    private Integer age;
    private String CName;
    @JsonProperty("cAge")
    private Integer CAge;

    public void setcName(String CName) {
        this.CName = CName;
    }

}