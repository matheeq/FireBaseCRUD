package com.sampleFirebaseDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sampleFirebaseDemo.model.EmpModel;

@RestController
public class EmpController {
	
	@PostMapping("/test")
	public void test() {
		System.out.println("Test Method");
	}
	
	@PostMapping("/save-emp-details")
	public String saveEmpDetails() {
		return null;
	}
	
	@GetMapping("/get-emp-details")
	public EmpModel getEmpDetails() {
		
		return null;
	}
	
	@PutMapping("/update-emp-details")
	public String updateEmpDetails() {
		return null;
	}
	
	public String deleteEmpDetails() {
		return null;
	}
	
}
