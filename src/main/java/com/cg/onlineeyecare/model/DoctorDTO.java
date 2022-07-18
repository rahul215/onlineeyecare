package com.cg.onlineeyecare.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

@Component
public class DoctorDTO {
	
	private int doctorId;
	
	@NotBlank(message="doc name  is mandetory")
	private String doctorName;
	
	@NotBlank(message="consult timing  is mandetory")
	private String doctorConsultationTime;
	
	private long doctorMobile;
	
	@NotBlank(message="doc email  is mandetory")
	@Pattern(regexp = "[A-Za-z0-9]+[@][a-z]+[\\.][a-z]+",message = "{invalid.email}")
	private String doctorEmail;
	
	@NotBlank(message="username  is mandetory")
	private String userName;
	
	@NotBlank(message="password  is mandetory")
	@Pattern(regexp = "[A-Za-z0-9@]{8}",message = "{password should be of 8 charecters}")
	private String password;
	
	private String address;
	
	
	public DoctorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DoctorDTO(int doctorId, @NotBlank(message = "doc name is mandetory") String doctorName,
			String doctorConsultationTime, long doctorMobile, String doctorEmail, String userName, String password,
			String address) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorConsultationTime = doctorConsultationTime;
		this.doctorMobile = doctorMobile;
		this.doctorEmail = doctorEmail;
		this.userName = userName;
		this.password = password;
		this.address = address;
	}

	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorConsultationTime() {
		return doctorConsultationTime;
	}
	public void setDoctorConsultationTime(String doctorConsultationTime) {
		this.doctorConsultationTime = doctorConsultationTime;
	}
	public long getDoctorMobile() {
		return doctorMobile;
	}
	public void setDoctorMobile(long doctorMobile) {
		this.doctorMobile = doctorMobile;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DoctorDTO [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorConsultationTime="
				+ doctorConsultationTime + ", doctorMobile=" + doctorMobile + ", doctorEmail=" + doctorEmail
				+ ", userName=" + userName + ", password=" + password + ", address=" + address + "]";
	}
	
	

}
