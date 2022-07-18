package com.cg.onlineeyecare.controller;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineeyecare.entity.Spectacles;

import com.cg.onlineeyecare.model.ReportDTO;
import com.cg.onlineeyecare.service.ReportService;


@RestController
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@PostMapping(value = "/addreport")
	public String addReport(@RequestBody ReportDTO reportDTO) {
		return reportService.addReport(reportDTO);
	}
	
	@PutMapping(value = "/updatereport")
	public String updateReport(@RequestBody ReportDTO reportDTO) {
		return reportService.updateReport(reportDTO);
	}
	
	@DeleteMapping(value = "/deletereportid/{reportId}")
	public String removeReport(@PathVariable("reportId") int reportId) {
		return reportService.removeReport(reportId);
	}
	
	@GetMapping(value = "/getreport/{reportId}")
	public ReportDTO viewReport(@PathVariable("reportId") int reportId) {
		return reportService.viewReport(reportId);
	}
	@GetMapping("/getspectacles/all")
	public Iterable<Spectacles> getAllSpectacles(){
		return reportService.viewSpetacles();
	}
	
}
