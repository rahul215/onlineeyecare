package com.cg.onlineeyecare.model;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class AppointmentDTO {
	
	private int appointmentId;
	private LocalDateTime dateAndTimeOfAppointment;
	//private LocalTime timeOfAppointment;
	private double consultationFee;
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public LocalDateTime getDateAndTimeOfAppointment() {
		return dateAndTimeOfAppointment;
	}
	public void setDateAndTimeOfAppointment(LocalDateTime dateAndTimeOfAppointment) {
		this.dateAndTimeOfAppointment = dateAndTimeOfAppointment;
	}
	public double getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	public AppointmentDTO(int appointmentId, LocalDateTime dateAndTimeOfAppointment,
			double consultationFee) {
		super();
		this.appointmentId = appointmentId;
		this.dateAndTimeOfAppointment = dateAndTimeOfAppointment;
		this.dateAndTimeOfAppointment = dateAndTimeOfAppointment;
		this.consultationFee = consultationFee;
	}
	public AppointmentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
