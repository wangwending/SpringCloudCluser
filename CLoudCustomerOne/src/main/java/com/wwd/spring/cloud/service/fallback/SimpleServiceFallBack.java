package com.wwd.spring.cloud.service.fallback;

import org.springframework.stereotype.Component;

import com.wwd.spring.cloud.service.SimpleService;

@Component
public class SimpleServiceFallBack implements SimpleService{

	@Override
	public String out() {
		return "Call Remote Service Fail!!!";
	}

}
