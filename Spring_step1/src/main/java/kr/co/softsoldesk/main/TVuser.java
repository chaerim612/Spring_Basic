package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.bean.TV;

public class TVuser {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TV tv1=(TV)ctx.getBean("tv1"); //방법1
		tv1.powerOn();
		tv1.volumeUp();
		
		TV tv2=ctx.getBean("tv2", TV.class); //방법2
		callMethod(tv2);
		
		ctx.close();
	}
	
	private static void callMethod(TV tv) {
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
	}

}
