package com.lemon.service;

import com.lemon.entity.Site;
import com.lemon.repository.ISiteRepository;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

/**
 * Created by jyj on 2017/10/16.
 */
@Log4j2
@Data
@Service("com.lemon.service.SiteService")
public class SiteService {

    @Autowired
    private ISiteRepository siteRepository;

    /**
     * 查询所有的网站
     *
     * @return
     */
    public List<Site> findAll() {
        return siteRepository.findAll();
    }

    /**
     * 新增一个网站链接
     *
     * @param siteEntity
     * @param userId
     */
    @Transactional
    public Site addSite(Site siteEntity, String userId) {
        Site site = new Site();
        site.setId(UUID.randomUUID().toString());
        site.setSiteName(siteEntity.getSiteName());
        site.setSiteUrl(siteEntity.getSiteUrl());
        site.setCreatedBy(userId);
        site.setCreatedTime(new Timestamp(Calendar.getInstance().getTime().getTime()));
        site.setUpdatedBy(userId);
        site.setUpdatedTime(new Timestamp(Calendar.getInstance().getTime().getTime()));
        return siteRepository.save(site);
    }

    /**
     * 查询所有的链接个数
     *
     * @return
     */
    public Long count() {
        return siteRepository.count();
    }

    /**
     * 修改一个网站链接信息
     *
     * @param site
     * @param userId
     */
    public Site editSite(Site site, String userId) throws ServiceException {
        Site site1 = siteRepository.findOne(site.getId());
        if (site1 != null && userId.equals(site1.getCreatedBy())) {
            site1.setSiteName(site.getSiteName());
            site1.setSiteUrl(site.getSiteUrl());
            site1.setUpdatedTime(new Timestamp(Calendar.getInstance().getTime().getTime()));
            site1.setUpdatedBy(userId);
            return siteRepository.save(site1);
        } else {
            throw new ServiceException("exception.site.null");
        }
    }

    /**
     * 删除一个网站链接
     *
     * @param userId
     * @param siteId
     */
    public void deleteSite(String userId, String siteId) {
        Site site = siteRepository.findOne(siteId);
        if (site != null && userId.equals(site.getCreatedBy())) {
            siteRepository.delete(siteId);

        }
    }
}
