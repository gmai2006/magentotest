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
@IdClass(AmazonPendingRefundId.class)
@Table(name = "amazon_pending_refund")
public class AmazonPendingRefund implements Serializable {
  private static final long serialVersionUID = 163445090322384661L;

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
  /** Description: refund_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "refund_id")
  private java.lang.String refundId;
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

  public AmazonPendingRefund() {}

  public java.lang.Integer getPaymentId() {
    return this.paymentId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.String getRefundId() {
    return this.refundId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public void setPaymentId(java.lang.Integer paymentId) {
    this.paymentId = paymentId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setRefundId(java.lang.String refundId) {
    this.refundId = refundId;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public java.util.Date getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }
}
