package com.ztesoft.springboot_demo.dao;

import com.ztesoft.springboot_demo.entity.Employee;
import java.util.List;

public interface EmployeeDao {
	List<Employee> selectAll();
}
