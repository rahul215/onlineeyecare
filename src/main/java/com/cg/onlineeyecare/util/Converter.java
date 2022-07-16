package com.cg.onlineeyecare.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.cg.onlineeyecare.entity.Test;
import com.cg.onlineeyecare.model.TestDTO;

@Component
public class Converter {
	
	public Test convertToTestEntity(TestDTO testDTO) {
		Test test = new Test();
				
		if(testDTO != null) {
			BeanUtils.copyProperties(testDTO, test);
		}
		
		return test;
	}
	
	public TestDTO convertToTestDTO(Test test) {
		TestDTO testDTO = new TestDTO();
		
		if(test != null) {
			BeanUtils.copyProperties(test, testDTO );			
		}
		
		return testDTO ;
	}
	
	

}
