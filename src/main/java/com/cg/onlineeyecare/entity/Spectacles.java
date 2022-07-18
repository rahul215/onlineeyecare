package com.cg.onlineeyecare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Spectacles {
    @Id
	private int spectaclesId;
	private String spectaclesNumber;
	private String spectaclesModel;
	private String spectaclesDescription;
	private Double spectaclesCost;
	public Spectacles(int spectaclesId, String spectaclesNumber, String spectaclesModel, String spectaclesDescription,
			Double spectaclesCost) {
		super();
		this.spectaclesId = spectaclesId;
		this.spectaclesNumber = spectaclesNumber;
		this.spectaclesModel = spectaclesModel;
		this.spectaclesDescription = spectaclesDescription;
		this.spectaclesCost = spectaclesCost;
	}
	public Spectacles() {
		super();
	}
	@Override
	public String toString() {
		return "Spectacles [spectaclesId=" + spectaclesId + ", spectaclesNumber=" + spectaclesNumber
				+ ", spectaclesModel=" + spectaclesModel + ", spectaclesDescription=" + spectaclesDescription
				+ ", spectaclesCost=" + spectaclesCost + "]";
	}
	public int getSpectaclesId() {
		return spectaclesId;
	}
	public void setSpectaclesId(int spectaclesId) {
		this.spectaclesId = spectaclesId;
	}
	public String getSpectaclesNumber() {
		return spectaclesNumber;
	}
	public void setSpectaclesNumber(String spectaclesNumber) {
		this.spectaclesNumber = spectaclesNumber;
	}
	public String getSpectaclesModel() {
		return spectaclesModel;
	}
	public void setSpectaclesModel(String spectaclesModel) {
		this.spectaclesModel = spectaclesModel;
	}
	public String getSpectaclesDescription() {
		return spectaclesDescription;
	}
	public void setSpectaclesDescription(String spectaclesDescription) {
		this.spectaclesDescription = spectaclesDescription;
	}
	public Double getSpectaclesCost() {
		return spectaclesCost;
	}
	public void setSpectaclesCost(Double spectaclesCost) {
		this.spectaclesCost = spectaclesCost;
	}
	
	            
}
