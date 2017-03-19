package spring_first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("sprint_first/beans/beans.xml");

		Person person = (Person) context.getBean("person");
		person.speak();
		
		AddressP addressP = (AddressP)context.getBean("addressP");
		
		
		System.out.println(person);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
