package com.exam.service;

import com.exam.model.exam.Catagory;

import java.util.Set;

public interface CatagoryService {
    public Catagory addCatagory(Catagory catagory);
    public Catagory updateCatagory(Catagory catagory);
    public Set<Catagory> getCatagories();

    public Catagory getCatagory(Long catagoryId);

    public void deleteCatagory(Long catagoryId);





}
