package com.cg.onlineeyecare.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineeyecare.entity.Signups;
import com.cg.onlineeyecare.entity.Tests;
import com.cg.onlineeyecare.model.SignUpDTO;
import com.cg.onlineeyecare.model.TestDTO;
import com.cg.onlineeyecare.service.SignUpService;
import com.cg.onlineeyecare.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/signUps")
public class SignUpController {

	@Autowired
	private SignUpService signUpService;
	
	@Autowired
	MapValidationErrorService mapValidationErrorService;

	@PostMapping("/signUp")
	public ResponseEntity<?> addUsers(@Valid @RequestBody SignUpDTO signUpDTO, BindingResult result){
		ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		
		Signups  savedSignUp = signUpService.signUp(signUpDTO);
		return new ResponseEntity<Signups>(savedSignUp, HttpStatus.OK);	
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUsers(@Valid @RequestBody SignUpDTO signUpDTO, BindingResult result){
		ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		
		String  savedSignUp = signUpService.login(signUpDTO);
		return new ResponseEntity<String>(savedSignUp, HttpStatus.OK);	
	}
}











