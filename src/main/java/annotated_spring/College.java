package annotated_spring;

import org.springframework.stereotype.Component;

//@Component("collegeBean")
public class College {
	private Principal principal;
	
	public College(Principal prc) {
		this.principal=prc;
	}
	
	public void getcollege()
	{
		System.out.println("hello college");
	}
	
	public void collegedetails()
	{
		System.out.println(principal.getName());
		
	}
	

}
