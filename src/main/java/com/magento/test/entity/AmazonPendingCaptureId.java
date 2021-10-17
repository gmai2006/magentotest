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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** embeddable class Id for AmazonPendingCapture. generated on 10/16/2021 from a schema. */
public class AmazonPendingCaptureId implements Serializable {
  private static final long serialVersionUID = 163445090319491833L;

  @Column(name = "payment_id")
  private java.lang.Integer paymentId;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "capture_id")
  private java.lang.String captureId;

  @Column(name = "order_id")
  private java.lang.Integer orderId;

  /** Constructor: AmazonPendingCaptureId. */
  public AmazonPendingCaptureId() {}

  /**
   * Constructor: AmazonPendingCaptureId.
   *
   * @param paymentId - paymentId.
   * @param entityId - entityId.
   * @param captureId - captureId.
   * @param orderId - orderId.
   */
  public AmazonPendingCaptureId(
      java.lang.Integer paymentId,
      java.lang.Integer entityId,
      java.lang.String captureId,
      java.lang.Integer orderId) {
    this.paymentId = paymentId;
    this.entityId = entityId;
    this.captureId = captureId;
    this.orderId = orderId;
  }

  public java.lang.Integer getPaymentId() {
    return this.paymentId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.String getCaptureId() {
    return this.captureId;
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

  public void setCaptureId(java.lang.String captureId) {
    this.captureId = captureId;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((paymentId == null) ? 0 : paymentId.hashCode());
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((captureId == null) ? 0 : captureId.hashCode());
    result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    AmazonPendingCaptureId other = (AmazonPendingCaptureId) obj;

    if (paymentId == null) {
      if (other.paymentId != null) return false;
    } else if (!paymentId.equals(other.paymentId)) return false;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (captureId == null) {
      if (other.captureId != null) return false;
    } else if (!captureId.equals(other.captureId)) return false;

    if (orderId == null) {
      if (other.orderId != null) return false;
    } else if (!orderId.equals(other.orderId)) return false;

    return true;
  }
}
