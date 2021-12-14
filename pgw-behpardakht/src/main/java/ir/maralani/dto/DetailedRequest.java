package ir.maralani.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public abstract class DetailedRequest extends Request{
	private long saleOrderId;
	private long saleReferenceId;

	public DetailedRequest(long orderId, long saleOrderId, long saleReferenceId) {
		super(orderId);
		this.saleOrderId = saleOrderId;
		this.saleReferenceId = saleReferenceId;
	}
}
