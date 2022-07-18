/*package com.cg.onlineeycare.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.onlineeyecare.model.PatientDTO;
import com.cg.onlineeyecare.repository.PatientRepository;
import com.cg.onlineeyecare.service.PatientService;
import com.cg.onlineeyecare.serviceimpl.PatientServiceImpl;
import com.cg.onlineeyecare.util.Converter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientSystemApplicationTests {
	@Mock
	private PatientRepository patientRepository;
	
	@Mock
	private Converter converter;
	
	@InjectMocks
	private PatientService patientService = new PatientServiceImpl();
	
	@BeforeEach
	void setMockOutput() {
		this.patientService = new PatientServiceImpl(this.patientRepository, new Converter());
	}
	
	@Test
	void TestAddTest() {
		
		PatientDTO patient = new PatientDTO();
		patient.setPatientId((int) 1);
		patient.setPatientName("Tarang");
		patient.setPatientDescription("This is a X-RAY test.");
		patient.setPatientType("X-RAY");
		patient.setPatientCost(800);
		
		Patients patientsEntity = converter.convertToPatientEntity(patient);

}*/
