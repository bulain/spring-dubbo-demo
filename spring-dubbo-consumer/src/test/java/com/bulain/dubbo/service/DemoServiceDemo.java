package com.bulain.dubbo.service;

import static org.junit.Assert.assertEquals;

import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bulain.dubbo.DubboConsumerApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboConsumerApplication.class)
public class DemoServiceDemo {

	@Reference
	private DemoService demoService;

	@Test
	public void testSayHello() {
		String ret = demoService.sayHello("Bulain");
		assertEquals("Hello Bulain, response form provider.", ret);
	}

}
