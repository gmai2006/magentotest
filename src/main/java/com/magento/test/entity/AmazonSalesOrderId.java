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

/** embeddable class Id for AmazonSalesOrder. generated on 10/16/2021 from a schema. */
public class AmazonSalesOrderId implements Serializable {
  private static final long serialVersionUID = 163445090324850381L;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "order_id")
  private java.lang.Integer orderId;

  /** Constructor: AmazonSalesOrderId. */
  public AmazonSalesOrderId() {}

  /**
   * Constructor: AmazonSalesOrderId.
   *
   * @param entityId - entityId.
   * @param orderId - orderId.
   */
  public AmazonSalesOrderId(java.lang.Integer entityId, java.lang.Integer orderId) {
    this.entityId = entityId;
    this.orderId = orderId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    AmazonSalesOrderId other = (AmazonSalesOrderId) obj;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (orderId == null) {
      if (other.orderId != null) return false;
    } else if (!orderId.equals(other.orderId)) return false;

    return true;
  }
}
