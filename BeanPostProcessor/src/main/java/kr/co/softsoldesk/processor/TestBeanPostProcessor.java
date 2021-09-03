package kr.co.softsoldesk.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{
	
	//호출 전
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before");
		
		switch(beanName) {
		case "t1":
			System.out.println("before t1");
			break;
		case "t2":
			System.out.println("before t2");
		}
		
		return bean;
	}
	
	//호출 후
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After");
		return bean;
	}
	
	
}
