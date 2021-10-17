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

/** embeddable class Id for AmazonCustomer. generated on 10/16/2021 from a schema. */
public class AmazonCustomerId implements Serializable {
  private static final long serialVersionUID = 163445090315172698L;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "customer_id")
  private java.lang.Integer customerId;

  @Column(name = "amazon_id")
  private java.lang.String amazonId;

  /** Constructor: AmazonCustomerId. */
  public AmazonCustomerId() {}

  /**
   * Constructor: AmazonCustomerId.
   *
   * @param entityId - entityId.
   * @param customerId - customerId.
   * @param amazonId - amazonId.
   */
  public AmazonCustomerId(
      java.lang.Integer entityId, java.lang.Integer customerId, java.lang.String amazonId) {
    this.entityId = entityId;
    this.customerId = customerId;
    this.amazonId = amazonId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getAmazonId() {
    return this.amazonId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setAmazonId(java.lang.String amazonId) {
    this.amazonId = amazonId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
    result = prime * result + ((amazonId == null) ? 0 : amazonId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    AmazonCustomerId other = (AmazonCustomerId) obj;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (customerId == null) {
      if (other.customerId != null) return false;
    } else if (!customerId.equals(other.customerId)) return false;

    if (amazonId == null) {
      if (other.amazonId != null) return false;
    } else if (!amazonId.equals(other.amazonId)) return false;

    return true;
  }
}
