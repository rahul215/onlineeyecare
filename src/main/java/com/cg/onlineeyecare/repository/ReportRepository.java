package com.cg.onlineeyecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineeyecare.entity.Report;

public interface ReportRepository extends JpaRepository <Report,Integer>{
	
}
