package com.hancai.springboot;

import com.hancai.springboot.bean.Properties;
import com.hancai.springboot.bean.Student;
import com.hancai.springboot.bean.SuperMan;
import com.hancai.springboot.util.SpringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    private static Logger log = LoggerFactory.getLogger(SpringbootApplicationTests.class);

    @Autowired
    private SuperMan superMan;

    @Autowired
    private Properties properties;

    @Test
    public void contextLoads() {

    }

    /**
     * 测试log back 日志工具
     */
    @Test
    public void logTest() {
        log.debug("--log debug");
        log.info("--log info");
        log.warn("--log warn");
        log.error("--log error");
    }

    /**
     * 测试读取yml配置文件
     */
    @Test
    public void readYml() {
        log.info(superMan.toString());
    }

    /**
     * 测试读取yml配置文件 @Value 零散读取
     */
    @Test
    public void readYmlSingle() {
        log.info(properties.toString());
    }

    /**
     * 测试@Bean注解，运行过程中，往Spring容器添加bean功能
     */
    @Test
    public void dyncBeanTest() {
        Student student = (Student) SpringUtil.getBean("student");
        log.info(student.toString());
    }

}

