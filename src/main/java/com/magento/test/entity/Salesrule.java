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
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "salesrule")
public class Salesrule implements Serializable {
  private static final long serialVersionUID = 163445090676160209L;

  /** Description: rule_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "rule_id")
  private java.lang.Integer ruleId;

  /** Description: name. */
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 0)
  private java.lang.String description;
  /** Description: from_date. */
  @Basic
  @Column(name = "from_date")
  private java.util.Date fromDate;
  /** Description: to_date. */
  @Basic
  @Column(name = "to_date")
  private java.util.Date toDate;
  /** Description: uses_per_customer. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "uses_per_customer")
  private java.lang.Integer usesPerCustomer;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: conditions_serialized. */
  @Basic
  @Column(name = "conditions_serialized", length = 0)
  private java.lang.String conditionsSerialized;
  /** Description: actions_serialized. */
  @Basic
  @Column(name = "actions_serialized", length = 0)
  private java.lang.String actionsSerialized;
  /** Description: stop_rules_processing. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "stop_rules_processing")
  private java.lang.Integer stopRulesProcessing;
  /** Description: is_advanced. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_advanced")
  private java.lang.Integer isAdvanced;
  /** Description: product_ids. */
  @Basic
  @Column(name = "product_ids", length = 0)
  private java.lang.String productIds;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: simple_action. */
  @Basic
  @Column(name = "simple_action", length = 32)
  private java.lang.String simpleAction;
  /** Description: discount_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "discount_amount")
  private java.math.BigDecimal discountAmount;
  /** Description: discount_qty. */
  @Basic
  @Column(name = "discount_qty")
  private java.math.BigDecimal discountQty;
  /** Description: discount_step. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "discount_step")
  private java.lang.Integer discountStep;
  /** Description: apply_to_shipping. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "apply_to_shipping")
  private java.lang.Integer applyToShipping;
  /** Description: times_used. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "times_used")
  private java.lang.Integer timesUsed;
  /** Description: is_rss. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_rss")
  private java.lang.Integer isRss;
  /** Description: coupon_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "coupon_type")
  private java.lang.Integer couponType;
  /** Description: use_auto_generation. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "use_auto_generation")
  private java.lang.Integer useAutoGeneration;
  /** Description: uses_per_coupon. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "uses_per_coupon")
  private java.lang.Integer usesPerCoupon;
  /** Description: simple_free_shipping. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "simple_free_shipping")
  private java.lang.Integer simpleFreeShipping;

  public Salesrule() {}

  public java.lang.Integer getRuleId() {
    return this.ruleId;
  }

  public void setRuleId(java.lang.Integer ruleId) {
    this.ruleId = ruleId;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.util.Date getFromDate() {
    return this.fromDate;
  }

  public java.util.Date getToDate() {
    return this.toDate;
  }

  public java.lang.Integer getUsesPerCustomer() {
    return this.usesPerCustomer;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.lang.String getConditionsSerialized() {
    return this.conditionsSerialized;
  }

  public java.lang.String getActionsSerialized() {
    return this.actionsSerialized;
  }

  public java.lang.Integer getStopRulesProcessing() {
    return this.stopRulesProcessing;
  }

  public java.lang.Integer getIsAdvanced() {
    return this.isAdvanced;
  }

  public java.lang.String getProductIds() {
    return this.productIds;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.String getSimpleAction() {
    return this.simpleAction;
  }

  public java.math.BigDecimal getDiscountAmount() {
    return this.discountAmount;
  }

  public java.math.BigDecimal getDiscountQty() {
    return this.discountQty;
  }

  public java.lang.Integer getDiscountStep() {
    return this.discountStep;
  }

  public java.lang.Integer getApplyToShipping() {
    return this.applyToShipping;
  }

  public java.lang.Integer getTimesUsed() {
    return this.timesUsed;
  }

  public java.lang.Integer getIsRss() {
    return this.isRss;
  }

  public java.lang.Integer getCouponType() {
    return this.couponType;
  }

  public java.lang.Integer getUseAutoGeneration() {
    return this.useAutoGeneration;
  }

  public java.lang.Integer getUsesPerCoupon() {
    return this.usesPerCoupon;
  }

  public java.lang.Integer getSimpleFreeShipping() {
    return this.simpleFreeShipping;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setFromDate(java.util.Date fromDate) {
    this.fromDate = fromDate;
  }

  public void setToDate(java.util.Date toDate) {
    this.toDate = toDate;
  }

  public void setUsesPerCustomer(java.lang.Integer usesPerCustomer) {
    this.usesPerCustomer = usesPerCustomer;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setConditionsSerialized(java.lang.String conditionsSerialized) {
    this.conditionsSerialized = conditionsSerialized;
  }

  public void setActionsSerialized(java.lang.String actionsSerialized) {
    this.actionsSerialized = actionsSerialized;
  }

  public void setStopRulesProcessing(java.lang.Integer stopRulesProcessing) {
    this.stopRulesProcessing = stopRulesProcessing;
  }

  public void setIsAdvanced(java.lang.Integer isAdvanced) {
    this.isAdvanced = isAdvanced;
  }

  public void setProductIds(java.lang.String productIds) {
    this.productIds = productIds;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setSimpleAction(java.lang.String simpleAction) {
    this.simpleAction = simpleAction;
  }

  public void setDiscountAmount(java.math.BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public void setDiscountQty(java.math.BigDecimal discountQty) {
    this.discountQty = discountQty;
  }

  public void setDiscountStep(java.lang.Integer discountStep) {
    this.discountStep = discountStep;
  }

  public void setApplyToShipping(java.lang.Integer applyToShipping) {
    this.applyToShipping = applyToShipping;
  }

  public void setTimesUsed(java.lang.Integer timesUsed) {
    this.timesUsed = timesUsed;
  }

  public void setIsRss(java.lang.Integer isRss) {
    this.isRss = isRss;
  }

  public void setCouponType(java.lang.Integer couponType) {
    this.couponType = couponType;
  }

  public void setUseAutoGeneration(java.lang.Integer useAutoGeneration) {
    this.useAutoGeneration = useAutoGeneration;
  }

  public void setUsesPerCoupon(java.lang.Integer usesPerCoupon) {
    this.usesPerCoupon = usesPerCoupon;
  }

  public void setSimpleFreeShipping(java.lang.Integer simpleFreeShipping) {
    this.simpleFreeShipping = simpleFreeShipping;
  }
}
