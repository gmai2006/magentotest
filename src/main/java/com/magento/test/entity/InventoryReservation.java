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
@Table(name = "inventory_reservation")
public class InventoryReservation implements Serializable {
  private static final long serialVersionUID = 163445090555957692L;

  /** Description: reservation_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "reservation_id")
  private java.lang.Integer reservationId;

  /** Description: stock_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "stock_id")
  private java.lang.Integer stockId;
  /** Description: sku. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sku", length = 64)
  private java.lang.String sku;
  /** Description: quantity. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "quantity")
  private java.math.BigDecimal quantity;
  /** Description: metadata. */
  @Basic
  @Column(name = "metadata", length = 255)
  private java.lang.String metadata;

  public InventoryReservation() {}

  public java.lang.Integer getReservationId() {
    return this.reservationId;
  }

  public void setReservationId(java.lang.Integer reservationId) {
    this.reservationId = reservationId;
  }

  public java.lang.Integer getStockId() {
    return this.stockId;
  }

  public java.lang.String getSku() {
    return this.sku;
  }

  public java.math.BigDecimal getQuantity() {
    return this.quantity;
  }

  public java.lang.String getMetadata() {
    return this.metadata;
  }

  public void setStockId(java.lang.Integer stockId) {
    this.stockId = stockId;
  }

  public void setSku(java.lang.String sku) {
    this.sku = sku;
  }

  public void setQuantity(java.math.BigDecimal quantity) {
    this.quantity = quantity;
  }

  public void setMetadata(java.lang.String metadata) {
    this.metadata = metadata;
  }
}
