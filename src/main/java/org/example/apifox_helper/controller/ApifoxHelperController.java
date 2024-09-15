package org.example.apifox_helper.controller;

import org.example.apifox_helper.dto.ApifoxHelperDataDto;
import org.example.apifox_helper.dto.ApifoxHelperDto;
import org.example.apifox_helper.dto.ApifoxHelperResDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * apifox helper api上传演示接口
 */
@RestController
public class ApifoxHelperController {

    /**
     * 测试apifox helper上传接口
     *
     * @param apifoxHelperDto 请求参数
     * @param name            返回对象需要的name参数
     * @param age             返回对象需要的age参数
     */
    @PostMapping("/testApifoxHelperUpload")
    public ApifoxHelperResDto<ApifoxHelperDataDto> testApifoxHelperUpload(@RequestBody ApifoxHelperDto apifoxHelperDto, @RequestParam String name, @RequestParam Integer age) {
        System.out.println(apifoxHelperDto.getApifoxHelper() + apifoxHelperDto.getApifoxHelperDesc());
        ApifoxHelperDataDto apifoxHelperDataDto = new ApifoxHelperDataDto(apifoxHelperDto.getId(), name, age);
        ApifoxHelperResDto<ApifoxHelperDataDto> result = new ApifoxHelperResDto<>();
        result.setData(apifoxHelperDataDto);
        return result;
    }
}
