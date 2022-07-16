package com.cg.onlineeyecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.onlineeyecare.entity.Test;


@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
	Test findByTestId(Long testId);
}
