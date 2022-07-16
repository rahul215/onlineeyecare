package com.cg.onlineeyecare.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.onlineeyecare.repository.ReportRepository;

import com.cg.onlineeyecare.entity.Report;
import com.cg.onlineeyecare.exception.ReportIdNotFoundException;
import com.cg.onlineeyecare.model.ReportDTO;
import com.cg.onlineeyecare.service.ReportService;
import com.cg.onlineeyecare.util.Converter;


@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private ReportRepository reportRepo;

	@Autowired
	private Converter converter;

	@Override
	public String addReport(ReportDTO reportDTO) {
		String message = null;
		Report report = null;
		
		report = reportRepo.save(converter.convertToReportEntity(reportDTO));
		
		if (report != null) {
			message = "Report Added Successful.";
		}
		return message;
	}

	@Override
	public String updateReport(ReportDTO reportDTO) {
		Optional<Report> report = reportRepo.findById(reportDTO.getReportId());

		Report rept = new Report();

		String message = null;
		
		if (report.isPresent()) {
			rept = converter.convertToReportEntity(reportDTO);
			rept = reportRepo.save(rept);
			
			if(rept != null) {
				message = new String("Report updated successfully.");
			}
		} else {
			throw new ReportIdNotFoundException("No such Report");
		}
		
		return message;
	}

	@Override
	public String removeReport(int reportId) {
		Optional<Report> report = reportRepo.findById(reportId);

		String message = null;
		
		if (report.isPresent()) {
			reportRepo.deleteById(reportId);
			
			message = new String("Record deleted successfully.");
		}else {
			throw new ReportIdNotFoundException("No such Report ");
		}
		
		return message;
	}

	@Override
	public ReportDTO viewReport(int reportId) {
		Optional<Report> report = reportRepo.findById(reportId);

		Report rept = null;
		
		if (report.isPresent()) {
			rept = report.get();
		}else {
			throw new ReportIdNotFoundException("No such Report");
		}
		
		return converter.convertToReportDTO(rept);
	}
	}
