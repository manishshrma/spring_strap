package myteam.manish_company;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
// interface BeanPostporcess method run everytime as bean is about to created and bean just created
public class DisplaynameBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In After initialization method bean name is "+beanName);

		return bean;
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In before initialization method bean name is "+beanName);
		return bean;
	}
}
