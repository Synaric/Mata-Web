package com.synaric.web.mata.base;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.synaric.web.mata.aspect.service.IAppService;

/**
 * 封装处理请求的Service的共通操作。
 * Created by Synaric on 2016年8月17日.
 */
public abstract class BaseAppService implements IAppService{

	/**
	 * 日志工具。
	 */
	protected Logger logger = Logger.getLogger(getClass());
	
	/**
	 * Json转换工具。
	 */
	protected Gson gson = new Gson();
	
	/**
	 * 将Json转换为Java对象。
	 */
	protected <T> T fromJson(String json, Class<T> clz) {
		return gson.fromJson(json, clz);
	}
	
	/**
	 * 将Json转换为Java对象。
	 */
	protected <T> T fromJson(String json, TypeToken<T> typeToken) {
		return gson.fromJson(json, typeToken.getType());
	}
}
