package com.cg.onlineeyecare.entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Report")
public class Report {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int reportId;
		
		private String dateOfReport;
		private String descriptionOfReport;
		private String visualAcuity;
		private String visualAcuityNear;
		private String visualAcuityDistance;
		//private Test    typeOfTest;
		//private Patient patientId;
		
		public Report() {
			super();
			}
			
			
			public Report(int reportId, String dateOfReport, String descriptionOfReport, String visualAcuity,
				String visualAcuityNear, String visualAcuityDistance) {
				
			super();
			this.reportId = reportId;
			this.dateOfReport = dateOfReport;
			this.descriptionOfReport = descriptionOfReport;
			this.visualAcuity = visualAcuity;
			this.visualAcuityNear = visualAcuityNear;
			this.visualAcuityDistance = visualAcuityDistance;
			}
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
		/*
		public Test getTypeOfTest() {
			return typeOfTest;
		}
		public void setTypeOfTest(Test typeOfTest) {
			this.typeOfTest = typeOfTest;
		}
		public Patient getPatientId() {
			return patientId;
		}
		public void setPatientId(Patient patientId) {
			this.patientId = patientId;
		}
		
	}*/
		
		@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", dateOfReport=" + dateOfReport + ", descriptionOfReport="
				+ descriptionOfReport + ", visualAcuity=" + visualAcuity + ", visualAcuityNear=" + visualAcuityNear
				+ ", visualAcuityDistance=" + visualAcuityDistance + "]";
		}

}
