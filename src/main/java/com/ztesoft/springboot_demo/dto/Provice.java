package com.ztesoft.springboot_demo.dto;

import java.util.List;

public class Provice {
	private int id;
	private String name;
	private List<City> children;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getChildren() {
		return children;
	}

	public void setChildren(List<City> children) {
		this.children = children;
	}
}
