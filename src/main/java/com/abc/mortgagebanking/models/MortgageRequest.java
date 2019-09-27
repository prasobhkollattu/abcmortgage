package com.abc.mortgagebanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MortgageRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-27T12:30:29.441+02:00")

public class MortgageRequest   {
  /**
   * Gets or Sets mortgageType
   */
  public enum MortgageTypeEnum {
    SAVIMGS("Savimgs"),
    
    MORTGAGE("Mortgage");

    private String value;

    MortgageTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MortgageTypeEnum fromValue(String text) {
      for (MortgageTypeEnum b : MortgageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mortgageType")
  private MortgageTypeEnum mortgageType = null;

  @JsonProperty("propertyCost")
  private BigDecimal propertyCost = null;

  @JsonProperty("deposit")
  private BigDecimal deposit = null;

  public MortgageRequest mortgageType(MortgageTypeEnum mortgageType) {
    this.mortgageType = mortgageType;
    return this;
  }

  /**
   * Get mortgageType
   * @return mortgageType
  **/
  @ApiModelProperty(value = "")


  public MortgageTypeEnum getMortgageType() {
    return mortgageType;
  }

  public void setMortgageType(MortgageTypeEnum mortgageType) {
    this.mortgageType = mortgageType;
  }

  public MortgageRequest propertyCost(BigDecimal propertyCost) {
    this.propertyCost = propertyCost;
    return this;
  }

  /**
   * Get propertyCost
   * @return propertyCost
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPropertyCost() {
    return propertyCost;
  }

  public void setPropertyCost(BigDecimal propertyCost) {
    this.propertyCost = propertyCost;
  }

  public MortgageRequest deposit(BigDecimal deposit) {
    this.deposit = deposit;
    return this;
  }

  /**
   * Get deposit
   * @return deposit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getDeposit() {
    return deposit;
  }

  public void setDeposit(BigDecimal deposit) {
    this.deposit = deposit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MortgageRequest mortgageRequest = (MortgageRequest) o;
    return Objects.equals(this.mortgageType, mortgageRequest.mortgageType) &&
        Objects.equals(this.propertyCost, mortgageRequest.propertyCost) &&
        Objects.equals(this.deposit, mortgageRequest.deposit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mortgageType, propertyCost, deposit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MortgageRequest {\n");
    
    sb.append("    mortgageType: ").append(toIndentedString(mortgageType)).append("\n");
    sb.append("    propertyCost: ").append(toIndentedString(propertyCost)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
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

