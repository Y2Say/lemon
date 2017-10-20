package com.lemon.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lemon.entity.Article;
import com.lemon.service.ArticleService;
import com.lemon.service.ServiceException;
import com.lemon.util.HttpResponseHelper;
import com.lemon.util.JsonUtilsHelper;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * Created by jyj on 2017/10/20.
 */
@Log4j2
@Data
@Controller("com.lemon.controller.ArticleController")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/article/add",method = RequestMethod.POST)
    @ResponseBody
    public String addArticle(Article article) throws ControllerException {
        try {
            articleService.addArticle(article);
            return HttpResponseHelper.successInfoInbox("操作成功");
        } catch (ServiceException e) {
            throw new ControllerException(e.getMessage());
        }

    }

    @RequestMapping(value = "/article/list",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String findAll() throws ControllerException {
        List<Article> list = articleService.findAll();
        Long count = articleService.count();
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
}
