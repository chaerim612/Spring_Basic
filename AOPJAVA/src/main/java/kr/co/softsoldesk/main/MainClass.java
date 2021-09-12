package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.bean.TestBean;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("-----------------------------------XML---------------------------------------");
		
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean xml1=ctx1.getBean(TestBean.class);
		xml1.method1();
		
		ctx1.close();
		
		System.out.println("-------------------------------Annotation------------------------------------");
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean java1=ctx2.getBean(TestBean.class);
		
		//java1.method1();
		try {
			java1.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		ctx2.close();
	}
}
