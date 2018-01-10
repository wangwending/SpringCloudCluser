package com.wwd.spring.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wwd.spring.cloud.service.SimpleService;


/**
 * 
		* ClassName: SimpleController <br/>
		* Function: Simple Controller Called. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@RestController
public class SimpleController {
	
	private final static Logger log = LoggerFactory.getLogger(SimpleController.class);
	
	@Autowired
	private SimpleService simpleService;
	
	@RequestMapping("/simple/out")
	public String hell() {
		String strResp = simpleService.out();
		if (StringUtils.isEmpty(strResp)) {
			strResp = "Call Remote Service Succ!!!!";
		}
		log.info("Customer Call end");
		return strResp;
	}
	
}
