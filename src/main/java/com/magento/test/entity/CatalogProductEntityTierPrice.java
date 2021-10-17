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
@IdClass(CatalogProductEntityTierPriceId.class)
@Table(name = "catalog_product_entity_tier_price")
public class CatalogProductEntityTierPrice implements Serializable {
  private static final long serialVersionUID = 16344509037649609L;

  /** Description: qty. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "qty")
  private java.math.BigDecimal qty;
  /** Description: value_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "value_id")
  private java.lang.Integer valueId;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: all_groups. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "all_groups")
  private java.lang.Integer allGroups;
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

  /** Description: value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "value")
  private java.math.BigDecimal value;
  /** Description: percentage_value. */
  @Basic
  @Column(name = "percentage_value")
  private java.math.BigDecimal percentageValue;

  public CatalogProductEntityTierPrice() {}

  public java.math.BigDecimal getQty() {
    return this.qty;
  }

  public java.lang.Integer getValueId() {
    return this.valueId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getAllGroups() {
    return this.allGroups;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setQty(java.math.BigDecimal qty) {
    this.qty = qty;
  }

  public void setValueId(java.lang.Integer valueId) {
    this.valueId = valueId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setAllGroups(java.lang.Integer allGroups) {
    this.allGroups = allGroups;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public java.math.BigDecimal getValue() {
    return this.value;
  }

  public java.math.BigDecimal getPercentageValue() {
    return this.percentageValue;
  }

  public void setValue(java.math.BigDecimal value) {
    this.value = value;
  }

  public void setPercentageValue(java.math.BigDecimal percentageValue) {
    this.percentageValue = percentageValue;
  }
}
