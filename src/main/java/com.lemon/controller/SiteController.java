package com.lemon.controller;

import com.lemon.entity.SiteEntity;
import com.lemon.service.SiteService;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.*;

/**
 * Created by jyj on 2017/10/16.
 */
@Log4j2
@Data
@Controller("com.lemon.controller.SiteController")
public class SiteController {
    @Autowired
    private SiteService siteService;

    @RequestMapping(value = "/site/list",method = RequestMethod.GET)
    @ResponseBody
    public String findAll(){

        List<SiteEntity> list = siteService.findAll();



        Map<String,Object> map = new HashMap<>();
        map.put("data",list);
        return null;
    }

    public String addSite(SiteEntity siteEntity){
        SiteEntity site = new SiteEntity();
        site.setId(UUID.randomUUID().toString());
        site.setCreatedTime(new Timestamp(Calendar.getInstance().getTime().getTime()));
        site.setSiteName(siteEntity.getSiteName());
        site.setSiteUrl(siteEntity.getSiteUrl());
        siteService.addSite(site);
        return "添加成功";
    }
}
