package com.lemon.controller;


import com.lemon.entity.Mango;
import com.lemon.service.MangoService;
import lombok.Data;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by jyj on 2017/10/16.
 */
@Log4j2
@Data
@RequestMapping("/mango")
@Controller("com.lemon.controller.MangoController")
public class MangoController {
    @Autowired
    private MangoService mangoService;



    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Mango> findAll(){
        return mangoService.findAll();
    }

    @RequestMapping(value = "/add_mango", method = RequestMethod.POST)
    @ResponseBody
    public String addMango(Mango mango, BindingResult result){
        if(result.hasErrors()){
            return result.getFieldError().getDefaultMessage();
        }
        mango.setName(mango.getName());
        mango.setSign(mango.getSign());

        mangoService.addMango(mango);
        return "添加成功";
    }
}
