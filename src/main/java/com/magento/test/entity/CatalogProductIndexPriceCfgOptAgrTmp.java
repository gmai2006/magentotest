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
@IdClass(CatalogProductIndexPriceCfgOptAgrTmpId.class)
@Table(name = "catalog_product_index_price_cfg_opt_agr_tmp")
public class CatalogProductIndexPriceCfgOptAgrTmp implements Serializable {
  private static final long serialVersionUID = 163445090407331686L;

  /** Description: child_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "child_id")
  private java.lang.Integer childId;
  /** Description: parent_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "parent_id")
  private java.lang.Integer parentId;
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

  /** Description: price. */
  @Basic
  @Column(name = "price")
  private java.math.BigDecimal price;
  /** Description: tier_price. */
  @Basic
  @Column(name = "tier_price")
  private java.math.BigDecimal tierPrice;

  public CatalogProductIndexPriceCfgOptAgrTmp() {}

  public java.lang.Integer getChildId() {
    return this.childId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setChildId(java.lang.Integer childId) {
    this.childId = childId;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public java.math.BigDecimal getPrice() {
    return this.price;
  }

  public java.math.BigDecimal getTierPrice() {
    return this.tierPrice;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }

  public void setTierPrice(java.math.BigDecimal tierPrice) {
    this.tierPrice = tierPrice;
  }
}
