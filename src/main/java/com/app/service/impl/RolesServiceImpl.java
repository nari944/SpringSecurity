package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Roles;
import com.app.repo.RolesRepository;
import com.app.service.IRolesService;

@Service
public class RolesServiceImpl implements IRolesService {

	@Autowired
	private RolesRepository repo;
	
	 
	@Override
	public List<Roles> getAllRoles() {
		return repo.findAll();
	}


	@Override
	public Roles getById(Integer roleId) {
	// TODO Auto-generated method stub
		return repo.getOne(roleId);
	}

}
