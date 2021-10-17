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
@IdClass(SalesOrderId.class)
@Table(name = "sales_order")
public class SalesOrder implements Serializable {
  private static final long serialVersionUID = 163445090639039449L;

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

  /** Description: state. */
  @Basic
  @Column(name = "state", length = 32)
  private java.lang.String state;
  /** Description: status. */
  @Basic
  @Column(name = "status", length = 32)
  private java.lang.String status;
  /** Description: coupon_code. */
  @Basic
  @Column(name = "coupon_code", length = 255)
  private java.lang.String couponCode;
  /** Description: protect_code. */
  @Basic
  @Column(name = "protect_code", length = 255)
  private java.lang.String protectCode;
  /** Description: shipping_description. */
  @Basic
  @Column(name = "shipping_description", length = 255)
  private java.lang.String shippingDescription;
  /** Description: is_virtual. */
  @Basic
  @Column(name = "is_virtual")
  private java.lang.Integer isVirtual;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: base_discount_amount. */
  @Basic
  @Column(name = "base_discount_amount")
  private java.math.BigDecimal baseDiscountAmount;
  /** Description: base_discount_canceled. */
  @Basic
  @Column(name = "base_discount_canceled")
  private java.math.BigDecimal baseDiscountCanceled;
  /** Description: base_discount_invoiced. */
  @Basic
  @Column(name = "base_discount_invoiced")
  private java.math.BigDecimal baseDiscountInvoiced;
  /** Description: base_discount_refunded. */
  @Basic
  @Column(name = "base_discount_refunded")
  private java.math.BigDecimal baseDiscountRefunded;
  /** Description: base_grand_total. */
  @Basic
  @Column(name = "base_grand_total")
  private java.math.BigDecimal baseGrandTotal;
  /** Description: base_shipping_amount. */
  @Basic
  @Column(name = "base_shipping_amount")
  private java.math.BigDecimal baseShippingAmount;
  /** Description: base_shipping_canceled. */
  @Basic
  @Column(name = "base_shipping_canceled")
  private java.math.BigDecimal baseShippingCanceled;
  /** Description: base_shipping_invoiced. */
  @Basic
  @Column(name = "base_shipping_invoiced")
  private java.math.BigDecimal baseShippingInvoiced;
  /** Description: base_shipping_refunded. */
  @Basic
  @Column(name = "base_shipping_refunded")
  private java.math.BigDecimal baseShippingRefunded;
  /** Description: base_shipping_tax_amount. */
  @Basic
  @Column(name = "base_shipping_tax_amount")
  private java.math.BigDecimal baseShippingTaxAmount;
  /** Description: base_shipping_tax_refunded. */
  @Basic
  @Column(name = "base_shipping_tax_refunded")
  private java.math.BigDecimal baseShippingTaxRefunded;
  /** Description: base_subtotal. */
  @Basic
  @Column(name = "base_subtotal")
  private java.math.BigDecimal baseSubtotal;
  /** Description: base_subtotal_canceled. */
  @Basic
  @Column(name = "base_subtotal_canceled")
  private java.math.BigDecimal baseSubtotalCanceled;
  /** Description: base_subtotal_invoiced. */
  @Basic
  @Column(name = "base_subtotal_invoiced")
  private java.math.BigDecimal baseSubtotalInvoiced;
  /** Description: base_subtotal_refunded. */
  @Basic
  @Column(name = "base_subtotal_refunded")
  private java.math.BigDecimal baseSubtotalRefunded;
  /** Description: base_tax_amount. */
  @Basic
  @Column(name = "base_tax_amount")
  private java.math.BigDecimal baseTaxAmount;
  /** Description: base_tax_canceled. */
  @Basic
  @Column(name = "base_tax_canceled")
  private java.math.BigDecimal baseTaxCanceled;
  /** Description: base_tax_invoiced. */
  @Basic
  @Column(name = "base_tax_invoiced")
  private java.math.BigDecimal baseTaxInvoiced;
  /** Description: base_tax_refunded. */
  @Basic
  @Column(name = "base_tax_refunded")
  private java.math.BigDecimal baseTaxRefunded;
  /** Description: base_to_global_rate. */
  @Basic
  @Column(name = "base_to_global_rate")
  private java.math.BigDecimal baseToGlobalRate;
  /** Description: base_to_order_rate. */
  @Basic
  @Column(name = "base_to_order_rate")
  private java.math.BigDecimal baseToOrderRate;
  /** Description: base_total_canceled. */
  @Basic
  @Column(name = "base_total_canceled")
  private java.math.BigDecimal baseTotalCanceled;
  /** Description: base_total_invoiced. */
  @Basic
  @Column(name = "base_total_invoiced")
  private java.math.BigDecimal baseTotalInvoiced;
  /** Description: base_total_invoiced_cost. */
  @Basic
  @Column(name = "base_total_invoiced_cost")
  private java.math.BigDecimal baseTotalInvoicedCost;
  /** Description: base_total_offline_refunded. */
  @Basic
  @Column(name = "base_total_offline_refunded")
  private java.math.BigDecimal baseTotalOfflineRefunded;
  /** Description: base_total_online_refunded. */
  @Basic
  @Column(name = "base_total_online_refunded")
  private java.math.BigDecimal baseTotalOnlineRefunded;
  /** Description: base_total_paid. */
  @Basic
  @Column(name = "base_total_paid")
  private java.math.BigDecimal baseTotalPaid;
  /** Description: base_total_qty_ordered. */
  @Basic
  @Column(name = "base_total_qty_ordered")
  private java.math.BigDecimal baseTotalQtyOrdered;
  /** Description: base_total_refunded. */
  @Basic
  @Column(name = "base_total_refunded")
  private java.math.BigDecimal baseTotalRefunded;
  /** Description: discount_amount. */
  @Basic
  @Column(name = "discount_amount")
  private java.math.BigDecimal discountAmount;
  /** Description: discount_canceled. */
  @Basic
  @Column(name = "discount_canceled")
  private java.math.BigDecimal discountCanceled;
  /** Description: discount_invoiced. */
  @Basic
  @Column(name = "discount_invoiced")
  private java.math.BigDecimal discountInvoiced;
  /** Description: discount_refunded. */
  @Basic
  @Column(name = "discount_refunded")
  private java.math.BigDecimal discountRefunded;
  /** Description: grand_total. */
  @Basic
  @Column(name = "grand_total")
  private java.math.BigDecimal grandTotal;
  /** Description: shipping_amount. */
  @Basic
  @Column(name = "shipping_amount")
  private java.math.BigDecimal shippingAmount;
  /** Description: shipping_canceled. */
  @Basic
  @Column(name = "shipping_canceled")
  private java.math.BigDecimal shippingCanceled;
  /** Description: shipping_invoiced. */
  @Basic
  @Column(name = "shipping_invoiced")
  private java.math.BigDecimal shippingInvoiced;
  /** Description: shipping_refunded. */
  @Basic
  @Column(name = "shipping_refunded")
  private java.math.BigDecimal shippingRefunded;
  /** Description: shipping_tax_amount. */
  @Basic
  @Column(name = "shipping_tax_amount")
  private java.math.BigDecimal shippingTaxAmount;
  /** Description: shipping_tax_refunded. */
  @Basic
  @Column(name = "shipping_tax_refunded")
  private java.math.BigDecimal shippingTaxRefunded;
  /** Description: store_to_base_rate. */
  @Basic
  @Column(name = "store_to_base_rate")
  private java.math.BigDecimal storeToBaseRate;
  /** Description: store_to_order_rate. */
  @Basic
  @Column(name = "store_to_order_rate")
  private java.math.BigDecimal storeToOrderRate;
  /** Description: subtotal. */
  @Basic
  @Column(name = "subtotal")
  private java.math.BigDecimal subtotal;
  /** Description: subtotal_canceled. */
  @Basic
  @Column(name = "subtotal_canceled")
  private java.math.BigDecimal subtotalCanceled;
  /** Description: subtotal_invoiced. */
  @Basic
  @Column(name = "subtotal_invoiced")
  private java.math.BigDecimal subtotalInvoiced;
  /** Description: subtotal_refunded. */
  @Basic
  @Column(name = "subtotal_refunded")
  private java.math.BigDecimal subtotalRefunded;
  /** Description: tax_amount. */
  @Basic
  @Column(name = "tax_amount")
  private java.math.BigDecimal taxAmount;
  /** Description: tax_canceled. */
  @Basic
  @Column(name = "tax_canceled")
  private java.math.BigDecimal taxCanceled;
  /** Description: tax_invoiced. */
  @Basic
  @Column(name = "tax_invoiced")
  private java.math.BigDecimal taxInvoiced;
  /** Description: tax_refunded. */
  @Basic
  @Column(name = "tax_refunded")
  private java.math.BigDecimal taxRefunded;
  /** Description: total_canceled. */
  @Basic
  @Column(name = "total_canceled")
  private java.math.BigDecimal totalCanceled;
  /** Description: total_invoiced. */
  @Basic
  @Column(name = "total_invoiced")
  private java.math.BigDecimal totalInvoiced;
  /** Description: total_offline_refunded. */
  @Basic
  @Column(name = "total_offline_refunded")
  private java.math.BigDecimal totalOfflineRefunded;
  /** Description: total_online_refunded. */
  @Basic
  @Column(name = "total_online_refunded")
  private java.math.BigDecimal totalOnlineRefunded;
  /** Description: total_paid. */
  @Basic
  @Column(name = "total_paid")
  private java.math.BigDecimal totalPaid;
  /** Description: total_qty_ordered. */
  @Basic
  @Column(name = "total_qty_ordered")
  private java.math.BigDecimal totalQtyOrdered;
  /** Description: total_refunded. */
  @Basic
  @Column(name = "total_refunded")
  private java.math.BigDecimal totalRefunded;
  /** Description: can_ship_partially. */
  @Basic
  @Column(name = "can_ship_partially")
  private java.lang.Integer canShipPartially;
  /** Description: can_ship_partially_item. */
  @Basic
  @Column(name = "can_ship_partially_item")
  private java.lang.Integer canShipPartiallyItem;
  /** Description: customer_is_guest. */
  @Basic
  @Column(name = "customer_is_guest")
  private java.lang.Integer customerIsGuest;
  /** Description: customer_note_notify. */
  @Basic
  @Column(name = "customer_note_notify")
  private java.lang.Integer customerNoteNotify;
  /** Description: billing_address_id. */
  @Basic
  @Column(name = "billing_address_id")
  private java.lang.Integer billingAddressId;
  /** Description: customer_group_id. */
  @Basic
  @Column(name = "customer_group_id")
  private java.lang.Integer customerGroupId;
  /** Description: edit_increment. */
  @Basic
  @Column(name = "edit_increment")
  private java.lang.Integer editIncrement;
  /** Description: email_sent. */
  @Basic
  @Column(name = "email_sent")
  private java.lang.Integer emailSent;
  /** Description: send_email. */
  @Basic
  @Column(name = "send_email")
  private java.lang.Integer sendEmail;
  /** Description: forced_shipment_with_invoice. */
  @Basic
  @Column(name = "forced_shipment_with_invoice")
  private java.lang.Integer forcedShipmentWithInvoice;
  /** Description: payment_auth_expiration. */
  @Basic
  @Column(name = "payment_auth_expiration")
  private java.lang.Integer paymentAuthExpiration;
  /** Description: quote_address_id. */
  @Basic
  @Column(name = "quote_address_id")
  private java.lang.Integer quoteAddressId;
  /** Description: quote_id. */
  @Basic
  @Column(name = "quote_id")
  private java.lang.Integer quoteId;
  /** Description: shipping_address_id. */
  @Basic
  @Column(name = "shipping_address_id")
  private java.lang.Integer shippingAddressId;
  /** Description: adjustment_negative. */
  @Basic
  @Column(name = "adjustment_negative")
  private java.math.BigDecimal adjustmentNegative;
  /** Description: adjustment_positive. */
  @Basic
  @Column(name = "adjustment_positive")
  private java.math.BigDecimal adjustmentPositive;
  /** Description: base_adjustment_negative. */
  @Basic
  @Column(name = "base_adjustment_negative")
  private java.math.BigDecimal baseAdjustmentNegative;
  /** Description: base_adjustment_positive. */
  @Basic
  @Column(name = "base_adjustment_positive")
  private java.math.BigDecimal baseAdjustmentPositive;
  /** Description: base_shipping_discount_amount. */
  @Basic
  @Column(name = "base_shipping_discount_amount")
  private java.math.BigDecimal baseShippingDiscountAmount;
  /** Description: base_subtotal_incl_tax. */
  @Basic
  @Column(name = "base_subtotal_incl_tax")
  private java.math.BigDecimal baseSubtotalInclTax;
  /** Description: base_total_due. */
  @Basic
  @Column(name = "base_total_due")
  private java.math.BigDecimal baseTotalDue;
  /** Description: payment_authorization_amount. */
  @Basic
  @Column(name = "payment_authorization_amount")
  private java.math.BigDecimal paymentAuthorizationAmount;
  /** Description: shipping_discount_amount. */
  @Basic
  @Column(name = "shipping_discount_amount")
  private java.math.BigDecimal shippingDiscountAmount;
  /** Description: subtotal_incl_tax. */
  @Basic
  @Column(name = "subtotal_incl_tax")
  private java.math.BigDecimal subtotalInclTax;
  /** Description: total_due. */
  @Basic
  @Column(name = "total_due")
  private java.math.BigDecimal totalDue;
  /** Description: weight. */
  @Basic
  @Column(name = "weight")
  private java.math.BigDecimal weight;
  /** Description: customer_dob. */
  @Basic
  @Column(name = "customer_dob")
  private java.util.Date customerDob;
  /** Description: applied_rule_ids. */
  @Basic
  @Column(name = "applied_rule_ids", length = 128)
  private java.lang.String appliedRuleIds;
  /** Description: base_currency_code. */
  @Basic
  @Column(name = "base_currency_code", length = 3)
  private java.lang.String baseCurrencyCode;
  /** Description: customer_email. */
  @Basic
  @Column(name = "customer_email", length = 128)
  private java.lang.String customerEmail;
  /** Description: customer_firstname. */
  @Basic
  @Column(name = "customer_firstname", length = 128)
  private java.lang.String customerFirstname;
  /** Description: customer_lastname. */
  @Basic
  @Column(name = "customer_lastname", length = 128)
  private java.lang.String customerLastname;
  /** Description: customer_middlename. */
  @Basic
  @Column(name = "customer_middlename", length = 128)
  private java.lang.String customerMiddlename;
  /** Description: customer_prefix. */
  @Basic
  @Column(name = "customer_prefix", length = 32)
  private java.lang.String customerPrefix;
  /** Description: customer_suffix. */
  @Basic
  @Column(name = "customer_suffix", length = 32)
  private java.lang.String customerSuffix;
  /** Description: customer_taxvat. */
  @Basic
  @Column(name = "customer_taxvat", length = 32)
  private java.lang.String customerTaxvat;
  /** Description: discount_description. */
  @Basic
  @Column(name = "discount_description", length = 255)
  private java.lang.String discountDescription;
  /** Description: ext_customer_id. */
  @Basic
  @Column(name = "ext_customer_id", length = 32)
  private java.lang.String extCustomerId;
  /** Description: ext_order_id. */
  @Basic
  @Column(name = "ext_order_id", length = 32)
  private java.lang.String extOrderId;
  /** Description: global_currency_code. */
  @Basic
  @Column(name = "global_currency_code", length = 3)
  private java.lang.String globalCurrencyCode;
  /** Description: hold_before_state. */
  @Basic
  @Column(name = "hold_before_state", length = 32)
  private java.lang.String holdBeforeState;
  /** Description: hold_before_status. */
  @Basic
  @Column(name = "hold_before_status", length = 32)
  private java.lang.String holdBeforeStatus;
  /** Description: order_currency_code. */
  @Basic
  @Column(name = "order_currency_code", length = 3)
  private java.lang.String orderCurrencyCode;
  /** Description: original_increment_id. */
  @Basic
  @Column(name = "original_increment_id", length = 32)
  private java.lang.String originalIncrementId;
  /** Description: relation_child_id. */
  @Basic
  @Column(name = "relation_child_id", length = 32)
  private java.lang.String relationChildId;
  /** Description: relation_child_real_id. */
  @Basic
  @Column(name = "relation_child_real_id", length = 32)
  private java.lang.String relationChildRealId;
  /** Description: relation_parent_id. */
  @Basic
  @Column(name = "relation_parent_id", length = 32)
  private java.lang.String relationParentId;
  /** Description: relation_parent_real_id. */
  @Basic
  @Column(name = "relation_parent_real_id", length = 32)
  private java.lang.String relationParentRealId;
  /** Description: remote_ip. */
  @Basic
  @Column(name = "remote_ip", length = 45)
  private java.lang.String remoteIp;
  /** Description: shipping_method. */
  @Basic
  @Column(name = "shipping_method", length = 120)
  private java.lang.String shippingMethod;
  /** Description: store_currency_code. */
  @Basic
  @Column(name = "store_currency_code", length = 3)
  private java.lang.String storeCurrencyCode;
  /** Description: store_name. */
  @Basic
  @Column(name = "store_name", length = 32)
  private java.lang.String storeName;
  /** Description: x_forwarded_for. */
  @Basic
  @Column(name = "x_forwarded_for", length = 32)
  private java.lang.String xForwardedFor;
  /** Description: customer_note. */
  @Basic
  @Column(name = "customer_note", length = 0)
  private java.lang.String customerNote;
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
  /** Description: total_item_count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_item_count")
  private java.lang.Integer totalItemCount;
  /** Description: customer_gender. */
  @Basic
  @Column(name = "customer_gender")
  private java.lang.Integer customerGender;
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
  /** Description: discount_tax_compensation_invoiced. */
  @Basic
  @Column(name = "discount_tax_compensation_invoiced")
  private java.math.BigDecimal discountTaxCompensationInvoiced;
  /** Description: base_discount_tax_compensation_invoiced. */
  @Basic
  @Column(name = "base_discount_tax_compensation_invoiced")
  private java.math.BigDecimal baseDiscountTaxCompensationInvoiced;
  /** Description: discount_tax_compensation_refunded. */
  @Basic
  @Column(name = "discount_tax_compensation_refunded")
  private java.math.BigDecimal discountTaxCompensationRefunded;
  /** Description: base_discount_tax_compensation_refunded. */
  @Basic
  @Column(name = "base_discount_tax_compensation_refunded")
  private java.math.BigDecimal baseDiscountTaxCompensationRefunded;
  /** Description: shipping_incl_tax. */
  @Basic
  @Column(name = "shipping_incl_tax")
  private java.math.BigDecimal shippingInclTax;
  /** Description: base_shipping_incl_tax. */
  @Basic
  @Column(name = "base_shipping_incl_tax")
  private java.math.BigDecimal baseShippingInclTax;
  /** Description: coupon_rule_name. */
  @Basic
  @Column(name = "coupon_rule_name", length = 255)
  private java.lang.String couponRuleName;
  /** Description: gift_message_id. */
  @Basic
  @Column(name = "gift_message_id")
  private java.lang.Integer giftMessageId;
  /** Description: paypal_ipn_customer_notified. */
  @Basic
  @Column(name = "paypal_ipn_customer_notified")
  private java.lang.Integer paypalIpnCustomerNotified;

  public SalesOrder() {}

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

  public java.lang.String getState() {
    return this.state;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.lang.String getCouponCode() {
    return this.couponCode;
  }

  public java.lang.String getProtectCode() {
    return this.protectCode;
  }

  public java.lang.String getShippingDescription() {
    return this.shippingDescription;
  }

  public java.lang.Integer getIsVirtual() {
    return this.isVirtual;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.math.BigDecimal getBaseDiscountAmount() {
    return this.baseDiscountAmount;
  }

  public java.math.BigDecimal getBaseDiscountCanceled() {
    return this.baseDiscountCanceled;
  }

  public java.math.BigDecimal getBaseDiscountInvoiced() {
    return this.baseDiscountInvoiced;
  }

  public java.math.BigDecimal getBaseDiscountRefunded() {
    return this.baseDiscountRefunded;
  }

  public java.math.BigDecimal getBaseGrandTotal() {
    return this.baseGrandTotal;
  }

  public java.math.BigDecimal getBaseShippingAmount() {
    return this.baseShippingAmount;
  }

  public java.math.BigDecimal getBaseShippingCanceled() {
    return this.baseShippingCanceled;
  }

  public java.math.BigDecimal getBaseShippingInvoiced() {
    return this.baseShippingInvoiced;
  }

  public java.math.BigDecimal getBaseShippingRefunded() {
    return this.baseShippingRefunded;
  }

  public java.math.BigDecimal getBaseShippingTaxAmount() {
    return this.baseShippingTaxAmount;
  }

  public java.math.BigDecimal getBaseShippingTaxRefunded() {
    return this.baseShippingTaxRefunded;
  }

  public java.math.BigDecimal getBaseSubtotal() {
    return this.baseSubtotal;
  }

  public java.math.BigDecimal getBaseSubtotalCanceled() {
    return this.baseSubtotalCanceled;
  }

  public java.math.BigDecimal getBaseSubtotalInvoiced() {
    return this.baseSubtotalInvoiced;
  }

  public java.math.BigDecimal getBaseSubtotalRefunded() {
    return this.baseSubtotalRefunded;
  }

  public java.math.BigDecimal getBaseTaxAmount() {
    return this.baseTaxAmount;
  }

  public java.math.BigDecimal getBaseTaxCanceled() {
    return this.baseTaxCanceled;
  }

  public java.math.BigDecimal getBaseTaxInvoiced() {
    return this.baseTaxInvoiced;
  }

  public java.math.BigDecimal getBaseTaxRefunded() {
    return this.baseTaxRefunded;
  }

  public java.math.BigDecimal getBaseToGlobalRate() {
    return this.baseToGlobalRate;
  }

  public java.math.BigDecimal getBaseToOrderRate() {
    return this.baseToOrderRate;
  }

  public java.math.BigDecimal getBaseTotalCanceled() {
    return this.baseTotalCanceled;
  }

  public java.math.BigDecimal getBaseTotalInvoiced() {
    return this.baseTotalInvoiced;
  }

  public java.math.BigDecimal getBaseTotalInvoicedCost() {
    return this.baseTotalInvoicedCost;
  }

  public java.math.BigDecimal getBaseTotalOfflineRefunded() {
    return this.baseTotalOfflineRefunded;
  }

  public java.math.BigDecimal getBaseTotalOnlineRefunded() {
    return this.baseTotalOnlineRefunded;
  }

  public java.math.BigDecimal getBaseTotalPaid() {
    return this.baseTotalPaid;
  }

  public java.math.BigDecimal getBaseTotalQtyOrdered() {
    return this.baseTotalQtyOrdered;
  }

  public java.math.BigDecimal getBaseTotalRefunded() {
    return this.baseTotalRefunded;
  }

  public java.math.BigDecimal getDiscountAmount() {
    return this.discountAmount;
  }

  public java.math.BigDecimal getDiscountCanceled() {
    return this.discountCanceled;
  }

  public java.math.BigDecimal getDiscountInvoiced() {
    return this.discountInvoiced;
  }

  public java.math.BigDecimal getDiscountRefunded() {
    return this.discountRefunded;
  }

  public java.math.BigDecimal getGrandTotal() {
    return this.grandTotal;
  }

  public java.math.BigDecimal getShippingAmount() {
    return this.shippingAmount;
  }

  public java.math.BigDecimal getShippingCanceled() {
    return this.shippingCanceled;
  }

  public java.math.BigDecimal getShippingInvoiced() {
    return this.shippingInvoiced;
  }

  public java.math.BigDecimal getShippingRefunded() {
    return this.shippingRefunded;
  }

  public java.math.BigDecimal getShippingTaxAmount() {
    return this.shippingTaxAmount;
  }

  public java.math.BigDecimal getShippingTaxRefunded() {
    return this.shippingTaxRefunded;
  }

  public java.math.BigDecimal getStoreToBaseRate() {
    return this.storeToBaseRate;
  }

  public java.math.BigDecimal getStoreToOrderRate() {
    return this.storeToOrderRate;
  }

  public java.math.BigDecimal getSubtotal() {
    return this.subtotal;
  }

  public java.math.BigDecimal getSubtotalCanceled() {
    return this.subtotalCanceled;
  }

  public java.math.BigDecimal getSubtotalInvoiced() {
    return this.subtotalInvoiced;
  }

  public java.math.BigDecimal getSubtotalRefunded() {
    return this.subtotalRefunded;
  }

  public java.math.BigDecimal getTaxAmount() {
    return this.taxAmount;
  }

  public java.math.BigDecimal getTaxCanceled() {
    return this.taxCanceled;
  }

  public java.math.BigDecimal getTaxInvoiced() {
    return this.taxInvoiced;
  }

  public java.math.BigDecimal getTaxRefunded() {
    return this.taxRefunded;
  }

  public java.math.BigDecimal getTotalCanceled() {
    return this.totalCanceled;
  }

  public java.math.BigDecimal getTotalInvoiced() {
    return this.totalInvoiced;
  }

  public java.math.BigDecimal getTotalOfflineRefunded() {
    return this.totalOfflineRefunded;
  }

  public java.math.BigDecimal getTotalOnlineRefunded() {
    return this.totalOnlineRefunded;
  }

  public java.math.BigDecimal getTotalPaid() {
    return this.totalPaid;
  }

  public java.math.BigDecimal getTotalQtyOrdered() {
    return this.totalQtyOrdered;
  }

  public java.math.BigDecimal getTotalRefunded() {
    return this.totalRefunded;
  }

  public java.lang.Integer getCanShipPartially() {
    return this.canShipPartially;
  }

  public java.lang.Integer getCanShipPartiallyItem() {
    return this.canShipPartiallyItem;
  }

  public java.lang.Integer getCustomerIsGuest() {
    return this.customerIsGuest;
  }

  public java.lang.Integer getCustomerNoteNotify() {
    return this.customerNoteNotify;
  }

  public java.lang.Integer getBillingAddressId() {
    return this.billingAddressId;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getEditIncrement() {
    return this.editIncrement;
  }

  public java.lang.Integer getEmailSent() {
    return this.emailSent;
  }

  public java.lang.Integer getSendEmail() {
    return this.sendEmail;
  }

  public java.lang.Integer getForcedShipmentWithInvoice() {
    return this.forcedShipmentWithInvoice;
  }

  public java.lang.Integer getPaymentAuthExpiration() {
    return this.paymentAuthExpiration;
  }

  public java.lang.Integer getQuoteAddressId() {
    return this.quoteAddressId;
  }

  public java.lang.Integer getQuoteId() {
    return this.quoteId;
  }

  public java.lang.Integer getShippingAddressId() {
    return this.shippingAddressId;
  }

  public java.math.BigDecimal getAdjustmentNegative() {
    return this.adjustmentNegative;
  }

  public java.math.BigDecimal getAdjustmentPositive() {
    return this.adjustmentPositive;
  }

  public java.math.BigDecimal getBaseAdjustmentNegative() {
    return this.baseAdjustmentNegative;
  }

  public java.math.BigDecimal getBaseAdjustmentPositive() {
    return this.baseAdjustmentPositive;
  }

  public java.math.BigDecimal getBaseShippingDiscountAmount() {
    return this.baseShippingDiscountAmount;
  }

  public java.math.BigDecimal getBaseSubtotalInclTax() {
    return this.baseSubtotalInclTax;
  }

  public java.math.BigDecimal getBaseTotalDue() {
    return this.baseTotalDue;
  }

  public java.math.BigDecimal getPaymentAuthorizationAmount() {
    return this.paymentAuthorizationAmount;
  }

  public java.math.BigDecimal getShippingDiscountAmount() {
    return this.shippingDiscountAmount;
  }

  public java.math.BigDecimal getSubtotalInclTax() {
    return this.subtotalInclTax;
  }

  public java.math.BigDecimal getTotalDue() {
    return this.totalDue;
  }

  public java.math.BigDecimal getWeight() {
    return this.weight;
  }

  public java.util.Date getCustomerDob() {
    return this.customerDob;
  }

  public java.lang.String getAppliedRuleIds() {
    return this.appliedRuleIds;
  }

  public java.lang.String getBaseCurrencyCode() {
    return this.baseCurrencyCode;
  }

  public java.lang.String getCustomerEmail() {
    return this.customerEmail;
  }

  public java.lang.String getCustomerFirstname() {
    return this.customerFirstname;
  }

  public java.lang.String getCustomerLastname() {
    return this.customerLastname;
  }

  public java.lang.String getCustomerMiddlename() {
    return this.customerMiddlename;
  }

  public java.lang.String getCustomerPrefix() {
    return this.customerPrefix;
  }

  public java.lang.String getCustomerSuffix() {
    return this.customerSuffix;
  }

  public java.lang.String getCustomerTaxvat() {
    return this.customerTaxvat;
  }

  public java.lang.String getDiscountDescription() {
    return this.discountDescription;
  }

  public java.lang.String getExtCustomerId() {
    return this.extCustomerId;
  }

  public java.lang.String getExtOrderId() {
    return this.extOrderId;
  }

  public java.lang.String getGlobalCurrencyCode() {
    return this.globalCurrencyCode;
  }

  public java.lang.String getHoldBeforeState() {
    return this.holdBeforeState;
  }

  public java.lang.String getHoldBeforeStatus() {
    return this.holdBeforeStatus;
  }

  public java.lang.String getOrderCurrencyCode() {
    return this.orderCurrencyCode;
  }

  public java.lang.String getOriginalIncrementId() {
    return this.originalIncrementId;
  }

  public java.lang.String getRelationChildId() {
    return this.relationChildId;
  }

  public java.lang.String getRelationChildRealId() {
    return this.relationChildRealId;
  }

  public java.lang.String getRelationParentId() {
    return this.relationParentId;
  }

  public java.lang.String getRelationParentRealId() {
    return this.relationParentRealId;
  }

  public java.lang.String getRemoteIp() {
    return this.remoteIp;
  }

  public java.lang.String getShippingMethod() {
    return this.shippingMethod;
  }

  public java.lang.String getStoreCurrencyCode() {
    return this.storeCurrencyCode;
  }

  public java.lang.String getStoreName() {
    return this.storeName;
  }

  public java.lang.String getXForwardedFor() {
    return this.xForwardedFor;
  }

  public java.lang.String getCustomerNote() {
    return this.customerNote;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.Integer getTotalItemCount() {
    return this.totalItemCount;
  }

  public java.lang.Integer getCustomerGender() {
    return this.customerGender;
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

  public java.math.BigDecimal getDiscountTaxCompensationInvoiced() {
    return this.discountTaxCompensationInvoiced;
  }

  public java.math.BigDecimal getBaseDiscountTaxCompensationInvoiced() {
    return this.baseDiscountTaxCompensationInvoiced;
  }

  public java.math.BigDecimal getDiscountTaxCompensationRefunded() {
    return this.discountTaxCompensationRefunded;
  }

  public java.math.BigDecimal getBaseDiscountTaxCompensationRefunded() {
    return this.baseDiscountTaxCompensationRefunded;
  }

  public java.math.BigDecimal getShippingInclTax() {
    return this.shippingInclTax;
  }

  public java.math.BigDecimal getBaseShippingInclTax() {
    return this.baseShippingInclTax;
  }

  public java.lang.String getCouponRuleName() {
    return this.couponRuleName;
  }

  public java.lang.Integer getGiftMessageId() {
    return this.giftMessageId;
  }

  public java.lang.Integer getPaypalIpnCustomerNotified() {
    return this.paypalIpnCustomerNotified;
  }

  public void setState(java.lang.String state) {
    this.state = state;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setCouponCode(java.lang.String couponCode) {
    this.couponCode = couponCode;
  }

  public void setProtectCode(java.lang.String protectCode) {
    this.protectCode = protectCode;
  }

  public void setShippingDescription(java.lang.String shippingDescription) {
    this.shippingDescription = shippingDescription;
  }

  public void setIsVirtual(java.lang.Integer isVirtual) {
    this.isVirtual = isVirtual;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setBaseDiscountAmount(java.math.BigDecimal baseDiscountAmount) {
    this.baseDiscountAmount = baseDiscountAmount;
  }

  public void setBaseDiscountCanceled(java.math.BigDecimal baseDiscountCanceled) {
    this.baseDiscountCanceled = baseDiscountCanceled;
  }

  public void setBaseDiscountInvoiced(java.math.BigDecimal baseDiscountInvoiced) {
    this.baseDiscountInvoiced = baseDiscountInvoiced;
  }

  public void setBaseDiscountRefunded(java.math.BigDecimal baseDiscountRefunded) {
    this.baseDiscountRefunded = baseDiscountRefunded;
  }

  public void setBaseGrandTotal(java.math.BigDecimal baseGrandTotal) {
    this.baseGrandTotal = baseGrandTotal;
  }

  public void setBaseShippingAmount(java.math.BigDecimal baseShippingAmount) {
    this.baseShippingAmount = baseShippingAmount;
  }

  public void setBaseShippingCanceled(java.math.BigDecimal baseShippingCanceled) {
    this.baseShippingCanceled = baseShippingCanceled;
  }

  public void setBaseShippingInvoiced(java.math.BigDecimal baseShippingInvoiced) {
    this.baseShippingInvoiced = baseShippingInvoiced;
  }

  public void setBaseShippingRefunded(java.math.BigDecimal baseShippingRefunded) {
    this.baseShippingRefunded = baseShippingRefunded;
  }

  public void setBaseShippingTaxAmount(java.math.BigDecimal baseShippingTaxAmount) {
    this.baseShippingTaxAmount = baseShippingTaxAmount;
  }

  public void setBaseShippingTaxRefunded(java.math.BigDecimal baseShippingTaxRefunded) {
    this.baseShippingTaxRefunded = baseShippingTaxRefunded;
  }

  public void setBaseSubtotal(java.math.BigDecimal baseSubtotal) {
    this.baseSubtotal = baseSubtotal;
  }

  public void setBaseSubtotalCanceled(java.math.BigDecimal baseSubtotalCanceled) {
    this.baseSubtotalCanceled = baseSubtotalCanceled;
  }

  public void setBaseSubtotalInvoiced(java.math.BigDecimal baseSubtotalInvoiced) {
    this.baseSubtotalInvoiced = baseSubtotalInvoiced;
  }

  public void setBaseSubtotalRefunded(java.math.BigDecimal baseSubtotalRefunded) {
    this.baseSubtotalRefunded = baseSubtotalRefunded;
  }

  public void setBaseTaxAmount(java.math.BigDecimal baseTaxAmount) {
    this.baseTaxAmount = baseTaxAmount;
  }

  public void setBaseTaxCanceled(java.math.BigDecimal baseTaxCanceled) {
    this.baseTaxCanceled = baseTaxCanceled;
  }

  public void setBaseTaxInvoiced(java.math.BigDecimal baseTaxInvoiced) {
    this.baseTaxInvoiced = baseTaxInvoiced;
  }

  public void setBaseTaxRefunded(java.math.BigDecimal baseTaxRefunded) {
    this.baseTaxRefunded = baseTaxRefunded;
  }

  public void setBaseToGlobalRate(java.math.BigDecimal baseToGlobalRate) {
    this.baseToGlobalRate = baseToGlobalRate;
  }

  public void setBaseToOrderRate(java.math.BigDecimal baseToOrderRate) {
    this.baseToOrderRate = baseToOrderRate;
  }

  public void setBaseTotalCanceled(java.math.BigDecimal baseTotalCanceled) {
    this.baseTotalCanceled = baseTotalCanceled;
  }

  public void setBaseTotalInvoiced(java.math.BigDecimal baseTotalInvoiced) {
    this.baseTotalInvoiced = baseTotalInvoiced;
  }

  public void setBaseTotalInvoicedCost(java.math.BigDecimal baseTotalInvoicedCost) {
    this.baseTotalInvoicedCost = baseTotalInvoicedCost;
  }

  public void setBaseTotalOfflineRefunded(java.math.BigDecimal baseTotalOfflineRefunded) {
    this.baseTotalOfflineRefunded = baseTotalOfflineRefunded;
  }

  public void setBaseTotalOnlineRefunded(java.math.BigDecimal baseTotalOnlineRefunded) {
    this.baseTotalOnlineRefunded = baseTotalOnlineRefunded;
  }

  public void setBaseTotalPaid(java.math.BigDecimal baseTotalPaid) {
    this.baseTotalPaid = baseTotalPaid;
  }

  public void setBaseTotalQtyOrdered(java.math.BigDecimal baseTotalQtyOrdered) {
    this.baseTotalQtyOrdered = baseTotalQtyOrdered;
  }

  public void setBaseTotalRefunded(java.math.BigDecimal baseTotalRefunded) {
    this.baseTotalRefunded = baseTotalRefunded;
  }

  public void setDiscountAmount(java.math.BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public void setDiscountCanceled(java.math.BigDecimal discountCanceled) {
    this.discountCanceled = discountCanceled;
  }

  public void setDiscountInvoiced(java.math.BigDecimal discountInvoiced) {
    this.discountInvoiced = discountInvoiced;
  }

  public void setDiscountRefunded(java.math.BigDecimal discountRefunded) {
    this.discountRefunded = discountRefunded;
  }

  public void setGrandTotal(java.math.BigDecimal grandTotal) {
    this.grandTotal = grandTotal;
  }

  public void setShippingAmount(java.math.BigDecimal shippingAmount) {
    this.shippingAmount = shippingAmount;
  }

  public void setShippingCanceled(java.math.BigDecimal shippingCanceled) {
    this.shippingCanceled = shippingCanceled;
  }

  public void setShippingInvoiced(java.math.BigDecimal shippingInvoiced) {
    this.shippingInvoiced = shippingInvoiced;
  }

  public void setShippingRefunded(java.math.BigDecimal shippingRefunded) {
    this.shippingRefunded = shippingRefunded;
  }

  public void setShippingTaxAmount(java.math.BigDecimal shippingTaxAmount) {
    this.shippingTaxAmount = shippingTaxAmount;
  }

  public void setShippingTaxRefunded(java.math.BigDecimal shippingTaxRefunded) {
    this.shippingTaxRefunded = shippingTaxRefunded;
  }

  public void setStoreToBaseRate(java.math.BigDecimal storeToBaseRate) {
    this.storeToBaseRate = storeToBaseRate;
  }

  public void setStoreToOrderRate(java.math.BigDecimal storeToOrderRate) {
    this.storeToOrderRate = storeToOrderRate;
  }

  public void setSubtotal(java.math.BigDecimal subtotal) {
    this.subtotal = subtotal;
  }

  public void setSubtotalCanceled(java.math.BigDecimal subtotalCanceled) {
    this.subtotalCanceled = subtotalCanceled;
  }

  public void setSubtotalInvoiced(java.math.BigDecimal subtotalInvoiced) {
    this.subtotalInvoiced = subtotalInvoiced;
  }

  public void setSubtotalRefunded(java.math.BigDecimal subtotalRefunded) {
    this.subtotalRefunded = subtotalRefunded;
  }

  public void setTaxAmount(java.math.BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public void setTaxCanceled(java.math.BigDecimal taxCanceled) {
    this.taxCanceled = taxCanceled;
  }

  public void setTaxInvoiced(java.math.BigDecimal taxInvoiced) {
    this.taxInvoiced = taxInvoiced;
  }

  public void setTaxRefunded(java.math.BigDecimal taxRefunded) {
    this.taxRefunded = taxRefunded;
  }

  public void setTotalCanceled(java.math.BigDecimal totalCanceled) {
    this.totalCanceled = totalCanceled;
  }

  public void setTotalInvoiced(java.math.BigDecimal totalInvoiced) {
    this.totalInvoiced = totalInvoiced;
  }

  public void setTotalOfflineRefunded(java.math.BigDecimal totalOfflineRefunded) {
    this.totalOfflineRefunded = totalOfflineRefunded;
  }

  public void setTotalOnlineRefunded(java.math.BigDecimal totalOnlineRefunded) {
    this.totalOnlineRefunded = totalOnlineRefunded;
  }

  public void setTotalPaid(java.math.BigDecimal totalPaid) {
    this.totalPaid = totalPaid;
  }

  public void setTotalQtyOrdered(java.math.BigDecimal totalQtyOrdered) {
    this.totalQtyOrdered = totalQtyOrdered;
  }

  public void setTotalRefunded(java.math.BigDecimal totalRefunded) {
    this.totalRefunded = totalRefunded;
  }

  public void setCanShipPartially(java.lang.Integer canShipPartially) {
    this.canShipPartially = canShipPartially;
  }

  public void setCanShipPartiallyItem(java.lang.Integer canShipPartiallyItem) {
    this.canShipPartiallyItem = canShipPartiallyItem;
  }

  public void setCustomerIsGuest(java.lang.Integer customerIsGuest) {
    this.customerIsGuest = customerIsGuest;
  }

  public void setCustomerNoteNotify(java.lang.Integer customerNoteNotify) {
    this.customerNoteNotify = customerNoteNotify;
  }

  public void setBillingAddressId(java.lang.Integer billingAddressId) {
    this.billingAddressId = billingAddressId;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setEditIncrement(java.lang.Integer editIncrement) {
    this.editIncrement = editIncrement;
  }

  public void setEmailSent(java.lang.Integer emailSent) {
    this.emailSent = emailSent;
  }

  public void setSendEmail(java.lang.Integer sendEmail) {
    this.sendEmail = sendEmail;
  }

  public void setForcedShipmentWithInvoice(java.lang.Integer forcedShipmentWithInvoice) {
    this.forcedShipmentWithInvoice = forcedShipmentWithInvoice;
  }

  public void setPaymentAuthExpiration(java.lang.Integer paymentAuthExpiration) {
    this.paymentAuthExpiration = paymentAuthExpiration;
  }

  public void setQuoteAddressId(java.lang.Integer quoteAddressId) {
    this.quoteAddressId = quoteAddressId;
  }

  public void setQuoteId(java.lang.Integer quoteId) {
    this.quoteId = quoteId;
  }

  public void setShippingAddressId(java.lang.Integer shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }

  public void setAdjustmentNegative(java.math.BigDecimal adjustmentNegative) {
    this.adjustmentNegative = adjustmentNegative;
  }

  public void setAdjustmentPositive(java.math.BigDecimal adjustmentPositive) {
    this.adjustmentPositive = adjustmentPositive;
  }

  public void setBaseAdjustmentNegative(java.math.BigDecimal baseAdjustmentNegative) {
    this.baseAdjustmentNegative = baseAdjustmentNegative;
  }

  public void setBaseAdjustmentPositive(java.math.BigDecimal baseAdjustmentPositive) {
    this.baseAdjustmentPositive = baseAdjustmentPositive;
  }

  public void setBaseShippingDiscountAmount(java.math.BigDecimal baseShippingDiscountAmount) {
    this.baseShippingDiscountAmount = baseShippingDiscountAmount;
  }

  public void setBaseSubtotalInclTax(java.math.BigDecimal baseSubtotalInclTax) {
    this.baseSubtotalInclTax = baseSubtotalInclTax;
  }

  public void setBaseTotalDue(java.math.BigDecimal baseTotalDue) {
    this.baseTotalDue = baseTotalDue;
  }

  public void setPaymentAuthorizationAmount(java.math.BigDecimal paymentAuthorizationAmount) {
    this.paymentAuthorizationAmount = paymentAuthorizationAmount;
  }

  public void setShippingDiscountAmount(java.math.BigDecimal shippingDiscountAmount) {
    this.shippingDiscountAmount = shippingDiscountAmount;
  }

  public void setSubtotalInclTax(java.math.BigDecimal subtotalInclTax) {
    this.subtotalInclTax = subtotalInclTax;
  }

  public void setTotalDue(java.math.BigDecimal totalDue) {
    this.totalDue = totalDue;
  }

  public void setWeight(java.math.BigDecimal weight) {
    this.weight = weight;
  }

  public void setCustomerDob(java.util.Date customerDob) {
    this.customerDob = customerDob;
  }

  public void setAppliedRuleIds(java.lang.String appliedRuleIds) {
    this.appliedRuleIds = appliedRuleIds;
  }

  public void setBaseCurrencyCode(java.lang.String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
  }

  public void setCustomerEmail(java.lang.String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public void setCustomerFirstname(java.lang.String customerFirstname) {
    this.customerFirstname = customerFirstname;
  }

  public void setCustomerLastname(java.lang.String customerLastname) {
    this.customerLastname = customerLastname;
  }

  public void setCustomerMiddlename(java.lang.String customerMiddlename) {
    this.customerMiddlename = customerMiddlename;
  }

  public void setCustomerPrefix(java.lang.String customerPrefix) {
    this.customerPrefix = customerPrefix;
  }

  public void setCustomerSuffix(java.lang.String customerSuffix) {
    this.customerSuffix = customerSuffix;
  }

  public void setCustomerTaxvat(java.lang.String customerTaxvat) {
    this.customerTaxvat = customerTaxvat;
  }

  public void setDiscountDescription(java.lang.String discountDescription) {
    this.discountDescription = discountDescription;
  }

  public void setExtCustomerId(java.lang.String extCustomerId) {
    this.extCustomerId = extCustomerId;
  }

  public void setExtOrderId(java.lang.String extOrderId) {
    this.extOrderId = extOrderId;
  }

  public void setGlobalCurrencyCode(java.lang.String globalCurrencyCode) {
    this.globalCurrencyCode = globalCurrencyCode;
  }

  public void setHoldBeforeState(java.lang.String holdBeforeState) {
    this.holdBeforeState = holdBeforeState;
  }

  public void setHoldBeforeStatus(java.lang.String holdBeforeStatus) {
    this.holdBeforeStatus = holdBeforeStatus;
  }

  public void setOrderCurrencyCode(java.lang.String orderCurrencyCode) {
    this.orderCurrencyCode = orderCurrencyCode;
  }

  public void setOriginalIncrementId(java.lang.String originalIncrementId) {
    this.originalIncrementId = originalIncrementId;
  }

  public void setRelationChildId(java.lang.String relationChildId) {
    this.relationChildId = relationChildId;
  }

  public void setRelationChildRealId(java.lang.String relationChildRealId) {
    this.relationChildRealId = relationChildRealId;
  }

  public void setRelationParentId(java.lang.String relationParentId) {
    this.relationParentId = relationParentId;
  }

  public void setRelationParentRealId(java.lang.String relationParentRealId) {
    this.relationParentRealId = relationParentRealId;
  }

  public void setRemoteIp(java.lang.String remoteIp) {
    this.remoteIp = remoteIp;
  }

  public void setShippingMethod(java.lang.String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public void setStoreCurrencyCode(java.lang.String storeCurrencyCode) {
    this.storeCurrencyCode = storeCurrencyCode;
  }

  public void setStoreName(java.lang.String storeName) {
    this.storeName = storeName;
  }

  public void setXForwardedFor(java.lang.String xForwardedFor) {
    this.xForwardedFor = xForwardedFor;
  }

  public void setCustomerNote(java.lang.String customerNote) {
    this.customerNote = customerNote;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setTotalItemCount(java.lang.Integer totalItemCount) {
    this.totalItemCount = totalItemCount;
  }

  public void setCustomerGender(java.lang.Integer customerGender) {
    this.customerGender = customerGender;
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

  public void setDiscountTaxCompensationInvoiced(
      java.math.BigDecimal discountTaxCompensationInvoiced) {
    this.discountTaxCompensationInvoiced = discountTaxCompensationInvoiced;
  }

  public void setBaseDiscountTaxCompensationInvoiced(
      java.math.BigDecimal baseDiscountTaxCompensationInvoiced) {
    this.baseDiscountTaxCompensationInvoiced = baseDiscountTaxCompensationInvoiced;
  }

  public void setDiscountTaxCompensationRefunded(
      java.math.BigDecimal discountTaxCompensationRefunded) {
    this.discountTaxCompensationRefunded = discountTaxCompensationRefunded;
  }

  public void setBaseDiscountTaxCompensationRefunded(
      java.math.BigDecimal baseDiscountTaxCompensationRefunded) {
    this.baseDiscountTaxCompensationRefunded = baseDiscountTaxCompensationRefunded;
  }

  public void setShippingInclTax(java.math.BigDecimal shippingInclTax) {
    this.shippingInclTax = shippingInclTax;
  }

  public void setBaseShippingInclTax(java.math.BigDecimal baseShippingInclTax) {
    this.baseShippingInclTax = baseShippingInclTax;
  }

  public void setCouponRuleName(java.lang.String couponRuleName) {
    this.couponRuleName = couponRuleName;
  }

  public void setGiftMessageId(java.lang.Integer giftMessageId) {
    this.giftMessageId = giftMessageId;
  }

  public void setPaypalIpnCustomerNotified(java.lang.Integer paypalIpnCustomerNotified) {
    this.paypalIpnCustomerNotified = paypalIpnCustomerNotified;
  }
}
