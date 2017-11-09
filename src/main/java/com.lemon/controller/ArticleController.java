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
import org.springframework.util.StringUtils;
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
@Controller
public class ArticleController extends BaseController{

    @Autowired
    private ArticleService articleService;

    /**
     * 新增文章
     * @param article
     * @return
     * @throws ControllerException
     */
    @RequestMapping(value = "/article/add", method = RequestMethod.POST)
    @ResponseBody
    public String addArticle(Article article) throws ControllerException {
        if (article == null) {
            throw new ControllerException("exception.article.null");
        }
        try {
            return HttpResponseHelper.successInfoInbox(JsonUtilsHelper.objectToJsonString(articleService.addArticle(article)));
        } catch (ServiceException | JsonProcessingException e) {
            throw new ControllerException(e.getMessage());
        }

    }

    /**
     * 查询文章列表
     * @return
     * @throws ControllerException
     */
    @RequestMapping(value = "/article/list", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
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

    /**
     * 根据Id删除一篇文章
     * @param articleId
     * @return
     * @throws ControllerException
     */
    @RequestMapping(value = "/article/del",method = RequestMethod.POST)
    @ResponseBody
    public String delArticle(String articleId) throws ControllerException {
        if(StringUtils.isEmpty(articleId)){
            throw new ControllerException("exception.article.id.null");
        }
        try {
            articleService.deleteArticle(articleId);
            return HttpResponseHelper.successInfoInbox("删除成功！");
        } catch (ServiceException e) {
            throw new ControllerException(e.getMessage());
        }
    }

    /**
     * 根据Id查询文章详情
     * @param articleId
     * @return
     * @throws ControllerException
     */
    @RequestMapping(value = "/article/detail",method = RequestMethod.GET)
    @ResponseBody
    public String findArticleInfo(String articleId) throws ControllerException {

        try {
            return HttpResponseHelper.successInfoInbox(JsonUtilsHelper.objectToJsonString(articleService.findArticleInfo(articleId)));
        } catch (JsonProcessingException e) {
            throw new ControllerException(e.getMessage());
        }
    }


}
