/*
 * Security Multifactor Authentication
 * Security Multifactor Authentication 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: rubiyanisha@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package scb.nextgen.dashboard.securitymultifactor.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Success
 */

public class Success {

  @JsonProperty("rescode")

  private BigDecimal rescode = null;

  @JsonProperty("message")

  private String message = null;
  public Success rescode(BigDecimal rescode) {
    this.rescode = rescode;
    return this;
  }

  

  /**
  * Get rescode
  * @return rescode
  **/
    @Valid
    @Schema(example = "200", description = "")
  public BigDecimal getRescode() {
    return rescode;
  }
  public void setRescode(BigDecimal rescode) {
    this.rescode = rescode;
  }
  public Success message(String message) {
    this.message = message;
    return this;
  }

  

  /**
  * Get message
  * @return message
  **/
    @Schema(example = "authenticaion success", description = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Success success = (Success) o;
    return Objects.equals(this.rescode, success.rescode) &&
        Objects.equals(this.message, success.message);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(rescode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Success {\n");
    
    sb.append("    rescode: ").append(toIndentedString(rescode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
