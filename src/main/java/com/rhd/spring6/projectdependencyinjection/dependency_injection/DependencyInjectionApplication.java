package com.rhd.spring6.projectdependencyinjection.dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.controller.MyController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		MyController controller = context.getBean(MyController.class);
		System.out.println("Im in the Main method");
		System.out.println(controller.sayHello() );
	}

}
