package com.ztesoft.springboot_demo.dao;

import com.ztesoft.springboot_demo.entity.City;
import com.ztesoft.springboot_demo.entity.Provice;
import com.ztesoft.springboot_demo.entity.Region;

import java.util.List;

public interface AreaDao {
	Boolean addProvice(List<Provice> provices);//省份
	Boolean addCity(List<City> citys);//市、区(市级)
	Boolean addRegion(List<Region> regions);//县、区(县级)

	List<com.ztesoft.springboot_demo.dto.Provice> queryArea();
}
