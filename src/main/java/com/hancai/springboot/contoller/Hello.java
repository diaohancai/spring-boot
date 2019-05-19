package com.hancai.springboot.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    /**
     * 个别的读取配置属性，则用@Value零散注入
     */
    @Value("${superman.name}")
    private String name;

    @RequestMapping("/say-hello")
    public String hello() {
        return "Hello, " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
