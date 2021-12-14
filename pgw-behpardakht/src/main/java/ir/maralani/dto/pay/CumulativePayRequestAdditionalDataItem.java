package ir.maralani.dto.pay;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CumulativePayRequestAdditionalDataItem {
	private String accountId;
	private Long amount;
	private String paymentId;
}
