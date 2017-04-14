package com.yobing.entity;

import java.util.Date;

/**
 * 这是一个测试实体类
 * @author : yobing Chen
 * @Data : 2017/3/29
 */
public class DemoEntity {
    private int id;

    private String name;
    private Date createTime;

    public DemoEntity() {
    }

    public DemoEntity(int id, String name, Date createTime) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
