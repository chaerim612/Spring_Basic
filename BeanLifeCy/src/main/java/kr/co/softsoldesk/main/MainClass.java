package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.bean.TestBean1;
import kr.co.softsoldesk.bean.TestBean2;
import kr.co.softsoldesk.bean.TestBean3;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 t1=ctx.getBean("t1",TestBean1.class);
		System.out.printf("t1 : %s \n",t1);
		
		System.out.println("===============================================");
		//==================================================
		TestBean2 t2=ctx.getBean("t2",TestBean2.class);
		System.out.printf("t2 : %s \n",t2);
		
		
		System.out.println("===============================================");
		//==================================================
		TestBean3 t3=ctx.getBean("t3",TestBean3.class);
		System.out.printf("t3 : %s \n",t3);
		
		
		ctx.close();
	}
}
