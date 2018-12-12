package com.ztesoft.demo.springboot_demo.service;

import com.ztesoft.demo.springboot_demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
	List<Employee> selectAll();

	Employee selectById(String employeeId);
}
