package com.cg.onlineeyecare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;
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

import com.cg.onlineeyecare.entity.Patient;
import com.cg.onlineeyecare.model.PatientDTO;
import com.cg.onlineeyecare.service.PatientService;
import com.cg.onlineeyecare.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/patients")
public class PatientController {
	@Autowired
	private PatientService patientService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewPatient(@Valid @RequestBody PatientDTO patientDTO, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap != null) return errorMap;
	
		Patient savedPatient = patientService.saveOrUpdate(patientDTO);
		return new ResponseEntity<Patient>(savedPatient,HttpStatus.CREATED);
	}
	
	@GetMapping("/{patientId}")
	public ResponseEntity<?> getLoginbyUsername(@PathVariable int patientId) {
		Patient patient = patientService.findPatientById(patientId);
		return new ResponseEntity<Patient>(patient,HttpStatus.OK);
	}

	@GetMapping("/all")
	public Iterable<PatientDTO> getAllLogins(){
		return patientService.findAllPatient();
	}

	@DeleteMapping("/{Id}")
	public ResponseEntity<?> deletePatient(@PathVariable int Id) {
	patientService.deletePatientById(Id);
	return new ResponseEntity<String>("Patient deleted by ID : "+Id+" deleted successfully!",HttpStatus.OK);
	}


}
