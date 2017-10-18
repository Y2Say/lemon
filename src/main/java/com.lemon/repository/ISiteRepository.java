package com.lemon.repository;

import com.lemon.entity.SiteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jyj on 2017/10/16.
 */
@Repository("com.lemon.repository.ISiteRepository")
public interface ISiteRepository  extends JpaRepository<SiteEntity,String>, PagingAndSortingRepository<SiteEntity,String> {
}
