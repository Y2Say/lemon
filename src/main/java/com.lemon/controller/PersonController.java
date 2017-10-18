package com.lemon.controller;

import com.lemon.entity.PersonEntity;
import com.lemon.service.PersonService;

import com.lemon.util.HttpResponseHelper;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lemon on 2017/8/15.
 */
@Log4j2
@Data
@Controller("com.lemon.controller.PersonController")
public class PersonController {
    @Autowired
    private PersonService personService;

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = "/person/add",method = RequestMethod.POST)
    @ResponseBody
    public String addPerson(@RequestBody PersonEntity personEntity) throws ControllerException {

        personService.addPerson(personEntity);
        return HttpResponseHelper.successInfoInbox("操作成功");


    }

    @RequestMapping(value = "/person/list",method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String,Object>> findAllPerson() throws ControllerException {
        List<PersonEntity> personEntityList = personService.findPersonList();
        List<Map<String,Object>> list = new ArrayList<>();
        personEntityList.forEach(personEntity -> {
                    Map<String,Object> map = new HashMap<String,Object>();
                    map.put("id",personEntity.getId());
                    map.put("city",personEntity.getCity());
                    map.put("identity",personEntity.getIdentity());
                    map.put("sign",personEntity.getSign());
                    map.put("sex",personEntity.getSex());
                    map.put("position",personEntity.getPosition());
                    map.put("name",personEntity.getName());
                    list.add(map);
                });
        return list;
    }

    @RequestMapping(value="/test",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String findAllList(){
        return "{\n" +
                "  \"users\":[\n" +
                "        {\n" +
                "           \"date\": \"1989-05-02\",\n" +
                "           \"name\": \"王小虎\",\n" +
                "           \"sex\":\"男\",\n" +
                "           \"age\":18,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1960-05-02\",\n" +
                "           \"name\": \"蔡翠娥\",\n" +
                "           \"sex\":\"女\",\n" +
                "           \"age\":56,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1998-05-02\",\n" +
                "           \"name\": \"王大兰\",\n" +
                "           \"sex\":\"女\",\n" +
                "           \"age\":36,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1599 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1963-05-02\",\n" +
                "           \"name\": \"王二麻子\",\n" +
                "           \"sex\":\"男\",\n" +
                "           \"age\":37,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦香玉\",\n" +
                "           \"sex\":\"女\",\n" +
                "           \"age\":30,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1963-05-02\",\n" +
                "           \"name\": \"王二麻子\",\n" +
                "           \"sex\":\"男\",\n" +
                "           \"age\":37,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦香玉\",\n" +
                "           \"sex\":\"女\",\n" +
                "           \"age\":30,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦香玉\",\n" +
                "           \"sex\":\"女\",\n" +
                "           \"age\":30,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦香玉\",\n" +
                "           \"sex\":\"女\",\n" +
                "           \"age\":30,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦香玉\",\n" +
                "           \"sex\":\"女\",\n" +
                "           \"age\":30,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦祥林\",\n" +
                "           \"sex\":\"男\",\n" +
                "           \"age\":21,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦祥林\",\n" +
                "           \"sex\":\"男\",\n" +
                "           \"age\":20,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦祥林\",\n" +
                "           \"sex\":\"男\",\n" +
                "           \"age\":20,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦祥林\",\n" +
                "           \"sex\":\"男\",\n" +
                "           \"age\":20,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦祥林\",\n" +
                "           \"sex\":\"男\",\n" +
                "           \"age\":20,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦祥林\",\n" +
                "           \"sex\":\"男\",\n" +
                "           \"age\":20,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          },\n" +
                "          {\n" +
                "           \"date\": \"1977-05-02\",\n" +
                "           \"name\": \"秦祥林\",\n" +
                "           \"sex\":\"男\",\n" +
                "           \"age\":22,\n" +
                "           \"birth\":\"2002-01-01\",\n" +
                "           \"addr\": \"上海市普陀区金沙江路 1518 弄\"\n" +
                "          }\n" +
                "  ]\n" +
                "}";
    }
}
