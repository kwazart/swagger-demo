package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TimeSlot
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
public class TimeSlot {

  @JsonProperty("slotId")
  private Integer slotId;

  @JsonProperty("slotStartTime")
  private String slotStartTime;

  @JsonProperty("slotEndTime")
  private String slotEndTime;

  @JsonProperty("isWorking")
  private Boolean isWorking;

  public TimeSlot slotId(Integer slotId) {
    this.slotId = slotId;
    return this;
  }

  /**
   * Порядковый номер слота
   * @return slotId
  */
  @NotNull 
  @Schema(name = "slotId", example = "2", description = "Порядковый номер слота", required = true)
  public Integer getSlotId() {
    return slotId;
  }

  public void setSlotId(Integer slotId) {
    this.slotId = slotId;
  }

  public TimeSlot slotStartTime(String slotStartTime) {
    this.slotStartTime = slotStartTime;
    return this;
  }

  /**
   * Время начала слота
   * @return slotStartTime
  */
  @NotNull 
  @Schema(name = "slotStartTime", example = "720", description = "Время начала слота", required = true)
  public String getSlotStartTime() {
    return slotStartTime;
  }

  public void setSlotStartTime(String slotStartTime) {
    this.slotStartTime = slotStartTime;
  }

  public TimeSlot slotEndTime(String slotEndTime) {
    this.slotEndTime = slotEndTime;
    return this;
  }

  /**
   * Время окончания слота
   * @return slotEndTime
  */
  @NotNull 
  @Schema(name = "slotEndTime", example = "780", description = "Время окончания слота", required = true)
  public String getSlotEndTime() {
    return slotEndTime;
  }

  public void setSlotEndTime(String slotEndTime) {
    this.slotEndTime = slotEndTime;
  }

  public TimeSlot isWorking(Boolean isWorking) {
    this.isWorking = isWorking;
    return this;
  }

  /**
   * Признак рабочего слота
   * @return isWorking
  */
  @NotNull 
  @Schema(name = "isWorking", example = "true", description = "Признак рабочего слота", required = true)
  public Boolean getIsWorking() {
    return isWorking;
  }

  public void setIsWorking(Boolean isWorking) {
    this.isWorking = isWorking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlot timeSlot = (TimeSlot) o;
    return Objects.equals(this.slotId, timeSlot.slotId) &&
        Objects.equals(this.slotStartTime, timeSlot.slotStartTime) &&
        Objects.equals(this.slotEndTime, timeSlot.slotEndTime) &&
        Objects.equals(this.isWorking, timeSlot.isWorking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slotId, slotStartTime, slotEndTime, isWorking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlot {\n");
    sb.append("    slotId: ").append(toIndentedString(slotId)).append("\n");
    sb.append("    slotStartTime: ").append(toIndentedString(slotStartTime)).append("\n");
    sb.append("    slotEndTime: ").append(toIndentedString(slotEndTime)).append("\n");
    sb.append("    isWorking: ").append(toIndentedString(isWorking)).append("\n");
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

