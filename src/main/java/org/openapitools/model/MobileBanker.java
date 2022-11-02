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
 * MobileBanker
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
public class MobileBanker {

  @JsonProperty("employeeFullName")
  private String employeeFullName;

  @JsonProperty("photo")
  private String photo;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("position")
  private String position;

  @JsonProperty("city")
  private String city;

  @JsonProperty("supervisorFullName")
  private String supervisorFullName;

  public MobileBanker employeeFullName(String employeeFullName) {
    this.employeeFullName = employeeFullName;
    return this;
  }

  /**
   * Полное ФИО МБ
   * @return employeeFullName
  */
  @NotNull @Size(max = 150) 
  @Schema(name = "employeeFullName", example = "Иванов Иван Иванович", description = "Полное ФИО МБ", required = true)
  public String getEmployeeFullName() {
    return employeeFullName;
  }

  public void setEmployeeFullName(String employeeFullName) {
    this.employeeFullName = employeeFullName;
  }

  public MobileBanker photo(String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Ссылка на фото сотрудника на ресурсе Банка.
   * @return photo
  */
  @Size(max = 1024) 
  @Schema(name = "photo", description = "Ссылка на фото сотрудника на ресурсе Банка.", required = false)
  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public MobileBanker email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Электронная почта
   * @return email
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "email", example = "example@mail.com", description = "Электронная почта", required = true)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MobileBanker phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Мобильный телефон
   * @return phone
  */
  @NotNull @Pattern(regexp = "^(\\+)\\d{11}$") @Size(max = 15) 
  @Schema(name = "phone", example = "74956735665", description = "Мобильный телефон", required = true)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public MobileBanker position(String position) {
    this.position = position;
    return this;
  }

  /**
   * специалист
   * @return position
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "position", example = "Менеджер", description = "специалист", required = true)
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public MobileBanker city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Город
   * @return city
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "city", example = "Москва", description = "Город", required = true)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public MobileBanker supervisorFullName(String supervisorFullName) {
    this.supervisorFullName = supervisorFullName;
    return this;
  }

  /**
   * Анна Андреевна Семёновна
   * @return supervisorFullName
  */
  @NotNull @Size(max = 150) 
  @Schema(name = "supervisorFullName", example = "Cидоров Василий Иванович", description = "Анна Андреевна Семёновна", required = true)
  public String getSupervisorFullName() {
    return supervisorFullName;
  }

  public void setSupervisorFullName(String supervisorFullName) {
    this.supervisorFullName = supervisorFullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileBanker mobileBanker = (MobileBanker) o;
    return Objects.equals(this.employeeFullName, mobileBanker.employeeFullName) &&
        Objects.equals(this.photo, mobileBanker.photo) &&
        Objects.equals(this.email, mobileBanker.email) &&
        Objects.equals(this.phone, mobileBanker.phone) &&
        Objects.equals(this.position, mobileBanker.position) &&
        Objects.equals(this.city, mobileBanker.city) &&
        Objects.equals(this.supervisorFullName, mobileBanker.supervisorFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeFullName, photo, email, phone, position, city, supervisorFullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileBanker {\n");
    sb.append("    employeeFullName: ").append(toIndentedString(employeeFullName)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    supervisorFullName: ").append(toIndentedString(supervisorFullName)).append("\n");
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

