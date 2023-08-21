package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-21T22:00:36.997790207Z[GMT]")


public class MessageInput   {
  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("userSender")
  private Long userSender = null;

  @JsonProperty("userReceiver")
  private Long userReceiver = null;

  public MessageInput subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   **/
  @Schema(example = "Important Announcement", required = true, description = "")
      @NotNull

    public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MessageInput body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   **/
  @Schema(example = "This is an important message.", required = true, description = "")
      @NotNull

    public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public MessageInput userSender(Long userSender) {
    this.userSender = userSender;
    return this;
  }

  /**
   * Get userSender
   * @return userSender
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Long getUserSender() {
    return userSender;
  }

  public void setUserSender(Long userSender) {
    this.userSender = userSender;
  }

  public MessageInput userReceiver(Long userReceiver) {
    this.userReceiver = userReceiver;
    return this;
  }

  /**
   * Get userReceiver
   * @return userReceiver
   **/
  @Schema(example = "2", required = true, description = "")
      @NotNull

    public Long getUserReceiver() {
    return userReceiver;
  }

  public void setUserReceiver(Long userReceiver) {
    this.userReceiver = userReceiver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageInput messageInput = (MessageInput) o;
    return Objects.equals(this.subject, messageInput.subject) &&
        Objects.equals(this.body, messageInput.body) &&
        Objects.equals(this.userSender, messageInput.userSender) &&
        Objects.equals(this.userReceiver, messageInput.userReceiver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, body, userSender, userReceiver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageInput {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    userSender: ").append(toIndentedString(userSender)).append("\n");
    sb.append("    userReceiver: ").append(toIndentedString(userReceiver)).append("\n");
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
