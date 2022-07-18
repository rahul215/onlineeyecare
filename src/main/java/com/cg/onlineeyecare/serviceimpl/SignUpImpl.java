package com.cg.onlineeyecare.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineeyecare.entity.Signups;
import com.cg.onlineeyecare.exception.LoginUsernameDoesNotExistsException;
import com.cg.onlineeyecare.exception.SignUsernameAlreadyExistsException;
import com.cg.onlineeyecare.model.SignUpDTO;
import com.cg.onlineeyecare.repository.SignUpRepository;
import com.cg.onlineeyecare.service.SignUpService;
import com.cg.onlineeyecare.util.Converter;
import com.google.common.base.Optional;

@Service
public class SignUpImpl implements SignUpService {
	
	@Autowired
	private SignUpRepository signUpRepository;

	@Override
	public Signups signUp(SignUpDTO signUpDTO) throws SignUsernameAlreadyExistsException {
		Converter converter = new Converter();
		Optional<Signups> data = signUpRepository.findByUsername(signUpDTO.getUsername());
		Signups signUp = converter.convertTOSignUpEntity(signUpDTO);
		
		if(data.isPresent()) {
			throw new SignUsernameAlreadyExistsException("User already present by username : " + signUp.getUsername());
		}
		return signUpRepository.save(signUp);
	}

	@Override
	public String login( SignUpDTO signUpDTO) {
		Converter converter = new Converter();
		Signups signUp = converter.convertTOSignUpEntity(signUpDTO);
		Optional<Signups> data = signUpRepository.findByUsername(signUpDTO.getUsername());
		Optional<Signups> data1 = signUpRepository.findByPassword(signUpDTO.getPassword());
		
		
		if(!data.isPresent()) {
			throw new LoginUsernameDoesNotExistsException(" Username doesnot exists with : " + signUp.getUsername());
		}
		if(!data1.isPresent()) {
				throw new WrongPasswordException(" Wrong Password entered for  : " + signUp.getUsername());
			}
		return "Successfully Logged In.....";
	}
}
