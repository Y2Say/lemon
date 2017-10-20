package com.lemon.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by jyj on 2017/10/20.
 */
@Entity
@Table(name = "article",schema = "lemon",catalog = "")
public class Article {
    private String id;
    private String title;
    private String author;
    private String status;
    private String visit;
    private Timestamp publishTime;
    private String content;
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "author", nullable = false, length = 128)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Basic
    @Column(name = "status", nullable = false, length = 128)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Basic
    @Column(name = "visit", nullable = false, length = 128)
    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }
    @Basic
    @Column(name = "publish_time", nullable = false)
    public Timestamp getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }
    @Basic
    @Column(name = "content", nullable = true)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
