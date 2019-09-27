/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.abc.mortgagebanking.apis;

import com.abc.mortgagebanking.models.Accounts;
import com.abc.mortgagebanking.models.Mortgage;
import com.abc.mortgagebanking.models.MortgageRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-27T16:08:08.190+02:00")

@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    Logger log = LoggerFactory.getLogger(AccountsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "create mortgage account for user", nickname = "createMortgage", notes = "", response = Mortgage.class, tags={ "accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful", response = Mortgage.class),
        @ApiResponse(code = 400, message = "The given input has not the right format"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/accounts/{acountNumber}/mortgage",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Mortgage> createMortgage(@ApiParam(value = "",required=true) @PathVariable("acountNumber") String acountNumber,@ApiParam(value = " Mortgage details" ,required=true )  @Valid @RequestBody MortgageRequest body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"acountNumber\" : \"acountNumber\"}", Mortgage.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AccountsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "get user accounts", nickname = "getAccounts", notes = "", response = Accounts.class, tags={ "accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful", response = Accounts.class),
        @ApiResponse(code = 400, message = "The given input has not the right format"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/accounts/{searchParam}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Accounts> getAccounts(@ApiParam(value = "",required=true) @PathVariable("searchParam") String searchParam) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"accounts\" : [ {    \"mortgages\" : [ {      \"acountNumber\" : \"acountNumber\"    }, {      \"acountNumber\" : \"acountNumber\"    } ],    \"gender\" : \"gender\",    \"lastTransactionDate\" : \"lastTransactionDate\",    \"acountNumber\" : \"acountNumber\",    \"dob\" : \"dob\",    \"customerId\" : \"customerId\",    \"acountType\" : \"acountType\",    \"customerName\" : \"customerName\",    \"availableBalance\" : \"availableBalance\"  }, {    \"mortgages\" : [ {      \"acountNumber\" : \"acountNumber\"    }, {      \"acountNumber\" : \"acountNumber\"    } ],    \"gender\" : \"gender\",    \"lastTransactionDate\" : \"lastTransactionDate\",    \"acountNumber\" : \"acountNumber\",    \"dob\" : \"dob\",    \"customerId\" : \"customerId\",    \"acountType\" : \"acountType\",    \"customerName\" : \"customerName\",    \"availableBalance\" : \"availableBalance\"  } ]}", Accounts.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AccountsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
