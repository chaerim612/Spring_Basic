package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.mapper.MapperInterface;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MapperInterface mapper=ctx.getBean(MapperInterface.class);
		
		//insert
		JdbcBean bean1=new JdbcBean();
		bean1.setInt_data(100);
		bean1.setStr_data("Spring 2021");
		mapper.insert_data(bean1);
		
		JdbcBean bean2=new JdbcBean();
		bean2.setInt_data(200);
		bean2.setStr_data("Python 2021");
		mapper.insert_data(bean2);
		
		ctx.close();
	}

}
