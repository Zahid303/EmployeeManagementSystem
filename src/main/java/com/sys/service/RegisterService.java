package com.sys.service;

import java.util.List;

import com.sys.model.Employee;
import com.sys.model.Register;

public interface RegisterService {

	List<Register> getAllEmployees();

	void saveRegister(Register register);
	
	Employee getRegisterId(long id);
	
	void deleteRegisterById(long id);

	public boolean login(String userEmail, String userPassword);
}
