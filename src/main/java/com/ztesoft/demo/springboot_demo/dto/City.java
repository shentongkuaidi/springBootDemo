package com.ztesoft.demo.springboot_demo.dto;

import java.util.List;

public class City {
	private int id;
	private String name;
	private List<Region> children;

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

	public List<Region> getChildren() {
		return children;
	}

	public void setChildren(List<Region> children) {
		this.children = children;
	}
}
