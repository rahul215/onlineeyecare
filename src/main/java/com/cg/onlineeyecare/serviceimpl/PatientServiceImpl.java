package com.cg.onlineeyecare.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineeyecare.entity.Patient;
import com.cg.onlineeyecare.exception.PatientIdNotFoundException;
import com.cg.onlineeyecare.model.PatientDTO;
import com.cg.onlineeyecare.repository.PatientRepository;
import com.cg.onlineeyecare.service.PatientService;
import com.cg.onlineeyecare.util.Converter;


@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepo;

	@Autowired
	private Converter converter;


	@Override
	public Patient saveOrUpdate(PatientDTO patientDTO) {
		// TODO Auto-generated method stub
		return patientRepo.save(converter.convertToPatientEntity(patientDTO));
	}

	

	@Override
	public Patient findPatientById(int Id) {
		// TODO Auto-generated method stub
		try {
			return patientRepo.findByPatientId(Id);
		}
		catch(Exception e) {
			throw new PatientIdNotFoundException("Patient Not Found By Id : "+Id);
		}
	}

	
	@Override
	public List<PatientDTO> findAllPatient() {
		List<Patient>patients = patientRepo.findAll();
		
		List<PatientDTO> patientsDTOList = new ArrayList<>();
		
		for(Patient patient : patients) {
			patientsDTOList.add(converter.convertToPatientDTO(patient));
		}
		return patientsDTOList;
		
	}

	@Override
	public void deletePatientById(int patientId) {
		// TODO Auto-generated method stub
		
		Patient patient = patientRepo.findByPatientId(patientId);
		
		if(patient == null) {
			throw new PatientIdNotFoundException("Patient Not Found By Id : " +patientId);
		}
		patientRepo.deleteById(patientId);
	}
	


}
