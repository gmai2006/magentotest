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
@IdClass(ReportViewedProductAggregatedMonthlyId.class)
@Table(name = "report_viewed_product_aggregated_monthly")
public class ReportViewedProductAggregatedMonthly implements Serializable {
  private static final long serialVersionUID = 163445090612812593L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: period. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "period")
  private java.util.Date period;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: product_name. */
  @Basic
  @Column(name = "product_name", length = 255)
  private java.lang.String productName;
  /** Description: product_price. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_price")
  private java.math.BigDecimal productPrice;
  /** Description: views_num. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "views_num")
  private java.lang.Integer viewsNum;
  /** Description: rating_pos. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "rating_pos")
  private java.lang.Integer ratingPos;

  public ReportViewedProductAggregatedMonthly() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.util.Date getPeriod() {
    return this.period;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setPeriod(java.util.Date period) {
    this.period = period;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getProductName() {
    return this.productName;
  }

  public java.math.BigDecimal getProductPrice() {
    return this.productPrice;
  }

  public java.lang.Integer getViewsNum() {
    return this.viewsNum;
  }

  public java.lang.Integer getRatingPos() {
    return this.ratingPos;
  }

  public void setProductName(java.lang.String productName) {
    this.productName = productName;
  }

  public void setProductPrice(java.math.BigDecimal productPrice) {
    this.productPrice = productPrice;
  }

  public void setViewsNum(java.lang.Integer viewsNum) {
    this.viewsNum = viewsNum;
  }

  public void setRatingPos(java.lang.Integer ratingPos) {
    this.ratingPos = ratingPos;
  }
}
