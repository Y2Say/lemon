package com.lemon.service;


import com.lemon.entity.User;
import com.lemon.repository.IUserRepository;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jyj on 2017/6/29.
 */
@Log4j2
@Data
@Service("com.lemon.service.UserService")
public class UserService {

    @Qualifier("com.lemon.repository.IUserRepository")
    @Autowired
    private IUserRepository userRepository;

    public int login(String userName, String password) {
        User userEntity = userRepository.findByUserName(userName);
        if (userEntity == null) {
            return 0;
        } else if (password.equals(userEntity.getPassword())) {
            return 1;
        } else {
            return 2;
        }
    }

    /**
     * 用户列表
     * @return
     */
    public List<Map<String, Object>> getUserList(){
        List<Map<String, Object>> list = new ArrayList<>();
        List<User> userList = userRepository.findAll();
        if (!CollectionUtils.isEmpty(userList)) {
            for (User userEntity : userList) {
                Map<String, Object> map = new HashMap<>();
                User user = userRepository.findById(userEntity.getId());
                if (user != null) {
                    map.put("id", userEntity.getId());
                    map.put("text", userEntity.getUserName());
                    list.add(map);
                }
            }
        }
        return list;
    }
}
