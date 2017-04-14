package com.yobing.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 使用的是bean.properties里的自定义属性
 * @author : yobing Chen
 * @Data : 2017/4/7
 */
@Component
@Configuration
@PropertySource("classpath:bean.properties")
@ConfigurationProperties(prefix = "demo")
public class ConfigBeanB {
    private String name;
    private String color;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
