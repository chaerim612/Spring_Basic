package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.bean.TV;
import kr.co.softsoldesk.bean.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestBean obj1 = new TestBean();

		obj1.setData1(100);
		System.out.println(obj1.getData1());

		System.out.println("====================================================================");

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");

		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.println("data1 : " + t1.getData1());
		System.out.println("data2 : " + t1.getData2());
		System.out.println("data3 : " + t1.isData3());
		System.out.println("data4 : " + t1.getData4());
		System.out.println("data5 : " + t1.getData5());
		System.out.println("data6 : " + t1.getData6());
		
		System.out.println("====================================================================");
		
		TV tv = (TV) ctx.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.VolumeUp();
		tv.VolumeDown();

		ctx.close();

	}

}
