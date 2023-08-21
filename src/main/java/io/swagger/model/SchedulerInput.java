package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SchedulerInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-21T22:00:36.997790207Z[GMT]")


public class SchedulerInput   {
  @JsonProperty("user")
  private Long user = null;

  @JsonProperty("message")
  private Long message = null;

  public SchedulerInput user(Long user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Long getUser() {
    return user;
  }

  public void setUser(Long user) {
    this.user = user;
  }

  public SchedulerInput message(Long message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Long getMessage() {
    return message;
  }

  public void setMessage(Long message) {
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
    SchedulerInput schedulerInput = (SchedulerInput) o;
    return Objects.equals(this.user, schedulerInput.user) &&
        Objects.equals(this.message, schedulerInput.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulerInput {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
