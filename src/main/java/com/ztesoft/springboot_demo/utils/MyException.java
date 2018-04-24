package com.ztesoft.demo.springboot_demo.utils;

public class MyException extends RuntimeException {
	private String code;
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public MyException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}