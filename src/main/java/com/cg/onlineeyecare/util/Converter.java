package com.cg.onlineeyecare.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.cg.onlineeyecare.entity.Patient;
import com.cg.onlineeyecare.model.PatientDTO;

@Component
public class Converter {

	public Patient convertToPatientEntity(PatientDTO patientDTO) {
		Patient patient =new Patient();
				
		if(patientDTO != null) {
			BeanUtils.copyProperties(patientDTO, patient);
		}
		
		return patient;
	}
	
	public PatientDTO convertToPatientDTO(Patient patient) {
		PatientDTO patientDTO=new PatientDTO();
		
		if(patient != null) {
			BeanUtils.copyProperties(patient, patientDTO);			
		}
		
		return patientDTO;
	}
}