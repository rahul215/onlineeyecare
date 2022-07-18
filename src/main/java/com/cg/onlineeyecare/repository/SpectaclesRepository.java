package com.cg.onlineeyecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineeyecare.entity.Spectacles;

@Repository
public interface SpectaclesRepository extends JpaRepository<Spectacles, Integer> {
	

}
