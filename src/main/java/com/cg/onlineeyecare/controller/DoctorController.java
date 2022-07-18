package com.cg.onlineeyecare.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineeyecare.entity.Doctor;
import com.cg.onlineeyecare.model.DoctorDTO;
import com.cg.onlineeyecare.service.DoctorService;
import com.cg.onlineeyecare.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	
	@PostMapping("")
	public ResponseEntity<?> createNewDoctor(@Valid @RequestBody DoctorDTO doctorDTO,BindingResult result ) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap != null) return errorMap;
		
		Doctor savedDoctor = doctorService.addDoctorOrUpdate(doctorDTO);
		return new ResponseEntity<Doctor>(savedDoctor,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public Iterable<DoctorDTO> getAllDoctors(){
		return doctorService.viewDoctorsList();
	}
	
	@GetMapping("/{doctorId}")
	public ResponseEntity<?> getLoginbyUsername(@PathVariable int doctorId){
		Doctor doctor = doctorService.viewDoctor(doctorId);
		return new ResponseEntity<Doctor>(doctor,HttpStatus.OK);	
	}
	
	
	@DeleteMapping("/{doctorId}")
	public ResponseEntity<?> deleteLogin(@PathVariable int doctorId){
		doctorService.deleteDoctor(doctorId);
		return new ResponseEntity<String>("doctor ID : "+doctorId+" deleted successfully!",HttpStatus.OK);
		
	}
	
}
