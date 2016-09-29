package com.synaric.web.mata.aspect.service;

import com.synaric.web.mata.entity.RequestExternal;

public interface IAppService {

	Object doService(String json, RequestExternal ext) throws Exception;
}
