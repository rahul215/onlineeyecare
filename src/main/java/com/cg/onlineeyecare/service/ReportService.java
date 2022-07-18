package com.cg.onlineeyecare.service;

import com.cg.onlineeyecare.exception.ReportIdNotFoundException;
import com.cg.onlineeyecare.model.ReportDTO;


public interface ReportService {
	
	
	public String addReport(ReportDTO reportDTO);

	public String updateReport(ReportDTO reportDTO);

	public String removeReport(int reportId)throws ReportIdNotFoundException;

	
	ReportDTO viewReport(int reportId )throws ReportIdNotFoundException ;

	List<Spectacles>  viewSpetacles();

}
