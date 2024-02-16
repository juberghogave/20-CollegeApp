package com.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.College;
import com.college.repo.CollegeRepo;

@Service
public class CollegeService {
	
	@Autowired
	CollegeRepo collegerepo;

	public void addCollege(College college) {
		collegerepo.save(college);
		
		
	}

	public College getCollege(Integer id) {
		
		return collegerepo.findById(id).get();
	}

	public String deleteCollege(Integer id) {
		
		 collegerepo.deleteById(id);
		 
		 return "College with "+id+" Deleted Successfully";
	}

}
