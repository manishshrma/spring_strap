package annotated_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
//	@Value("TaxiDriver")// hardcore value
	@Value("${College.Name}")// fetching from propreties file
	private String killername;
	
	@Autowired
	private Principal principal;
	@Autowired
	private Teacher teacher;
	
//	public College(Principal prc) {
//		this.principal=prc;
//	}
	
	public College() {
	}

	public void getcollege()
	{
		System.out.println("hello college");
	}
	
//	public void collegedetails()
//	{
//		System.out.println(principal.getName());
//		
//	}
//	public void setTeacher(Teacher mathteacher)
//	{
//		this.teacher=mathteacher;
//	}
	
	public void getteach()
	{
		this.teacher.teach();
		System.out.println(this.killername);
		System.out.println("hello world dev2");
		System.out.println("hello world part1 dev2");
	}
	


}
