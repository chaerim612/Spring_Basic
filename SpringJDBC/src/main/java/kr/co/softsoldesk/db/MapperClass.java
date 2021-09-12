package kr.co.softsoldesk.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk.beans.JdbcBean;

@Component
public class MapperClass implements RowMapper<JdbcBean>{

	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		//ResultSet rs : select문의 결과를 받는다
		//받음 결과값을 JdbcBean의 setter메서드를 활용하여 입력
		JdbcBean bean=new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}
	
}
