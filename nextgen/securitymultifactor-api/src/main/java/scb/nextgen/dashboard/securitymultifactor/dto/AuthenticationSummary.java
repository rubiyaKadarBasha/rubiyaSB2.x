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
import scb.nextgen.dashboard.securitymultifactor.dto.Success;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * AuthenticationSummary
 */

public class AuthenticationSummary {

  @JsonProperty("multifactorResponse")

  private Success multifactorResponse = null;
  public AuthenticationSummary multifactorResponse(Success multifactorResponse) {
    this.multifactorResponse = multifactorResponse;
    return this;
  }

  

  /**
  * Get multifactorResponse
  * @return multifactorResponse
  **/
    @Valid
    @Schema(description = "")
  public Success getMultifactorResponse() {
    return multifactorResponse;
  }
  public void setMultifactorResponse(Success multifactorResponse) {
    this.multifactorResponse = multifactorResponse;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationSummary authenticationSummary = (AuthenticationSummary) o;
    return Objects.equals(this.multifactorResponse, authenticationSummary.multifactorResponse);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(multifactorResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationSummary {\n");
    
    sb.append("    multifactorResponse: ").append(toIndentedString(multifactorResponse)).append("\n");
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
