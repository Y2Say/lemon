package com.lemon.controller;

import com.lemon.entity.PersonEntity;
import com.lemon.service.PersonService;

import com.lemon.util.HttpResponseHelper;
import com.lemon.util.UUIDString;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
@RestController("com.lemon.controller.PersonController")
public class PersonController {
    @Autowired
    private PersonService personService;

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private HttpServletRequest request;

    @PostMapping(value = "/person/add")
    @ResponseBody
    public String addPerson(@RequestBody PersonEntity personEntity) throws ControllerException {

        personService.addPerson(personEntity);
        return HttpResponseHelper.successInfoInbox("操作成功");


    }

    @GetMapping(value = "/person/list")
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

    public String uploadFile(@RequestPart("files") MultipartFile[] files){

        personService.uploadFile(files);
        return null;

    }
}