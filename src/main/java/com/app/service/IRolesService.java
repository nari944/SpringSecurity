package com.app.service;

import java.util.List;

import com.app.model.Roles;

public interface IRolesService {
	public List<Roles> getAllRoles();

	public Roles getById(Integer roleId);

}
