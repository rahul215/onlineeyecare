package com.cg.onlineeyecare.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.cg.onlineeyecare.entity.Appointment;
import com.cg.onlineeyecare.model.AppointmentDTO;

@Component
public class Converter {
	public Appointment convertToAppointmentEntity(AppointmentDTO appointmentDTO) {
		Appointment appointment= new Appointment();
		if(appointmentDTO != null) {
			BeanUtils.copyProperties(appointmentDTO, appointment);
		}
		return appointment;
				
	}
	public AppointmentDTO convertToAppointmentDTO(Appointment appointment) {
		AppointmentDTO appointmentDTO= new AppointmentDTO();
		if(appointment != null) {
			BeanUtils.copyProperties(appointment, appointmentDTO);
		}
		return appointmentDTO;
	}

}
