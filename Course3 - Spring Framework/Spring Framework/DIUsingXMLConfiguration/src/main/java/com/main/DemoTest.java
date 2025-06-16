package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.Address;
import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		emp1.display();
		
	Resource res = new ClassPathResource("beans.xml"); // load xml file it must be inside src folder
	BeanFactory obj = new XmlBeanFactory(res);			// created BeanFactory reference.
	
//	Employee emp1 = (Employee)obj.getBean("e1"); // pull the employee object from container 
//	emp1.display();
//
//	Employee emp2 = (Employee)obj.getBean("e1"); // pull the employee object from container 
//	emp2.display();
//	
//	System.out.println("---------------");
//
//	Employee emp3 = (Employee)obj.getBean("e2"); // pull the employee object from container 
//	emp3.display();
//
//	Employee emp4 = (Employee)obj.getBean("e2"); // pull the employee object from container 
//	emp4.display();
	
	
//	Employee emp5 = (Employee)obj.getBean("e1");		// singleton by default empty constructor 
//	System.out.println(emp5);                          // call toString method and display default value of id,name,salary
//	
//	
//	Employee emp6 = (Employee)obj.getBean("e2");		// prototype each time new memory created..empty constructor 
//	System.out.println(emp6);                          // call toString method and display default value of id,name,salary
//	
//	Employee emp7 = (Employee)obj.getBean("e3");		// singleton but inject to parameter constructor.
//	System.out.println(emp7);                          // call toString method we will what are the value set of container 
//	
//	
//	Employee emp8 = (Employee)obj.getBean("e4");		// setter base di
//	System.out.println(emp8); 
	
	
	Address add1 = (Address)obj.getBean("a1");
	System.out.println(add1);
	
	Employee emp9  = (Employee)obj.getBean("e5");
	System.out.println(emp9);
	}

}








