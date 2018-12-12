package com.ztesoft.demo.springboot_demo.dao;

import com.ztesoft.demo.springboot_demo.entity.Employee;

import java.util.List;

public interface EmployeeDao {
	List<Employee> selectAll();

	Employee selectById(String employeeId);
}
