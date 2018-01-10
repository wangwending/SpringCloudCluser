package com.wwd.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwd.spring.cloud.service.fallback.SimpleServiceFallBack;


/**
 * 
		* ClassName: SimpleService <br/>
		* Function: 调用远程服务. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@FeignClient(name = "provider", fallback=SimpleServiceFallBack.class)
//@FeignClient(name = "provider")
public interface SimpleService {
	@RequestMapping("/simple/out")
	String out();
}
