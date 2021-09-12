package kr.co.softsoldesk.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import kr.co.softsoldesk.beans.JdbcBean;

public interface MapperInterface {
	//컬럼의 이름과 빈의 이름이 다를 경우 사용, 동일하면 생략 가능
	
	  @Results({
		  @Result(column="int_data",property="int_data"),
		  @Result(column="str_data",property="str_data") 
	  })
	 
	  //#{int_data},#{str_data} : 빈 객체의 변수에 대입
	  @Insert("insert into jdbc_table(int_data, str_data) values(#{int_data},#{str_data})")
	  void insert_data(JdbcBean bean);
	
	
}
