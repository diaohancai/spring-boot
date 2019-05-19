package com.hancai.springboot.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * themeleaf：
 * prefix: /templates/**
 * suffix: .html
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public String toThymeleaf(Map<String, Object> map) {
        map.put("template", "Thymeleaf");
        return "thymeleaf";
    }

}
