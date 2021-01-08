package com.ms.ms.config.client.vo;

import lombok.Data;

@Data
public class UserVo {
    public UserVo(String name, Integer age) {
        this.age = age;
        this.name = name;
    }
    private String name;
    private Integer age;
}
