package com.cg.onlineeyecare.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineeyecare.entity.Test;
import com.cg.onlineeyecare.model.TestDTO;
import com.cg.onlineeyecare.service.TestService;
import com.cg.onlineeyecare.serviceImpl.MapValidationErrorService;
import com.cg.onlineeyecare.serviceImpl.TestServiceImpl;


@RestController
@RequestMapping("/api/tests")
public class TestController {

	@Autowired
	private TestService testService;
	
	@Autowired
	MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("/addTest")
	public ResponseEntity<?> createTest(@Valid @RequestBody TestDTO testDTO, BindingResult result){
		
		ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		
		Test savedTest = testService.addOrUpdateTest(testDTO);
		return new ResponseEntity<Test>(savedTest, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/allTests")
	public Iterable<TestDTO> getAllProjects(){
		return testService.viewAllTests();
	}
	
	@DeleteMapping("/{testId}")
	public ResponseEntity<?> deleteProject(@PathVariable Long testId){
		testService.removeTest(testId);
		return new ResponseEntity<String>("Test with id: "+ testId +" deleted Successfully!", HttpStatus.OK);
	}
	
}
