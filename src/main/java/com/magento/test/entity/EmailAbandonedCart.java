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
@Table(name = "email_abandoned_cart")
public class EmailAbandonedCart implements Serializable {
  private static final long serialVersionUID = 163445090538419305L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: quote_id. */
  @Basic
  @Column(name = "quote_id")
  private java.lang.Integer quoteId;
  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: email. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "email", length = 255)
  private java.lang.String email;
  /** Description: status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "status", length = 255)
  private java.lang.String status;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: quote_updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "quote_updated_at")
  private java.sql.Timestamp quoteUpdatedAt;
  /** Description: abandoned_cart_number. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "abandoned_cart_number")
  private java.lang.Integer abandonedCartNumber;
  /** Description: items_count. */
  @Basic
  @Column(name = "items_count")
  private java.lang.Integer itemsCount;
  /** Description: items_ids. */
  @Basic
  @Column(name = "items_ids", length = 255)
  private java.lang.String itemsIds;
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

  public EmailAbandonedCart() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getQuoteId() {
    return this.quoteId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.sql.Timestamp getQuoteUpdatedAt() {
    return this.quoteUpdatedAt;
  }

  public java.lang.Integer getAbandonedCartNumber() {
    return this.abandonedCartNumber;
  }

  public java.lang.Integer getItemsCount() {
    return this.itemsCount;
  }

  public java.lang.String getItemsIds() {
    return this.itemsIds;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setQuoteId(java.lang.Integer quoteId) {
    this.quoteId = quoteId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setQuoteUpdatedAt(java.sql.Timestamp quoteUpdatedAt) {
    this.quoteUpdatedAt = quoteUpdatedAt;
  }

  public void setAbandonedCartNumber(java.lang.Integer abandonedCartNumber) {
    this.abandonedCartNumber = abandonedCartNumber;
  }

  public void setItemsCount(java.lang.Integer itemsCount) {
    this.itemsCount = itemsCount;
  }

  public void setItemsIds(java.lang.String itemsIds) {
    this.itemsIds = itemsIds;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
