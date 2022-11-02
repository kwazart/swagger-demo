package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Параметры для поиска заявок
 */

@Schema(name = "ApplicationRequest", description = "Параметры для поиска заявок")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
public class ApplicationRequest {

  @JsonProperty("isGroup")
  private Boolean isGroup;

  /**
   * Gets or Sets statuses
   */
  public enum StatusesEnum {
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

    StatusesEnum(String value) {
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
    public static StatusesEnum fromValue(String value) {
      for (StatusesEnum b : StatusesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("statuses")
  @Valid
  private List<StatusesEnum> statuses = null;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  public ApplicationRequest isGroup(Boolean isGroup) {
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

  public ApplicationRequest statuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
    return this;
  }

  public ApplicationRequest addStatusesItem(StatusesEnum statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Список системных статусов
   * @return statuses
  */
  
  @Schema(name = "statuses", example = "[\"AWAITING_DISTRIBUTION\",\"CONTACT_CLIENT\"]", description = "Список системных статусов", required = false)
  public List<StatusesEnum> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
  }

  public ApplicationRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Начало периода
   * @return startDate
  */
  
  @Schema(name = "startDate", example = "02.11.2022", description = "Начало периода", required = false)
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ApplicationRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Конец периода
   * @return endDate
  */
  
  @Schema(name = "endDate", example = "09.11.2022", description = "Конец периода", required = false)
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationRequest applicationRequest = (ApplicationRequest) o;
    return Objects.equals(this.isGroup, applicationRequest.isGroup) &&
        Objects.equals(this.statuses, applicationRequest.statuses) &&
        Objects.equals(this.startDate, applicationRequest.startDate) &&
        Objects.equals(this.endDate, applicationRequest.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isGroup, statuses, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationRequest {\n");
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

