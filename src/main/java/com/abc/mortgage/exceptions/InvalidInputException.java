package com.abc.mortgage.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.abc.mortgage.utils.Messages;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends MortageBankingException {
	private static final long serialVersionUID = 8481507757899949243L;

	public InvalidInputException(String msg) {
		super(msg, Messages.BAD_INPUT, 400);

	}
}
