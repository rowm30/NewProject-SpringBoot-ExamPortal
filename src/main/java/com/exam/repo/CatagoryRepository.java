package com.exam.repo;

import com.exam.model.exam.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatagoryRepository extends JpaRepository<Catagory, Long> {

}
