package com.synaric.web.mata.entity;

/**
 * APP端接口。
 * Created by Synaric on 2016年8月19日.
 */
public enum AppInterface {

	userRegister("userService");
	
	private String service;
	
	private AppInterface(String service) {
		this.service = service;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
}
