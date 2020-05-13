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
@AllArgsConstructor	// 선언된 모든 객체변수를 인수로 받는 생성자 묵시적 생성  
//@RequiredArgsConstructor //@NonNull 이나  final이 붙은 객체 변수에 대한 생성자 생성 
public class SampleHotel {
	
//	@NonNull
	private Chef chef;
}
