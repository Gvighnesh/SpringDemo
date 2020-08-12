package com.example.services;

import java.util.List;

import com.example.bean.Test;


public interface TestService {
	
	List<Test> listAll();
	
	List<Test> listBtwnDates();

}
