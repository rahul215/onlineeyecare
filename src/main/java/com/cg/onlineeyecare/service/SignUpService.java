package com.cg.onlineeyecare.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.cg.onlineeyecare.entity.Signups;
import com.cg.onlineeyecare.exception.SignUsernameAlreadyExistsException;
import com.cg.onlineeyecare.model.SignUpDTO;


public interface SignUpService {

	Signups signUp(SignUpDTO signUpDTO) throws SignUsernameAlreadyExistsException;

	String login(SignUpDTO signUpDTO);
	
}
