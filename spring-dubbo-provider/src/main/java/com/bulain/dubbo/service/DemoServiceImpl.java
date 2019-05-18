package com.bulain.dubbo.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DemoServiceImpl implements DemoService {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	public String sayHello(String name) {
		logger.info("sayHello(String) - [" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name
				+ ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
		return "Hello " + name + ", response form provider.";
	}

}