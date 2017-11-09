package com.lemon.repository;

import com.lemon.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jyj on 2017/10/20.
 */
@Repository
public interface IArticleRepository extends JpaRepository<Article,String>, PagingAndSortingRepository<Article,String> {

    Article findArticleById(String id);
}
