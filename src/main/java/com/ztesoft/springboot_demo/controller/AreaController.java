package com.ztesoft.springboot_demo.controller;

import com.ztesoft.springboot_demo.dto.Area;
import com.ztesoft.springboot_demo.dto.Provice;
import com.ztesoft.springboot_demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AreaController {

	@Autowired
	private AreaService areaService;

	//将地址添加到数据库
	@PostMapping("/addArea")
	public Map<String, Object> addArea(@RequestBody Area area) {
		System.out.println("数据已加载！");
//		测试获取数据结果
//		System.out.println(area.getpList().get(2).getProname());
//		System.out.println(area.getcList().get(32).getCitname());
//		System.out.println(area.getrList().get(0).getRegname());
		Map<String, Object> resultMap = new HashMap<>();
		if (areaService.addArea(area.getpList(), area.getcList(), area.getrList())) resultMap.put("result", "1");
		else resultMap.put("result", "0");
		return resultMap;
	}

	//从数据库获取地址信息
	@PostMapping("/getArea")
	public List<Provice> getArea(){
		return areaService.queryArea();
	}
}
