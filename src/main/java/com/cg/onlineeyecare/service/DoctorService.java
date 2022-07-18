package com.cg.onlineeyecare.service;

import java.util.List;

import com.cg.onlineeyecare.entity.Doctor;
import com.cg.onlineeyecare.exception.DoctorIdNotFoundException;
import com.cg.onlineeyecare.model.DoctorDTO;

public interface DoctorService {
	
	Doctor addDoctorOrUpdate(DoctorDTO doctorDTO);
	
	void deleteDoctor(int doctorId) throws DoctorIdNotFoundException;
	
	Doctor viewDoctor(int doctorId) throws DoctorIdNotFoundException;
	
	List<DoctorDTO> viewDoctorsList();
	
	//List<Appointment> viewAppointments();
	//Test createTest(Test test);
}
