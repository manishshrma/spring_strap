package annotated_spring;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("math teacher is ...NOT good");
		
	}
	

}
