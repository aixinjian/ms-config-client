package com.ms.ms.config.client.controller;

import com.ms.ms.config.client.vo.UserVo;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${data.name}")
    private String name;


    @GetMapping
    public List<UserVo> test() {
        List<UserVo> userVos = Lists.newArrayList();
        userVos.add(new UserVo("aixinjian",30));
        userVos.add(new UserVo("lisi",22));
        userVos.add(new UserVo("zhangshan",23));
        return userVos;

    }
}
