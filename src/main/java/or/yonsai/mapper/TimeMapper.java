package or.yonsai.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("SELECT SYSDATE()")
	public String getTime();
	
	public String getTime2();	 //TimeMapper.xml�� �̿��ϴ� �޼���, ������̼�, ������ ���� �ʿ����.
}
