package com.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.College;
import com.college.service.CollegeService;

@RestController
@RequestMapping("/api/v1/college")
public class CollegeController {
	
	@Autowired
	CollegeService collegeService;

	@PostMapping
	public String addCollege(@RequestBody College college) {
		collegeService.addCollege(college);
		return " College Added Successfully";
	}

	@GetMapping("{id}")
    public College getCollege(@PathVariable Integer id) {	
		return collegeService.getCollege(id);	
    }
	
	@DeleteMapping("{id}")
	public String deleteCollege(@PathVariable Integer id ) {
		
		return collegeService.deleteCollege(id);
		  
	}
}