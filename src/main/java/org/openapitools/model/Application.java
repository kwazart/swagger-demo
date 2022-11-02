package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Заявка
 */

@Schema(name = "Application", description = "Заявка")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
public class Application {

  @JsonProperty("applicationId")
  private Integer applicationId;

  @JsonProperty("isGroup")
  private Boolean isGroup;

  @JsonProperty("productName")
  private String productName;

  @JsonProperty("status")
  private String status;

  @JsonProperty("meetingDate")
  private String meetingDate;

  @JsonProperty("startMeetingTime")
  private String startMeetingTime;

  @JsonProperty("endMeetingTime")
  private String endMeetingTime;

  @JsonProperty("address")
  private String address;

  @JsonProperty("clientFullName")
  private String clientFullName;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("companyName")
  private String companyName;

  @JsonProperty("callCounter")
  private Integer callCounter;

  @JsonProperty("applications")
  @Valid
  private List<Application> applications = new ArrayList<>();

  public Application applicationId(Integer applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Номер заявки
   * @return applicationId
  */
  @NotNull 
  @Schema(name = "applicationId", example = "34786", description = "Номер заявки", required = true)
  public Integer getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }

  public Application isGroup(Boolean isGroup) {
    this.isGroup = isGroup;
    return this;
  }

  /**
   * Признак групповой заявки
   * @return isGroup
  */
  @NotNull 
  @Schema(name = "isGroup", example = "false", description = "Признак групповой заявки", required = true)
  public Boolean getIsGroup() {
    return isGroup;
  }

  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }

  public Application productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Наименование продукта, отображаемое в МП
   * @return productName
  */
  @Size(max = 50) 
  @Schema(name = "productName", example = "Вклад", description = "Наименование продукта, отображаемое в МП", required = false)
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Application status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Системный статус заявки
   * @return status
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "status", example = "CONTACT_CLIENT", description = "Системный статус заявки", required = true)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Application meetingDate(String meetingDate) {
    this.meetingDate = meetingDate;
    return this;
  }

  /**
   * Дата встречи
   * @return meetingDate
  */
  @NotNull 
  @Schema(name = "meetingDate", example = "02.11.2022", description = "Дата встречи", required = true)
  public String getMeetingDate() {
    return meetingDate;
  }

  public void setMeetingDate(String meetingDate) {
    this.meetingDate = meetingDate;
  }

  public Application startMeetingTime(String startMeetingTime) {
    this.startMeetingTime = startMeetingTime;
    return this;
  }

  /**
   * Начало слота времени встречи
   * @return startMeetingTime
  */
  @NotNull 
  @Schema(name = "startMeetingTime", example = "08:00", description = "Начало слота времени встречи", required = true)
  public String getStartMeetingTime() {
    return startMeetingTime;
  }

  public void setStartMeetingTime(String startMeetingTime) {
    this.startMeetingTime = startMeetingTime;
  }

  public Application endMeetingTime(String endMeetingTime) {
    this.endMeetingTime = endMeetingTime;
    return this;
  }

  /**
   * Конец слота времени встречи
   * @return endMeetingTime
  */
  @NotNull 
  @Schema(name = "endMeetingTime", example = "840", description = "Конец слота времени встречи", required = true)
  public String getEndMeetingTime() {
    return endMeetingTime;
  }

  public void setEndMeetingTime(String endMeetingTime) {
    this.endMeetingTime = endMeetingTime;
  }

  public Application address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Адрес встречи
   * @return address
  */
  @NotNull @Size(max = 1024) 
  @Schema(name = "address", example = "г. Москва, ул. Островитянова, д.10, кв.101", description = "Адрес встречи", required = true)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Application clientFullName(String clientFullName) {
    this.clientFullName = clientFullName;
    return this;
  }

  /**
   * Полное имя клиента (Контактное лицо)
   * @return clientFullName
  */
  @NotNull @Size(max = 150) 
  @Schema(name = "clientFullName", example = "Иванов Иван Иванович", description = "Полное имя клиента (Контактное лицо)", required = true)
  public String getClientFullName() {
    return clientFullName;
  }

  public void setClientFullName(String clientFullName) {
    this.clientFullName = clientFullName;
  }

  public Application phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Телефон клиента (контактно лица)
   * @return phone
  */
  @NotNull @Size(max = 15) 
  @Schema(name = "phone", example = "749567356665", description = "Телефон клиента (контактно лица)", required = true)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Application comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий
   * @return comment
  */
  @Size(max = 128) 
  @Schema(name = "comment", example = "Буду до 13%00", description = "Комментарий", required = false)
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Application companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Компания (организация)
   * @return companyName
  */
  @Size(max = 64) 
  @Schema(name = "companyName", example = "ООО Ромашка", description = "Компания (организация)", required = false)
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Application callCounter(Integer callCounter) {
    this.callCounter = callCounter;
    return this;
  }

  /**
   * Количество зарегистрированных звонков клиенту/контактному лицу
   * @return callCounter
  */
  
  @Schema(name = "callCounter", example = "2", description = "Количество зарегистрированных звонков клиенту/контактному лицу", required = false)
  public Integer getCallCounter() {
    return callCounter;
  }

  public void setCallCounter(Integer callCounter) {
    this.callCounter = callCounter;
  }

  public Application applications(List<Application> applications) {
    this.applications = applications;
    return this;
  }

  public Application addApplicationsItem(Application applicationsItem) {
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * Список дочерних заявок
   * @return applications
  */
  @NotNull @Valid 
  @Schema(name = "applications", description = "Список дочерних заявок", required = true)
  public List<Application> getApplications() {
    return applications;
  }

  public void setApplications(List<Application> applications) {
    this.applications = applications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.applicationId, application.applicationId) &&
        Objects.equals(this.isGroup, application.isGroup) &&
        Objects.equals(this.productName, application.productName) &&
        Objects.equals(this.status, application.status) &&
        Objects.equals(this.meetingDate, application.meetingDate) &&
        Objects.equals(this.startMeetingTime, application.startMeetingTime) &&
        Objects.equals(this.endMeetingTime, application.endMeetingTime) &&
        Objects.equals(this.address, application.address) &&
        Objects.equals(this.clientFullName, application.clientFullName) &&
        Objects.equals(this.phone, application.phone) &&
        Objects.equals(this.comment, application.comment) &&
        Objects.equals(this.companyName, application.companyName) &&
        Objects.equals(this.callCounter, application.callCounter) &&
        Objects.equals(this.applications, application.applications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, isGroup, productName, status, meetingDate, startMeetingTime, endMeetingTime, address, clientFullName, phone, comment, companyName, callCounter, applications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    meetingDate: ").append(toIndentedString(meetingDate)).append("\n");
    sb.append("    startMeetingTime: ").append(toIndentedString(startMeetingTime)).append("\n");
    sb.append("    endMeetingTime: ").append(toIndentedString(endMeetingTime)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    clientFullName: ").append(toIndentedString(clientFullName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    callCounter: ").append(toIndentedString(callCounter)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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

