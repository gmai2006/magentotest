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
@IdClass(SalesruleCouponAggregatedUpdatedId.class)
@Table(name = "salesrule_coupon_aggregated_updated")
public class SalesruleCouponAggregatedUpdated implements Serializable {
  private static final long serialVersionUID = 16344509068107730L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: order_status. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "order_status")
  private java.lang.String orderStatus;
  /** Description: period. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "period")
  private java.util.Date period;
  /** Description: coupon_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "coupon_code")
  private java.lang.String couponCode;
  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: coupon_uses. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "coupon_uses")
  private java.lang.Integer couponUses;
  /** Description: subtotal_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "subtotal_amount")
  private java.math.BigDecimal subtotalAmount;
  /** Description: discount_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "discount_amount")
  private java.math.BigDecimal discountAmount;
  /** Description: total_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_amount")
  private java.math.BigDecimal totalAmount;
  /** Description: subtotal_amount_actual. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "subtotal_amount_actual")
  private java.math.BigDecimal subtotalAmountActual;
  /** Description: discount_amount_actual. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "discount_amount_actual")
  private java.math.BigDecimal discountAmountActual;
  /** Description: total_amount_actual. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_amount_actual")
  private java.math.BigDecimal totalAmountActual;
  /** Description: rule_name. */
  @Basic
  @Column(name = "rule_name", length = 255)
  private java.lang.String ruleName;

  public SalesruleCouponAggregatedUpdated() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getOrderStatus() {
    return this.orderStatus;
  }

  public java.util.Date getPeriod() {
    return this.period;
  }

  public java.lang.String getCouponCode() {
    return this.couponCode;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setOrderStatus(java.lang.String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public void setPeriod(java.util.Date period) {
    this.period = period;
  }

  public void setCouponCode(java.lang.String couponCode) {
    this.couponCode = couponCode;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getCouponUses() {
    return this.couponUses;
  }

  public java.math.BigDecimal getSubtotalAmount() {
    return this.subtotalAmount;
  }

  public java.math.BigDecimal getDiscountAmount() {
    return this.discountAmount;
  }

  public java.math.BigDecimal getTotalAmount() {
    return this.totalAmount;
  }

  public java.math.BigDecimal getSubtotalAmountActual() {
    return this.subtotalAmountActual;
  }

  public java.math.BigDecimal getDiscountAmountActual() {
    return this.discountAmountActual;
  }

  public java.math.BigDecimal getTotalAmountActual() {
    return this.totalAmountActual;
  }

  public java.lang.String getRuleName() {
    return this.ruleName;
  }

  public void setCouponUses(java.lang.Integer couponUses) {
    this.couponUses = couponUses;
  }

  public void setSubtotalAmount(java.math.BigDecimal subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }

  public void setDiscountAmount(java.math.BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public void setTotalAmount(java.math.BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public void setSubtotalAmountActual(java.math.BigDecimal subtotalAmountActual) {
    this.subtotalAmountActual = subtotalAmountActual;
  }

  public void setDiscountAmountActual(java.math.BigDecimal discountAmountActual) {
    this.discountAmountActual = discountAmountActual;
  }

  public void setTotalAmountActual(java.math.BigDecimal totalAmountActual) {
    this.totalAmountActual = totalAmountActual;
  }

  public void setRuleName(java.lang.String ruleName) {
    this.ruleName = ruleName;
  }
}
