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

/** embeddable class Id for SalesruleCouponUsage. generated on 10/16/2021 from a schema. */
public class SalesruleCouponUsageId implements Serializable {
  private static final long serialVersionUID = 163445090681643250L;

  @Column(name = "coupon_id")
  private java.lang.Integer couponId;

  @Column(name = "customer_id")
  private java.lang.Integer customerId;

  /** Constructor: SalesruleCouponUsageId. */
  public SalesruleCouponUsageId() {}

  /**
   * Constructor: SalesruleCouponUsageId.
   *
   * @param couponId - couponId.
   * @param customerId - customerId.
   */
  public SalesruleCouponUsageId(java.lang.Integer couponId, java.lang.Integer customerId) {
    this.couponId = couponId;
    this.customerId = customerId;
  }

  public java.lang.Integer getCouponId() {
    return this.couponId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public void setCouponId(java.lang.Integer couponId) {
    this.couponId = couponId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((couponId == null) ? 0 : couponId.hashCode());
    result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    SalesruleCouponUsageId other = (SalesruleCouponUsageId) obj;

    if (couponId == null) {
      if (other.couponId != null) return false;
    } else if (!couponId.equals(other.couponId)) return false;

    if (customerId == null) {
      if (other.customerId != null) return false;
    } else if (!customerId.equals(other.customerId)) return false;

    return true;
  }
}
