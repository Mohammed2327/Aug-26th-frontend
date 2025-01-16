package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
		
//		Resource resource = new ClassPathResource("SpringConfig.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Employee emp = (Employee) factory.getBean("mohammed");
		
		System.out.println(emp);
	}
}
