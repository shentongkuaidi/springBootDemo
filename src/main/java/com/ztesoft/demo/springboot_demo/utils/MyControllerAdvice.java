package com.ztesoft.springboot_demo.utils;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class MyControllerAdvice {

	/**
	 * 全局异常捕捉处理
	 *
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@SuppressWarnings("unchecked")
	@ExceptionHandler(value = Exception.class)
	public Map errorHandler(Exception ex) {
		Map map = new HashMap();
		map.put("code", 100);
		map.put("msg", ex.getMessage());
		System.out.println("异常信息：" + map);
		return map;
	}

	/**
	 * 拦截捕捉自定义异常 MyException.class
	 *
	 * @param ex 返回json
	 * @return
	 */
	@ResponseBody
	@SuppressWarnings("unchecked")
	@ExceptionHandler(value = MyException.class)
	public Map myErrorHandler(MyException ex) {
		Map map = new HashMap();
		map.put("code", ex.getCode());
		map.put("msg", ex.getMsg());
		System.out.println("异常信息：" + map);
		return map;
	}

}