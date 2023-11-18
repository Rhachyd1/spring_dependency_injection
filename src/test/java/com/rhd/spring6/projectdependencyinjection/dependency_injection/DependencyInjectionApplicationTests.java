package com.rhd.spring6.projectdependencyinjection.dependency_injection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.controller.MyController;

@SpringBootTest
class DependencyInjectionApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetControllerFromContext(){
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

	@Test
	public void testMyControllerAutowired(){
		System.out.println(myController.sayHello());
	}
}
