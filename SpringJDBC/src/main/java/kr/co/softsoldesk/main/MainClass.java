package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.db.JdbcDAO;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		JdbcDAO dao = ctx.getBean(JdbcDAO.class);

		/*
		 * //저장 JdbcBean bean1=new JdbcBean(); bean1.setInt_data(1);
		 * bean1.setStr_data("Spring"); dao.insert_data(bean1);
		 * 
		 * JdbcBean bean2=new JdbcBean(); bean2.setInt_data(2);
		 * bean2.setStr_data("java"); dao.insert_data(bean2);
		 * 
		 * System.out.println("저장 완료");
		 */

		/*
		// update
		JdbcBean bean4 = new JdbcBean();
		bean4.setInt_data(2);
		bean4.setStr_data("Script");
		dao.update_data(bean4);
		*/
		
		//delete
		dao.delete_data(2);

		// select
		List<JdbcBean> list = dao.select_data();

		for (JdbcBean bean3 : list) {
			System.out.println("int_data : " + bean3.getInt_data());
			System.out.println("str_data : " + bean3.getStr_data());
			System.out.println("===============================");
		}

		ctx.close();
	}
}
