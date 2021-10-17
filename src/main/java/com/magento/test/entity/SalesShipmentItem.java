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
@Table(name = "sales_shipment_item")
public class SalesShipmentItem implements Serializable {
  private static final long serialVersionUID = 163445090673191438L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: parent_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "parent_id")
  private java.lang.Integer parentId;
  /** Description: row_total. */
  @Basic
  @Column(name = "row_total")
  private java.math.BigDecimal rowTotal;
  /** Description: price. */
  @Basic
  @Column(name = "price")
  private java.math.BigDecimal price;
  /** Description: weight. */
  @Basic
  @Column(name = "weight")
  private java.math.BigDecimal weight;
  /** Description: qty. */
  @Basic
  @Column(name = "qty")
  private java.math.BigDecimal qty;
  /** Description: product_id. */
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: order_item_id. */
  @Basic
  @Column(name = "order_item_id")
  private java.lang.Integer orderItemId;
  /** Description: additional_data. */
  @Basic
  @Column(name = "additional_data", length = 0)
  private java.lang.String additionalData;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 0)
  private java.lang.String description;
  /** Description: name. */
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: sku. */
  @Basic
  @Column(name = "sku", length = 255)
  private java.lang.String sku;

  public SalesShipmentItem() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.math.BigDecimal getRowTotal() {
    return this.rowTotal;
  }

  public java.math.BigDecimal getPrice() {
    return this.price;
  }

  public java.math.BigDecimal getWeight() {
    return this.weight;
  }

  public java.math.BigDecimal getQty() {
    return this.qty;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getOrderItemId() {
    return this.orderItemId;
  }

  public java.lang.String getAdditionalData() {
    return this.additionalData;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getSku() {
    return this.sku;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setRowTotal(java.math.BigDecimal rowTotal) {
    this.rowTotal = rowTotal;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }

  public void setWeight(java.math.BigDecimal weight) {
    this.weight = weight;
  }

  public void setQty(java.math.BigDecimal qty) {
    this.qty = qty;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setOrderItemId(java.lang.Integer orderItemId) {
    this.orderItemId = orderItemId;
  }

  public void setAdditionalData(java.lang.String additionalData) {
    this.additionalData = additionalData;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setSku(java.lang.String sku) {
    this.sku = sku;
  }
}
