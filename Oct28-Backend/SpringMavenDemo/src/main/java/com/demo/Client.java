package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.demo")
public class Client {
	public static void main(String[] args) {
		
//		Resource resource = new ClassPathResource("SpringConfig.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		
		// ApplicationContext factory = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		
	// 	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//annotation way
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(Client.class);
		Employee emp = (Employee) factory.getBean("employee");
		
		Address add = (Address) factory.getBean("address");
		add.setHno(56);
		// System.out.println(add);
		
		emp.setEmpname("Mohammed");
		emp.setEmpsal(45000);
		emp.setAddress(add);
		
		
		System.out.println(emp);
	}
}
