package com.bulain.dubbo.ctrl;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bulain.dubbo.service.DemoService;

@RestController
public class DemoCtrl {

	@Reference
	private DemoService demoService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(@RequestParam String name) {
		return demoService.sayHello(name);
	}

}
