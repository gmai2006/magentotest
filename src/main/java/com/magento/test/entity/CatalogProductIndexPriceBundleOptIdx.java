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
@IdClass(CatalogProductIndexPriceBundleOptIdxId.class)
@Table(name = "catalog_product_index_price_bundle_opt_idx")
public class CatalogProductIndexPriceBundleOptIdx implements Serializable {
  private static final long serialVersionUID = 163445090397436219L;

  /** Description: option_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "option_id")
  private java.lang.Integer optionId;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
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

  /** Description: min_price. */
  @Basic
  @Column(name = "min_price")
  private java.math.BigDecimal minPrice;
  /** Description: alt_price. */
  @Basic
  @Column(name = "alt_price")
  private java.math.BigDecimal altPrice;
  /** Description: max_price. */
  @Basic
  @Column(name = "max_price")
  private java.math.BigDecimal maxPrice;
  /** Description: tier_price. */
  @Basic
  @Column(name = "tier_price")
  private java.math.BigDecimal tierPrice;
  /** Description: alt_tier_price. */
  @Basic
  @Column(name = "alt_tier_price")
  private java.math.BigDecimal altTierPrice;

  public CatalogProductIndexPriceBundleOptIdx() {}

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public java.math.BigDecimal getMinPrice() {
    return this.minPrice;
  }

  public java.math.BigDecimal getAltPrice() {
    return this.altPrice;
  }

  public java.math.BigDecimal getMaxPrice() {
    return this.maxPrice;
  }

  public java.math.BigDecimal getTierPrice() {
    return this.tierPrice;
  }

  public java.math.BigDecimal getAltTierPrice() {
    return this.altTierPrice;
  }

  public void setMinPrice(java.math.BigDecimal minPrice) {
    this.minPrice = minPrice;
  }

  public void setAltPrice(java.math.BigDecimal altPrice) {
    this.altPrice = altPrice;
  }

  public void setMaxPrice(java.math.BigDecimal maxPrice) {
    this.maxPrice = maxPrice;
  }

  public void setTierPrice(java.math.BigDecimal tierPrice) {
    this.tierPrice = tierPrice;
  }

  public void setAltTierPrice(java.math.BigDecimal altTierPrice) {
    this.altTierPrice = altTierPrice;
  }
}
