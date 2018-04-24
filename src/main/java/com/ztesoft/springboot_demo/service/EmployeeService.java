package com.ztesoft.springboot_demo.service;

import com.ztesoft.springboot_demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
	List<Employee> selectAll();
}
