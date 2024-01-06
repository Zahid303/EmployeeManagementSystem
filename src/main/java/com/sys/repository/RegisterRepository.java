package com.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sys.model.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long>{
	
	public Register findByUserEmail(String userEmail);

}
