package com.lemon.service;


import com.lemon.entity.Mango;
import com.lemon.repository.IMangoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jyj on 2017/9/6.
 */
@Service
public class MangoService {

    @Autowired
    private IMangoRepository mangoRepository;

    public List<Mango> findAll(){
        return mangoRepository.findAll();
    }


    @Transactional
    public void addMango(Mango mango){
        mangoRepository.save(mango);
    }

    @Transactional
    public void updae(Mango mango){

        mangoRepository.save(mango);

    }
}
