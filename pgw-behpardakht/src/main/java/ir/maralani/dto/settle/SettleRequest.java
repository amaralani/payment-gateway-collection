package ir.maralani.dto.settle;

import ir.maralani.dto.DetailedRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class SettleRequest extends DetailedRequest {
	public SettleRequest(long orderId, long saleOrderId, long saleReferenceId) {
		super(orderId, saleOrderId, saleReferenceId);
	}
}
