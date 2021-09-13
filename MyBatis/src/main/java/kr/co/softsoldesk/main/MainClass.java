package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.mapper.MapperInterface;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MapperInterface mapper=ctx.getBean(MapperInterface.class);
		
		/*
		//insert
		JdbcBean bean1=new JdbcBean();
		bean1.setInt_data(100);
		bean1.setStr_data("Spring 2021");
		mapper.insert_data(bean1);
		
		JdbcBean bean2=new JdbcBean();
		bean2.setInt_data(200);
		bean2.setStr_data("Python 2021");
		mapper.insert_data(bean2);
		
		System.out.println("저장 완료");
		*/
		
		/*
		//update
		JdbcBean bean4=new JdbcBean();
		bean4.setInt_data(100);
		bean4.setStr_data("Django");
		mapper.update_data(bean4);
		*/
		
		//delete
		JdbcBean bean5=new JdbcBean();
		bean5.setInt_data(200);
		mapper.delete_data(bean5.getInt_data());
		
		//select
		List<JdbcBean> list=mapper.select_data();
		for(JdbcBean bean3:list) {
			System.out.println("int_data : "+bean3.getInt_data());
			System.out.println("str_data : "+bean3.getStr_data());
			System.out.println("=======================================================");
		}
		
		ctx.close();
	}

}
