package com.cg.onlineeyecare.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.cg.onlineeyecare.entity.Doctor;
import com.cg.onlineeyecare.model.DoctorDTO;

@Component
public class Converter {

	public Doctor convertToDoctorEntity(DoctorDTO doctorDTO) {
		Doctor doctor =new Doctor();
				
		if(doctorDTO != null) {
			BeanUtils.copyProperties(doctorDTO, doctor);
		}
		
		return doctor;
	}
	
	public DoctorDTO convertToDoctorDTO(Doctor doctor) {
		DoctorDTO doctorDTO=new DoctorDTO();
		
		if(doctor != null) {
			BeanUtils.copyProperties(doctor, doctorDTO);			
		}
		
		return doctorDTO;
	}
}
