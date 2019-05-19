package com.hancai.springboot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DyncBean {

    /**
     * @Bean 运行中往Spring IOC容器添加bean
     * @return
     */
    @Bean(name = "student")
    public Student registerDefaultStudent() {
        Student student = new Student();
        student.setName("刁汉财");
        student.setNumber(8638);
        return student;
    }

}
