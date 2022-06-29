package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.Employee;

public class SetternInjectionDependentObject {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"setterInjectiondependentObject.xml");
		
		Employee employee = (Employee) applicationContext.getBean("emp1");
		System.out.println(employee);

	}

}
