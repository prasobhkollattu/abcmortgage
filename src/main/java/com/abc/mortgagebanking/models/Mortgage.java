package com.abc.mortgagebanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mortgage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-27T12:30:29.441+02:00")

public class Mortgage   {
  @JsonProperty("acountNumber")
  private String acountNumber = null;

  public Mortgage acountNumber(String acountNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mortgage mortgage = (Mortgage) o;
    return Objects.equals(this.acountNumber, mortgage.acountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mortgage {\n");
    
    sb.append("    acountNumber: ").append(toIndentedString(acountNumber)).append("\n");
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

