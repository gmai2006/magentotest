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
@IdClass(CatalogProductIndexPriceIdxId.class)
@Table(name = "catalog_product_index_price_idx")
public class CatalogProductIndexPriceIdx implements Serializable {
  private static final long serialVersionUID = 1634450904170519L;

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

  /** Description: tax_class_id. */
  @Basic
  @Column(name = "tax_class_id")
  private java.lang.Integer taxClassId;
  /** Description: price. */
  @Basic
  @Column(name = "price")
  private java.math.BigDecimal price;
  /** Description: final_price. */
  @Basic
  @Column(name = "final_price")
  private java.math.BigDecimal finalPrice;
  /** Description: min_price. */
  @Basic
  @Column(name = "min_price")
  private java.math.BigDecimal minPrice;
  /** Description: max_price. */
  @Basic
  @Column(name = "max_price")
  private java.math.BigDecimal maxPrice;
  /** Description: tier_price. */
  @Basic
  @Column(name = "tier_price")
  private java.math.BigDecimal tierPrice;

  public CatalogProductIndexPriceIdx() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
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

  public java.lang.Integer getTaxClassId() {
    return this.taxClassId;
  }

  public java.math.BigDecimal getPrice() {
    return this.price;
  }

  public java.math.BigDecimal getFinalPrice() {
    return this.finalPrice;
  }

  public java.math.BigDecimal getMinPrice() {
    return this.minPrice;
  }

  public java.math.BigDecimal getMaxPrice() {
    return this.maxPrice;
  }

  public java.math.BigDecimal getTierPrice() {
    return this.tierPrice;
  }

  public void setTaxClassId(java.lang.Integer taxClassId) {
    this.taxClassId = taxClassId;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }

  public void setFinalPrice(java.math.BigDecimal finalPrice) {
    this.finalPrice = finalPrice;
  }

  public void setMinPrice(java.math.BigDecimal minPrice) {
    this.minPrice = minPrice;
  }

  public void setMaxPrice(java.math.BigDecimal maxPrice) {
    this.maxPrice = maxPrice;
  }

  public void setTierPrice(java.math.BigDecimal tierPrice) {
    this.tierPrice = tierPrice;
  }
}
