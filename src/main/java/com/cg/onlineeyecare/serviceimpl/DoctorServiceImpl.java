package com.cg.onlineeyecare.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineeyecare.entity.Doctor;
import com.cg.onlineeyecare.exception.DoctorIdNotFoundException;
import com.cg.onlineeyecare.model.DoctorDTO;
import com.cg.onlineeyecare.repository.DoctorRepository;
import com.cg.onlineeyecare.service.DoctorService;
import com.cg.onlineeyecare.util.Converter;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepo;

	@Autowired
	private Converter converter;

	@Override
	public Doctor addDoctorOrUpdate(DoctorDTO doctorDTO) {
		// TODO Auto-generated method stub
		return doctorRepo.save(converter.convertToDoctorEntity(doctorDTO));
	}

	@Override
	public void deleteDoctor(int doctorId) throws DoctorIdNotFoundException {
		// TODO Auto-generated method stub
		Doctor doctor = doctorRepo.findByDoctorId(doctorId);
		if(doctor == null) {
			throw new DoctorIdNotFoundException("Doctor not Found By ID : " + doctorId);
		}
		doctorRepo.deleteById(doctorId);
		
	}

	@Override
	public Doctor viewDoctor(int doctorId) throws DoctorIdNotFoundException {
		// TODO Auto-generated method stub
		try {
			return doctorRepo.findByDoctorId(doctorId);
		}
		catch(Exception e) {
			throw new DoctorIdNotFoundException("doctor not found by given id : "+doctorId);
		}
	}

	@Override
	public List<DoctorDTO> viewDoctorsList() {
		// TODO Auto-generated method stub
		
		List<Doctor>doctors = doctorRepo.findAll();
		
		List<DoctorDTO> doctorsDTOList = new ArrayList<>();
		
		for(Doctor doctor : doctors) {
			doctorsDTOList.add(converter.convertToDoctorDTO(doctor));
		}
		return doctorsDTOList;
	}
	
	

}
