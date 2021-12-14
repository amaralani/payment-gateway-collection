package ir.maralani.dto.reversal;

import ir.maralani.dto.DetailedRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class ReversalRequest extends DetailedRequest {
	public ReversalRequest(long orderId, long saleOrderId, long saleReferenceId) {
		super(orderId, saleOrderId, saleReferenceId);
	}
}
