package com.ztesoft.springboot_demo.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author ShenTong
 * @date 2018/12/11 10:36
 */
@Component
public class Test implements CommandLineRunner{

	@Override
	public void run(String... s1) throws Exception{
		System.out.println("Test 启动了。。。");
	}
}
