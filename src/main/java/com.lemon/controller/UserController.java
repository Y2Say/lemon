package com.lemon.controller;

import com.fasterxml.jackson.core.JsonProcessingException;


import com.lemon.service.UserService;
import com.lemon.util.HttpResponseHelper;
import com.lemon.util.JsonUtilsHelper;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


/**
 * Created by jyj on 2017/6/29.
 */
@Log4j2
@Data
@Controller("com.lemon.controller.UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @ResponseBody
    public int login(String userName, String password) throws ControllerException {
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){
            throw new ControllerException("exception.login.username.or.password.null");
        }
        return userService.login(userName, password);
    }

    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    @ResponseBody
    public String findAll() throws ControllerException {
        try {
            return JsonUtilsHelper.objectToJsonString(userService.getUserList());
        } catch (JsonProcessingException e) {
            throw new ControllerException(e.getMessage());
        }

    }


/*
    @RequestMapping("/logout.do")
    public String logout(){
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return "login";

    }*/

}
