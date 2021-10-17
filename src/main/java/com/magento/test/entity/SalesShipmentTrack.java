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
@Table(name = "sales_shipment_track")
public class SalesShipmentTrack implements Serializable {
  private static final long serialVersionUID = 163445090673691492L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: parent_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "parent_id")
  private java.lang.Integer parentId;
  /** Description: weight. */
  @Basic
  @Column(name = "weight")
  private java.math.BigDecimal weight;
  /** Description: qty. */
  @Basic
  @Column(name = "qty")
  private java.math.BigDecimal qty;
  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_id")
  private java.lang.Integer orderId;
  /** Description: track_number. */
  @Basic
  @Column(name = "track_number", length = 0)
  private java.lang.String trackNumber;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 0)
  private java.lang.String description;
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: carrier_code. */
  @Basic
  @Column(name = "carrier_code", length = 32)
  private java.lang.String carrierCode;
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

  public SalesShipmentTrack() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.math.BigDecimal getWeight() {
    return this.weight;
  }

  public java.math.BigDecimal getQty() {
    return this.qty;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public java.lang.String getTrackNumber() {
    return this.trackNumber;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getCarrierCode() {
    return this.carrierCode;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setWeight(java.math.BigDecimal weight) {
    this.weight = weight;
  }

  public void setQty(java.math.BigDecimal qty) {
    this.qty = qty;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public void setTrackNumber(java.lang.String trackNumber) {
    this.trackNumber = trackNumber;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setCarrierCode(java.lang.String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
