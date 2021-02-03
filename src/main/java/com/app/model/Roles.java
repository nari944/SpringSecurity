package com.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Roles {
	
	@Id
	@Column(name="role_id")
	private Integer roleId;
	@Column(name="role_name") 
	private String roleName;
	
	
	@ManyToMany(mappedBy="roles")
	private List<User> user;


	public Integer getRoleId() {
		return roleId;
	}


	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public List<User> getUser() {
		return user;
	}


	public void setUser(List<User> user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", roleName=" + roleName + ", user=" + user + "]";
	}


	

	
}
	