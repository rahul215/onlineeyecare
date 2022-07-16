package com.cg.onlineeyecare.model;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class ReportDTO {
	
	private int reportId;
	
	@NotNull
	private String dateOfReport;
	
	@NotNull
	private String descriptionOfReport;
	
	@NotNull
	private String visualAcuity;
	
	@NotNull
	private String visualAcuityNear;
	
	@NotNull
	private String visualAcuityDistance;

	public int getReportId() {
		return reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public String getDateOfReport() {
		return dateOfReport;
	}

	public void setDateOfReport(String dateOfReport) {
		this.dateOfReport = dateOfReport;
	}

	public String getDescriptionOfReport() {
		return descriptionOfReport;
	}

	public void setDescriptionOfReport(String descriptionOfReport) {
		this.descriptionOfReport = descriptionOfReport;
	}

	public String getVisualAcuity() {
		return visualAcuity;
	}

	public void setVisualAcuity(String visualAcuity) {
		this.visualAcuity = visualAcuity;
	}

	public String getVisualAcuityNear() {
		return visualAcuityNear;
	}

	public void setVisualAcuityNear(String visualAcuityNear) {
		this.visualAcuityNear = visualAcuityNear;
	}

	public String getVisualAcuityDistance() {
		return visualAcuityDistance;
	}

	public void setVisualAcuityDistance(String visualAcuityDistance) {
		this.visualAcuityDistance = visualAcuityDistance;
	}

	public ReportDTO(int reportId, @NotNull String dateOfReport, @NotNull String descriptionOfReport,
			@NotNull String visualAcuity, @NotNull String visualAcuityNear, @NotNull String visualAcuityDistance) {
		super();
		this.reportId = reportId;
		this.dateOfReport = dateOfReport;
		this.descriptionOfReport = descriptionOfReport;
		this.visualAcuity = visualAcuity;
		this.visualAcuityNear = visualAcuityNear;
		this.visualAcuityDistance = visualAcuityDistance;
	}

	public ReportDTO() {
		super();
	}
	
	
	

}
