package com.cg.onlineeyecare.serviceimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineeyecare.entity.Appointment;
import com.cg.onlineeyecare.exception.AppointmentIdNotFoundException;
import com.cg.onlineeyecare.model.AppointmentDTO;
import com.cg.onlineeyecare.repository.AppointmentRepository;
import com.cg.onlineeyecare.service.AppointmentService;
import com.cg.onlineeyecare.util.Converter;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	private AppointmentRepository appointmentRepo;
	
	@Autowired
	private  Converter converter;

	@Override
	public Appointment saveOrUpdateAppointment(AppointmentDTO appointmentDTO) {
		// TODO Auto-generated method stub
		return appointmentRepo.save(converter.convertToAppointmentEntity(appointmentDTO));
	}

	@Override
	public void cancelAppointment(int appointmentId) {
		Appointment appointment = appointmentRepo.findByAppointmentId(appointmentId);
		if(appointment==null) {
			throw new AppointmentIdNotFoundException("Appointment not found by Id: "+appointmentId);
		}
		appointmentRepo.deleteById(appointmentId);;
	}

	@Override
	public Appointment viewAppointment(int Id) {
		try {
			return appointmentRepo.findByAppointmentId(Id);
		}
		catch (Exception e) {
			throw new AppointmentIdNotFoundException("Appointment not found by Id: "+Id);
		}
	}

	@Override
	public List<AppointmentDTO> getAllAppointment() {
		List<Appointment>appointments= appointmentRepo.findAll();
		List<AppointmentDTO>appointmentDTOList= new ArrayList<>();
		for(Appointment appointment: appointments) {
			appointmentDTOList.add(converter.convertToAppointmentDTO(appointment));
		}
		return appointmentDTOList;
	}

	@Override
	public List<AppointmentDTO> getAppointment(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}
}

	