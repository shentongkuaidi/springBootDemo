package com.ztesoft.springboot_demo.service;

import com.ztesoft.springboot_demo.entity.City;
import com.ztesoft.springboot_demo.entity.Provice;
import com.ztesoft.springboot_demo.entity.Region;

import java.util.List;

public interface AreaService {

	Boolean addArea(List<Provice> provices, List<City> citys, List<Region> regions);

	List<com.ztesoft.springboot_demo.dto.Provice> queryArea();
}
