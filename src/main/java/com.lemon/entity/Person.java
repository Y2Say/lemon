package com.lemon.entity;

import com.lemon.util.Page;

import javax.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by lemon on 2017/8/15.
 */
@Entity
@Table(name = "person", schema = "lemon", catalog = "")
public class Person extends Page implements Serializable {
    private String id;
    private String name;
    private String password;
    private String identity;
    private String phone;
    private String city;
    private String sign;
    private String position;
    private String sex;
    private Timestamp createdTime;
    private Timestamp updatedTime;
    private String createdBy;
    private String updatedBy;

    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 128)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 128)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "identity", nullable = true, length = 18)
    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 128)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "sign", nullable = true)
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Basic
    @Column(name = "position", nullable = true, length = 128)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "sex", nullable = false)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "created_time", nullable = false)
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }
    @Basic
    @Column(name = "updated_time", nullable = false)
    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }
    @Basic
    @Column(name = "created_by", nullable = false)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    @Basic
    @Column(name = "updated_by", nullable = false)
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (getId() != null ? !getId().equals(person.getId()) : person.getId() != null) return false;
        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        if (getPassword() != null ? !getPassword().equals(person.getPassword()) : person.getPassword() != null)
            return false;
        if (getIdentity() != null ? !getIdentity().equals(person.getIdentity()) : person.getIdentity() != null)
            return false;
        if (getPhone() != null ? !getPhone().equals(person.getPhone()) : person.getPhone() != null) return false;
        if (getCity() != null ? !getCity().equals(person.getCity()) : person.getCity() != null) return false;
        if (getSign() != null ? !getSign().equals(person.getSign()) : person.getSign() != null) return false;
        if (getPosition() != null ? !getPosition().equals(person.getPosition()) : person.getPosition() != null)
            return false;
        if (getSex() != null ? !getSex().equals(person.getSex()) : person.getSex() != null) return false;
        if (getCreatedTime() != null ? !getCreatedTime().equals(person.getCreatedTime()) : person.getCreatedTime() != null)
            return false;
        if (getUpdatedTime() != null ? !getUpdatedTime().equals(person.getUpdatedTime()) : person.getUpdatedTime() != null)
            return false;
        if (getCreatedBy() != null ? !getCreatedBy().equals(person.getCreatedBy()) : person.getCreatedBy() != null)
            return false;
        return getUpdatedBy() != null ? getUpdatedBy().equals(person.getUpdatedBy()) : person.getUpdatedBy() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getIdentity() != null ? getIdentity().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getSign() != null ? getSign().hashCode() : 0);
        result = 31 * result + (getPosition() != null ? getPosition().hashCode() : 0);
        result = 31 * result + (getSex() != null ? getSex().hashCode() : 0);
        result = 31 * result + (getCreatedTime() != null ? getCreatedTime().hashCode() : 0);
        result = 31 * result + (getUpdatedTime() != null ? getUpdatedTime().hashCode() : 0);
        result = 31 * result + (getCreatedBy() != null ? getCreatedBy().hashCode() : 0);
        result = 31 * result + (getUpdatedBy() != null ? getUpdatedBy().hashCode() : 0);
        return result;
    }
}
