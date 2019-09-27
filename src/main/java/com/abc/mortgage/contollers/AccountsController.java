package com.abc.mortgage.contollers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.mortgage.services.AccountService;
import com.abc.mortgagebanking.apis.AccountsApi;
import com.abc.mortgagebanking.models.Accounts;
import com.abc.mortgagebanking.models.Mortgage;
import com.abc.mortgagebanking.models.MortgageRequest;

import io.swagger.annotations.ApiParam;

/**
 * controller to handle accounts
 * 
 * @author Prasobh Kollattu
 *
 */
@RestController
public class AccountsController implements AccountsApi {

	@Autowired
	private AccountService planGeneratorService;

	public ResponseEntity<Mortgage> createMortgage(
			@ApiParam(value = "", required = true) @PathVariable("acountNumber") String acountNumber,
			@ApiParam(value = " Mortgage details", required = true) @Valid @RequestBody MortgageRequest body) {
		return null;

	}

	public ResponseEntity<Accounts> getAccounts(
			@ApiParam(value = "", required = true) @PathVariable("searchParam") String searchParam) {
		return null;

	}

}
