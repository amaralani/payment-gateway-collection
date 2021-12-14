package ir.maralani.dto.pay;

import ir.maralani.dto.Request;
import ir.maralani.exception.TooManyAccountData;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class CumulativePayRequest extends Request {
	private String mobile;
	private long amount;
	private Date date;
	private CumulativePayRequestAdditionalDataItem[] accountData;
	private String callBackUrl;

	public CumulativePayRequest(long orderId, long amount, Date date,
								CumulativePayRequestAdditionalDataItem[] accountData, String callBackUrl) throws TooManyAccountData {
		super(orderId);

		if (accountData != null && accountData.length > 10) {
			throw new TooManyAccountData(String.format("%d additional data items passed. Max %d is supported.",
					accountData.length, 10));
		}

		this.amount = amount;
		this.date = date;
		this.accountData = accountData;
		this.callBackUrl = callBackUrl;
	}

	public CumulativePayRequest(long orderId, long amount, Date date,
								CumulativePayRequestAdditionalDataItem[] accountData, String callBackUrl,
								String mobile) throws TooManyAccountData {
		super(orderId);

		if (accountData != null && accountData.length > 10) {
			throw new TooManyAccountData(String.format("%d additional data items passed. Max %d is supported.",
					accountData.length, 10));
		}
		this.mobile = mobile;
		this.amount = amount;
		this.date = date;
		this.accountData = accountData;
		this.callBackUrl = callBackUrl;
	}
}
