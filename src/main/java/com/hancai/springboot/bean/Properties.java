package com.hancai.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

    /**
     * @Value 零散读取 properties
     */
    @Value("${environment}")
    private String environment;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "environment='" + environment + '\'' +
                '}';
    }
}
