package com.lab.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.Repository.studentRepository;

@Service
public class studentService {

	
	@Autowired
	studentRepository reposiotory;
	
	
	
}
