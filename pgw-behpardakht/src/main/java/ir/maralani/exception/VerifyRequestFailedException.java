package ir.maralani.exception;

import ir.maralani.dto.Response;

public class VerifyRequestFailedException extends Exception{
	private final Response response;
	public VerifyRequestFailedException(Response response){
		this.response = response;
	}

	public Response getResponse() {
		return response;
	}
}
