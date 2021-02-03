package com.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Roles;
import com.app.model.User;
import com.app.service.IRolesService;
import com.app.service.IUserService;

@Controller
public class HomeController {

	private static final Integer Integer = null;
	@Autowired
	private IUserService service;

	@Autowired
	private IRolesService roleservice;

	private void commonUi(Model map) {
		List<Roles> rolelist = roleservice.getAllRoles();
		map.addAttribute("rolelist", rolelist);
	}

	@RequestMapping("/")
	public String show() {
		System.out.println("security");
		return "Home";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "Login";
	}

	@RequestMapping("/logout")
	public String logoutPage() {
		return "Login";
	}

	@RequestMapping("/admin")
	public String adminPage() {
		System.out.println("adminn");
		return "Admin";
	}

	@RequestMapping("/manager")
	public String managerPage() {
		return "Manager";
	}

	@RequestMapping("/adduser")
	public String adduser(Model map) {
		System.out.println("narrrrrrrr");

		List<Roles> role = roleservice.getAllRoles();
		/*
		 * for (Roles roles : role) { System.out.println(roles.getRoleId() + "----" +
		 * roles.getRoleName()); }
		 */
		map.addAttribute("roles", role);

		map.addAttribute("user", new User());
		// commonUi(map);
		return "Adduser";

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute User user, @RequestParam(value = "roleId") Integer roleId, Model map) {
		Roles byId = roleservice.getById(roleId);

		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getRoleName());
		System.out.println("venuuuuu");

		

		user.setRoles(Arrays.asList(byId));
		Integer id = service.saveUser(user);
		String msg = "User '" + id + "' saved";
		map.addAttribute("msg", msg);
		return "Adduser";

	}

	@RequestMapping("/all")
	public String showAll(Model map) {
		List<User> list = service.getAllUsers();
		//System.out.println(list);
		map.addAttribute("list", list);
		return "Data";

	}
	/*
	 * @RequestMapping(value="/edit") public String showOne(@RequestParam Integer
	 * id,Model map) { User user=service.getUserById(id); map.addAttribute("user",
	 * user); map.addAttribute("Mode", "Edit"); return "Adduser"; }
	 */

	/*
	 * @RequestMapping("/view") public String viewOne(@RequestParam Integer id,
	 * Model map) { Roles role=service.getRoleById(id); map.addAttribute("r", role);
	 * return "Viewone";
	 * 
	 * }
	 */
}
