package ir.maralani.dto.verify;

import ir.maralani.dto.DetailedRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class VerifyRequest extends DetailedRequest {

	public VerifyRequest(long orderId, long saleOrderId, long saleReferenceId) {
		super(orderId, saleOrderId, saleReferenceId);
	}
}
