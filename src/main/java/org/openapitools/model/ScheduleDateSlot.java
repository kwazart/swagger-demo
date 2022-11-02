package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TimeSlot;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ScheduleDateSlot
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
public class ScheduleDateSlot {

  @JsonProperty("scheduleDate")
  private String scheduleDate;

  @JsonProperty("isHoliday")
  private Boolean isHoliday;

  @JsonProperty("timeSlots")
  @Valid
  private List<TimeSlot> timeSlots = new ArrayList<>();

  @JsonProperty("isWeekend")
  private Boolean isWeekend;

  public ScheduleDateSlot scheduleDate(String scheduleDate) {
    this.scheduleDate = scheduleDate;
    return this;
  }

  /**
   * День в графике
   * @return scheduleDate
  */
  @NotNull 
  @Schema(name = "scheduleDate", example = "02.10.2022", description = "День в графике", required = true)
  public String getScheduleDate() {
    return scheduleDate;
  }

  public void setScheduleDate(String scheduleDate) {
    this.scheduleDate = scheduleDate;
  }

  public ScheduleDateSlot isHoliday(Boolean isHoliday) {
    this.isHoliday = isHoliday;
    return this;
  }

  /**
   * Признак нерабочего дня (праздник, распоряжение по компании и пр.)
   * @return isHoliday
  */
  @NotNull 
  @Schema(name = "isHoliday", example = "false", description = "Признак нерабочего дня (праздник, распоряжение по компании и пр.)", required = true)
  public Boolean getIsHoliday() {
    return isHoliday;
  }

  public void setIsHoliday(Boolean isHoliday) {
    this.isHoliday = isHoliday;
  }

  public ScheduleDateSlot timeSlots(List<TimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
    return this;
  }

  public ScheduleDateSlot addTimeSlotsItem(TimeSlot timeSlotsItem) {
    this.timeSlots.add(timeSlotsItem);
    return this;
  }

  /**
   * Get timeSlots
   * @return timeSlots
  */
  @NotNull @Valid 
  @Schema(name = "timeSlots", required = true)
  public List<TimeSlot> getTimeSlots() {
    return timeSlots;
  }

  public void setTimeSlots(List<TimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
  }

  public ScheduleDateSlot isWeekend(Boolean isWeekend) {
    this.isWeekend = isWeekend;
    return this;
  }

  /**
   * Признак выходного дня
   * @return isWeekend
  */
  @NotNull 
  @Schema(name = "isWeekend", example = "true", description = "Признак выходного дня", required = true)
  public Boolean getIsWeekend() {
    return isWeekend;
  }

  public void setIsWeekend(Boolean isWeekend) {
    this.isWeekend = isWeekend;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleDateSlot scheduleDateSlot = (ScheduleDateSlot) o;
    return Objects.equals(this.scheduleDate, scheduleDateSlot.scheduleDate) &&
        Objects.equals(this.isHoliday, scheduleDateSlot.isHoliday) &&
        Objects.equals(this.timeSlots, scheduleDateSlot.timeSlots) &&
        Objects.equals(this.isWeekend, scheduleDateSlot.isWeekend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleDate, isHoliday, timeSlots, isWeekend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDateSlot {\n");
    sb.append("    scheduleDate: ").append(toIndentedString(scheduleDate)).append("\n");
    sb.append("    isHoliday: ").append(toIndentedString(isHoliday)).append("\n");
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
    sb.append("    isWeekend: ").append(toIndentedString(isWeekend)).append("\n");
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

