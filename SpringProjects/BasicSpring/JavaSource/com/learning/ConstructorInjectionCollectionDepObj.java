package com.learning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.learning.beans.Question;

public class ConstructorInjectionCollectionDepObj {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("springcontext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Question question1 = (Question) beanFactory.getBean("q1");
		System.out.println(question1);
	}	
}
