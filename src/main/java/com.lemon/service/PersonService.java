package com.lemon.service;

import com.lemon.entity.Person;
import com.lemon.repository.IPersonRepository;

import com.lemon.util.UUIDString;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.sql.Timestamp;
import java.util.Date;
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

    /**
     * 登录
     * @param name
     * @param password
     * @return
     */
    public Person login(String name, String password) throws ServiceException {
        Person person = personRepository.findByName(name);
        if (person != null && password.equals(person.getPassword())) {
          return person;
        }else{
            throw new ServiceException("exception.login.name.or.password.wrong");
        }
    }


    @Transactional
    public void addPerson(Person person,String userId) {
        Person personEntity = new Person();
        personEntity.setId(UUIDString.genUUID());
        personEntity.setName(person.getName());
        personEntity.setPassword(person.getPassword());
        personEntity.setCity(person.getCity());
        personEntity.setIdentity(person.getIdentity());
        personEntity.setPosition(person.getPosition());
        personEntity.setSign(person.getSign());
        personEntity.setSex(person.getSex());
        personEntity.setPhone(person.getPhone());
        personEntity.setCreatedBy(userId);
        personEntity.setUpdatedBy(userId);
        personEntity.setCreatedTime(new Timestamp(new Date().getTime()));
        personEntity.setUpdatedTime(new Timestamp(new Date().getTime()));
        personRepository.save(personEntity);

    }

    /*public Page<Person> findAll(int page,int size,String orderType) {
        Sort sort = new Sort(Sort.Direction.ASC, "createdTime");
        if ("desc".equalsIgnoreCase(orderType)) {
            sort = new Sort(Sort.Direction.DESC, "createdTime");
        }
        Pageable pageable = new PageRequest(page < 0 ? 0 : page, size < 0 ? 20 : size, sort);
        Page<Person> personPage = personRepository.findAll(pageable);

        return personPage;

    }*/
    public List<Person> findAll() {

        List<Person> personList = personRepository.findAll();
        return personList;

    }
    public Long countAll(){
        return personRepository.count();
    }


}
