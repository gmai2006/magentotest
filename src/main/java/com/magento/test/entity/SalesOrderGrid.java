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
@IdClass(SalesOrderGridId.class)
@Table(name = "sales_order_grid")
public class SalesOrderGrid implements Serializable {
  private static final long serialVersionUID = 16344509065111426L;

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

  /** Description: status. */
  @Basic
  @Column(name = "status", length = 32)
  private java.lang.String status;
  /** Description: store_name. */
  @Basic
  @Column(name = "store_name", length = 255)
  private java.lang.String storeName;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: base_grand_total. */
  @Basic
  @Column(name = "base_grand_total")
  private java.math.BigDecimal baseGrandTotal;
  /** Description: base_total_paid. */
  @Basic
  @Column(name = "base_total_paid")
  private java.math.BigDecimal baseTotalPaid;
  /** Description: grand_total. */
  @Basic
  @Column(name = "grand_total")
  private java.math.BigDecimal grandTotal;
  /** Description: total_paid. */
  @Basic
  @Column(name = "total_paid")
  private java.math.BigDecimal totalPaid;
  /** Description: base_currency_code. */
  @Basic
  @Column(name = "base_currency_code", length = 3)
  private java.lang.String baseCurrencyCode;
  /** Description: order_currency_code. */
  @Basic
  @Column(name = "order_currency_code", length = 255)
  private java.lang.String orderCurrencyCode;
  /** Description: shipping_name. */
  @Basic
  @Column(name = "shipping_name", length = 255)
  private java.lang.String shippingName;
  /** Description: billing_name. */
  @Basic
  @Column(name = "billing_name", length = 255)
  private java.lang.String billingName;
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
  /** Description: billing_address. */
  @Basic
  @Column(name = "billing_address", length = 255)
  private java.lang.String billingAddress;
  /** Description: shipping_address. */
  @Basic
  @Column(name = "shipping_address", length = 255)
  private java.lang.String shippingAddress;
  /** Description: shipping_information. */
  @Basic
  @Column(name = "shipping_information", length = 255)
  private java.lang.String shippingInformation;
  /** Description: customer_email. */
  @Basic
  @Column(name = "customer_email", length = 255)
  private java.lang.String customerEmail;
  /** Description: customer_group. */
  @Basic
  @Column(name = "customer_group", length = 255)
  private java.lang.String customerGroup;
  /** Description: subtotal. */
  @Basic
  @Column(name = "subtotal")
  private java.math.BigDecimal subtotal;
  /** Description: shipping_and_handling. */
  @Basic
  @Column(name = "shipping_and_handling")
  private java.math.BigDecimal shippingAndHandling;
  /** Description: customer_name. */
  @Basic
  @Column(name = "customer_name", length = 255)
  private java.lang.String customerName;
  /** Description: payment_method. */
  @Basic
  @Column(name = "payment_method", length = 255)
  private java.lang.String paymentMethod;
  /** Description: total_refunded. */
  @Basic
  @Column(name = "total_refunded")
  private java.math.BigDecimal totalRefunded;
  /** Description: signifyd_guarantee_status. */
  @Basic
  @Column(name = "signifyd_guarantee_status", length = 32)
  private java.lang.String signifydGuaranteeStatus;

  public SalesOrderGrid() {}

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

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.lang.String getStoreName() {
    return this.storeName;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.math.BigDecimal getBaseGrandTotal() {
    return this.baseGrandTotal;
  }

  public java.math.BigDecimal getBaseTotalPaid() {
    return this.baseTotalPaid;
  }

  public java.math.BigDecimal getGrandTotal() {
    return this.grandTotal;
  }

  public java.math.BigDecimal getTotalPaid() {
    return this.totalPaid;
  }

  public java.lang.String getBaseCurrencyCode() {
    return this.baseCurrencyCode;
  }

  public java.lang.String getOrderCurrencyCode() {
    return this.orderCurrencyCode;
  }

  public java.lang.String getShippingName() {
    return this.shippingName;
  }

  public java.lang.String getBillingName() {
    return this.billingName;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.String getBillingAddress() {
    return this.billingAddress;
  }

  public java.lang.String getShippingAddress() {
    return this.shippingAddress;
  }

  public java.lang.String getShippingInformation() {
    return this.shippingInformation;
  }

  public java.lang.String getCustomerEmail() {
    return this.customerEmail;
  }

  public java.lang.String getCustomerGroup() {
    return this.customerGroup;
  }

  public java.math.BigDecimal getSubtotal() {
    return this.subtotal;
  }

  public java.math.BigDecimal getShippingAndHandling() {
    return this.shippingAndHandling;
  }

  public java.lang.String getCustomerName() {
    return this.customerName;
  }

  public java.lang.String getPaymentMethod() {
    return this.paymentMethod;
  }

  public java.math.BigDecimal getTotalRefunded() {
    return this.totalRefunded;
  }

  public java.lang.String getSignifydGuaranteeStatus() {
    return this.signifydGuaranteeStatus;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setStoreName(java.lang.String storeName) {
    this.storeName = storeName;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setBaseGrandTotal(java.math.BigDecimal baseGrandTotal) {
    this.baseGrandTotal = baseGrandTotal;
  }

  public void setBaseTotalPaid(java.math.BigDecimal baseTotalPaid) {
    this.baseTotalPaid = baseTotalPaid;
  }

  public void setGrandTotal(java.math.BigDecimal grandTotal) {
    this.grandTotal = grandTotal;
  }

  public void setTotalPaid(java.math.BigDecimal totalPaid) {
    this.totalPaid = totalPaid;
  }

  public void setBaseCurrencyCode(java.lang.String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
  }

  public void setOrderCurrencyCode(java.lang.String orderCurrencyCode) {
    this.orderCurrencyCode = orderCurrencyCode;
  }

  public void setShippingName(java.lang.String shippingName) {
    this.shippingName = shippingName;
  }

  public void setBillingName(java.lang.String billingName) {
    this.billingName = billingName;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setBillingAddress(java.lang.String billingAddress) {
    this.billingAddress = billingAddress;
  }

  public void setShippingAddress(java.lang.String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public void setShippingInformation(java.lang.String shippingInformation) {
    this.shippingInformation = shippingInformation;
  }

  public void setCustomerEmail(java.lang.String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public void setCustomerGroup(java.lang.String customerGroup) {
    this.customerGroup = customerGroup;
  }

  public void setSubtotal(java.math.BigDecimal subtotal) {
    this.subtotal = subtotal;
  }

  public void setShippingAndHandling(java.math.BigDecimal shippingAndHandling) {
    this.shippingAndHandling = shippingAndHandling;
  }

  public void setCustomerName(java.lang.String customerName) {
    this.customerName = customerName;
  }

  public void setPaymentMethod(java.lang.String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void setTotalRefunded(java.math.BigDecimal totalRefunded) {
    this.totalRefunded = totalRefunded;
  }

  public void setSignifydGuaranteeStatus(java.lang.String signifydGuaranteeStatus) {
    this.signifydGuaranteeStatus = signifydGuaranteeStatus;
  }
}
