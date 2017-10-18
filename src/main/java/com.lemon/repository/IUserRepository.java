package com.lemon.repository;

import com.lemon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jyj on 2017/6/29.
 */
@Repository("com.lemon.repository.IUserRepository")
public interface IUserRepository extends JpaRepository<User, String>, PagingAndSortingRepository<User, String> {
    User findByUserName(String userName);
    User findById(String id);
}
