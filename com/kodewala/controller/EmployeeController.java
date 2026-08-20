package com.kodewala.controller;

import com.kodewala.entity.Employee;
import com.kodewala.exception.EmployeeNotFoundException;
import com.kodewala.service.IEmployeeService;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author:GOURAV CHOPRA 
 *  Generated F/w:SHWR-Framework 
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;

	@GetMapping("/register")
	public String registerEmployee(Model model) {
		model.addAttribute("employee",new Employee());
		return "EmployeeRegister";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee, Model model) {
		java.lang.Long id=service.saveEmployee(employee);
		model.addAttribute("message","Employee created with Id:"+id);
		model.addAttribute("employee",new Employee()) ;
		return "EmployeeRegister";
	}

	@GetMapping("/all")
	public String getAllEmployees(Model model,
			@RequestParam(value = "message", required = false) String message) {
		List<Employee> list=service.getAllEmployees();
		model.addAttribute("list",list);
		model.addAttribute("message",message);
		return "EmployeeData";
	}

	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam Long id, RedirectAttributes attributes) {
		try {
			service.deleteEmployee(id);
			attributes.addAttribute("message","Employee deleted with Id:"+id);
		} catch(EmployeeNotFoundException e) {
			e.printStackTrace() ;
			attributes.addAttribute("message",e.getMessage());
		}
		return "redirect:all";
	}

	@GetMapping("/edit")
	public String editEmployee(@RequestParam Long id, Model model, RedirectAttributes attributes) {
		String page=null;
		try {
			Employee ob=service.getOneEmployee(id);
			model.addAttribute("employee",ob);
			page="EmployeeEdit";
		} catch(EmployeeNotFoundException e) {
			e.printStackTrace() ;
			attributes.addAttribute("message",e.getMessage());
			page="redirect:all";
		}
		return page;
	}

	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee employee, RedirectAttributes attributes) {
		service.updateEmployee(employee);
		attributes.addAttribute("message","Employee updated");
		return "redirect:all";
	}
}
