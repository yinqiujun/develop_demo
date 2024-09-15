package org.example.lombok_demo.controller;

import org.example.lombok_demo.dto.LombokDemoDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * LombokDemo controller
 */
@RestController
public class LombokDemoController {

    /**
     * 测试Lombok请求参数接收
     */
    @PostMapping("/testLombok")
    public LombokDemoDto testLombok(@RequestBody LombokDemoDto lombokDemoDto) {
        return lombokDemoDto;
    }
}
