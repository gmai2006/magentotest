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
@Table(name = "product_alert_stock")
public class ProductAlertStock implements Serializable {
  private static final long serialVersionUID = 163445090586047719L;

  /** Description: alert_stock_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "alert_stock_id")
  private java.lang.Integer alertStockId;

  /** Description: customer_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;
  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: add_date. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "add_date")
  private java.sql.Timestamp addDate;
  /** Description: send_date. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "send_date")
  private java.sql.Timestamp sendDate;
  /** Description: send_count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "send_count")
  private java.lang.Integer sendCount;
  /** Description: status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "status")
  private java.lang.Integer status;

  public ProductAlertStock() {}

  public java.lang.Integer getAlertStockId() {
    return this.alertStockId;
  }

  public void setAlertStockId(java.lang.Integer alertStockId) {
    this.alertStockId = alertStockId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.sql.Timestamp getAddDate() {
    return this.addDate;
  }

  public java.sql.Timestamp getSendDate() {
    return this.sendDate;
  }

  public java.lang.Integer getSendCount() {
    return this.sendCount;
  }

  public java.lang.Integer getStatus() {
    return this.status;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setAddDate(java.sql.Timestamp addDate) {
    this.addDate = addDate;
  }

  public void setSendDate(java.sql.Timestamp sendDate) {
    this.sendDate = sendDate;
  }

  public void setSendCount(java.lang.Integer sendCount) {
    this.sendCount = sendCount;
  }

  public void setStatus(java.lang.Integer status) {
    this.status = status;
  }
}
