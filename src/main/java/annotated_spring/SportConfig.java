package annotated_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "annotated_spring")
@PropertySource("classpath:college_info.properties")

public class SportConfig {
	
	
	/*
	 * @Bean public Teacher getteacher() { return new MathTeacher(); }
	 * 
	 * @Bean public Principal principalBean() { return new Principal("awsm",15); //
	 * created principal object annd return it as bena creation
	 * 
	 * }
	 * 
	 * @Bean(name = {"nameOne", "nameTwo"}) public College collegeBean() // created
	 * a bean with id is same as method name. { // new
	 * College().setTeacher(getteacher()); // new College(principalBean());//
	 * constructor injection College college=new College(principalBean());//
	 * constructor injection college.setTeacher(getteacher());// setter injection
	 * return college;
	 * 
	 * }
	 */

}
