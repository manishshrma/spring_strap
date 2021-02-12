package annotated_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("annotated_spring")
public class SportConfig {
	
	@Bean
	public Principal principalBean() {
		return new Principal("awsm",15); // created principal object annd return it as  bena creation
		
	}
	
	@Bean(name = {"nameOne", "nameTwo"})
	public College collegeBean() // created a bean with id is same as method name.
	{
		return new College(principalBean());// constructor injection
	}

}
