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
@IdClass(CatalogruleProductId.class)
@Table(name = "catalogrule_product")
public class CatalogruleProduct implements Serializable {
  private static final long serialVersionUID = 163445090461550818L;

  /** Description: rule_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "rule_id")
  private java.lang.Integer ruleId;
  /** Description: rule_product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "rule_product_id")
  private java.lang.Integer ruleProductId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: to_time. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "to_time")
  private java.lang.Integer toTime;
  /** Description: from_time. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "from_time")
  private java.lang.Integer fromTime;
  /** Description: customer_group_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "customer_group_id")
  private java.lang.Integer customerGroupId;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Description: action_operator. */
  @Basic
  @Column(name = "action_operator", length = 10)
  private java.lang.String actionOperator;
  /** Description: action_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "action_amount")
  private java.math.BigDecimal actionAmount;
  /** Description: action_stop. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "action_stop")
  private java.lang.Integer actionStop;

  public CatalogruleProduct() {}

  public java.lang.Integer getRuleId() {
    return this.ruleId;
  }

  public java.lang.Integer getRuleProductId() {
    return this.ruleProductId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getToTime() {
    return this.toTime;
  }

  public java.lang.Integer getFromTime() {
    return this.fromTime;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setRuleId(java.lang.Integer ruleId) {
    this.ruleId = ruleId;
  }

  public void setRuleProductId(java.lang.Integer ruleProductId) {
    this.ruleProductId = ruleProductId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setToTime(java.lang.Integer toTime) {
    this.toTime = toTime;
  }

  public void setFromTime(java.lang.Integer fromTime) {
    this.fromTime = fromTime;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public java.lang.String getActionOperator() {
    return this.actionOperator;
  }

  public java.math.BigDecimal getActionAmount() {
    return this.actionAmount;
  }

  public java.lang.Integer getActionStop() {
    return this.actionStop;
  }

  public void setActionOperator(java.lang.String actionOperator) {
    this.actionOperator = actionOperator;
  }

  public void setActionAmount(java.math.BigDecimal actionAmount) {
    this.actionAmount = actionAmount;
  }

  public void setActionStop(java.lang.Integer actionStop) {
    this.actionStop = actionStop;
  }
}
