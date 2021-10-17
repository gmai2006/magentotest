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

/** embeddable class Id for CatalogProductFrontendAction. generated on 10/16/2021 from a schema. */
public class CatalogProductFrontendActionId implements Serializable {
  private static final long serialVersionUID = 163445090378783459L;

  @Column(name = "action_id")
  private java.lang.Long actionId;

  @Column(name = "type_id")
  private java.lang.String typeId;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  @Column(name = "visitor_id")
  private java.lang.Integer visitorId;

  @Column(name = "customer_id")
  private java.lang.Integer customerId;

  /** Constructor: CatalogProductFrontendActionId. */
  public CatalogProductFrontendActionId() {}

  /**
   * Constructor: CatalogProductFrontendActionId.
   *
   * @param actionId - actionId.
   * @param typeId - typeId.
   * @param productId - productId.
   * @param visitorId - visitorId.
   * @param customerId - customerId.
   */
  public CatalogProductFrontendActionId(
      java.lang.Long actionId,
      java.lang.String typeId,
      java.lang.Integer productId,
      java.lang.Integer visitorId,
      java.lang.Integer customerId) {
    this.actionId = actionId;
    this.typeId = typeId;
    this.productId = productId;
    this.visitorId = visitorId;
    this.customerId = customerId;
  }

  public java.lang.Long getActionId() {
    return this.actionId;
  }

  public java.lang.String getTypeId() {
    return this.typeId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getVisitorId() {
    return this.visitorId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public void setActionId(java.lang.Long actionId) {
    this.actionId = actionId;
  }

  public void setTypeId(java.lang.String typeId) {
    this.typeId = typeId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setVisitorId(java.lang.Integer visitorId) {
    this.visitorId = visitorId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((actionId == null) ? 0 : actionId.hashCode());
    result = prime * result + ((typeId == null) ? 0 : typeId.hashCode());
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());
    result = prime * result + ((visitorId == null) ? 0 : visitorId.hashCode());
    result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductFrontendActionId other = (CatalogProductFrontendActionId) obj;

    if (actionId == null) {
      if (other.actionId != null) return false;
    } else if (!actionId.equals(other.actionId)) return false;

    if (typeId == null) {
      if (other.typeId != null) return false;
    } else if (!typeId.equals(other.typeId)) return false;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    if (visitorId == null) {
      if (other.visitorId != null) return false;
    } else if (!visitorId.equals(other.visitorId)) return false;

    if (customerId == null) {
      if (other.customerId != null) return false;
    } else if (!customerId.equals(other.customerId)) return false;

    return true;
  }
}
