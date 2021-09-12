package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.bean.TestBean1;
import kr.co.softsoldesk.bean.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 xml1=ctx.getBean("xml1",TestBean1.class);
		xml1.method1();
		
		System.out.println("===================================================");
		xml1.method2(100);
		
		System.out.println("===================================================");
		xml1.method3("soft");
		
		System.out.println("===================================================");
		xml1.method4(100,"soft");
		
		//TestBean2 xml2=ctx.getBean("xml2",TestBean2.class);
	
		ctx.close();

	}

}
