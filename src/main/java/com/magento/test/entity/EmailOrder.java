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
@Table(name = "email_order")
public class EmailOrder implements Serializable {
  private static final long serialVersionUID = 163445090544510452L;

  /** Description: email_order_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "email_order_id")
  private java.lang.Integer emailOrderId;

  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_id")
  private java.lang.Integer orderId;
  /** Description: order_status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_status", length = 255)
  private java.lang.String orderStatus;
  /** Description: quote_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "quote_id")
  private java.lang.Integer quoteId;
  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: email_imported. */
  @Basic
  @Column(name = "email_imported")
  private java.lang.Integer emailImported;
  /** Description: modified. */
  @Basic
  @Column(name = "modified")
  private java.lang.Integer modified;
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

  public EmailOrder() {}

  public java.lang.Integer getEmailOrderId() {
    return this.emailOrderId;
  }

  public void setEmailOrderId(java.lang.Integer emailOrderId) {
    this.emailOrderId = emailOrderId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public java.lang.String getOrderStatus() {
    return this.orderStatus;
  }

  public java.lang.Integer getQuoteId() {
    return this.quoteId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getEmailImported() {
    return this.emailImported;
  }

  public java.lang.Integer getModified() {
    return this.modified;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public void setOrderStatus(java.lang.String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public void setQuoteId(java.lang.Integer quoteId) {
    this.quoteId = quoteId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setEmailImported(java.lang.Integer emailImported) {
    this.emailImported = emailImported;
  }

  public void setModified(java.lang.Integer modified) {
    this.modified = modified;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
