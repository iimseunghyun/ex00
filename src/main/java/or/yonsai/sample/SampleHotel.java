package or.yonsai.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor	// ����� ��� ��ü������ �μ��� �޴� ������ ������ ����  
//@RequiredArgsConstructor //@NonNull �̳�  final�� ���� ��ü ������ ���� ������ ���� 
public class SampleHotel {
	
//	@NonNull
	private Chef chef;
}
