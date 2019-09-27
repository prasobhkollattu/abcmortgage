package com.abc.mortgagebanking.models;

import java.util.Objects;
import com.abc.mortgagebanking.models.Mortgage;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-27T16:08:08.190+02:00")

public class Account   {
  @JsonProperty("acountNumber")
  private String acountNumber = null;

  @JsonProperty("acountType")
  private String acountType = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("dob")
  private String dob = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("availableBalance")
  private String availableBalance = null;

  @JsonProperty("lastTransactionDate")
  private String lastTransactionDate = null;

  @JsonProperty("mortgages")
  @Valid
  private List<Mortgage> mortgages = null;

  public Account acountNumber(String acountNumber) {
    this.acountNumber = acountNumber;
    return this;
  }

  /**
   * Get acountNumber
   * @return acountNumber
  **/
  @ApiModelProperty(value = "")


  public String getAcountNumber() {
    return acountNumber;
  }

  public void setAcountNumber(String acountNumber) {
    this.acountNumber = acountNumber;
  }

  public Account acountType(String acountType) {
    this.acountType = acountType;
    return this;
  }

  /**
   * Get acountType
   * @return acountType
  **/
  @ApiModelProperty(value = "")


  public String getAcountType() {
    return acountType;
  }

  public void setAcountType(String acountType) {
    this.acountType = acountType;
  }

  public Account customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Account customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public Account dob(String dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  **/
  @ApiModelProperty(value = "")


  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public Account gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Account availableBalance(String availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

  /**
   * Get availableBalance
   * @return availableBalance
  **/
  @ApiModelProperty(value = "")


  public String getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(String availableBalance) {
    this.availableBalance = availableBalance;
  }

  public Account lastTransactionDate(String lastTransactionDate) {
    this.lastTransactionDate = lastTransactionDate;
    return this;
  }

  /**
   * Get lastTransactionDate
   * @return lastTransactionDate
  **/
  @ApiModelProperty(value = "")


  public String getLastTransactionDate() {
    return lastTransactionDate;
  }

  public void setLastTransactionDate(String lastTransactionDate) {
    this.lastTransactionDate = lastTransactionDate;
  }

  public Account mortgages(List<Mortgage> mortgages) {
    this.mortgages = mortgages;
    return this;
  }

  public Account addMortgagesItem(Mortgage mortgagesItem) {
    if (this.mortgages == null) {
      this.mortgages = new ArrayList<>();
    }
    this.mortgages.add(mortgagesItem);
    return this;
  }

  /**
   * Get mortgages
   * @return mortgages
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Mortgage> getMortgages() {
    return mortgages;
  }

  public void setMortgages(List<Mortgage> mortgages) {
    this.mortgages = mortgages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.acountNumber, account.acountNumber) &&
        Objects.equals(this.acountType, account.acountType) &&
        Objects.equals(this.customerId, account.customerId) &&
        Objects.equals(this.customerName, account.customerName) &&
        Objects.equals(this.dob, account.dob) &&
        Objects.equals(this.gender, account.gender) &&
        Objects.equals(this.availableBalance, account.availableBalance) &&
        Objects.equals(this.lastTransactionDate, account.lastTransactionDate) &&
        Objects.equals(this.mortgages, account.mortgages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acountNumber, acountType, customerId, customerName, dob, gender, availableBalance, lastTransactionDate, mortgages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    acountNumber: ").append(toIndentedString(acountNumber)).append("\n");
    sb.append("    acountType: ").append(toIndentedString(acountType)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    lastTransactionDate: ").append(toIndentedString(lastTransactionDate)).append("\n");
    sb.append("    mortgages: ").append(toIndentedString(mortgages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

