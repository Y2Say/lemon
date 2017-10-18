package com.lemon.service;

import com.lemon.entity.SiteEntity;
import com.lemon.repository.ISiteRepository;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jyj on 2017/10/16.
 */
@Log4j2
@Data
@Service("com.lemon.service.SiteService")
public class SiteService {

    @Autowired
    private ISiteRepository siteRepository;

    public List<SiteEntity> findAll(){
        return siteRepository.findAll();
    }

    @Transactional
    public void addSite(SiteEntity siteEntity){
        siteRepository.save(siteEntity);
    }

}
