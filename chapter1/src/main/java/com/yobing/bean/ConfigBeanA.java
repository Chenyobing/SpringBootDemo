package com.yobing.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 使用的是application.properties里的自定义属性
 * @author : yobing Chen
 * @Data : 2017/4/7
 */
@Component
@ConfigurationProperties(prefix = "test")
public class ConfigBeanA {
    private String name;
    private String want;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
