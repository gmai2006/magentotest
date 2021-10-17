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
@IdClass(AmazonPendingAuthorizationId.class)
@Table(name = "amazon_pending_authorization")
public class AmazonPendingAuthorization implements Serializable {
  private static final long serialVersionUID = 163445090317948746L;

  /** Description: authorization_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "authorization_id")
  private java.lang.String authorizationId;
  /** Description: payment_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "payment_id")
  private java.lang.Integer paymentId;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "order_id")
  private java.lang.Integer orderId;

  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.util.Date createdAt;
  /** Description: updated_at. */
  @Basic
  @Column(name = "updated_at")
  private java.util.Date updatedAt;
  /** Description: processed. */
  @Basic
  @Column(name = "processed")
  private java.lang.Integer processed;
  /** Description: capture. */
  @Basic
  @Column(name = "capture")
  private java.lang.Integer capture;
  /** Description: capture_id. */
  @Basic
  @Column(name = "capture_id", length = 255)
  private java.lang.String captureId;

  public AmazonPendingAuthorization() {}

  public java.lang.String getAuthorizationId() {
    return this.authorizationId;
  }

  public java.lang.Integer getPaymentId() {
    return this.paymentId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public void setAuthorizationId(java.lang.String authorizationId) {
    this.authorizationId = authorizationId;
  }

  public void setPaymentId(java.lang.Integer paymentId) {
    this.paymentId = paymentId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public java.util.Date getCreatedAt() {
    return this.createdAt;
  }

  public java.util.Date getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.Integer getProcessed() {
    return this.processed;
  }

  public java.lang.Integer getCapture() {
    return this.capture;
  }

  public java.lang.String getCaptureId() {
    return this.captureId;
  }

  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setProcessed(java.lang.Integer processed) {
    this.processed = processed;
  }

  public void setCapture(java.lang.Integer capture) {
    this.capture = capture;
  }

  public void setCaptureId(java.lang.String captureId) {
    this.captureId = captureId;
  }
}
