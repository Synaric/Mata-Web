package com.synaric.web.mata.service;

import org.springframework.stereotype.Service;

import com.synaric.web.mata.base.BaseAppService;
import com.synaric.web.mata.entity.RequestExternal;

/**
 * 处理用户信息。
 * Created by Synaric on 2016年8月16日.
 */
@Service("userService")
public class UserService extends BaseAppService{

	@Override
	public Object doService(String json, RequestExternal ext) throws Exception {
		
		return "ok";
	}

}
