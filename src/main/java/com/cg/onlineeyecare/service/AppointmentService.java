package com.cg.onlineeyecare.service;
import java.time.LocalDate;
import java.util.List;

import com.cg.onlineeyecare.entity.Appointment;
import com.cg.onlineeyecare.exception.AppointmentIdNotFoundException;
import com.cg.onlineeyecare.model.AppointmentDTO;

public interface AppointmentService {
	public Appointment saveOrUpdateAppointment(AppointmentDTO appointmentDTO) ;
	public void cancelAppointment(int appointmentId) throws AppointmentIdNotFoundException;
	Appointment viewAppointment(int appointmentId) throws AppointmentIdNotFoundException;
	List<AppointmentDTO> getAllAppointment();
	List<AppointmentDTO> getAppointment(LocalDate date);
	

}
