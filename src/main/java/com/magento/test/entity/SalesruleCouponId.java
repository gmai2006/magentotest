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

/** embeddable class Id for SalesruleCoupon. generated on 10/16/2021 from a schema. */
public class SalesruleCouponId implements Serializable {
  private static final long serialVersionUID = 163445090677351559L;

  @Column(name = "rule_id")
  private java.lang.Integer ruleId;

  @Column(name = "code")
  private java.lang.String code;

  @Column(name = "coupon_id")
  private java.lang.Integer couponId;

  @Column(name = "is_primary")
  private java.lang.Integer isPrimary;

  /** Constructor: SalesruleCouponId. */
  public SalesruleCouponId() {}

  /**
   * Constructor: SalesruleCouponId.
   *
   * @param ruleId - ruleId.
   * @param code - code.
   * @param couponId - couponId.
   * @param isPrimary - isPrimary.
   */
  public SalesruleCouponId(
      java.lang.Integer ruleId,
      java.lang.String code,
      java.lang.Integer couponId,
      java.lang.Integer isPrimary) {
    this.ruleId = ruleId;
    this.code = code;
    this.couponId = couponId;
    this.isPrimary = isPrimary;
  }

  public java.lang.Integer getRuleId() {
    return this.ruleId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.Integer getCouponId() {
    return this.couponId;
  }

  public java.lang.Integer getIsPrimary() {
    return this.isPrimary;
  }

  public void setRuleId(java.lang.Integer ruleId) {
    this.ruleId = ruleId;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setCouponId(java.lang.Integer couponId) {
    this.couponId = couponId;
  }

  public void setIsPrimary(java.lang.Integer isPrimary) {
    this.isPrimary = isPrimary;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((ruleId == null) ? 0 : ruleId.hashCode());
    result = prime * result + ((code == null) ? 0 : code.hashCode());
    result = prime * result + ((couponId == null) ? 0 : couponId.hashCode());
    result = prime * result + ((isPrimary == null) ? 0 : isPrimary.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    SalesruleCouponId other = (SalesruleCouponId) obj;

    if (ruleId == null) {
      if (other.ruleId != null) return false;
    } else if (!ruleId.equals(other.ruleId)) return false;

    if (code == null) {
      if (other.code != null) return false;
    } else if (!code.equals(other.code)) return false;

    if (couponId == null) {
      if (other.couponId != null) return false;
    } else if (!couponId.equals(other.couponId)) return false;

    if (isPrimary == null) {
      if (other.isPrimary != null) return false;
    } else if (!isPrimary.equals(other.isPrimary)) return false;

    return true;
  }
}
