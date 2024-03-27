package com.techietact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.techietact.bo.EmployeeBO;
import com.techietact.dao.EmployeeDao;
import com.techietact.vo.EmployeeVO;

import jakarta.validation.Valid;
@Controller
public class HomeController {
	@Autowired
	private EmployeeDao dao;
@GetMapping("/")
public String hellojsp(Model model) {
	model.addAttribute("employee",new EmployeeBO());
	return "create_employee";
}
@PostMapping("/createEmployee")
public String createEmployee(@Valid @ModelAttribute("employee")EmployeeBO bo,BindingResult result,Model model) {
	if(result.hasErrors()) {
		model.addAttribute("employee",bo);
		return "create_employee";
	}
	EmployeeVO vo =new EmployeeVO();
	vo.setEmployeeName(bo.getEmployeeName());
	vo.setEmail(bo.getEmail());
	vo=dao.saveEmployee(vo);
	return "home";
}
}
