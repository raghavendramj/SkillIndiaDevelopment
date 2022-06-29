package com.learning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.learning.beans.Employee;

public class SetternInjectionExample {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("setterInjection.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Employee employee = (Employee) beanFactory.getBean("emp1");
		
		System.out.println(employee);

//		Employee emp1 = new Employee();
//		System.out.println(emp1);
//		emp1.setId(23);
//		System.out.println(emp1);
//		emp1.setName("John Doe");
//		System.out.println(emp1);
		
	}
}
