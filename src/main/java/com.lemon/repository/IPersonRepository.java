package com.lemon.repository;

import com.lemon.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lemon on 2017/8/15.
 */
@Repository("com.lemon.repository.IPersonRepository")
public interface IPersonRepository extends JpaRepository<PersonEntity,String>, PagingAndSortingRepository<PersonEntity,String>{

    List<PersonEntity> findAll();

}
