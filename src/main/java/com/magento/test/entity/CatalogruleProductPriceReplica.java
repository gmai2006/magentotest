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
@IdClass(CatalogruleProductPriceReplicaId.class)
@Table(name = "catalogrule_product_price_replica")
public class CatalogruleProductPriceReplica implements Serializable {
  private static final long serialVersionUID = 16344509046503845L;

  /** Description: rule_date. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "rule_date")
  private java.util.Date ruleDate;
  /** Description: rule_product_price_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "rule_product_price_id")
  private java.lang.Integer ruleProductPriceId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: customer_group_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "customer_group_id")
  private java.lang.Integer customerGroupId;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Description: rule_price. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "rule_price")
  private java.math.BigDecimal rulePrice;
  /** Description: latest_start_date. */
  @Basic
  @Column(name = "latest_start_date")
  private java.util.Date latestStartDate;
  /** Description: earliest_end_date. */
  @Basic
  @Column(name = "earliest_end_date")
  private java.util.Date earliestEndDate;

  public CatalogruleProductPriceReplica() {}

  public java.util.Date getRuleDate() {
    return this.ruleDate;
  }

  public java.lang.Integer getRuleProductPriceId() {
    return this.ruleProductPriceId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setRuleDate(java.util.Date ruleDate) {
    this.ruleDate = ruleDate;
  }

  public void setRuleProductPriceId(java.lang.Integer ruleProductPriceId) {
    this.ruleProductPriceId = ruleProductPriceId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public java.math.BigDecimal getRulePrice() {
    return this.rulePrice;
  }

  public java.util.Date getLatestStartDate() {
    return this.latestStartDate;
  }

  public java.util.Date getEarliestEndDate() {
    return this.earliestEndDate;
  }

  public void setRulePrice(java.math.BigDecimal rulePrice) {
    this.rulePrice = rulePrice;
  }

  public void setLatestStartDate(java.util.Date latestStartDate) {
    this.latestStartDate = latestStartDate;
  }

  public void setEarliestEndDate(java.util.Date earliestEndDate) {
    this.earliestEndDate = earliestEndDate;
  }
}
