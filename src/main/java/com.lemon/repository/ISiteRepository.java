package com.lemon.repository;

import com.lemon.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jyj on 2017/10/16.
 */
@Repository
public interface ISiteRepository extends JpaRepository<Site,String>, PagingAndSortingRepository<Site,String> {
}
