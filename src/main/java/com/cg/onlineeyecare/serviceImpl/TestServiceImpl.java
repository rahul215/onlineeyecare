package com.cg.onlineeyecare.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineeyecare.entity.Test;
import com.cg.onlineeyecare.exception.TestIdNotFoundException;
import com.cg.onlineeyecare.model.TestDTO;
import com.cg.onlineeyecare.repository.TestRepository;
import com.cg.onlineeyecare.service.TestService;
import com.cg.onlineeyecare.util.Converter;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRepository testRepository;
	
	@Autowired
	 private Converter converter;

	/**
	 * Save a test in the database.
	 */
	@Override
	public Test addOrUpdateTest(TestDTO testDTO) {
		Test test = converter.convertToTestEntity(testDTO);
		return testRepository.save(test);
	}

	/**
	 * Remove a Test.
	 */
	@Override
	public void removeTest(Long testId) throws TestIdNotFoundException {
		// TODO Auto-generated method stub
		Test test = testRepository.findByTestId(testId);				
		if(test == null) {
			throw new TestIdNotFoundException("Test Not Present By Id : " + testId);
		}
		testRepository.deleteById(testId);
	}

	/**
	 * View a test's appointment using testId.
	 */
	@Override
	public TestDTO viewTest(int testId) throws TestIdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * View all the tests present.
	 */
	@Override
	public List<TestDTO> viewAllTests() {
		// TODO Auto-generated method stub
		List<Test> tests = testRepository.findAll();
		
		List<TestDTO> testsList = new ArrayList<>();
		for (Test test : tests) {
			testsList.add(converter.convertToTestDTO(test));
		}
		return testsList;
	}
	
}
