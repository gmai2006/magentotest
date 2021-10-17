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

/** embeddable class Id for TemandoShipment. generated on 10/16/2021 from a schema. */
public class TemandoShipmentId implements Serializable {
  private static final long serialVersionUID = 163445090705866509L;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "shipment_id")
  private java.lang.Integer shipmentId;

  @Column(name = "ext_shipment_id")
  private java.lang.String extShipmentId;

  /** Constructor: TemandoShipmentId. */
  public TemandoShipmentId() {}

  /**
   * Constructor: TemandoShipmentId.
   *
   * @param entityId - entityId.
   * @param shipmentId - shipmentId.
   * @param extShipmentId - extShipmentId.
   */
  public TemandoShipmentId(
      java.lang.Integer entityId, java.lang.Integer shipmentId, java.lang.String extShipmentId) {
    this.entityId = entityId;
    this.shipmentId = shipmentId;
    this.extShipmentId = extShipmentId;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((shipmentId == null) ? 0 : shipmentId.hashCode());
    result = prime * result + ((extShipmentId == null) ? 0 : extShipmentId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    TemandoShipmentId other = (TemandoShipmentId) obj;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (shipmentId == null) {
      if (other.shipmentId != null) return false;
    } else if (!shipmentId.equals(other.shipmentId)) return false;

    if (extShipmentId == null) {
      if (other.extShipmentId != null) return false;
    } else if (!extShipmentId.equals(other.extShipmentId)) return false;

    return true;
  }
}
