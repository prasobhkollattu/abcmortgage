package com.abc.mortgage.exceptions;

import java.time.LocalDateTime;

import com.abc.mortgage.exceptions.models.ExceptionResponse;

public class MortageBankingException extends RuntimeException {

	private ExceptionResponse errorResp = null;
	private int errorCode;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8915899321825365533L;

	public MortageBankingException(String msg, String error, int erroCode) {
		errorResp = new ExceptionResponse();
		this.errorCode = erroCode;
		errorResp.setMessage(msg);
		errorResp.setTimestamp(LocalDateTime.now().toString());
		errorResp.setError(error);
		errorResp.setStatus(erroCode);
	}

	public ExceptionResponse getError() {
		return errorResp;
	}
}
