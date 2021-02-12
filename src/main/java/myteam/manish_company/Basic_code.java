package myteam.manish_company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Basic_code {
	public static void main(String[] args) {
		

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Traingle traingle = (Traingle) context.getBean("traingle");	
		traingle.getmypoints();
		context.registerShutdownHook(); // shutdown the context as JVM shutdown
		context.close();
			
		System.out.println("hello world!!");
	}
}