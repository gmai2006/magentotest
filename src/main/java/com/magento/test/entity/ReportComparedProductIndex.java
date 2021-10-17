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
@IdClass(ReportComparedProductIndexId.class)
@Table(name = "report_compared_product_index")
public class ReportComparedProductIndex implements Serializable {
  private static final long serialVersionUID = 163445090610449708L;

  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: visitor_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "visitor_id")
  private java.lang.Integer visitorId;
  /** Description: index_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "index_id")
  private java.lang.Long indexId;
  /** Description: customer_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "customer_id")
  private java.lang.Integer customerId;

  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: added_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "added_at")
  private java.sql.Timestamp addedAt;

  public ReportComparedProductIndex() {}

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getVisitorId() {
    return this.visitorId;
  }

  public java.lang.Long getIndexId() {
    return this.indexId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setVisitorId(java.lang.Integer visitorId) {
    this.visitorId = visitorId;
  }

  public void setIndexId(java.lang.Long indexId) {
    this.indexId = indexId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.sql.Timestamp getAddedAt() {
    return this.addedAt;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setAddedAt(java.sql.Timestamp addedAt) {
    this.addedAt = addedAt;
  }
}
