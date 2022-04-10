package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.model.Employee;
import com.shopping.repository.EmployeeRepository;
import com.shopping.service.EmployeeService;

@RestController
public class EmployeeController {
	@GetMapping(value = "/")
	public String getPage() {
		return "abbcccc";
	}
//	@Autowired
//	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = "/employee")
	public List<Employee>getEmployee() {
		return employeeService.getAll();
	}
	
//	@PostMapping(value = "/save")
//	public Boolean saveEmployee(@RequestBody Employee employee) {
//		employeeRepository.save(employee);
//		return true;
//	}
//	
//	@PutMapping(value = "update/{id}")
//	public Boolean update(@PathVariable long id, @RequestBody Employee employee) {
//		try {
//			Employee update = employeeRepository.findById(id).get();
//			update.setName(employee.getName());
//			update.setPhone(employee.getPhone());
//			employeeRepository.save(update);
//			return true;
//		} catch (Exception e) {
//			// TODO: handle exception
//			return false;
//		}
//	}
//	
//	@DeleteMapping(value = "delete/{id}")
//	public String delete(@PathVariable long id) {
//		Employee delete = employeeRepository.findById(id).get();
//		employeeRepository.delete(delete);
//		return "Delete empleyee with the id: " + id;
//	}
}
