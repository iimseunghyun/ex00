package or.yonsai.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {

	@Setter(onMethod_ = @Autowired)			//Restaurant�� �Ʒ� Chef�� �������̶�� ǥ�� : ������ ����
	private Chef chef;
}
