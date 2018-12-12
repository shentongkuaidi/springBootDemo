package com.ztesoft.demo.springboot_demo.service.Impl;

import com.ztesoft.demo.springboot_demo.dao.JdbcDao;
import com.ztesoft.demo.springboot_demo.entity.Employee;
import com.ztesoft.demo.springboot_demo.service.EmployeeService;
import com.ztesoft.demo.springboot_demo.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private JdbcDao jdbcDao;

	@Override
	public List<Employee> selectAll(){
		return employeeDao.selectAll();
	}

	@Override
	public Employee selectById(String employeeId){
		return employeeDao.selectById(employeeId);
	}

	public Employee queryOne(String id){
		return jdbcDao.queryOne(id);
	}
}
