package com.example.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.bean.Test;


public interface TestRepository extends CrudRepository<Test, Long>  {
	
	List<Test> findByFromDateBetween(Date date,Date date2);

}
