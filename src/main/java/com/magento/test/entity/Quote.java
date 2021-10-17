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
@Table(name = "quote")
public class Quote implements Serializable {
  private static final long serialVersionUID = 163445090589767609L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
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
  /** Description: converted_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "converted_at")
  private java.sql.Timestamp convertedAt;
  /** Description: is_active. */
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: is_virtual. */
  @Basic
  @Column(name = "is_virtual")
  private java.lang.Integer isVirtual;
  /** Description: is_multi_shipping. */
  @Basic
  @Column(name = "is_multi_shipping")
  private java.lang.Integer isMultiShipping;
  /** Description: items_count. */
  @Basic
  @Column(name = "items_count")
  private java.lang.Integer itemsCount;
  /** Description: items_qty. */
  @Basic
  @Column(name = "items_qty")
  private java.math.BigDecimal itemsQty;
  /** Description: orig_order_id. */
  @Basic
  @Column(name = "orig_order_id")
  private java.lang.Integer origOrderId;
  /** Description: store_to_base_rate. */
  @Basic
  @Column(name = "store_to_base_rate")
  private java.math.BigDecimal storeToBaseRate;
  /** Description: store_to_quote_rate. */
  @Basic
  @Column(name = "store_to_quote_rate")
  private java.math.BigDecimal storeToQuoteRate;
  /** Description: base_currency_code. */
  @Basic
  @Column(name = "base_currency_code", length = 255)
  private java.lang.String baseCurrencyCode;
  /** Description: store_currency_code. */
  @Basic
  @Column(name = "store_currency_code", length = 255)
  private java.lang.String storeCurrencyCode;
  /** Description: quote_currency_code. */
  @Basic
  @Column(name = "quote_currency_code", length = 255)
  private java.lang.String quoteCurrencyCode;
  /** Description: grand_total. */
  @Basic
  @Column(name = "grand_total")
  private java.math.BigDecimal grandTotal;
  /** Description: base_grand_total. */
  @Basic
  @Column(name = "base_grand_total")
  private java.math.BigDecimal baseGrandTotal;
  /** Description: checkout_method. */
  @Basic
  @Column(name = "checkout_method", length = 255)
  private java.lang.String checkoutMethod;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: customer_tax_class_id. */
  @Basic
  @Column(name = "customer_tax_class_id")
  private java.lang.Integer customerTaxClassId;
  /** Description: customer_group_id. */
  @Basic
  @Column(name = "customer_group_id")
  private java.lang.Integer customerGroupId;
  /** Description: customer_email. */
  @Basic
  @Column(name = "customer_email", length = 255)
  private java.lang.String customerEmail;
  /** Description: customer_prefix. */
  @Basic
  @Column(name = "customer_prefix", length = 40)
  private java.lang.String customerPrefix;
  /** Description: customer_firstname. */
  @Basic
  @Column(name = "customer_firstname", length = 255)
  private java.lang.String customerFirstname;
  /** Description: customer_middlename. */
  @Basic
  @Column(name = "customer_middlename", length = 40)
  private java.lang.String customerMiddlename;
  /** Description: customer_lastname. */
  @Basic
  @Column(name = "customer_lastname", length = 255)
  private java.lang.String customerLastname;
  /** Description: customer_suffix. */
  @Basic
  @Column(name = "customer_suffix", length = 40)
  private java.lang.String customerSuffix;
  /** Description: customer_dob. */
  @Basic
  @Column(name = "customer_dob")
  private java.util.Date customerDob;
  /** Description: customer_note. */
  @Basic
  @Column(name = "customer_note", length = 255)
  private java.lang.String customerNote;
  /** Description: customer_note_notify. */
  @Basic
  @Column(name = "customer_note_notify")
  private java.lang.Integer customerNoteNotify;
  /** Description: customer_is_guest. */
  @Basic
  @Column(name = "customer_is_guest")
  private java.lang.Integer customerIsGuest;
  /** Description: remote_ip. */
  @Basic
  @Column(name = "remote_ip", length = 45)
  private java.lang.String remoteIp;
  /** Description: applied_rule_ids. */
  @Basic
  @Column(name = "applied_rule_ids", length = 255)
  private java.lang.String appliedRuleIds;
  /** Description: reserved_order_id. */
  @Basic
  @Column(name = "reserved_order_id", length = 64)
  private java.lang.String reservedOrderId;
  /** Description: password_hash. */
  @Basic
  @Column(name = "password_hash", length = 255)
  private java.lang.String passwordHash;
  /** Description: coupon_code. */
  @Basic
  @Column(name = "coupon_code", length = 255)
  private java.lang.String couponCode;
  /** Description: global_currency_code. */
  @Basic
  @Column(name = "global_currency_code", length = 255)
  private java.lang.String globalCurrencyCode;
  /** Description: base_to_global_rate. */
  @Basic
  @Column(name = "base_to_global_rate")
  private java.math.BigDecimal baseToGlobalRate;
  /** Description: base_to_quote_rate. */
  @Basic
  @Column(name = "base_to_quote_rate")
  private java.math.BigDecimal baseToQuoteRate;
  /** Description: customer_taxvat. */
  @Basic
  @Column(name = "customer_taxvat", length = 255)
  private java.lang.String customerTaxvat;
  /** Description: customer_gender. */
  @Basic
  @Column(name = "customer_gender", length = 255)
  private java.lang.String customerGender;
  /** Description: subtotal. */
  @Basic
  @Column(name = "subtotal")
  private java.math.BigDecimal subtotal;
  /** Description: base_subtotal. */
  @Basic
  @Column(name = "base_subtotal")
  private java.math.BigDecimal baseSubtotal;
  /** Description: subtotal_with_discount. */
  @Basic
  @Column(name = "subtotal_with_discount")
  private java.math.BigDecimal subtotalWithDiscount;
  /** Description: base_subtotal_with_discount. */
  @Basic
  @Column(name = "base_subtotal_with_discount")
  private java.math.BigDecimal baseSubtotalWithDiscount;
  /** Description: is_changed. */
  @Basic
  @Column(name = "is_changed")
  private java.lang.Integer isChanged;
  /** Description: trigger_recollect. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "trigger_recollect")
  private java.lang.Integer triggerRecollect;
  /** Description: ext_shipping_info. */
  @Basic
  @Column(name = "ext_shipping_info", length = 0)
  private java.lang.String extShippingInfo;
  /** Description: gift_message_id. */
  @Basic
  @Column(name = "gift_message_id")
  private java.lang.Integer giftMessageId;
  /** Description: is_persistent. */
  @Basic
  @Column(name = "is_persistent")
  private java.lang.Integer isPersistent;

  public Quote() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.sql.Timestamp getConvertedAt() {
    return this.convertedAt;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.lang.Integer getIsVirtual() {
    return this.isVirtual;
  }

  public java.lang.Integer getIsMultiShipping() {
    return this.isMultiShipping;
  }

  public java.lang.Integer getItemsCount() {
    return this.itemsCount;
  }

  public java.math.BigDecimal getItemsQty() {
    return this.itemsQty;
  }

  public java.lang.Integer getOrigOrderId() {
    return this.origOrderId;
  }

  public java.math.BigDecimal getStoreToBaseRate() {
    return this.storeToBaseRate;
  }

  public java.math.BigDecimal getStoreToQuoteRate() {
    return this.storeToQuoteRate;
  }

  public java.lang.String getBaseCurrencyCode() {
    return this.baseCurrencyCode;
  }

  public java.lang.String getStoreCurrencyCode() {
    return this.storeCurrencyCode;
  }

  public java.lang.String getQuoteCurrencyCode() {
    return this.quoteCurrencyCode;
  }

  public java.math.BigDecimal getGrandTotal() {
    return this.grandTotal;
  }

  public java.math.BigDecimal getBaseGrandTotal() {
    return this.baseGrandTotal;
  }

  public java.lang.String getCheckoutMethod() {
    return this.checkoutMethod;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.Integer getCustomerTaxClassId() {
    return this.customerTaxClassId;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.String getCustomerEmail() {
    return this.customerEmail;
  }

  public java.lang.String getCustomerPrefix() {
    return this.customerPrefix;
  }

  public java.lang.String getCustomerFirstname() {
    return this.customerFirstname;
  }

  public java.lang.String getCustomerMiddlename() {
    return this.customerMiddlename;
  }

  public java.lang.String getCustomerLastname() {
    return this.customerLastname;
  }

  public java.lang.String getCustomerSuffix() {
    return this.customerSuffix;
  }

  public java.util.Date getCustomerDob() {
    return this.customerDob;
  }

  public java.lang.String getCustomerNote() {
    return this.customerNote;
  }

  public java.lang.Integer getCustomerNoteNotify() {
    return this.customerNoteNotify;
  }

  public java.lang.Integer getCustomerIsGuest() {
    return this.customerIsGuest;
  }

  public java.lang.String getRemoteIp() {
    return this.remoteIp;
  }

  public java.lang.String getAppliedRuleIds() {
    return this.appliedRuleIds;
  }

  public java.lang.String getReservedOrderId() {
    return this.reservedOrderId;
  }

  public java.lang.String getPasswordHash() {
    return this.passwordHash;
  }

  public java.lang.String getCouponCode() {
    return this.couponCode;
  }

  public java.lang.String getGlobalCurrencyCode() {
    return this.globalCurrencyCode;
  }

  public java.math.BigDecimal getBaseToGlobalRate() {
    return this.baseToGlobalRate;
  }

  public java.math.BigDecimal getBaseToQuoteRate() {
    return this.baseToQuoteRate;
  }

  public java.lang.String getCustomerTaxvat() {
    return this.customerTaxvat;
  }

  public java.lang.String getCustomerGender() {
    return this.customerGender;
  }

  public java.math.BigDecimal getSubtotal() {
    return this.subtotal;
  }

  public java.math.BigDecimal getBaseSubtotal() {
    return this.baseSubtotal;
  }

  public java.math.BigDecimal getSubtotalWithDiscount() {
    return this.subtotalWithDiscount;
  }

  public java.math.BigDecimal getBaseSubtotalWithDiscount() {
    return this.baseSubtotalWithDiscount;
  }

  public java.lang.Integer getIsChanged() {
    return this.isChanged;
  }

  public java.lang.Integer getTriggerRecollect() {
    return this.triggerRecollect;
  }

  public java.lang.String getExtShippingInfo() {
    return this.extShippingInfo;
  }

  public java.lang.Integer getGiftMessageId() {
    return this.giftMessageId;
  }

  public java.lang.Integer getIsPersistent() {
    return this.isPersistent;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setConvertedAt(java.sql.Timestamp convertedAt) {
    this.convertedAt = convertedAt;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setIsVirtual(java.lang.Integer isVirtual) {
    this.isVirtual = isVirtual;
  }

  public void setIsMultiShipping(java.lang.Integer isMultiShipping) {
    this.isMultiShipping = isMultiShipping;
  }

  public void setItemsCount(java.lang.Integer itemsCount) {
    this.itemsCount = itemsCount;
  }

  public void setItemsQty(java.math.BigDecimal itemsQty) {
    this.itemsQty = itemsQty;
  }

  public void setOrigOrderId(java.lang.Integer origOrderId) {
    this.origOrderId = origOrderId;
  }

  public void setStoreToBaseRate(java.math.BigDecimal storeToBaseRate) {
    this.storeToBaseRate = storeToBaseRate;
  }

  public void setStoreToQuoteRate(java.math.BigDecimal storeToQuoteRate) {
    this.storeToQuoteRate = storeToQuoteRate;
  }

  public void setBaseCurrencyCode(java.lang.String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
  }

  public void setStoreCurrencyCode(java.lang.String storeCurrencyCode) {
    this.storeCurrencyCode = storeCurrencyCode;
  }

  public void setQuoteCurrencyCode(java.lang.String quoteCurrencyCode) {
    this.quoteCurrencyCode = quoteCurrencyCode;
  }

  public void setGrandTotal(java.math.BigDecimal grandTotal) {
    this.grandTotal = grandTotal;
  }

  public void setBaseGrandTotal(java.math.BigDecimal baseGrandTotal) {
    this.baseGrandTotal = baseGrandTotal;
  }

  public void setCheckoutMethod(java.lang.String checkoutMethod) {
    this.checkoutMethod = checkoutMethod;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setCustomerTaxClassId(java.lang.Integer customerTaxClassId) {
    this.customerTaxClassId = customerTaxClassId;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setCustomerEmail(java.lang.String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public void setCustomerPrefix(java.lang.String customerPrefix) {
    this.customerPrefix = customerPrefix;
  }

  public void setCustomerFirstname(java.lang.String customerFirstname) {
    this.customerFirstname = customerFirstname;
  }

  public void setCustomerMiddlename(java.lang.String customerMiddlename) {
    this.customerMiddlename = customerMiddlename;
  }

  public void setCustomerLastname(java.lang.String customerLastname) {
    this.customerLastname = customerLastname;
  }

  public void setCustomerSuffix(java.lang.String customerSuffix) {
    this.customerSuffix = customerSuffix;
  }

  public void setCustomerDob(java.util.Date customerDob) {
    this.customerDob = customerDob;
  }

  public void setCustomerNote(java.lang.String customerNote) {
    this.customerNote = customerNote;
  }

  public void setCustomerNoteNotify(java.lang.Integer customerNoteNotify) {
    this.customerNoteNotify = customerNoteNotify;
  }

  public void setCustomerIsGuest(java.lang.Integer customerIsGuest) {
    this.customerIsGuest = customerIsGuest;
  }

  public void setRemoteIp(java.lang.String remoteIp) {
    this.remoteIp = remoteIp;
  }

  public void setAppliedRuleIds(java.lang.String appliedRuleIds) {
    this.appliedRuleIds = appliedRuleIds;
  }

  public void setReservedOrderId(java.lang.String reservedOrderId) {
    this.reservedOrderId = reservedOrderId;
  }

  public void setPasswordHash(java.lang.String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public void setCouponCode(java.lang.String couponCode) {
    this.couponCode = couponCode;
  }

  public void setGlobalCurrencyCode(java.lang.String globalCurrencyCode) {
    this.globalCurrencyCode = globalCurrencyCode;
  }

  public void setBaseToGlobalRate(java.math.BigDecimal baseToGlobalRate) {
    this.baseToGlobalRate = baseToGlobalRate;
  }

  public void setBaseToQuoteRate(java.math.BigDecimal baseToQuoteRate) {
    this.baseToQuoteRate = baseToQuoteRate;
  }

  public void setCustomerTaxvat(java.lang.String customerTaxvat) {
    this.customerTaxvat = customerTaxvat;
  }

  public void setCustomerGender(java.lang.String customerGender) {
    this.customerGender = customerGender;
  }

  public void setSubtotal(java.math.BigDecimal subtotal) {
    this.subtotal = subtotal;
  }

  public void setBaseSubtotal(java.math.BigDecimal baseSubtotal) {
    this.baseSubtotal = baseSubtotal;
  }

  public void setSubtotalWithDiscount(java.math.BigDecimal subtotalWithDiscount) {
    this.subtotalWithDiscount = subtotalWithDiscount;
  }

  public void setBaseSubtotalWithDiscount(java.math.BigDecimal baseSubtotalWithDiscount) {
    this.baseSubtotalWithDiscount = baseSubtotalWithDiscount;
  }

  public void setIsChanged(java.lang.Integer isChanged) {
    this.isChanged = isChanged;
  }

  public void setTriggerRecollect(java.lang.Integer triggerRecollect) {
    this.triggerRecollect = triggerRecollect;
  }

  public void setExtShippingInfo(java.lang.String extShippingInfo) {
    this.extShippingInfo = extShippingInfo;
  }

  public void setGiftMessageId(java.lang.Integer giftMessageId) {
    this.giftMessageId = giftMessageId;
  }

  public void setIsPersistent(java.lang.Integer isPersistent) {
    this.isPersistent = isPersistent;
  }
}
