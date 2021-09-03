package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.bean.HelloWorld;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		HelloWorld hello1=(HelloWorld)ctx.getBean("hello");
		callMethod(hello1);
		
		HelloWorld hello2=ctx.getBean("hello1", HelloWorld.class);
		callMethod(hello2);
		
		ctx.close();
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayhello();
	}
}
		
		/*
		 * HelloWorldEn hello1=new HelloWorldEn(); callMethod(hello1);
		 * 
		 * HelloWorldKo hello2=new HelloWorldKo(); callMethod(hello2);
		 */
		

	
	/*
	 * public static void callMethod(HelloWorld hello) { hello.sayhello(); }
	 */

