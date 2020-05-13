package or.yonsai.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("SELECT SYSDATE()")
	public String getTime();
	
	public String getTime2();	 //TimeMapper.xml을 이용하는 메서드, 어노테이션, 쿼리문 등이 필요없다.
}
