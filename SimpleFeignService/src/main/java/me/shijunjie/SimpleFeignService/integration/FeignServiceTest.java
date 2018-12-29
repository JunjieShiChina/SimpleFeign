package me.shijunjie.SimpleFeignService.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.shijunjie.SimpleFeignCommon.bean.FeignResponse;
import me.shijunjie.SimpleFeignService.config.FeignConfiguration;

@FeignClient(value = "SIMPLEZUULCLIENT", configuration=FeignConfiguration.class)
//@FeignClient(value = "SIMPLEZUULCLIENT")
public interface FeignServiceTest {

	@RequestMapping(value = "/gateway/SimpleUserServer/test/ipAddress", method = RequestMethod.GET)
	FeignResponse getIpAddress();
	
}
