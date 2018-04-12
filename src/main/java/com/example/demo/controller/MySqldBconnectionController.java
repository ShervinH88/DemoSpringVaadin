package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.DAO.ServiceDAO;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MySqldBconnectionController {

@Autowired
static
ServiceDAO serviceDAO; 
	
@RequestMapping("/")
@ResponseBody
public String sayHello() {
	String elem1 = ServiceDAO.newUser();
    return elem1;
}	
	
}
