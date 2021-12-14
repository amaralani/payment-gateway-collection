package ir.maralani.dto.pay;

import ir.maralani.dto.Request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class PayRequest extends Request {
	private long amount;
	private Date date;
	private String additionalData;
	private String callBackUrl;
	private String payerId = "0";
	private String mobile;

	public PayRequest(long orderId, long amount, Date date, String additionalData, String callBackUrl, String payerId,
					  String mobile) {
		super(orderId);
		this.amount = amount;
		this.date = date;
		this.additionalData = additionalData;
		this.callBackUrl = callBackUrl;
		this.payerId = payerId;
		this.mobile = mobile;
	}
}
