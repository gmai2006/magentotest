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
@IdClass(SalesCreditmemoId.class)
@Table(name = "sales_creditmemo")
public class SalesCreditmemo implements Serializable {
  private static final long serialVersionUID = 163445090622730309L;

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

  /** Description: adjustment_positive. */
  @Basic
  @Column(name = "adjustment_positive")
  private java.math.BigDecimal adjustmentPositive;
  /** Description: base_shipping_tax_amount. */
  @Basic
  @Column(name = "base_shipping_tax_amount")
  private java.math.BigDecimal baseShippingTaxAmount;
  /** Description: store_to_order_rate. */
  @Basic
  @Column(name = "store_to_order_rate")
  private java.math.BigDecimal storeToOrderRate;
  /** Description: base_discount_amount. */
  @Basic
  @Column(name = "base_discount_amount")
  private java.math.BigDecimal baseDiscountAmount;
  /** Description: base_to_order_rate. */
  @Basic
  @Column(name = "base_to_order_rate")
  private java.math.BigDecimal baseToOrderRate;
  /** Description: grand_total. */
  @Basic
  @Column(name = "grand_total")
  private java.math.BigDecimal grandTotal;
  /** Description: base_adjustment_negative. */
  @Basic
  @Column(name = "base_adjustment_negative")
  private java.math.BigDecimal baseAdjustmentNegative;
  /** Description: base_subtotal_incl_tax. */
  @Basic
  @Column(name = "base_subtotal_incl_tax")
  private java.math.BigDecimal baseSubtotalInclTax;
  /** Description: shipping_amount. */
  @Basic
  @Column(name = "shipping_amount")
  private java.math.BigDecimal shippingAmount;
  /** Description: subtotal_incl_tax. */
  @Basic
  @Column(name = "subtotal_incl_tax")
  private java.math.BigDecimal subtotalInclTax;
  /** Description: adjustment_negative. */
  @Basic
  @Column(name = "adjustment_negative")
  private java.math.BigDecimal adjustmentNegative;
  /** Description: base_shipping_amount. */
  @Basic
  @Column(name = "base_shipping_amount")
  private java.math.BigDecimal baseShippingAmount;
  /** Description: store_to_base_rate. */
  @Basic
  @Column(name = "store_to_base_rate")
  private java.math.BigDecimal storeToBaseRate;
  /** Description: base_to_global_rate. */
  @Basic
  @Column(name = "base_to_global_rate")
  private java.math.BigDecimal baseToGlobalRate;
  /** Description: base_adjustment. */
  @Basic
  @Column(name = "base_adjustment")
  private java.math.BigDecimal baseAdjustment;
  /** Description: base_subtotal. */
  @Basic
  @Column(name = "base_subtotal")
  private java.math.BigDecimal baseSubtotal;
  /** Description: discount_amount. */
  @Basic
  @Column(name = "discount_amount")
  private java.math.BigDecimal discountAmount;
  /** Description: subtotal. */
  @Basic
  @Column(name = "subtotal")
  private java.math.BigDecimal subtotal;
  /** Description: adjustment. */
  @Basic
  @Column(name = "adjustment")
  private java.math.BigDecimal adjustment;
  /** Description: base_grand_total. */
  @Basic
  @Column(name = "base_grand_total")
  private java.math.BigDecimal baseGrandTotal;
  /** Description: base_adjustment_positive. */
  @Basic
  @Column(name = "base_adjustment_positive")
  private java.math.BigDecimal baseAdjustmentPositive;
  /** Description: base_tax_amount. */
  @Basic
  @Column(name = "base_tax_amount")
  private java.math.BigDecimal baseTaxAmount;
  /** Description: shipping_tax_amount. */
  @Basic
  @Column(name = "shipping_tax_amount")
  private java.math.BigDecimal shippingTaxAmount;
  /** Description: tax_amount. */
  @Basic
  @Column(name = "tax_amount")
  private java.math.BigDecimal taxAmount;
  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_id")
  private java.lang.Integer orderId;
  /** Description: email_sent. */
  @Basic
  @Column(name = "email_sent")
  private java.lang.Integer emailSent;
  /** Description: send_email. */
  @Basic
  @Column(name = "send_email")
  private java.lang.Integer sendEmail;
  /** Description: creditmemo_status. */
  @Basic
  @Column(name = "creditmemo_status")
  private java.lang.Integer creditmemoStatus;
  /** Description: state. */
  @Basic
  @Column(name = "state")
  private java.lang.Integer state;
  /** Description: shipping_address_id. */
  @Basic
  @Column(name = "shipping_address_id")
  private java.lang.Integer shippingAddressId;
  /** Description: billing_address_id. */
  @Basic
  @Column(name = "billing_address_id")
  private java.lang.Integer billingAddressId;
  /** Description: invoice_id. */
  @Basic
  @Column(name = "invoice_id")
  private java.lang.Integer invoiceId;
  /** Description: store_currency_code. */
  @Basic
  @Column(name = "store_currency_code", length = 3)
  private java.lang.String storeCurrencyCode;
  /** Description: order_currency_code. */
  @Basic
  @Column(name = "order_currency_code", length = 3)
  private java.lang.String orderCurrencyCode;
  /** Description: base_currency_code. */
  @Basic
  @Column(name = "base_currency_code", length = 3)
  private java.lang.String baseCurrencyCode;
  /** Description: global_currency_code. */
  @Basic
  @Column(name = "global_currency_code", length = 3)
  private java.lang.String globalCurrencyCode;
  /** Description: transaction_id. */
  @Basic
  @Column(name = "transaction_id", length = 255)
  private java.lang.String transactionId;
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
  /** Description: discount_tax_compensation_amount. */
  @Basic
  @Column(name = "discount_tax_compensation_amount")
  private java.math.BigDecimal discountTaxCompensationAmount;
  /** Description: base_discount_tax_compensation_amount. */
  @Basic
  @Column(name = "base_discount_tax_compensation_amount")
  private java.math.BigDecimal baseDiscountTaxCompensationAmount;
  /** Description: shipping_discount_tax_compensation_amount. */
  @Basic
  @Column(name = "shipping_discount_tax_compensation_amount")
  private java.math.BigDecimal shippingDiscountTaxCompensationAmount;
  /** Description: base_shipping_discount_tax_compensation_amnt. */
  @Basic
  @Column(name = "base_shipping_discount_tax_compensation_amnt")
  private java.math.BigDecimal baseShippingDiscountTaxCompensationAmnt;
  /** Description: shipping_incl_tax. */
  @Basic
  @Column(name = "shipping_incl_tax")
  private java.math.BigDecimal shippingInclTax;
  /** Description: base_shipping_incl_tax. */
  @Basic
  @Column(name = "base_shipping_incl_tax")
  private java.math.BigDecimal baseShippingInclTax;
  /** Description: discount_description. */
  @Basic
  @Column(name = "discount_description", length = 255)
  private java.lang.String discountDescription;
  /** Description: customer_note. */
  @Basic
  @Column(name = "customer_note", length = 0)
  private java.lang.String customerNote;
  /** Description: customer_note_notify. */
  @Basic
  @Column(name = "customer_note_notify")
  private java.lang.Integer customerNoteNotify;

  public SalesCreditmemo() {}

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

  public java.math.BigDecimal getAdjustmentPositive() {
    return this.adjustmentPositive;
  }

  public java.math.BigDecimal getBaseShippingTaxAmount() {
    return this.baseShippingTaxAmount;
  }

  public java.math.BigDecimal getStoreToOrderRate() {
    return this.storeToOrderRate;
  }

  public java.math.BigDecimal getBaseDiscountAmount() {
    return this.baseDiscountAmount;
  }

  public java.math.BigDecimal getBaseToOrderRate() {
    return this.baseToOrderRate;
  }

  public java.math.BigDecimal getGrandTotal() {
    return this.grandTotal;
  }

  public java.math.BigDecimal getBaseAdjustmentNegative() {
    return this.baseAdjustmentNegative;
  }

  public java.math.BigDecimal getBaseSubtotalInclTax() {
    return this.baseSubtotalInclTax;
  }

  public java.math.BigDecimal getShippingAmount() {
    return this.shippingAmount;
  }

  public java.math.BigDecimal getSubtotalInclTax() {
    return this.subtotalInclTax;
  }

  public java.math.BigDecimal getAdjustmentNegative() {
    return this.adjustmentNegative;
  }

  public java.math.BigDecimal getBaseShippingAmount() {
    return this.baseShippingAmount;
  }

  public java.math.BigDecimal getStoreToBaseRate() {
    return this.storeToBaseRate;
  }

  public java.math.BigDecimal getBaseToGlobalRate() {
    return this.baseToGlobalRate;
  }

  public java.math.BigDecimal getBaseAdjustment() {
    return this.baseAdjustment;
  }

  public java.math.BigDecimal getBaseSubtotal() {
    return this.baseSubtotal;
  }

  public java.math.BigDecimal getDiscountAmount() {
    return this.discountAmount;
  }

  public java.math.BigDecimal getSubtotal() {
    return this.subtotal;
  }

  public java.math.BigDecimal getAdjustment() {
    return this.adjustment;
  }

  public java.math.BigDecimal getBaseGrandTotal() {
    return this.baseGrandTotal;
  }

  public java.math.BigDecimal getBaseAdjustmentPositive() {
    return this.baseAdjustmentPositive;
  }

  public java.math.BigDecimal getBaseTaxAmount() {
    return this.baseTaxAmount;
  }

  public java.math.BigDecimal getShippingTaxAmount() {
    return this.shippingTaxAmount;
  }

  public java.math.BigDecimal getTaxAmount() {
    return this.taxAmount;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public java.lang.Integer getEmailSent() {
    return this.emailSent;
  }

  public java.lang.Integer getSendEmail() {
    return this.sendEmail;
  }

  public java.lang.Integer getCreditmemoStatus() {
    return this.creditmemoStatus;
  }

  public java.lang.Integer getState() {
    return this.state;
  }

  public java.lang.Integer getShippingAddressId() {
    return this.shippingAddressId;
  }

  public java.lang.Integer getBillingAddressId() {
    return this.billingAddressId;
  }

  public java.lang.Integer getInvoiceId() {
    return this.invoiceId;
  }

  public java.lang.String getStoreCurrencyCode() {
    return this.storeCurrencyCode;
  }

  public java.lang.String getOrderCurrencyCode() {
    return this.orderCurrencyCode;
  }

  public java.lang.String getBaseCurrencyCode() {
    return this.baseCurrencyCode;
  }

  public java.lang.String getGlobalCurrencyCode() {
    return this.globalCurrencyCode;
  }

  public java.lang.String getTransactionId() {
    return this.transactionId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.math.BigDecimal getDiscountTaxCompensationAmount() {
    return this.discountTaxCompensationAmount;
  }

  public java.math.BigDecimal getBaseDiscountTaxCompensationAmount() {
    return this.baseDiscountTaxCompensationAmount;
  }

  public java.math.BigDecimal getShippingDiscountTaxCompensationAmount() {
    return this.shippingDiscountTaxCompensationAmount;
  }

  public java.math.BigDecimal getBaseShippingDiscountTaxCompensationAmnt() {
    return this.baseShippingDiscountTaxCompensationAmnt;
  }

  public java.math.BigDecimal getShippingInclTax() {
    return this.shippingInclTax;
  }

  public java.math.BigDecimal getBaseShippingInclTax() {
    return this.baseShippingInclTax;
  }

  public java.lang.String getDiscountDescription() {
    return this.discountDescription;
  }

  public java.lang.String getCustomerNote() {
    return this.customerNote;
  }

  public java.lang.Integer getCustomerNoteNotify() {
    return this.customerNoteNotify;
  }

  public void setAdjustmentPositive(java.math.BigDecimal adjustmentPositive) {
    this.adjustmentPositive = adjustmentPositive;
  }

  public void setBaseShippingTaxAmount(java.math.BigDecimal baseShippingTaxAmount) {
    this.baseShippingTaxAmount = baseShippingTaxAmount;
  }

  public void setStoreToOrderRate(java.math.BigDecimal storeToOrderRate) {
    this.storeToOrderRate = storeToOrderRate;
  }

  public void setBaseDiscountAmount(java.math.BigDecimal baseDiscountAmount) {
    this.baseDiscountAmount = baseDiscountAmount;
  }

  public void setBaseToOrderRate(java.math.BigDecimal baseToOrderRate) {
    this.baseToOrderRate = baseToOrderRate;
  }

  public void setGrandTotal(java.math.BigDecimal grandTotal) {
    this.grandTotal = grandTotal;
  }

  public void setBaseAdjustmentNegative(java.math.BigDecimal baseAdjustmentNegative) {
    this.baseAdjustmentNegative = baseAdjustmentNegative;
  }

  public void setBaseSubtotalInclTax(java.math.BigDecimal baseSubtotalInclTax) {
    this.baseSubtotalInclTax = baseSubtotalInclTax;
  }

  public void setShippingAmount(java.math.BigDecimal shippingAmount) {
    this.shippingAmount = shippingAmount;
  }

  public void setSubtotalInclTax(java.math.BigDecimal subtotalInclTax) {
    this.subtotalInclTax = subtotalInclTax;
  }

  public void setAdjustmentNegative(java.math.BigDecimal adjustmentNegative) {
    this.adjustmentNegative = adjustmentNegative;
  }

  public void setBaseShippingAmount(java.math.BigDecimal baseShippingAmount) {
    this.baseShippingAmount = baseShippingAmount;
  }

  public void setStoreToBaseRate(java.math.BigDecimal storeToBaseRate) {
    this.storeToBaseRate = storeToBaseRate;
  }

  public void setBaseToGlobalRate(java.math.BigDecimal baseToGlobalRate) {
    this.baseToGlobalRate = baseToGlobalRate;
  }

  public void setBaseAdjustment(java.math.BigDecimal baseAdjustment) {
    this.baseAdjustment = baseAdjustment;
  }

  public void setBaseSubtotal(java.math.BigDecimal baseSubtotal) {
    this.baseSubtotal = baseSubtotal;
  }

  public void setDiscountAmount(java.math.BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public void setSubtotal(java.math.BigDecimal subtotal) {
    this.subtotal = subtotal;
  }

  public void setAdjustment(java.math.BigDecimal adjustment) {
    this.adjustment = adjustment;
  }

  public void setBaseGrandTotal(java.math.BigDecimal baseGrandTotal) {
    this.baseGrandTotal = baseGrandTotal;
  }

  public void setBaseAdjustmentPositive(java.math.BigDecimal baseAdjustmentPositive) {
    this.baseAdjustmentPositive = baseAdjustmentPositive;
  }

  public void setBaseTaxAmount(java.math.BigDecimal baseTaxAmount) {
    this.baseTaxAmount = baseTaxAmount;
  }

  public void setShippingTaxAmount(java.math.BigDecimal shippingTaxAmount) {
    this.shippingTaxAmount = shippingTaxAmount;
  }

  public void setTaxAmount(java.math.BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public void setEmailSent(java.lang.Integer emailSent) {
    this.emailSent = emailSent;
  }

  public void setSendEmail(java.lang.Integer sendEmail) {
    this.sendEmail = sendEmail;
  }

  public void setCreditmemoStatus(java.lang.Integer creditmemoStatus) {
    this.creditmemoStatus = creditmemoStatus;
  }

  public void setState(java.lang.Integer state) {
    this.state = state;
  }

  public void setShippingAddressId(java.lang.Integer shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }

  public void setBillingAddressId(java.lang.Integer billingAddressId) {
    this.billingAddressId = billingAddressId;
  }

  public void setInvoiceId(java.lang.Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public void setStoreCurrencyCode(java.lang.String storeCurrencyCode) {
    this.storeCurrencyCode = storeCurrencyCode;
  }

  public void setOrderCurrencyCode(java.lang.String orderCurrencyCode) {
    this.orderCurrencyCode = orderCurrencyCode;
  }

  public void setBaseCurrencyCode(java.lang.String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
  }

  public void setGlobalCurrencyCode(java.lang.String globalCurrencyCode) {
    this.globalCurrencyCode = globalCurrencyCode;
  }

  public void setTransactionId(java.lang.String transactionId) {
    this.transactionId = transactionId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setDiscountTaxCompensationAmount(java.math.BigDecimal discountTaxCompensationAmount) {
    this.discountTaxCompensationAmount = discountTaxCompensationAmount;
  }

  public void setBaseDiscountTaxCompensationAmount(
      java.math.BigDecimal baseDiscountTaxCompensationAmount) {
    this.baseDiscountTaxCompensationAmount = baseDiscountTaxCompensationAmount;
  }

  public void setShippingDiscountTaxCompensationAmount(
      java.math.BigDecimal shippingDiscountTaxCompensationAmount) {
    this.shippingDiscountTaxCompensationAmount = shippingDiscountTaxCompensationAmount;
  }

  public void setBaseShippingDiscountTaxCompensationAmnt(
      java.math.BigDecimal baseShippingDiscountTaxCompensationAmnt) {
    this.baseShippingDiscountTaxCompensationAmnt = baseShippingDiscountTaxCompensationAmnt;
  }

  public void setShippingInclTax(java.math.BigDecimal shippingInclTax) {
    this.shippingInclTax = shippingInclTax;
  }

  public void setBaseShippingInclTax(java.math.BigDecimal baseShippingInclTax) {
    this.baseShippingInclTax = baseShippingInclTax;
  }

  public void setDiscountDescription(java.lang.String discountDescription) {
    this.discountDescription = discountDescription;
  }

  public void setCustomerNote(java.lang.String customerNote) {
    this.customerNote = customerNote;
  }

  public void setCustomerNoteNotify(java.lang.Integer customerNoteNotify) {
    this.customerNoteNotify = customerNoteNotify;
  }
}
