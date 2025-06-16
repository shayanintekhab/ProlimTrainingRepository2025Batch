package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		emp1.display();
		
	Resource res = new ClassPathResource("beans.xml"); // load xml file it must be inside src folder
	BeanFactory obj = new XmlBeanFactory(res);			// created BeanFactory reference.
	
	Employee emp1 = (Employee)obj.getBean("e1"); // pull the employee object from container 
	emp1.display();

	}

}
