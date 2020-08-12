package com.example.services;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Test;
import com.example.repositories.TestRepository;

@Service
public class TestServiceImpl implements TestService {
	
	private TestRepository testRepository; 
	
//	SimpleDateFormat dateFormatIn = new SimpleDateFormat("yyyy-MM-dd");
//	
//	Date day = dateFormatIn.parse("2020-02-12");
//	
	ZoneId defaultZoneId = ZoneId.systemDefault();
	LocalDate date2 = LocalDate.parse("2020-01-12");
	LocalDate date3 = LocalDate.parse("2020-03-12");
	Date date = Date.from(date2.atStartOfDay(defaultZoneId).toInstant());
	Date date1 = Date.from(date3.atStartOfDay(defaultZoneId).toInstant());
	
	
	 @Autowired
	    public TestServiceImpl(TestRepository testRepository) {
	        this.testRepository = testRepository;
	    }
	 
	 @Override
	    public List<Test> listAll() {
	        List<Test> products = new ArrayList<>();
	        testRepository.findAll().forEach(products::add); 
	        return products;
	    }
	 
	 @Override
	    public List<Test> listBtwnDates() {
	        List<Test> tests = new ArrayList<>();
	        testRepository.findByFromDateBetween(date,date1).forEach(tests::add); 
	        return tests;
	    }
}
