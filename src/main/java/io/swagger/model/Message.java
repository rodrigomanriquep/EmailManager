package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Message
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-21T22:00:36.997790207Z[GMT]")


public class Message   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("userSender")
  private User userSender = null;

  @JsonProperty("userReceiver")
  private User userReceiver = null;

  @JsonProperty("date")
  private LocalDate date = null;

  public Message id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Message subject(String subject) {
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

  public Message body(String body) {
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

  public Message userSender(User userSender) {
    this.userSender = userSender;
    return this;
  }

  /**
   * Get userSender
   * @return userSender
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public User getUserSender() {
    return userSender;
  }

  public void setUserSender(User userSender) {
    this.userSender = userSender;
  }

  public Message userReceiver(User userReceiver) {
    this.userReceiver = userReceiver;
    return this;
  }

  /**
   * Get userReceiver
   * @return userReceiver
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public User getUserReceiver() {
    return userReceiver;
  }

  public void setUserReceiver(User userReceiver) {
    this.userReceiver = userReceiver;
  }

  public Message date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(example = "Fri Aug 18 00:00:00 GMT 2023", required = true, description = "")
      @NotNull

    @Valid
    public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.id, message.id) &&
        Objects.equals(this.subject, message.subject) &&
        Objects.equals(this.body, message.body) &&
        Objects.equals(this.userSender, message.userSender) &&
        Objects.equals(this.userReceiver, message.userReceiver) &&
        Objects.equals(this.date, message.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subject, body, userSender, userReceiver, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    userSender: ").append(toIndentedString(userSender)).append("\n");
    sb.append("    userReceiver: ").append(toIndentedString(userReceiver)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
