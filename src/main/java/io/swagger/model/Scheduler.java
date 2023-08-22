package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Message;
import io.swagger.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Scheduler
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-21T22:00:36.997790207Z[GMT]")

@Entity
@Table(name = "Scheduler")
public class Scheduler {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@JsonProperty("id")
	private Long id = null;

	@Column(name = "USER_ID")
	@JsonProperty("user")
	private User user = null;

	@Column(name = "MESSAGE_ID")
	@JsonProperty("message")
	private Message message = null;

	@Column(name = "STATUS")
	@JsonProperty("status")
	private String status = null;
	
	@Column(name = "DATE")
	@JsonProperty("date")
	private LocalDate date = null;

	public Scheduler id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
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

	public Scheduler user(User user) {
		this.user = user;
		return this;
	}

	/**
	 * Get user
	 * 
	 * @return user
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Scheduler message(Message message) {
		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * 
	 * @return message
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public Scheduler status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@Schema(example = "PENDING", required = true, description = "")
	@NotNull

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Scheduler date(LocalDate date) {
		this.date = date;
		return this;
	}

	/**
	 * Get date
	 * 
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
		Scheduler scheduler = (Scheduler) o;
		return Objects.equals(this.id, scheduler.id) && Objects.equals(this.user, scheduler.user)
				&& Objects.equals(this.message, scheduler.message) && Objects.equals(this.status, scheduler.status)
				&& Objects.equals(this.date, scheduler.date);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, user, message, status, date);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Scheduler {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
