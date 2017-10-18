package com.lemon.repository;


import com.lemon.entity.Mango;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jyj on 2017/9/6.
 */
@Repository
public interface IMangoRepository extends JpaRepository<Mango,String>, PagingAndSortingRepository<Mango,String> {
}
