package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Attribute;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Event
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
public class Event {

  @JsonProperty("event")
  private String event;

  @JsonProperty("sourceScreen")
  private String sourceScreen;

  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  public Event event(String event) {
    this.event = event;
    return this;
  }

  /**
   * Системное наименования события
   * @return event
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "event", example = "viewApplication", description = "Системное наименования события", required = true)
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public Event sourceScreen(String sourceScreen) {
    this.sourceScreen = sourceScreen;
    return this;
  }

  /**
   * Название экрана
   * @return sourceScreen
  */
  @Size(max = 50) 
  @Schema(name = "sourceScreen", example = "Заявки", description = "Название экрана", required = false)
  public String getSourceScreen() {
    return sourceScreen;
  }

  public void setSourceScreen(String sourceScreen) {
    this.sourceScreen = sourceScreen;
  }

  public Event attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Event addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @Valid 
  @Schema(name = "attributes", required = false)
  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.event, event.event) &&
        Objects.equals(this.sourceScreen, event.sourceScreen) &&
        Objects.equals(this.attributes, event.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, sourceScreen, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    sourceScreen: ").append(toIndentedString(sourceScreen)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

