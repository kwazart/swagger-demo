package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Список системных наименование продуктов
 */

@Schema(name = "updateApplicationCrossSale_request", description = "Список системных наименование продуктов")
@JsonTypeName("updateApplicationCrossSale_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
public class UpdateApplicationCrossSaleRequest {

  @JsonProperty("products")
  @Valid
  private List<String> products = null;

  public UpdateApplicationCrossSaleRequest products(List<String> products) {
    this.products = products;
    return this;
  }

  public UpdateApplicationCrossSaleRequest addProductsItem(String productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  */
  
  @Schema(name = "products", example = "[\"CREDIT_CARD\",\"DEPOSIT\"]", required = false)
  public List<String> getProducts() {
    return products;
  }

  public void setProducts(List<String> products) {
    this.products = products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateApplicationCrossSaleRequest updateApplicationCrossSaleRequest = (UpdateApplicationCrossSaleRequest) o;
    return Objects.equals(this.products, updateApplicationCrossSaleRequest.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateApplicationCrossSaleRequest {\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

