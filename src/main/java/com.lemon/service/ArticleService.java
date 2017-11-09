package com.lemon.service;

import com.lemon.entity.Article;
import com.lemon.repository.IArticleRepository;

import com.lemon.util.UUIDString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by jyj on 2017/10/20.
 */

@Service
public class ArticleService {

    @Autowired
    private IArticleRepository articleRepository;

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    /**
     * 删除一篇文章
     * @param id
     */
    public void deleteArticle(String id) throws ServiceException {
        Article article = findArticleInfo(id);
        if(article != null){
            articleRepository.delete(id);
        }else{
            throw new ServiceException("exception.article.del.fail");
        }
    }

    /**
     * 新增文章
     *
     * @param article
     */
    @Transactional
    public Article addArticle(Article article) throws ServiceException {
        if (article != null) {
            Article articleEntity = new Article();

            articleEntity.setId(UUIDString.genUUID());
            articleEntity.setAuthor(article.getAuthor());
            articleEntity.setContent(article.getContent());
            articleEntity.setPublishTime(new Timestamp(new Date().getTime()));
            articleEntity.setStyle(article.getStyle());
            articleEntity.setTitle(article.getTitle());
            return articleRepository.save(articleEntity);
        } else {
            throw new ServiceException("exception.article.null");
        }
    }
    /**
     * 总数量
     *
     * @return
     */
    public Long count() {
        return articleRepository.count();
    }

    /**
     * 根据Id查询文章信息
     * @param articleId
     * @return
     */
    public Article findArticleInfo(String articleId){
        return articleRepository.findArticleById(articleId);
    }

}
