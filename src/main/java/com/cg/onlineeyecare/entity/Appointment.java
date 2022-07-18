package com.cg.onlineeyecare.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="Appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="appointment_Id")
	private int appointmentId;
	
	@Column(name="consultation_Fee")
	private double consultationFee;
	
	@Column(name = "appointment_time", columnDefinition = "TIME")
	private LocalDateTime dateAndTimeOfAppointment;

	
	public Appointment() {
		super();
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	public LocalDateTime getDateAndTimeOfAppointment() {
		return dateAndTimeOfAppointment;
	}

	public void setDateAndTimeOfAppointment(LocalDateTime DateAndTimeOfAppointment) {
		this.dateAndTimeOfAppointment = DateAndTimeOfAppointment;
	}

	

	public Appointment(int appointmentId, double consultationFee, LocalDateTime dateAndTimeOfAppointment
			) {
		super();
		this.appointmentId = appointmentId;
		this.consultationFee = consultationFee;
		this.dateAndTimeOfAppointment = dateAndTimeOfAppointment;
		this.dateAndTimeOfAppointment = dateAndTimeOfAppointment;
	}

	@Override
	public String toString() {
		return "AppointmentDTO [appointmentId=" + appointmentId + ", consultationFee=" + consultationFee
				+ ", DateAndTimeOfAppointment=" + dateAndTimeOfAppointment + "]";
	}
	@PrePersist
	public void onCreate() {
		this.dateAndTimeOfAppointment = LocalDateTime.now();
		//this.DateAndTimeOfAppointment = this.DateAndTimeOfAppointment.plusHours(3);
		
	}
		
	/*@PreUpdate
	public void onUpdate() {
		this.DateAndTimeOfAppointment = DateAndTimeOfAppointment.now();
		//this.DateAndTimeOfAppointment = this.showStartDateTime.plusHours(3);
	}*/
	
	

}
