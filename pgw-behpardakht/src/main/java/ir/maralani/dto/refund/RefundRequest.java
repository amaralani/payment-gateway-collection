package ir.maralani.dto.refund;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RefundRequest {
	private long saleReferenceId;
	private long refundAmount;
}
