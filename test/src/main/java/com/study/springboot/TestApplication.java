package com.study.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.multi.Config;
import com.study.springboot.multi.Person;

//@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Person Person1 = (Person)context.getBean("Person1");
		Person1.print();
	}

}
