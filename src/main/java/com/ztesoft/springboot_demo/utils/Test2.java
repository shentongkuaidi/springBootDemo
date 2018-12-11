package com.ztesoft.springboot_demo.utils;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author ShenTong
 * @date 2018/12/11 10:47
 */
@Component
public class Test2 implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments str) {
		System.out.println("Test2 成功启动了。。。");
	}
}

