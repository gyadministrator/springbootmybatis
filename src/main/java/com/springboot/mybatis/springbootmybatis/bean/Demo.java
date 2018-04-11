package com.springboot.mybatis.springbootmybatis.bean;

/**
 * @author gaoyun
 * 2018/4/11 9:38
 * 描述:
 */
public class Demo {
    private long id;
    private String name;

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo() {
    }
}
