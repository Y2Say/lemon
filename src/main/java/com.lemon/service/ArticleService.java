package com.lemon.service;

import com.lemon.entity.Article;
import com.lemon.repository.IArticleRepository;
import com.lemon.util.UUIDString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by jyj on 2017/10/20.
 */

@Service("com.lemon.service.ArticleService")
public class ArticleService {

    @Autowired
    private IArticleRepository articleRepository;

    public List<Article> findAll(){
        return articleRepository.findAll();
    }

    public void deleteArticle(String id){
        articleRepository.delete(id);
    }

    /**
     * 新增文章
     * @param article
     */
    @Transactional
    public void addArticle(Article article) throws ServiceException {
        /*if(article != null){*/
            Article articleEntity = new Article();

            articleEntity.setId(UUIDString.genUUID());
            articleEntity.setAuthor(article.getAuthor());
            articleEntity.setContent(article.getContent());
            articleEntity.setPublishTime(new Timestamp(new Date().getTime()));
            articleEntity.setVisit(article.getVisit());
            articleEntity.setStatus(article.getStatus());
            articleEntity.setTitle(article.getTitle());
            articleRepository.save(articleEntity);
        /*}else{
            throw new ServiceException("exception.article.null");
        }*/

    }

    /**
     * 总数量
     * @return
     */
    public Long count(){
        return articleRepository.count();
    }
}
