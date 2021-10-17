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
@IdClass(TemandoShipmentId.class)
@Table(name = "temando_shipment")
public class TemandoShipment implements Serializable {
  private static final long serialVersionUID = 163445090706468503L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: shipment_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "shipment_id")
  private java.lang.Integer shipmentId;
  /** Description: ext_shipment_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "ext_shipment_id")
  private java.lang.String extShipmentId;

  /** Description: ext_location_id. */
  @Basic
  @Column(name = "ext_location_id", length = 64)
  private java.lang.String extLocationId;
  /** Description: ext_tracking_url. */
  @Basic
  @Column(name = "ext_tracking_url", length = 255)
  private java.lang.String extTrackingUrl;
  /** Description: ext_tracking_reference. */
  @Basic
  @Column(name = "ext_tracking_reference", length = 255)
  private java.lang.String extTrackingReference;
  /** Description: ext_return_shipment_id. */
  @Basic
  @Column(name = "ext_return_shipment_id", length = 64)
  private java.lang.String extReturnShipmentId;

  public TemandoShipment() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getShipmentId() {
    return this.shipmentId;
  }

  public java.lang.String getExtShipmentId() {
    return this.extShipmentId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setShipmentId(java.lang.Integer shipmentId) {
    this.shipmentId = shipmentId;
  }

  public void setExtShipmentId(java.lang.String extShipmentId) {
    this.extShipmentId = extShipmentId;
  }

  public java.lang.String getExtLocationId() {
    return this.extLocationId;
  }

  public java.lang.String getExtTrackingUrl() {
    return this.extTrackingUrl;
  }

  public java.lang.String getExtTrackingReference() {
    return this.extTrackingReference;
  }

  public java.lang.String getExtReturnShipmentId() {
    return this.extReturnShipmentId;
  }

  public void setExtLocationId(java.lang.String extLocationId) {
    this.extLocationId = extLocationId;
  }

  public void setExtTrackingUrl(java.lang.String extTrackingUrl) {
    this.extTrackingUrl = extTrackingUrl;
  }

  public void setExtTrackingReference(java.lang.String extTrackingReference) {
    this.extTrackingReference = extTrackingReference;
  }

  public void setExtReturnShipmentId(java.lang.String extReturnShipmentId) {
    this.extReturnShipmentId = extReturnShipmentId;
  }
}
