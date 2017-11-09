package com.lemon.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lemon.entity.Site;
import com.lemon.service.ServiceException;
import com.lemon.service.SiteService;
import com.lemon.util.HttpResponseHelper;
import com.lemon.util.JsonUtilsHelper;
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
 * 友情链接
 * Created by jyj on 2017/10/16.
 */
@Log4j2
@Data
@Controller
public class SiteController extends BaseController{
    @Autowired
    private SiteService siteService;

    /**
     * 新增一个网站链接
     * @param siteEntity
     * @return
     * @throws ControllerException
     */
    @RequestMapping(value = "/site/add",method = RequestMethod.POST)
    @ResponseBody
    public String addSite(Site siteEntity) throws ControllerException {
        String userId = getUserID();
        Site site = siteService.addSite(siteEntity,userId);
        try {
            return JsonUtilsHelper.objectToJsonString(site);
        } catch (JsonProcessingException e) {
            throw new ControllerException(e.getMessage());
        }
    }

    /**
     * 查询网站列表
     * @return
     * @throws ControllerException
     */
    @RequestMapping(value = "/site/list", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String findAllSite() throws ControllerException {

        List<Site> list = siteService.findAll();
        Long count = siteService.count();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", list);
        try {
            return JsonUtilsHelper.objectToJsonString(map);
        } catch (JsonProcessingException e) {
            throw new ControllerException(e.getMessage());
        }
    }

    /**
     * 编辑修改网站链接信息
     * @param siteEntity
     * @return
     * @throws ControllerException
     */
    @RequestMapping(value = "/site/edit", method = RequestMethod.POST)
    @ResponseBody
    public String editSite(Site siteEntity) throws ControllerException {
        String userId = getUserID();
        try {
            Site site = siteService.editSite(siteEntity,userId);
            return HttpResponseHelper.successInfoInbox("操作成功");
        } catch (ServiceException e) {
            throw new ControllerException(e.getMessage());
        }


    }

    /**
     * 删除一个网站链接
     * @param id
     * @return
     * @throws ControllerException
     */
    @RequestMapping(value = "/site/delete",method = RequestMethod.POST)
    @ResponseBody
    public String deleteSite(String id) throws ControllerException {
        String userId = getUserID();
        siteService.deleteSite(userId,id);
        return HttpResponseHelper.successInfoInbox("操作成功");
    }


}
