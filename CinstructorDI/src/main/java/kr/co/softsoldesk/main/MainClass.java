package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.bean.DataBean;
import kr.co.softsoldesk.bean.SamsungTV;
import kr.co.softsoldesk.bean.TV;
import kr.co.softsoldesk.bean.TestBean1;
import kr.co.softsoldesk.bean.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		
		/*
		TestBean1 t1 = new TestBean1();
		t1.printData();

		System.out.println("============================================================================");
		
		TestBean1 t2 = new TestBean1(100);
		t2.printData();

		System.out.println("============================================================================");
		
		TestBean1 t3 = new TestBean1(11.11);
		t3.printData();

		System.out.println("============================================================================");
		
		TestBean1 t4 = new TestBean1("Hello");
		t4.printData();
		
		System.out.println("============================================================================");
		
		TestBean1 t5 = new TestBean1(100,11.11,"Hello");
		t5.printData();

		System.out.println("============================================================================");

		TestBean1 obj1 = ctx.getBean("obj1", TestBean1.class);
		obj1.printData();

		System.out.println("============================================================================");

		TestBean1 obj2 = ctx.getBean("obj2", TestBean1.class);
		obj2.printData();

		System.out.println("============================================================================");

		TestBean1 obj3 = ctx.getBean("obj3", TestBean1.class);
		obj3.printData();

		System.out.println("============================================================================");

		TestBean1 obj4 = ctx.getBean("obj4", TestBean1.class);
		obj4.printData();

		System.out.println("============================================================================");

		TestBean1 obj5 = ctx.getBean("obj5", TestBean1.class);
		obj5.printData();
		
		System.out.println("============================================================================");

		TestBean1 obj6 = ctx.getBean("obj6", TestBean1.class);
		obj6.printData();
		
		System.out.println("============================================================================");

		TestBean1 obj7 = ctx.getBean("obj7", TestBean1.class);
		obj7.printData();
		*/
		
		System.out.println("============================================================================");
		System.out.println("==JAVA (DataBean, TestBean2)==");
		
		DataBean d1=new DataBean();
		DataBean d2=new DataBean();
		
		TestBean2 t1=new TestBean2(d1, d2);
		t1.printData();
		
		System.out.println("============================================================================");
		System.out.println("==JAVA (DataBean, TestBean2)==");
		
		TestBean2 obj8=ctx.getBean("obj8",TestBean2.class);
		obj8.printData();
		
		System.out.println("============================================================================");
		System.out.println("==JAVA (DataBean, TestBean2)==");
		
		TestBean2 obj9=ctx.getBean("obj9",TestBean2.class);
		obj9.printData();
		
		
		
		TV tv=(TV)ctx.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.VolumeUp();
		tv.VolumeDown();
		
		ctx.close();
		
	}

}
