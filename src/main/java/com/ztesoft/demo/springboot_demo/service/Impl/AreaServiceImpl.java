package com.ztesoft.demo.springboot_demo.service.Impl;

import com.ztesoft.demo.springboot_demo.dao.AreaDao;
import com.ztesoft.demo.springboot_demo.entity.City;
import com.ztesoft.demo.springboot_demo.entity.Provice;
import com.ztesoft.demo.springboot_demo.entity.Region;
import com.ztesoft.demo.springboot_demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("areaService")
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao areaDao;

	@Override
	@Transactional
	public Boolean addArea(List<Provice> provices, List<City> citys, List<Region> regions){
		                //省份                     市、区(市级)            县、区(县级)
		return areaDao.addProvice(provices)&&areaDao.addCity(citys)&&areaDao.addRegion(regions);
	}

	@Override
	public List<com.ztesoft.demo.springboot_demo.dto.Provice> queryArea(){
		return areaDao.queryArea();
	}
}
