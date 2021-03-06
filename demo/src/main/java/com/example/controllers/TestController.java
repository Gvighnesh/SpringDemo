package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Test;
import com.example.services.TestService;

@RestController
public class TestController {
	
	@Autowired
    private TestService testService;

    @GetMapping("/tests")
    public List<Test> allUsers() {
        return testService.listAll();
    }
    
    @GetMapping("/tests/condition")
    public List<Test> conditionusers() {
        return testService.listBtwnDates();
    }

}
