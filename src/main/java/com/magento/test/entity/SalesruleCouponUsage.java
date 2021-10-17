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
@IdClass(SalesruleCouponUsageId.class)
@Table(name = "salesrule_coupon_usage")
public class SalesruleCouponUsage implements Serializable {
  private static final long serialVersionUID = 163445090681945610L;

  /** Description: coupon_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "coupon_id")
  private java.lang.Integer couponId;
  /** Description: customer_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "customer_id")
  private java.lang.Integer customerId;

  /** Description: times_used. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "times_used")
  private java.lang.Integer timesUsed;

  public SalesruleCouponUsage() {}

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

  public java.lang.Integer getTimesUsed() {
    return this.timesUsed;
  }

  public void setTimesUsed(java.lang.Integer timesUsed) {
    this.timesUsed = timesUsed;
  }
}
