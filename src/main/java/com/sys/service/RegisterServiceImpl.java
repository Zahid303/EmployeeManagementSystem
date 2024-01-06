package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.model.Employee;
import com.sys.model.Register;
import com.sys.repository.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	private RegisterRepository registerRepository;  

	@Override
	public List<Register> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveRegister(Register register) {

		registerRepository.save(register);
		
	}

	@Override
	public Employee getRegisterId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRegisterById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean login(String userEmail, String userPassword) {
		
		Register resgister = registerRepository.findByUserEmail(userEmail);
		if(resgister==null) {
			return false;
		}
		if(userEmail.equals(resgister.getUserEmail()) && userPassword.equals(resgister.getUserPassword())) {
			return true;
		}else {
			return false;
		}
	}

}
