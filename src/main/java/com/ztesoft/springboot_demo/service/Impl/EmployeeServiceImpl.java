package com.ztesoft.springboot_demo.service.Impl;

import com.ztesoft.springboot_demo.dao.EmployeeDao;
import com.ztesoft.springboot_demo.dao.JdbcDao;
import com.ztesoft.springboot_demo.entity.Employee;
import com.ztesoft.springboot_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	public Employee queryOne(String id){
		return jdbcDao.queryOne(id);
	}
}
