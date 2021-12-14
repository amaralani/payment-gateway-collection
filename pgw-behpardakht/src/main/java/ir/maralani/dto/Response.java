package ir.maralani.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Response {
	private int responseCode;
	private String referenceId;
}
