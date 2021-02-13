package annotated_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class JavaConfigDemoApp {
	public static void main(String[] args) {
		// read the config java class, just like the xml file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		College college = context.getBean("college", College.class);
		college.getcollege();
//		college.collegedetails();
		college.getteach();
//		
	}

}
	