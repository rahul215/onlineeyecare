package com.cg.onlineeyecare.util;

import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Component;

import com.cg.onlineeyecare.entity.Report;
import com.cg.onlineeyecare.model.ReportDTO;

@Component
public class Converter {
	public Report convertToReportEntity(ReportDTO reportDTO) {
		Report report =new Report();
				
		if(reportDTO != null) {
			BeanUtils.copyProperties(reportDTO, report);
		}
		
		return report;
	}
	
	public ReportDTO convertToReportDTO(Report report) {
		ReportDTO reportDTO=new ReportDTO();
		
		if(report != null) {
			BeanUtils.copyProperties(report, reportDTO);			
		}
		
		return reportDTO;
	}
	

}
