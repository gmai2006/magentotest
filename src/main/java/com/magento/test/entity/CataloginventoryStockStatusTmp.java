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
@IdClass(CataloginventoryStockStatusTmpId.class)
@Table(name = "cataloginventory_stock_status_tmp")
public class CataloginventoryStockStatusTmp implements Serializable {
  private static final long serialVersionUID = 163445090455241060L;

  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "website_id")
  private java.lang.Integer websiteId;
  /** Description: stock_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "stock_id")
  private java.lang.Integer stockId;

  /** Description: qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "qty")
  private java.math.BigDecimal qty;
  /** Description: stock_status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "stock_status")
  private java.lang.Integer stockStatus;

  public CataloginventoryStockStatusTmp() {}

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.Integer getStockId() {
    return this.stockId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setStockId(java.lang.Integer stockId) {
    this.stockId = stockId;
  }

  public java.math.BigDecimal getQty() {
    return this.qty;
  }

  public java.lang.Integer getStockStatus() {
    return this.stockStatus;
  }

  public void setQty(java.math.BigDecimal qty) {
    this.qty = qty;
  }

  public void setStockStatus(java.lang.Integer stockStatus) {
    this.stockStatus = stockStatus;
  }
}
