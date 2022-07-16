package com.cg.onlineeyecare.service;

import java.util.List;

import com.cg.onlineeyecare.entity.Test;
import com.cg.onlineeyecare.exception.TestIdNotFoundException;
import com.cg.onlineeyecare.model.TestDTO;


public interface TestService { 

	Test addOrUpdateTest(TestDTO testDTO);

	void removeTest(Long testId) throws TestIdNotFoundException;

	TestDTO viewTest(int testId)throws TestIdNotFoundException;

	List<TestDTO> viewAllTests();
	
}
