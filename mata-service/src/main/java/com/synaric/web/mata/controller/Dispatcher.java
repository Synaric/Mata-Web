package com.synaric.web.mata.controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.synaric.web.mata.aspect.service.IAppService;
import com.synaric.web.mata.entity.RequestExternal;

/**
 * 请求的入口与分发器。
 * 访问方式<a href="http://localhost:8088/mata-service/dispatcher/emptyService?params={}&ext={}"/>sample url</a>
 */
@Controller
@RequestMapping("/dispatcher")
public class Dispatcher implements ApplicationContextAware{
	
	private static final long serialVersionUID = 1L;
	
	private ApplicationContext context;
	
	private final Logger logger = Logger.getLogger(getClass());
	
	static {
		BasicConfigurator.configure();
	}
       
    public Dispatcher() {
        super();
    }
	
    @RequestMapping("/{service}")
	public ModelAndView doDispatch(
			@PathVariable String service, 
			@RequestParam String params, 
			@RequestParam String ext){
    	
    	logger.info("接收到请求： service = " + service 
    			+ ", params = " + params 
    			+ ", ext = " + ext);
    	
    	ModelAndView view = new ModelAndView();
    	view.setViewName("http");
    	try {
    		
    		//根据service找到相应组件，组件接受请求并返回结果
			IAppService handler = (IAppService) context.getBean(service);
			RequestExternal external = JSON.parseObject(ext, RequestExternal.class);
			Object response = handler.doService(params, external);
			String jsonResult = JSON.toJSONString(response);
			
			view.addObject("result", jsonResult);
			logger.info("响应： " + jsonResult);
			
		} catch (Exception e) {
			e.printStackTrace();
			view.addObject("result", e.getMessage());
			return view;
		}
    	
		return view;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeanCreationException{
		this.context = context;
	}
}
