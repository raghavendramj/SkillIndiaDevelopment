package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.Employee;

public class SetternInjectionMap {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"setterInjectionMap.xml");
		
		Employee employee = (Employee) applicationContext.getBean("emp1");
		System.out.println(employee);
		
	}

}
