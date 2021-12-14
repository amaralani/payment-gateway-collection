package ir.maralani.dto.inquiry;

import ir.maralani.dto.DetailedRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class InquiryRequest extends DetailedRequest {
	public InquiryRequest(long orderId, long saleOrderId, long saleReferenceId) {
		super(orderId, saleOrderId, saleReferenceId);
	}
}
