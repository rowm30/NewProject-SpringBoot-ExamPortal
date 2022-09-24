package com.exam.service.impl;

import com.exam.model.exam.Catagory;
import com.exam.repo.CatagoryRepository;
import com.exam.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class CatagoryServiceImpl implements CatagoryService {

    @Autowired
    private CatagoryRepository catagoryRepository;

    @Override
    public Catagory addCatagory(Catagory catagory) {
        return this.catagoryRepository.save(catagory);
    }

    @Override
    public Catagory updateCatagory(Catagory catagory) {
        return this.catagoryRepository.save(catagory);
    }

    @Override
    public Set<Catagory> getCatagories() {
        return  new LinkedHashSet<>( this.catagoryRepository.findAll());
    }

    @Override
    public Catagory getCatagory(Long catagoryId) {
        return this.catagoryRepository.findById(catagoryId).get();
    }

    @Override
    public void deleteCatagory(Long catagoryId) {

        Catagory catagory = new Catagory();
        catagory.setCid(catagoryId);
        this.catagoryRepository.delete(catagory);
    }
}
