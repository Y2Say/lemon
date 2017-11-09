package com.lemon.controller;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jyj on 2017/9/11.
 */
@Log4j2
@Data
@Controller
public class ModelAndView {
    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "layout/decorator";
    }

    /**
     * 用户列表
     *
     * @return
     */
    @RequestMapping(value = "/person/person_list_page", method = RequestMethod.GET)
    public String personPage() {
        return "person/person_list";
    }

    @RequestMapping(value = "/person_add_page", method = RequestMethod.GET)
    public String addPersonPage() {
        return "person/add_person";
    }

    @RequestMapping(value = "/favorites/animals_page", method = RequestMethod.GET)
    public String animalsPage() {
        return "favorites/animals";
    }

    @RequestMapping(value = "/favorites/flowers_page", method = RequestMethod.GET)
    public String flowersPage() {
        return "favorites/flowers";
    }

    @RequestMapping(value = "/favorites/vegetables_page", method = RequestMethod.GET)
    public String vegetablesPage() {
        return "favorites/vegetables";
    }

    @RequestMapping(value = "/favorites/fruits_page", method = RequestMethod.GET)
    public String fruitsPage() {
        return "favorites/fruits";
    }

    @RequestMapping(value = "/history/detail_page", method = RequestMethod.GET)
    public String detailPage() {
        return "history/detail";
    }

    @RequestMapping(value = "/history/take_nodes_page", method = RequestMethod.GET)
    public String takeNodesPage() {
        return "history/take_nodes";
    }


}

