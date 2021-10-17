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
@Table(name = "klarna_core_order")
public class KlarnaCoreOrder implements Serializable {
  private static final long serialVersionUID = 163445090562113517L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: klarna_order_id. */
  @Basic
  @Column(name = "klarna_order_id", length = 255)
  private java.lang.String klarnaOrderId;
  /** Description: session_id. */
  @Basic
  @Column(name = "session_id", length = 255)
  private java.lang.String sessionId;
  /** Description: reservation_id. */
  @Basic
  @Column(name = "reservation_id", length = 255)
  private java.lang.String reservationId;
  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_id")
  private java.lang.Integer orderId;
  /** Description: is_acknowledged. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_acknowledged")
  private java.lang.Integer isAcknowledged;

  public KlarnaCoreOrder() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getKlarnaOrderId() {
    return this.klarnaOrderId;
  }

  public java.lang.String getSessionId() {
    return this.sessionId;
  }

  public java.lang.String getReservationId() {
    return this.reservationId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public java.lang.Integer getIsAcknowledged() {
    return this.isAcknowledged;
  }

  public void setKlarnaOrderId(java.lang.String klarnaOrderId) {
    this.klarnaOrderId = klarnaOrderId;
  }

  public void setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
  }

  public void setReservationId(java.lang.String reservationId) {
    this.reservationId = reservationId;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public void setIsAcknowledged(java.lang.Integer isAcknowledged) {
    this.isAcknowledged = isAcknowledged;
  }
}
