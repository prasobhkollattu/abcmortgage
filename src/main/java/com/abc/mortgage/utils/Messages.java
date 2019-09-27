package com.abc.mortgage.utils;

/**
 * Application messages
 * 
 * @author PRASOBH KOLLATTU
 *
 */
public interface Messages {
	String INVALID_REQUEST = "Invalid Request";
	String INTERNAL_SERVER_ERROR = "Internal Server Error";
	String MINIMUM_LOAN_AMOUNT_ERROR = "Loan amount should be minimum 500";
	String MINIMUM_NOMINALRATE_ERROR = "Nominal rate should be minimum 1.00";
	String LOAN_DURATION_ERROR = "Loan duraion should be greater than 0 and less than 360";
	String BAD_INPUT = "The given input has not the right format";
	String UNAUTHORIZED = "Unauthorized";
}
