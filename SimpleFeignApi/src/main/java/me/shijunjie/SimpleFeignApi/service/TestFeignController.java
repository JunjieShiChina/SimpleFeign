package me.shijunjie.SimpleFeignApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.shijunjie.SimpleFeignCommon.bean.FeignResponse;
import me.shijunjie.SimpleFeignService.integration.FeignServiceTest;

@RestController
public class TestFeignController {

	@Autowired
	private FeignServiceTest feignServiceTest;
	
	@RequestMapping(value = "/testFeign", method = RequestMethod.GET)
	public FeignResponse testFeign() {
		System.out.println("----testfeign----");
		return feignServiceTest.getIpAddress();
	}
	
}
