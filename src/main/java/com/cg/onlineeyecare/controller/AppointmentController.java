package com.cg.onlineeyecare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineeyecare.entity.Appointment;
import com.cg.onlineeyecare.model.AppointmentDTO;
import com.cg.onlineeyecare.service.AppointmentService;
import com.cg.onlineeyecare.serviceimpl.ErrorMapValidationService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	@Autowired
	private ErrorMapValidationService errorMapValidationService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewAppointment(@Validated @RequestBody AppointmentDTO appointmentDTO, BindingResult result){
		ResponseEntity<?> errorMap = errorMapValidationService.mapValidationError(result);
		if(errorMap != null) return errorMap;
		Appointment savedAppointment = appointmentService.saveOrUpdateAppointment(appointmentDTO);
		return new ResponseEntity<Appointment>(savedAppointment, HttpStatus.CREATED);
	}
	
	@GetMapping("/{appointmentId}")
	public ResponseEntity<?> getAppointmentById(@PathVariable int appointmentId){
		Appointment appointment=appointmentService.viewAppointment(appointmentId);
		return new ResponseEntity<Appointment>(appointment, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<AppointmentDTO> getAllAppointments(){
		return appointmentService.getAllAppointment();
	}
	
	@DeleteMapping("/{Id}")
	public ResponseEntity<?> deleteAppointment(@PathVariable int Id){
		appointmentService.cancelAppointment(Id);
		return new ResponseEntity<String>("Appointment by" +Id +"deleted successfully", HttpStatus.OK);
	}
		
	
	
	
}
