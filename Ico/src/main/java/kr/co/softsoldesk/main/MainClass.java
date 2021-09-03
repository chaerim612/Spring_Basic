package kr.co.softsoldesk.main;

import java.security.PublicKey;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softsoldesk.bean.TestBean;

public class MainClass {
	
	public static void main(String[] args) {
		
		test1();//로딩하자마자 객체가 만들어지진 않는다
		test2();
		test3();
		test4();
		
	}

	public static void test1() {
		//경로만 설정해줌
		ClassPathResource res=new ClassPathResource("kr/co/softsoldesk/config/beans.xml");
		//#1
		//경로지정 후 객체가 생성되어야 한다
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//XmlBeanFactory : 자동으로 객체가 생성되진 않는다.
		
		//#2 :getBean에 의해서 객체가 생성됨
		TestBean t1=factory.getBean("t1", TestBean.class);
		System.out.printf("t1 :  %s\n", t1 );
		
		//#3 :이미 생성된 객체에 대한 정보가 컨테이너에 보관되어 있음
		TestBean t2=factory.getBean("t1", TestBean.class);
		System.out.printf("t2 :  %s\n", t2 );
	}
		//#4 외부 beans
		public static void test2() {
			FileSystemResource res=new FileSystemResource("beans.xml");
			XmlBeanFactory factory=new XmlBeanFactory(res);
			System.out.println("-----------------------------------------");
			//#5 
			TestBean t1=factory.getBean("t2", TestBean.class);
			System.out.printf("t1 :  %s\n", t1 );
			
			
			TestBean t2=factory.getBean("t2", TestBean.class);
			System.out.printf("t2 :  %s\n", t2 );
			
		}
		
		public static void test3() {
			
			System.out.println("----------------------------------------------");
			ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
			
			//ctx.close(); // 로딩하자마자 객체가 호출됨 
			//#5
			TestBean t1=ctx.getBean("t1", TestBean.class);
			System.out.printf("t1 :  %s\n", t1 );
			
			
			TestBean t2=ctx.getBean("t1", TestBean.class);
			System.out.printf("t2 :  %s\n", t2 );
			
			ctx.close();
		}
		
		//#6 외부패키지
		public static void test4() {
			System.out.println("---------------------------------------");
			
			FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("beans.xml");
			
			//ctx.close(); // 로딩하자마자 객체가 호출됨 
			TestBean t1=ctx.getBean("t2", TestBean.class);
			System.out.printf("t1 :  %s\n", t1 );
			
			TestBean t2=ctx.getBean("t2", TestBean.class);
			System.out.printf("t2 :  %s\n", t2 );
			
			ctx.close();
			
		}
	
	}
