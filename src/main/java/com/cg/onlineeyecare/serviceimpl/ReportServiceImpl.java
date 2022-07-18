package com.cg.onlineeyecare.serviceimpl;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.onlineeyecare.repository.ReportRepository;
import com.cg.onlineeyecare.repository.SpectaclesRepository;
import com.cg.onlineeyecare.entity.Report;
import com.cg.onlineeyecare.entity.Spectacles;
import com.cg.onlineeyecare.exception.ReportIdNotFoundException;
import com.cg.onlineeyecare.model.ReportDTO;
import com.cg.onlineeyecare.service.ReportService;
import com.cg.onlineeyecare.util.Converter;


@Service
public class ReportServiceImpl implements ReportService{
	
	public ReportServiceImpl() {
		super();
	}
	public ReportServiceImpl(ReportRepository reportRepository, Converter converter) {
		super();
		this.reportRepo = reportRepository;
		this.converter=converter;
	}

	@Autowired
	private ReportRepository reportRepo;
	
	
	@Autowired
	private SpectaclesRepository spectaclesRepo;

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
	public List<Spectacles> viewSpetacles() {
		
    List<Spectacles>spectacles = spectaclesRepo.findAll();
		
		List<Spectacles> spectaclesList = new ArrayList<>();
		
		for(Spectacles spectacle : spectacles) {
			spectaclesList.add(spectacle);
		}
		return spectaclesList;
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
