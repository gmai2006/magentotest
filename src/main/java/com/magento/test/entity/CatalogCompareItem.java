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
@Table(name = "catalog_compare_item")
public class CatalogCompareItem implements Serializable {
  private static final long serialVersionUID = 163445090351744985L;

  /** Description: catalog_compare_item_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "catalog_compare_item_id")
  private java.lang.Integer catalogCompareItemId;

  /** Description: visitor_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "visitor_id")
  private java.lang.Integer visitorId;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;

  public CatalogCompareItem() {}

  public java.lang.Integer getCatalogCompareItemId() {
    return this.catalogCompareItemId;
  }

  public void setCatalogCompareItemId(java.lang.Integer catalogCompareItemId) {
    this.catalogCompareItemId = catalogCompareItemId;
  }

  public java.lang.Integer getVisitorId() {
    return this.visitorId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public void setVisitorId(java.lang.Integer visitorId) {
    this.visitorId = visitorId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }
}
