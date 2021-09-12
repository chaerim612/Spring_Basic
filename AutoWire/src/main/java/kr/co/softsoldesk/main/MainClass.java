package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.bean.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		/* setter 주입을 이용한 객체 생성 */
		System.out.println("setter 주입을 이용한 객체 생성");
		TestBean1 obj1=ctx.getBean("obj1",TestBean1.class);
		System.out.println("obj1.data1 : "+obj1.getData1());
		System.out.println("obj1.data2 : "+obj1.getData2());
		
		/* byName 주입을 이용한 객체 생성 */
		System.out.println("byName 주입을 이용한 객체 생성");
		TestBean1 obj2=ctx.getBean("obj2",TestBean1.class);
		System.out.println("obj2.data1 : "+obj1.getData1());
		System.out.println("obj2.data2 : "+obj1.getData2());
	}

}
