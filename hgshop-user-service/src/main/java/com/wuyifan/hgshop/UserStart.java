package com.wuyifan.hgshop;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动服务
 * @author 45466
 *
 */
public class UserStart {
	
	public static void main(String[] args) throws IOException {
		System.out.println("开始启动服务");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml","classpath:dao.xml");
		context.start();
		System.out.println("服务启动完成");
		System.in.read();
	}

}
