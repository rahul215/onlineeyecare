package com.cg.onlineeyecare.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class TestDTO {

	private Long testId;
	@NotBlank(message = "Test name is required.")
	@Size(min=2,max=10,message="Please use 2 to 10 characters only")
	private String testName;
	@NotBlank(message = "Test type is required.")
	@Size(min=2,max=10,message="Please use 2 to 10 characters only")
	private String testType;
	@NotBlank(message = "Test description is required.")
	@Size(min=2,max=20,message="Please use 2 to 20 characters only")
	private String testDescription;
	@NotBlank(message = "Test Cost is required.")
	@Min(value = 0)
	private double testCost;
	
	public TestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TestDTO(Long testId, String testName, String testType, String testDescription, double testCost) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testType = testType;
		this.testDescription = testDescription;
		this.testCost = testCost;
	}
	public Long getTestId() {
		return testId;
	}
	public void setTestId(Long testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public String getTestDescription() {
		return testDescription;
	}
	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}
	public double getTestCost() {
		return testCost;
	}
	public void setTestCost(double testCost) {
		this.testCost = testCost;
	}
	
	@Override
	public String toString() {
		return "TestDTO [testId=" + testId + ", testName=" + testName + ", testType=" + testType + ", testDescription="
				+ testDescription + ", testCost=" + testCost + "]";
	}
	
}
