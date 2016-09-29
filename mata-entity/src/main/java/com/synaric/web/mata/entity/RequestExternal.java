package com.synaric.web.mata.entity;

/**
 * 对应请求的ext字段。 
 * Created by Synaric on 2016年8月17日.
 */
public class RequestExternal {

	/**
	 * 表示具体请求接口的哪个操作。一个接口由一个或多个operation组成。
	 */
	private String operation;
	
	/**
	 * 数据分页的起始页数，从0开始。
	 */
	private int start;

	/**
	 * 数据分页的每页条目数。
	 */
	private int limit;

	/**
	 * 设备识别号。
	 */
	private String deviceID;

	/**
	 * 请求来源平台。
	 */
	private int platform;

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public int getPlatform() {
		return platform;
	}

	public void setPlatform(int platform) {
		this.platform = platform;
	}
}
