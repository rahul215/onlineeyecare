package com.cg.onlineeyecare.service;

import com.cg.onlineeyecare.exception.ReportIdNotFoundException;
import com.cg.onlineeyecare.model.ReportDTO;


public interface ReportService {
	
	
	public String addReport(ReportDTO reportDTO);

	public String updateReport(ReportDTO reportDTO);

	public String removeReport(int reportId)throws ReportIdNotFoundException;

	// We have to implement the patient id here which is missing as the integration is not done yet so I am skipping it right now
	ReportDTO viewReport(int reportId /*, int patientId*/)throws ReportIdNotFoundException /*,PatientIdFoundNotException*/;

	//List<Spectacles>  viewSpetacles();

}
