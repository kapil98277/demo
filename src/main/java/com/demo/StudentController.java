package com.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentRepository repo;
	
	@RequestMapping("/")
	public String get() {
		return "Hello web";
	}
	
	@RequestMapping(value="/getStudent", method= org.springframework.web.bind.annotation.RequestMethod.GET)
	public List<Student> getS() {
		List<Student> s = (List<Student>) repo.findAll();
		for(Student ss: s) {
			System.out.println("----student----"+ss.getName());
		}
		return s;
	}
}
