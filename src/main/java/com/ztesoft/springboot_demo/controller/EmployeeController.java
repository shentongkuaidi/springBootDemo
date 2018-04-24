package com.ztesoft.springboot_demo.controller;

import com.ztesoft.springboot_demo.dao.JdbcDao;
import com.ztesoft.springboot_demo.entity.Employee;
import com.ztesoft.springboot_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@PropertySource("classpath:config/test.yml")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private JdbcDao jdbcDao;

//	配置文件
	@Value("${employee.name}")
	private String name;
	@Value("${employee.sex}")
	private String sex;
	@Value("${employee.age}")
	private int age;
//	自定义配置文件
	@Value("${hello}")
	private String hello;

	//测试
	@GetMapping(value = "/hello")
	public String hello(){
		return "hello";
	}

	//jdbc
	@GetMapping("/queryOne/{id}")
	public Employee queryOne(@PathVariable("id") String id){
		return jdbcDao.queryOne(id);
	}

	//员工列表
	@RequestMapping(value = "/list")
	public Map<String,Object> selectAll(){
		Map<String,Object> resultMap = new HashMap<>();
		resultMap.put("employeeList",employeeService.selectAll());
		return resultMap;
	}

	//读取配置文件里的属性
	@GetMapping("/getValue1")
	public String getValue1(){
		return name+" "+sex+" "+age;
	}

	//读取自定义配置文件里的属性
	@GetMapping("/getValue2")
	public String getValue2(){
		return "hello！ "+hello;
	}

//	异常测试
	@RequestMapping("/home")
	public String home(){
		Employee e= null;
		System.out.println("执行中!");
		System.out.println(1/0);
		System.out.println(e.toString());
		return "true";
	}

}
