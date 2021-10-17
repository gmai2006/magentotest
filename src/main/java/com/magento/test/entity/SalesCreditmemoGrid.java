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
@IdClass(SalesCreditmemoGridId.class)
@Table(name = "sales_creditmemo_grid")
public class SalesCreditmemoGrid implements Serializable {
  private static final long serialVersionUID = 163445090625465479L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: increment_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "increment_id")
  private java.lang.String incrementId;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

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
  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_id")
  private java.lang.Integer orderId;
  /** Description: order_increment_id. */
  @Basic
  @Column(name = "order_increment_id", length = 50)
  private java.lang.String orderIncrementId;
  /** Description: order_created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_created_at")
  private java.sql.Timestamp orderCreatedAt;
  /** Description: billing_name. */
  @Basic
  @Column(name = "billing_name", length = 255)
  private java.lang.String billingName;
  /** Description: state. */
  @Basic
  @Column(name = "state")
  private java.lang.Integer state;
  /** Description: base_grand_total. */
  @Basic
  @Column(name = "base_grand_total")
  private java.math.BigDecimal baseGrandTotal;
  /** Description: order_status. */
  @Basic
  @Column(name = "order_status", length = 32)
  private java.lang.String orderStatus;
  /** Description: billing_address. */
  @Basic
  @Column(name = "billing_address", length = 255)
  private java.lang.String billingAddress;
  /** Description: shipping_address. */
  @Basic
  @Column(name = "shipping_address", length = 255)
  private java.lang.String shippingAddress;
  /** Description: customer_name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "customer_name", length = 128)
  private java.lang.String customerName;
  /** Description: customer_email. */
  @Basic
  @Column(name = "customer_email", length = 128)
  private java.lang.String customerEmail;
  /** Description: customer_group_id. */
  @Basic
  @Column(name = "customer_group_id")
  private java.lang.Integer customerGroupId;
  /** Description: payment_method. */
  @Basic
  @Column(name = "payment_method", length = 32)
  private java.lang.String paymentMethod;
  /** Description: shipping_information. */
  @Basic
  @Column(name = "shipping_information", length = 255)
  private java.lang.String shippingInformation;
  /** Description: subtotal. */
  @Basic
  @Column(name = "subtotal")
  private java.math.BigDecimal subtotal;
  /** Description: shipping_and_handling. */
  @Basic
  @Column(name = "shipping_and_handling")
  private java.math.BigDecimal shippingAndHandling;
  /** Description: adjustment_positive. */
  @Basic
  @Column(name = "adjustment_positive")
  private java.math.BigDecimal adjustmentPositive;
  /** Description: adjustment_negative. */
  @Basic
  @Column(name = "adjustment_negative")
  private java.math.BigDecimal adjustmentNegative;
  /** Description: order_base_grand_total. */
  @Basic
  @Column(name = "order_base_grand_total")
  private java.math.BigDecimal orderBaseGrandTotal;

  public SalesCreditmemoGrid() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getIncrementId() {
    return this.incrementId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setIncrementId(java.lang.String incrementId) {
    this.incrementId = incrementId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public java.lang.String getOrderIncrementId() {
    return this.orderIncrementId;
  }

  public java.sql.Timestamp getOrderCreatedAt() {
    return this.orderCreatedAt;
  }

  public java.lang.String getBillingName() {
    return this.billingName;
  }

  public java.lang.Integer getState() {
    return this.state;
  }

  public java.math.BigDecimal getBaseGrandTotal() {
    return this.baseGrandTotal;
  }

  public java.lang.String getOrderStatus() {
    return this.orderStatus;
  }

  public java.lang.String getBillingAddress() {
    return this.billingAddress;
  }

  public java.lang.String getShippingAddress() {
    return this.shippingAddress;
  }

  public java.lang.String getCustomerName() {
    return this.customerName;
  }

  public java.lang.String getCustomerEmail() {
    return this.customerEmail;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.String getPaymentMethod() {
    return this.paymentMethod;
  }

  public java.lang.String getShippingInformation() {
    return this.shippingInformation;
  }

  public java.math.BigDecimal getSubtotal() {
    return this.subtotal;
  }

  public java.math.BigDecimal getShippingAndHandling() {
    return this.shippingAndHandling;
  }

  public java.math.BigDecimal getAdjustmentPositive() {
    return this.adjustmentPositive;
  }

  public java.math.BigDecimal getAdjustmentNegative() {
    return this.adjustmentNegative;
  }

  public java.math.BigDecimal getOrderBaseGrandTotal() {
    return this.orderBaseGrandTotal;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public void setOrderIncrementId(java.lang.String orderIncrementId) {
    this.orderIncrementId = orderIncrementId;
  }

  public void setOrderCreatedAt(java.sql.Timestamp orderCreatedAt) {
    this.orderCreatedAt = orderCreatedAt;
  }

  public void setBillingName(java.lang.String billingName) {
    this.billingName = billingName;
  }

  public void setState(java.lang.Integer state) {
    this.state = state;
  }

  public void setBaseGrandTotal(java.math.BigDecimal baseGrandTotal) {
    this.baseGrandTotal = baseGrandTotal;
  }

  public void setOrderStatus(java.lang.String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public void setBillingAddress(java.lang.String billingAddress) {
    this.billingAddress = billingAddress;
  }

  public void setShippingAddress(java.lang.String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public void setCustomerName(java.lang.String customerName) {
    this.customerName = customerName;
  }

  public void setCustomerEmail(java.lang.String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setPaymentMethod(java.lang.String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void setShippingInformation(java.lang.String shippingInformation) {
    this.shippingInformation = shippingInformation;
  }

  public void setSubtotal(java.math.BigDecimal subtotal) {
    this.subtotal = subtotal;
  }

  public void setShippingAndHandling(java.math.BigDecimal shippingAndHandling) {
    this.shippingAndHandling = shippingAndHandling;
  }

  public void setAdjustmentPositive(java.math.BigDecimal adjustmentPositive) {
    this.adjustmentPositive = adjustmentPositive;
  }

  public void setAdjustmentNegative(java.math.BigDecimal adjustmentNegative) {
    this.adjustmentNegative = adjustmentNegative;
  }

  public void setOrderBaseGrandTotal(java.math.BigDecimal orderBaseGrandTotal) {
    this.orderBaseGrandTotal = orderBaseGrandTotal;
  }
}
