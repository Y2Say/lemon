package com.lemon.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by jyj on 2017/10/16.
 */
@Entity
@Table(name = "site", schema = "lemon", catalog = "")
public class Site {
    private String id;
    private String siteName;
    private String siteUrl;
    private Timestamp createdTime;
    private String createdBy;
    private Timestamp updatedTime;
    private String updatedBy;
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
    @Column(name = "created_by", nullable = false, length = 128)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    @Basic
    @Column(name = "updated_by", nullable = false, length = 128)
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

        Site site = (Site) o;

        if (getId() != null ? !getId().equals(site.getId()) : site.getId() != null) return false;
        if (getSiteName() != null ? !getSiteName().equals(site.getSiteName()) : site.getSiteName() != null)
            return false;
        if (getSiteUrl() != null ? !getSiteUrl().equals(site.getSiteUrl()) : site.getSiteUrl() != null) return false;
        if (getCreatedTime() != null ? !getCreatedTime().equals(site.getCreatedTime()) : site.getCreatedTime() != null)
            return false;
        if (getCreatedBy() != null ? !getCreatedBy().equals(site.getCreatedBy()) : site.getCreatedBy() != null)
            return false;
        if (getUpdatedTime() != null ? !getUpdatedTime().equals(site.getUpdatedTime()) : site.getUpdatedTime() != null)
            return false;
        return getUpdatedBy() != null ? getUpdatedBy().equals(site.getUpdatedBy()) : site.getUpdatedBy() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getSiteName() != null ? getSiteName().hashCode() : 0);
        result = 31 * result + (getSiteUrl() != null ? getSiteUrl().hashCode() : 0);
        result = 31 * result + (getCreatedTime() != null ? getCreatedTime().hashCode() : 0);
        result = 31 * result + (getCreatedBy() != null ? getCreatedBy().hashCode() : 0);
        result = 31 * result + (getUpdatedTime() != null ? getUpdatedTime().hashCode() : 0);
        result = 31 * result + (getUpdatedBy() != null ? getUpdatedBy().hashCode() : 0);
        return result;
    }
}
