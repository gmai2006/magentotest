/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.magento.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "quote_shipping_rate")
public class QuoteShippingRate implements Serializable {
  private static final long serialVersionUID = 163445090602917012L;

  /** Description: rate_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "rate_id")
  private java.lang.Integer rateId;

  /** Description: address_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "address_id")
  private java.lang.Integer addressId;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;
  /** Description: carrier. */
  @Basic
  @Column(name = "carrier", length = 255)
  private java.lang.String carrier;
  /** Description: carrier_title. */
  @Basic
  @Column(name = "carrier_title", length = 255)
  private java.lang.String carrierTitle;
  /** Description: code. */
  @Basic
  @Column(name = "code", length = 255)
  private java.lang.String code;
  /** Description: method. */
  @Basic
  @Column(name = "method", length = 255)
  private java.lang.String method;
  /** Description: method_description. */
  @Basic
  @Column(name = "method_description", length = 0)
  private java.lang.String methodDescription;
  /** Description: price. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "price")
  private java.math.BigDecimal price;
  /** Description: error_message. */
  @Basic
  @Column(name = "error_message", length = 0)
  private java.lang.String errorMessage;
  /** Description: method_title. */
  @Basic
  @Column(name = "method_title", length = 0)
  private java.lang.String methodTitle;

  public QuoteShippingRate() {}

  public java.lang.Integer getRateId() {
    return this.rateId;
  }

  public void setRateId(java.lang.Integer rateId) {
    this.rateId = rateId;
  }

  public java.lang.Integer getAddressId() {
    return this.addressId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.String getCarrier() {
    return this.carrier;
  }

  public java.lang.String getCarrierTitle() {
    return this.carrierTitle;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.String getMethod() {
    return this.method;
  }

  public java.lang.String getMethodDescription() {
    return this.methodDescription;
  }

  public java.math.BigDecimal getPrice() {
    return this.price;
  }

  public java.lang.String getErrorMessage() {
    return this.errorMessage;
  }

  public java.lang.String getMethodTitle() {
    return this.methodTitle;
  }

  public void setAddressId(java.lang.Integer addressId) {
    this.addressId = addressId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setCarrier(java.lang.String carrier) {
    this.carrier = carrier;
  }

  public void setCarrierTitle(java.lang.String carrierTitle) {
    this.carrierTitle = carrierTitle;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setMethod(java.lang.String method) {
    this.method = method;
  }

  public void setMethodDescription(java.lang.String methodDescription) {
    this.methodDescription = methodDescription;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }

  public void setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void setMethodTitle(java.lang.String methodTitle) {
    this.methodTitle = methodTitle;
  }
}
