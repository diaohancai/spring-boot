package com.hancai.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Java Bean与配置文件的映射，则用@ConfigurationProperties
 */
@Component
@ConfigurationProperties(prefix = "superman")
public class SuperMan {

    private String name;
    private int age;
    private Date birthday;

    private List skill;
    private Map hobby;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List getSkill() {
        return skill;
    }

    public void setSkill(List skill) {
        this.skill = skill;
    }

    public Map getHobby() {
        return hobby;
    }

    public void setHobby(Map hobby) {
        this.hobby = hobby;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "SuperMan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", skill=" + skill +
                ", hobby=" + hobby +
                ", weapon=" + weapon +
                '}';
    }
}
