package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.bean.TestBean;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean bean1=ctx.getBean("xml1",TestBean.class);
		
		bean1.method1();
		
		//int a1=bean1.method1(100);
		//System.out.println(a1);
		
		ctx.close();
	}
}
