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
@Table(name = "downloadable_link_purchased")
public class DownloadableLinkPurchased implements Serializable {
  private static final long serialVersionUID = 163445090510495027L;

  /** Description: purchased_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "purchased_id")
  private java.lang.Integer purchasedId;

  /** Description: order_id. */
  @Basic
  @Column(name = "order_id")
  private java.lang.Integer orderId;
  /** Description: order_increment_id. */
  @Basic
  @Column(name = "order_increment_id", length = 50)
  private java.lang.String orderIncrementId;
  /** Description: order_item_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_item_id")
  private java.lang.Integer orderItemId;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: product_name. */
  @Basic
  @Column(name = "product_name", length = 255)
  private java.lang.String productName;
  /** Description: product_sku. */
  @Basic
  @Column(name = "product_sku", length = 255)
  private java.lang.String productSku;
  /** Description: link_section_title. */
  @Basic
  @Column(name = "link_section_title", length = 255)
  private java.lang.String linkSectionTitle;

  public DownloadableLinkPurchased() {}

  public java.lang.Integer getPurchasedId() {
    return this.purchasedId;
  }

  public void setPurchasedId(java.lang.Integer purchasedId) {
    this.purchasedId = purchasedId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public java.lang.String getOrderIncrementId() {
    return this.orderIncrementId;
  }

  public java.lang.Integer getOrderItemId() {
    return this.orderItemId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getProductName() {
    return this.productName;
  }

  public java.lang.String getProductSku() {
    return this.productSku;
  }

  public java.lang.String getLinkSectionTitle() {
    return this.linkSectionTitle;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public void setOrderIncrementId(java.lang.String orderIncrementId) {
    this.orderIncrementId = orderIncrementId;
  }

  public void setOrderItemId(java.lang.Integer orderItemId) {
    this.orderItemId = orderItemId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setProductName(java.lang.String productName) {
    this.productName = productName;
  }

  public void setProductSku(java.lang.String productSku) {
    this.productSku = productSku;
  }

  public void setLinkSectionTitle(java.lang.String linkSectionTitle) {
    this.linkSectionTitle = linkSectionTitle;
  }
}
