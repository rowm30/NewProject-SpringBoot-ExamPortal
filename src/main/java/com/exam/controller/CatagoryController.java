package com.exam.controller;

import com.exam.model.exam.Catagory;
import com.exam.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catagory")
@CrossOrigin("*")
public class CatagoryController {
    @Autowired
    private CatagoryService catagoryService;

//    add catagory

    @PostMapping("/")
    public ResponseEntity<?> addCatagory(@RequestBody Catagory catagory){
        Catagory catagory1 = this.catagoryService.addCatagory(catagory);
        return ResponseEntity.ok(catagory1);
    }

//    get catagory
    @GetMapping("/{catagoryId}")
    public Catagory getCatagory(@PathVariable("catagoryId") Long catagoryId){
        return this.catagoryService.getCatagory(catagoryId);
    }

//    Get all catagories

    @GetMapping("/")
    public ResponseEntity<?> getCatagories(){
        return ResponseEntity.ok(this.catagoryService.getCatagories());
    }
//
    @PutMapping("/")
    public Catagory updateCayagory(@RequestBody Catagory catagory){
        return this.catagoryService.updateCatagory(catagory);
    }

//    delete catagory

    @DeleteMapping("/{catagoryId}")
    public void deleteCatagory(@PathVariable("catagoryId")Long catagoryId)
    {
        this.catagoryService.deleteCatagory(catagoryId);
    }

}
