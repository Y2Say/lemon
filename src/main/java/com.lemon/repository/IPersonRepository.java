package com.lemon.repository;

import com.lemon.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by lemon on 2017/8/15.
 */
@Repository("com.lemon.repository.IPersonRepository")
public interface IPersonRepository extends JpaRepository<Person,String>, PagingAndSortingRepository<Person,String>{

    List<Person> findAll();

}
