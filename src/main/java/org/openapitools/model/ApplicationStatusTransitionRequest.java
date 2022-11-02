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
 * ApplicationStatusTransitionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
public class ApplicationStatusTransitionRequest {

  @JsonProperty("isGroup")
  private Boolean isGroup;

  /**
   * Канал коммуникации
   */
  public enum CommunicationChannelEnum {
    CALL("call"),
    
    OTHER("other");

    private String value;

    CommunicationChannelEnum(String value) {
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
    public static CommunicationChannelEnum fromValue(String value) {
      for (CommunicationChannelEnum b : CommunicationChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("communicationChannel")
  private CommunicationChannelEnum communicationChannel;

  /**
   * Текущий статус заявки
   */
  public enum StartStatusEnum {
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

    StartStatusEnum(String value) {
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
    public static StartStatusEnum fromValue(String value) {
      for (StartStatusEnum b : StartStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("startStatus")
  private StartStatusEnum startStatus;

  /**
   * Текущий статус заявки
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

  @JsonProperty("callCounter")
  private Integer callCounter;

  /**
   * Результат коммуникации с клиентом
   */
  public enum CommunicationResultEnum {
    CALL_FAILED("CALL_FAILED"),
    
    MEETING_CONFIRMED("MEETING_CONFIRMED"),
    
    CLIENT_CANCEL("CLIENT_CANCEL");

    private String value;

    CommunicationResultEnum(String value) {
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
    public static CommunicationResultEnum fromValue(String value) {
      for (CommunicationResultEnum b : CommunicationResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("communicationResult")
  private CommunicationResultEnum communicationResult;

  @JsonProperty("comment")
  private String comment;

  public ApplicationStatusTransitionRequest isGroup(Boolean isGroup) {
    this.isGroup = isGroup;
    return this;
  }

  /**
   * Признак групповой заявки
   * @return isGroup
  */
  
  @Schema(name = "isGroup", example = "false", description = "Признак групповой заявки", required = false)
  public Boolean getIsGroup() {
    return isGroup;
  }

  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }

  public ApplicationStatusTransitionRequest communicationChannel(CommunicationChannelEnum communicationChannel) {
    this.communicationChannel = communicationChannel;
    return this;
  }

  /**
   * Канал коммуникации
   * @return communicationChannel
  */
  
  @Schema(name = "communicationChannel", example = "call", description = "Канал коммуникации", required = false)
  public CommunicationChannelEnum getCommunicationChannel() {
    return communicationChannel;
  }

  public void setCommunicationChannel(CommunicationChannelEnum communicationChannel) {
    this.communicationChannel = communicationChannel;
  }

  public ApplicationStatusTransitionRequest startStatus(StartStatusEnum startStatus) {
    this.startStatus = startStatus;
    return this;
  }

  /**
   * Текущий статус заявки
   * @return startStatus
  */
  
  @Schema(name = "startStatus", example = "AWAITING_DISTRIBUTION", description = "Текущий статус заявки", required = false)
  public StartStatusEnum getStartStatus() {
    return startStatus;
  }

  public void setStartStatus(StartStatusEnum startStatus) {
    this.startStatus = startStatus;
  }

  public ApplicationStatusTransitionRequest endStatus(EndStatusEnum endStatus) {
    this.endStatus = endStatus;
    return this;
  }

  /**
   * Текущий статус заявки
   * @return endStatus
  */
  
  @Schema(name = "endStatus", example = "DONE", description = "Текущий статус заявки", required = false)
  public EndStatusEnum getEndStatus() {
    return endStatus;
  }

  public void setEndStatus(EndStatusEnum endStatus) {
    this.endStatus = endStatus;
  }

  public ApplicationStatusTransitionRequest callCounter(Integer callCounter) {
    this.callCounter = callCounter;
    return this;
  }

  /**
   * Счетчик количества звонков по заявке
   * @return callCounter
  */
  
  @Schema(name = "callCounter", example = "3", description = "Счетчик количества звонков по заявке", required = false)
  public Integer getCallCounter() {
    return callCounter;
  }

  public void setCallCounter(Integer callCounter) {
    this.callCounter = callCounter;
  }

  public ApplicationStatusTransitionRequest communicationResult(CommunicationResultEnum communicationResult) {
    this.communicationResult = communicationResult;
    return this;
  }

  /**
   * Результат коммуникации с клиентом
   * @return communicationResult
  */
  
  @Schema(name = "communicationResult", example = "CALL_FAILED", description = "Результат коммуникации с клиентом", required = false)
  public CommunicationResultEnum getCommunicationResult() {
    return communicationResult;
  }

  public void setCommunicationResult(CommunicationResultEnum communicationResult) {
    this.communicationResult = communicationResult;
  }

  public ApplicationStatusTransitionRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий МБ
   * @return comment
  */
  @Size(max = 2048) 
  @Schema(name = "comment", example = "Любая дополнительная информация", description = "Комментарий МБ", required = false)
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
    ApplicationStatusTransitionRequest applicationStatusTransitionRequest = (ApplicationStatusTransitionRequest) o;
    return Objects.equals(this.isGroup, applicationStatusTransitionRequest.isGroup) &&
        Objects.equals(this.communicationChannel, applicationStatusTransitionRequest.communicationChannel) &&
        Objects.equals(this.startStatus, applicationStatusTransitionRequest.startStatus) &&
        Objects.equals(this.endStatus, applicationStatusTransitionRequest.endStatus) &&
        Objects.equals(this.callCounter, applicationStatusTransitionRequest.callCounter) &&
        Objects.equals(this.communicationResult, applicationStatusTransitionRequest.communicationResult) &&
        Objects.equals(this.comment, applicationStatusTransitionRequest.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isGroup, communicationChannel, startStatus, endStatus, callCounter, communicationResult, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationStatusTransitionRequest {\n");
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    communicationChannel: ").append(toIndentedString(communicationChannel)).append("\n");
    sb.append("    startStatus: ").append(toIndentedString(startStatus)).append("\n");
    sb.append("    endStatus: ").append(toIndentedString(endStatus)).append("\n");
    sb.append("    callCounter: ").append(toIndentedString(callCounter)).append("\n");
    sb.append("    communicationResult: ").append(toIndentedString(communicationResult)).append("\n");
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

