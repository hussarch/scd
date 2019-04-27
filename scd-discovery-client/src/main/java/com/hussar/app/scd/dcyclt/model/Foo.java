package com.hussar.app.scd.dcyclt.model;

import java.util.Date;

/**
 * Created by 肖毅(hussarch@126.com) on 18/7/11.
 */
public class Foo {

    private Integer id;
    private String name;
    private String desc;
    private Date date;

    public Foo(){
    }

    public Foo(Integer id, String name, String desc){
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.date = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
