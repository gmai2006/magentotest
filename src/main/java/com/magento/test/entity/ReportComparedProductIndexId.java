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

/** embeddable class Id for ReportComparedProductIndex. generated on 10/16/2021 from a schema. */
public class ReportComparedProductIndexId implements Serializable {
  private static final long serialVersionUID = 163445090610097189L;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  @Column(name = "visitor_id")
  private java.lang.Integer visitorId;

  @Column(name = "index_id")
  private java.lang.Long indexId;

  @Column(name = "customer_id")
  private java.lang.Integer customerId;

  /** Constructor: ReportComparedProductIndexId. */
  public ReportComparedProductIndexId() {}

  /**
   * Constructor: ReportComparedProductIndexId.
   *
   * @param productId - productId.
   * @param visitorId - visitorId.
   * @param indexId - indexId.
   * @param customerId - customerId.
   */
  public ReportComparedProductIndexId(
      java.lang.Integer productId,
      java.lang.Integer visitorId,
      java.lang.Long indexId,
      java.lang.Integer customerId) {
    this.productId = productId;
    this.visitorId = visitorId;
    this.indexId = indexId;
    this.customerId = customerId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getVisitorId() {
    return this.visitorId;
  }

  public java.lang.Long getIndexId() {
    return this.indexId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setVisitorId(java.lang.Integer visitorId) {
    this.visitorId = visitorId;
  }

  public void setIndexId(java.lang.Long indexId) {
    this.indexId = indexId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());
    result = prime * result + ((visitorId == null) ? 0 : visitorId.hashCode());
    result = prime * result + ((indexId == null) ? 0 : indexId.hashCode());
    result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    ReportComparedProductIndexId other = (ReportComparedProductIndexId) obj;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    if (visitorId == null) {
      if (other.visitorId != null) return false;
    } else if (!visitorId.equals(other.visitorId)) return false;

    if (indexId == null) {
      if (other.indexId != null) return false;
    } else if (!indexId.equals(other.indexId)) return false;

    if (customerId == null) {
      if (other.customerId != null) return false;
    } else if (!customerId.equals(other.customerId)) return false;

    return true;
  }
}
