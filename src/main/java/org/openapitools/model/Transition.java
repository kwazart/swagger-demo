package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Transition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
public class Transition {

  /**
   * Конечный статус
   */
  public enum EndStatusEnum {
    AWAITING_DISTRIBUTION("AWAITING_DISTRIBUTION"),
    
    CALL_NACK_CLIENT("CALL_NACK_CLIENT"),
    
    CANCELED("CANCELED"),
    
    CLIENT_IDENTITICATION("CLIENT_IDENTITICATION"),
    
    CLIENT_IDENTITICATION_DONE("CLIENT_IDENTITICATION_DONE"),
    
    CLIENT_REFUSAL("CLIENT_REFUSAL"),
    
    CONTACT_CLIENT("CONTACT_CLIENT"),
    
    DOCUMENT_VERIFICATION("DOCUMENT_VERIFICATION"),
    
    DONE("DONE"),
    
    MEETING_CONFIRMED("MEETING_CONFIRMED"),
    
    REVISION("REVISION"),
    
    SENT_TO_CONTACT_CENTER("SENT_TO_CONTACT_CENTER");

    private String value;

    EndStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EndStatusEnum fromValue(String value) {
      for (EndStatusEnum b : EndStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("endStatus")
  private EndStatusEnum endStatus;

  /**
   * Конечный статус групповой заявки, у которой текущаяя заявка является дочерней
   */
  public enum EndGroupStatusEnum {
    DONE("DONE"),
    
    CLIENT_REFUSAL("CLIENT_REFUSAL"),
    
    SENT_TO_CONTACT_CENTER("SENT_TO_CONTACT_CENTER");

    private String value;

    EndGroupStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EndGroupStatusEnum fromValue(String value) {
      for (EndGroupStatusEnum b : EndGroupStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("endGroupStatus")
  private EndGroupStatusEnum endGroupStatus;

  @JsonProperty("callCounter")
  private Integer callCounter;

  @JsonProperty("comment")
  private String comment;

  public Transition endStatus(EndStatusEnum endStatus) {
    this.endStatus = endStatus;
    return this;
  }

  /**
   * Конечный статус
   * @return endStatus
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "endStatus", example = "CONTACT_CLIENT", description = "Конечный статус", required = true)
  public EndStatusEnum getEndStatus() {
    return endStatus;
  }

  public void setEndStatus(EndStatusEnum endStatus) {
    this.endStatus = endStatus;
  }

  public Transition endGroupStatus(EndGroupStatusEnum endGroupStatus) {
    this.endGroupStatus = endGroupStatus;
    return this;
  }

  /**
   * Конечный статус групповой заявки, у которой текущаяя заявка является дочерней
   * @return endGroupStatus
  */
  @Size(max = 50) 
  @Schema(name = "endGroupStatus", example = "CONTACT_CLIENT", description = "Конечный статус групповой заявки, у которой текущаяя заявка является дочерней", required = false)
  public EndGroupStatusEnum getEndGroupStatus() {
    return endGroupStatus;
  }

  public void setEndGroupStatus(EndGroupStatusEnum endGroupStatus) {
    this.endGroupStatus = endGroupStatus;
  }

  public Transition callCounter(Integer callCounter) {
    this.callCounter = callCounter;
    return this;
  }

  /**
   * Счетчик звонков
   * @return callCounter
  */
  @NotNull 
  @Schema(name = "callCounter", example = "2", description = "Счетчик звонков", required = true)
  public Integer getCallCounter() {
    return callCounter;
  }

  public void setCallCounter(Integer callCounter) {
    this.callCounter = callCounter;
  }

  public Transition comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий
   * @return comment
  */
  @NotNull @Size(max = 128) 
  @Schema(name = "comment", example = "Любые дополнения", description = "Комментарий", required = true)
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transition transition = (Transition) o;
    return Objects.equals(this.endStatus, transition.endStatus) &&
        Objects.equals(this.endGroupStatus, transition.endGroupStatus) &&
        Objects.equals(this.callCounter, transition.callCounter) &&
        Objects.equals(this.comment, transition.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endStatus, endGroupStatus, callCounter, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transition {\n");
    sb.append("    endStatus: ").append(toIndentedString(endStatus)).append("\n");
    sb.append("    endGroupStatus: ").append(toIndentedString(endGroupStatus)).append("\n");
    sb.append("    callCounter: ").append(toIndentedString(callCounter)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

