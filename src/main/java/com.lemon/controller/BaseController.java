package com.lemon.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

/**
 * Created by jyj on 2017/10/19.
 */
@Log4j2
@Controller("com.lemon.controller.BaseController")
public class BaseController {
    @Autowired
    protected HttpSession httpSession;

    public String getUserID() throws ControllerException {
        String user_id = (String) httpSession.getAttribute("user_id");
        if (StringUtils.isEmpty(user_id)) {
            throw new ControllerException("exception.system.need_login");
        }
        return user_id;
    }
}
