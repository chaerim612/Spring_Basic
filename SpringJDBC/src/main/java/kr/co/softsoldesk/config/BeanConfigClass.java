package kr.co.softsoldesk.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages={"kr.co.softsoldesk.beans","kr.co.softsoldesk.db"})
public class BeanConfigClass {
	
	//DataSource
	@Bean
	public BasicDataSource source() {
		
		BasicDataSource source=new BasicDataSource();
		
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("system");
		source.setPassword("1234");
		
		return source;
	}
	
	//데이터베이스에 접속을 해서 쿼리를 전달하는 빈을 등록하는 메서드
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		
		JdbcTemplate db=new JdbcTemplate(source);
		return db;
	}
}
