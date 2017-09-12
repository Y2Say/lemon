package com.lemon.service;

import com.lemon.entity.PersonEntity;
import com.lemon.repository.IPersonRepository;
import com.lemon.util.UUIDString;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by lemon on 2017/8/15.
 */
@Log4j2
@Data
@Service("com.lemon.service.PersonService")
public class PersonService {

    @Qualifier("com.lemon.repository.IPersonRepository")
    @Autowired
    private IPersonRepository personRepository;

    @Transactional
    public void addPerson(PersonEntity person){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(UUIDString.genUUID());
        personEntity.setName(person.getName());
        personEntity.setPassword(person.getPassword());
        personEntity.setCity(person.getCity());
        personEntity.setIdentity(person.getIdentity());
        personEntity.setPosition(person.getPosition());
        personEntity.setSign(person.getSign());
        personEntity.setSex(person.getSex());
        personEntity.setPhone(person.getPhone());
        personRepository.save(personEntity);

    }

    public List<PersonEntity> findPersonList(){

        return personRepository.findAll();
    }


    public String uploadFile(MultipartFile[] files){

        if(files.length>0){

        }
        return null;

    }

}
