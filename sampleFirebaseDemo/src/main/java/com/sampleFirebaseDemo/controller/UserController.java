package com.sampleFirebaseDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.sampleFirebaseDemo.model.User;
import com.sampleFirebaseDemo.service.FirebaseService;



@RestController
public class UserController {
   
	@Autowired
	FirebaseService firebaseService;
	
	
	@GetMapping("/get-user-details")
	public User getUserDetails(@RequestHeader String name) {
		User user = firebaseService.getUserDetails(name);
		System.out.println("getuserdetails");
		return user;
	}
	
	@PostMapping("/save-user-details")
	public String saveUser(@RequestBody User user) {
		return firebaseService.saveUserDetails(user);
	}
	
	@PutMapping("/update-user-details")
	public String updateUserDetails(@RequestBody User user) {
		return firebaseService.updateUserDetails(user);
	}
	
	@DeleteMapping("/delete-user-details")
	public String deleteUserDetails(@RequestHeader String name) {
		return firebaseService.deleteUserDetails(name);
	}
}
