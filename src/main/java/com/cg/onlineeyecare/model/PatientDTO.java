package com.cg.onlineeyecare.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
public class PatientDTO {
	

	private int patientId;
	@NotBlank(message="Patient Name is Required")
	private String patientName;
	private int patientAge;
	private long patientMobile;
	private String patientEmail;
	private String patientUserName;
	private String patientPassword;
	private String address;

	
	public PatientDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientDTO(int patientId, String patientName, int patientAge, long patientMobile, String patientEmail,
			String patientUserName, String patientPassword, String address) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientMobile = patientMobile;
		this.patientEmail = patientEmail;
		this.patientUserName = patientUserName;
		this.patientPassword = patientPassword;
		this.address = address;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public long getPatientMobile() {
		return patientMobile;
	}

	public void setPatientMobile(long patientMobile) {
		this.patientMobile = patientMobile;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}


	public String getPatientUserName() {
		return patientUserName;
	}

	public void setPatientUserName(String patientUserName) {
		this.patientUserName = patientUserName;
	}

	public String getPatientPassword() {
		return patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PatientDTO [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", patientMobile=" + patientMobile + ", patientEmail=" + patientEmail + ", patientUserName="
				+ patientUserName + ", patientPassword=" + patientPassword + ", address=" + address + "]";
	}
	

}
