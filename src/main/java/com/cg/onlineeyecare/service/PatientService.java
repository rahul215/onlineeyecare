package com.cg.onlineeyecare.service;

import java.util.List;

import com.cg.onlineeyecare.entity.Patient;
import com.cg.onlineeyecare.exception.PatientIdNotFoundException;
import com.cg.onlineeyecare.model.PatientDTO;


public interface PatientService {
	
	public Patient saveOrUpdate(PatientDTO patientDTO);
	public Patient findPatientById(int patientId) throws PatientIdNotFoundException;

	public List<PatientDTO> findAllPatient();
	public void deletePatientById(int patientId) throws PatientIdNotFoundException;

}
