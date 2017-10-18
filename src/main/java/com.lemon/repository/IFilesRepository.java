package com.lemon.repository;

import com.lemon.entity.FilesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jyj on 2017/9/5.
 */
@Repository("com.lemon.repository.IFilesRepository")
public interface IFilesRepository extends JpaRepository<FilesEntity,String>,PagingAndSortingRepository<FilesEntity,String> {
}
