package com.lemon.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by jyj on 2017/10/16.
 */
@Entity
@Table(name = "site", schema = "lemon", catalog = "")
public class SiteEntity {
    private String id;
    private String siteName;
    private String siteUrl;
    private Timestamp createdTime;

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
    @Column(name = "site_name", nullable = false, length = 128)
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
    @Basic
    @Column(name = "site_url", nullable = false, length = 128)
    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }
    @Basic
    @Column(name = "created_time", nullable = false, length = 128)
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SiteEntity that = (SiteEntity) o;

        if (siteName != null ? !siteName.equals(that.siteName) : that.siteName != null) return false;
        if (siteUrl != null ? !siteUrl.equals(that.siteUrl) : that.siteUrl != null) return false;
        return createdTime != null ? createdTime.equals(that.createdTime) : that.createdTime == null;
    }

    @Override
    public int hashCode() {
        int result = siteName != null ? siteName.hashCode() : 0;
        result = 31 * result + (siteUrl != null ? siteUrl.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        return result;
    }
}
