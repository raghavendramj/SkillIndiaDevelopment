package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.Employee;
import com.learning.beans.QuestionWithList;

public class SetternInjectionWithCollection {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjectionCollection.xml");
		QuestionWithList quest1 = (QuestionWithList) applicationContext.getBean("quest1");
		System.out.println(quest1);
	}
}
