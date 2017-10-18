package com.lemon.entity;


import javax.persistence.*;


/**
 * Created by jyj on 2017/9/6.
 */
@Entity
@Table(name = "mango",schema = "lemon",catalog = "")
public class Mango {

    private String id;
    private String name;
    private String sign;

    public Mango() {
    }
    @Id
    @Column(name = "id", nullable = false, length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sign",nullable = false)
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Mango{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
