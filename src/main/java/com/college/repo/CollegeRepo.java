package com.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entity.College;

@Repository
public interface CollegeRepo extends JpaRepository<College, Integer> {

}
