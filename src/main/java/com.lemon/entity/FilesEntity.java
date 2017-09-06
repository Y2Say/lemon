package com.lemon.entity;

import javax.persistence.*;

/**
 * Created by jyj on 2017/9/5.
 */
@Entity
@Table(name = "files",schema = "lemon",catalog = "")
public class FilesEntity {
    private String id;
    private String fileName;
    private String type;

    @Id
    @Column(name = "id",nullable = false,length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
