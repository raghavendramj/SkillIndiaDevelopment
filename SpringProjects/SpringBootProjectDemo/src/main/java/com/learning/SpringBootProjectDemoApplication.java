package com.learning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.learning.beans.Student;

public class SpringBootProjectDemoApplication {

	public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Student student1 = (Student) beanFactory.getBean("s1");
        System.out.println(student1);

        Student student2 = (Student) beanFactory.getBean("s2");
        System.out.println(student2);
        
	}

}
