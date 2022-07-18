package com.cg.onlineeyecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.onlineeyecare.entity.Signups;
import com.google.common.base.Optional;

@Repository
public interface SignUpRepository extends JpaRepository<Signups, Integer>{

	Optional<Signups>findByUsername(String username);
	Optional<Signups>findByPassword(String password);


}
