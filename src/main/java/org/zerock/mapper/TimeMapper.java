package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

//org.zerock.mapper.TimeMapper.getTime2 ->

public interface TimeMapper {
	
	@Select("select sysdate from dual")
	public String getTime();
	
	public String getTime2();

}
