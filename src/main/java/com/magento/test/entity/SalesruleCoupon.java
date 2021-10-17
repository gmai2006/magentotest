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
@IdClass(SalesruleCouponId.class)
@Table(name = "salesrule_coupon")
public class SalesruleCoupon implements Serializable {
  private static final long serialVersionUID = 163445090677884136L;

  /** Description: rule_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "rule_id")
  private java.lang.Integer ruleId;
  /** Description: code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "code")
  private java.lang.String code;
  /** Description: coupon_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "coupon_id")
  private java.lang.Integer couponId;
  /** Description: is_primary. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "is_primary")
  private java.lang.Integer isPrimary;

  /** Description: usage_limit. */
  @Basic
  @Column(name = "usage_limit")
  private java.lang.Integer usageLimit;
  /** Description: usage_per_customer. */
  @Basic
  @Column(name = "usage_per_customer")
  private java.lang.Integer usagePerCustomer;
  /** Description: times_used. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "times_used")
  private java.lang.Integer timesUsed;
  /** Description: expiration_date. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "expiration_date")
  private java.sql.Timestamp expirationDate;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: type. */
  @Basic
  @Column(name = "type")
  private java.lang.Integer type;
  /** Description: generated_by_dotmailer. */
  @Basic
  @Column(name = "generated_by_dotmailer")
  private java.lang.Integer generatedByDotmailer;

  public SalesruleCoupon() {}

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

  public java.lang.Integer getUsageLimit() {
    return this.usageLimit;
  }

  public java.lang.Integer getUsagePerCustomer() {
    return this.usagePerCustomer;
  }

  public java.lang.Integer getTimesUsed() {
    return this.timesUsed;
  }

  public java.sql.Timestamp getExpirationDate() {
    return this.expirationDate;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.lang.Integer getType() {
    return this.type;
  }

  public java.lang.Integer getGeneratedByDotmailer() {
    return this.generatedByDotmailer;
  }

  public void setUsageLimit(java.lang.Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  public void setUsagePerCustomer(java.lang.Integer usagePerCustomer) {
    this.usagePerCustomer = usagePerCustomer;
  }

  public void setTimesUsed(java.lang.Integer timesUsed) {
    this.timesUsed = timesUsed;
  }

  public void setExpirationDate(java.sql.Timestamp expirationDate) {
    this.expirationDate = expirationDate;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setType(java.lang.Integer type) {
    this.type = type;
  }

  public void setGeneratedByDotmailer(java.lang.Integer generatedByDotmailer) {
    this.generatedByDotmailer = generatedByDotmailer;
  }
}
