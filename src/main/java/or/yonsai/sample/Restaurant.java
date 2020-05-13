package or.yonsai.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {

	@Setter(onMethod_ = @Autowired)			//Restaurant과 아래 Chef는 의존적이라는 표시 : 의존성 주입
	private Chef chef;
}
