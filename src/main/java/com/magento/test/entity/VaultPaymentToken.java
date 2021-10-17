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
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(VaultPaymentTokenId.class)
@Table(name = "vault_payment_token")
public class VaultPaymentToken implements Serializable {
  private static final long serialVersionUID = 163445090715085085L;

  /** Description: payment_method_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "payment_method_code")
  private java.lang.String paymentMethodCode;
  /** Description: gateway_token. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "gateway_token")
  private java.lang.String gatewayToken;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: customer_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: public_hash. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "public_hash")
  private java.lang.String publicHash;

  /** Description: type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "type", length = 128)
  private java.lang.String type;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: expires_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "expires_at")
  private java.sql.Timestamp expiresAt;
  /** Description: details. */
  @Basic
  @Column(name = "details", length = 0)
  private java.lang.String details;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: is_visible. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_visible")
  private java.lang.Integer isVisible;

  public VaultPaymentToken() {}

  public java.lang.String getPaymentMethodCode() {
    return this.paymentMethodCode;
  }

  public java.lang.String getGatewayToken() {
    return this.gatewayToken;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getPublicHash() {
    return this.publicHash;
  }

  public void setPaymentMethodCode(java.lang.String paymentMethodCode) {
    this.paymentMethodCode = paymentMethodCode;
  }

  public void setGatewayToken(java.lang.String gatewayToken) {
    this.gatewayToken = gatewayToken;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setPublicHash(java.lang.String publicHash) {
    this.publicHash = publicHash;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getExpiresAt() {
    return this.expiresAt;
  }

  public java.lang.String getDetails() {
    return this.details;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.lang.Integer getIsVisible() {
    return this.isVisible;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setExpiresAt(java.sql.Timestamp expiresAt) {
    this.expiresAt = expiresAt;
  }

  public void setDetails(java.lang.String details) {
    this.details = details;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setIsVisible(java.lang.Integer isVisible) {
    this.isVisible = isVisible;
  }
}
