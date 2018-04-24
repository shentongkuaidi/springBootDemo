package com.ztesoft.springboot_demo.dao;

import com.ztesoft.springboot_demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcDao {

	@Autowired
	JdbcTemplate template;

	public Employee queryOne(String id){
		return template.queryForObject("select id,name,sex,age,job from employee where id=?", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int i) throws SQLException {
				Employee employee = new Employee();
				employee.setId(rs.getString("id"));
				employee.setName(rs.getString("name"));
				employee.setSex(rs.getString("sex"));
				employee.setAge(rs.getInt("age"));
				employee.setJob(rs.getString("job"));
				return employee;
			}
		},id);
	}
}
