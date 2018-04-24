package com.ztesoft.springboot_demo.dto;

import com.ztesoft.springboot_demo.entity.City;
import com.ztesoft.springboot_demo.entity.Provice;
import com.ztesoft.springboot_demo.entity.Region;

import java.util.List;

public class Area {
	private List<Provice> pList;
	private List<City> cList;
	private List<Region> rList;

	public List<Provice> getpList() {
		return pList;
	}

	public void setpList(List<Provice> pList) {
		this.pList = pList;
	}

	public List<City> getcList() {
		return cList;
	}

	public void setcList(List<City> cList) {
		this.cList = cList;
	}

	public List<Region> getrList() {
		return rList;
	}

	public void setrList(List<Region> rList) {
		this.rList = rList;
	}
}
