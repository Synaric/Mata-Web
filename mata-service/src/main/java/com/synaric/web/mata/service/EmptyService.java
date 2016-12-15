package com.synaric.web.mata.service;

import org.springframework.stereotype.Service;

import com.synaric.web.mata.aspect.service.IAppService;
import com.synaric.web.mata.entity.RequestExternal;

/**
 * 没有任何处理，测试请求是否正常。
 * Created by Synaric on 2016年9月28日.
 */
@Service("emptyService")
public class EmptyService implements IAppService{
	
	@Override
	public Object doService(String json, RequestExternal ext) throws Exception {
		return "request: ok";
	}

}
