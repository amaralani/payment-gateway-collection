package ir.maralani.dto.pay;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class ChargeRequest extends PayRequest {
	public ChargeRequest(long orderId, long amount, Date date, String additionalData, String callBackUrl,
						 String payerId, String mobile) {
		super(orderId, amount, date, additionalData, callBackUrl, payerId, mobile);
	}
}
