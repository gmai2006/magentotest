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
@Table(name = "sales_order_item")
public class SalesOrderItem implements Serializable {
  private static final long serialVersionUID = 163445090652592575L;

  /** Description: item_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "item_id")
  private java.lang.Integer itemId;

  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_id")
  private java.lang.Integer orderId;
  /** Description: parent_item_id. */
  @Basic
  @Column(name = "parent_item_id")
  private java.lang.Integer parentItemId;
  /** Description: quote_item_id. */
  @Basic
  @Column(name = "quote_item_id")
  private java.lang.Integer quoteItemId;
  /** Description: store_id. */
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
  /** Description: product_id. */
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: product_type. */
  @Basic
  @Column(name = "product_type", length = 255)
  private java.lang.String productType;
  /** Description: product_options. */
  @Basic
  @Column(name = "product_options", length = 0)
  private java.lang.String productOptions;
  /** Description: weight. */
  @Basic
  @Column(name = "weight")
  private java.math.BigDecimal weight;
  /** Description: is_virtual. */
  @Basic
  @Column(name = "is_virtual")
  private java.lang.Integer isVirtual;
  /** Description: sku. */
  @Basic
  @Column(name = "sku", length = 255)
  private java.lang.String sku;
  /** Description: name. */
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 0)
  private java.lang.String description;
  /** Description: applied_rule_ids. */
  @Basic
  @Column(name = "applied_rule_ids", length = 0)
  private java.lang.String appliedRuleIds;
  /** Description: additional_data. */
  @Basic
  @Column(name = "additional_data", length = 0)
  private java.lang.String additionalData;
  /** Description: is_qty_decimal. */
  @Basic
  @Column(name = "is_qty_decimal")
  private java.lang.Integer isQtyDecimal;
  /** Description: no_discount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "no_discount")
  private java.lang.Integer noDiscount;
  /** Description: qty_backordered. */
  @Basic
  @Column(name = "qty_backordered")
  private java.math.BigDecimal qtyBackordered;
  /** Description: qty_canceled. */
  @Basic
  @Column(name = "qty_canceled")
  private java.math.BigDecimal qtyCanceled;
  /** Description: qty_invoiced. */
  @Basic
  @Column(name = "qty_invoiced")
  private java.math.BigDecimal qtyInvoiced;
  /** Description: qty_ordered. */
  @Basic
  @Column(name = "qty_ordered")
  private java.math.BigDecimal qtyOrdered;
  /** Description: qty_refunded. */
  @Basic
  @Column(name = "qty_refunded")
  private java.math.BigDecimal qtyRefunded;
  /** Description: qty_shipped. */
  @Basic
  @Column(name = "qty_shipped")
  private java.math.BigDecimal qtyShipped;
  /** Description: base_cost. */
  @Basic
  @Column(name = "base_cost")
  private java.math.BigDecimal baseCost;
  /** Description: price. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "price")
  private java.math.BigDecimal price;
  /** Description: base_price. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "base_price")
  private java.math.BigDecimal basePrice;
  /** Description: original_price. */
  @Basic
  @Column(name = "original_price")
  private java.math.BigDecimal originalPrice;
  /** Description: base_original_price. */
  @Basic
  @Column(name = "base_original_price")
  private java.math.BigDecimal baseOriginalPrice;
  /** Description: tax_percent. */
  @Basic
  @Column(name = "tax_percent")
  private java.math.BigDecimal taxPercent;
  /** Description: tax_amount. */
  @Basic
  @Column(name = "tax_amount")
  private java.math.BigDecimal taxAmount;
  /** Description: base_tax_amount. */
  @Basic
  @Column(name = "base_tax_amount")
  private java.math.BigDecimal baseTaxAmount;
  /** Description: tax_invoiced. */
  @Basic
  @Column(name = "tax_invoiced")
  private java.math.BigDecimal taxInvoiced;
  /** Description: base_tax_invoiced. */
  @Basic
  @Column(name = "base_tax_invoiced")
  private java.math.BigDecimal baseTaxInvoiced;
  /** Description: discount_percent. */
  @Basic
  @Column(name = "discount_percent")
  private java.math.BigDecimal discountPercent;
  /** Description: discount_amount. */
  @Basic
  @Column(name = "discount_amount")
  private java.math.BigDecimal discountAmount;
  /** Description: base_discount_amount. */
  @Basic
  @Column(name = "base_discount_amount")
  private java.math.BigDecimal baseDiscountAmount;
  /** Description: discount_invoiced. */
  @Basic
  @Column(name = "discount_invoiced")
  private java.math.BigDecimal discountInvoiced;
  /** Description: base_discount_invoiced. */
  @Basic
  @Column(name = "base_discount_invoiced")
  private java.math.BigDecimal baseDiscountInvoiced;
  /** Description: amount_refunded. */
  @Basic
  @Column(name = "amount_refunded")
  private java.math.BigDecimal amountRefunded;
  /** Description: base_amount_refunded. */
  @Basic
  @Column(name = "base_amount_refunded")
  private java.math.BigDecimal baseAmountRefunded;
  /** Description: row_total. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "row_total")
  private java.math.BigDecimal rowTotal;
  /** Description: base_row_total. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "base_row_total")
  private java.math.BigDecimal baseRowTotal;
  /** Description: row_invoiced. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "row_invoiced")
  private java.math.BigDecimal rowInvoiced;
  /** Description: base_row_invoiced. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "base_row_invoiced")
  private java.math.BigDecimal baseRowInvoiced;
  /** Description: row_weight. */
  @Basic
  @Column(name = "row_weight")
  private java.math.BigDecimal rowWeight;
  /** Description: base_tax_before_discount. */
  @Basic
  @Column(name = "base_tax_before_discount")
  private java.math.BigDecimal baseTaxBeforeDiscount;
  /** Description: tax_before_discount. */
  @Basic
  @Column(name = "tax_before_discount")
  private java.math.BigDecimal taxBeforeDiscount;
  /** Description: ext_order_item_id. */
  @Basic
  @Column(name = "ext_order_item_id", length = 255)
  private java.lang.String extOrderItemId;
  /** Description: locked_do_invoice. */
  @Basic
  @Column(name = "locked_do_invoice")
  private java.lang.Integer lockedDoInvoice;
  /** Description: locked_do_ship. */
  @Basic
  @Column(name = "locked_do_ship")
  private java.lang.Integer lockedDoShip;
  /** Description: price_incl_tax. */
  @Basic
  @Column(name = "price_incl_tax")
  private java.math.BigDecimal priceInclTax;
  /** Description: base_price_incl_tax. */
  @Basic
  @Column(name = "base_price_incl_tax")
  private java.math.BigDecimal basePriceInclTax;
  /** Description: row_total_incl_tax. */
  @Basic
  @Column(name = "row_total_incl_tax")
  private java.math.BigDecimal rowTotalInclTax;
  /** Description: base_row_total_incl_tax. */
  @Basic
  @Column(name = "base_row_total_incl_tax")
  private java.math.BigDecimal baseRowTotalInclTax;
  /** Description: discount_tax_compensation_amount. */
  @Basic
  @Column(name = "discount_tax_compensation_amount")
  private java.math.BigDecimal discountTaxCompensationAmount;
  /** Description: base_discount_tax_compensation_amount. */
  @Basic
  @Column(name = "base_discount_tax_compensation_amount")
  private java.math.BigDecimal baseDiscountTaxCompensationAmount;
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
  /** Description: tax_canceled. */
  @Basic
  @Column(name = "tax_canceled")
  private java.math.BigDecimal taxCanceled;
  /** Description: discount_tax_compensation_canceled. */
  @Basic
  @Column(name = "discount_tax_compensation_canceled")
  private java.math.BigDecimal discountTaxCompensationCanceled;
  /** Description: tax_refunded. */
  @Basic
  @Column(name = "tax_refunded")
  private java.math.BigDecimal taxRefunded;
  /** Description: base_tax_refunded. */
  @Basic
  @Column(name = "base_tax_refunded")
  private java.math.BigDecimal baseTaxRefunded;
  /** Description: discount_refunded. */
  @Basic
  @Column(name = "discount_refunded")
  private java.math.BigDecimal discountRefunded;
  /** Description: base_discount_refunded. */
  @Basic
  @Column(name = "base_discount_refunded")
  private java.math.BigDecimal baseDiscountRefunded;
  /** Description: gift_message_id. */
  @Basic
  @Column(name = "gift_message_id")
  private java.lang.Integer giftMessageId;
  /** Description: gift_message_available. */
  @Basic
  @Column(name = "gift_message_available")
  private java.lang.Integer giftMessageAvailable;
  /** Description: free_shipping. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "free_shipping")
  private java.lang.Integer freeShipping;
  /** Description: weee_tax_applied. */
  @Basic
  @Column(name = "weee_tax_applied", length = 0)
  private java.lang.String weeeTaxApplied;
  /** Description: weee_tax_applied_amount. */
  @Basic
  @Column(name = "weee_tax_applied_amount")
  private java.math.BigDecimal weeeTaxAppliedAmount;
  /** Description: weee_tax_applied_row_amount. */
  @Basic
  @Column(name = "weee_tax_applied_row_amount")
  private java.math.BigDecimal weeeTaxAppliedRowAmount;
  /** Description: weee_tax_disposition. */
  @Basic
  @Column(name = "weee_tax_disposition")
  private java.math.BigDecimal weeeTaxDisposition;
  /** Description: weee_tax_row_disposition. */
  @Basic
  @Column(name = "weee_tax_row_disposition")
  private java.math.BigDecimal weeeTaxRowDisposition;
  /** Description: base_weee_tax_applied_amount. */
  @Basic
  @Column(name = "base_weee_tax_applied_amount")
  private java.math.BigDecimal baseWeeeTaxAppliedAmount;
  /** Description: base_weee_tax_applied_row_amnt. */
  @Basic
  @Column(name = "base_weee_tax_applied_row_amnt")
  private java.math.BigDecimal baseWeeeTaxAppliedRowAmnt;
  /** Description: base_weee_tax_disposition. */
  @Basic
  @Column(name = "base_weee_tax_disposition")
  private java.math.BigDecimal baseWeeeTaxDisposition;
  /** Description: base_weee_tax_row_disposition. */
  @Basic
  @Column(name = "base_weee_tax_row_disposition")
  private java.math.BigDecimal baseWeeeTaxRowDisposition;

  public SalesOrderItem() {}

  public java.lang.Integer getItemId() {
    return this.itemId;
  }

  public void setItemId(java.lang.Integer itemId) {
    this.itemId = itemId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public java.lang.Integer getParentItemId() {
    return this.parentItemId;
  }

  public java.lang.Integer getQuoteItemId() {
    return this.quoteItemId;
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

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.String getProductType() {
    return this.productType;
  }

  public java.lang.String getProductOptions() {
    return this.productOptions;
  }

  public java.math.BigDecimal getWeight() {
    return this.weight;
  }

  public java.lang.Integer getIsVirtual() {
    return this.isVirtual;
  }

  public java.lang.String getSku() {
    return this.sku;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.lang.String getAppliedRuleIds() {
    return this.appliedRuleIds;
  }

  public java.lang.String getAdditionalData() {
    return this.additionalData;
  }

  public java.lang.Integer getIsQtyDecimal() {
    return this.isQtyDecimal;
  }

  public java.lang.Integer getNoDiscount() {
    return this.noDiscount;
  }

  public java.math.BigDecimal getQtyBackordered() {
    return this.qtyBackordered;
  }

  public java.math.BigDecimal getQtyCanceled() {
    return this.qtyCanceled;
  }

  public java.math.BigDecimal getQtyInvoiced() {
    return this.qtyInvoiced;
  }

  public java.math.BigDecimal getQtyOrdered() {
    return this.qtyOrdered;
  }

  public java.math.BigDecimal getQtyRefunded() {
    return this.qtyRefunded;
  }

  public java.math.BigDecimal getQtyShipped() {
    return this.qtyShipped;
  }

  public java.math.BigDecimal getBaseCost() {
    return this.baseCost;
  }

  public java.math.BigDecimal getPrice() {
    return this.price;
  }

  public java.math.BigDecimal getBasePrice() {
    return this.basePrice;
  }

  public java.math.BigDecimal getOriginalPrice() {
    return this.originalPrice;
  }

  public java.math.BigDecimal getBaseOriginalPrice() {
    return this.baseOriginalPrice;
  }

  public java.math.BigDecimal getTaxPercent() {
    return this.taxPercent;
  }

  public java.math.BigDecimal getTaxAmount() {
    return this.taxAmount;
  }

  public java.math.BigDecimal getBaseTaxAmount() {
    return this.baseTaxAmount;
  }

  public java.math.BigDecimal getTaxInvoiced() {
    return this.taxInvoiced;
  }

  public java.math.BigDecimal getBaseTaxInvoiced() {
    return this.baseTaxInvoiced;
  }

  public java.math.BigDecimal getDiscountPercent() {
    return this.discountPercent;
  }

  public java.math.BigDecimal getDiscountAmount() {
    return this.discountAmount;
  }

  public java.math.BigDecimal getBaseDiscountAmount() {
    return this.baseDiscountAmount;
  }

  public java.math.BigDecimal getDiscountInvoiced() {
    return this.discountInvoiced;
  }

  public java.math.BigDecimal getBaseDiscountInvoiced() {
    return this.baseDiscountInvoiced;
  }

  public java.math.BigDecimal getAmountRefunded() {
    return this.amountRefunded;
  }

  public java.math.BigDecimal getBaseAmountRefunded() {
    return this.baseAmountRefunded;
  }

  public java.math.BigDecimal getRowTotal() {
    return this.rowTotal;
  }

  public java.math.BigDecimal getBaseRowTotal() {
    return this.baseRowTotal;
  }

  public java.math.BigDecimal getRowInvoiced() {
    return this.rowInvoiced;
  }

  public java.math.BigDecimal getBaseRowInvoiced() {
    return this.baseRowInvoiced;
  }

  public java.math.BigDecimal getRowWeight() {
    return this.rowWeight;
  }

  public java.math.BigDecimal getBaseTaxBeforeDiscount() {
    return this.baseTaxBeforeDiscount;
  }

  public java.math.BigDecimal getTaxBeforeDiscount() {
    return this.taxBeforeDiscount;
  }

  public java.lang.String getExtOrderItemId() {
    return this.extOrderItemId;
  }

  public java.lang.Integer getLockedDoInvoice() {
    return this.lockedDoInvoice;
  }

  public java.lang.Integer getLockedDoShip() {
    return this.lockedDoShip;
  }

  public java.math.BigDecimal getPriceInclTax() {
    return this.priceInclTax;
  }

  public java.math.BigDecimal getBasePriceInclTax() {
    return this.basePriceInclTax;
  }

  public java.math.BigDecimal getRowTotalInclTax() {
    return this.rowTotalInclTax;
  }

  public java.math.BigDecimal getBaseRowTotalInclTax() {
    return this.baseRowTotalInclTax;
  }

  public java.math.BigDecimal getDiscountTaxCompensationAmount() {
    return this.discountTaxCompensationAmount;
  }

  public java.math.BigDecimal getBaseDiscountTaxCompensationAmount() {
    return this.baseDiscountTaxCompensationAmount;
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

  public java.math.BigDecimal getTaxCanceled() {
    return this.taxCanceled;
  }

  public java.math.BigDecimal getDiscountTaxCompensationCanceled() {
    return this.discountTaxCompensationCanceled;
  }

  public java.math.BigDecimal getTaxRefunded() {
    return this.taxRefunded;
  }

  public java.math.BigDecimal getBaseTaxRefunded() {
    return this.baseTaxRefunded;
  }

  public java.math.BigDecimal getDiscountRefunded() {
    return this.discountRefunded;
  }

  public java.math.BigDecimal getBaseDiscountRefunded() {
    return this.baseDiscountRefunded;
  }

  public java.lang.Integer getGiftMessageId() {
    return this.giftMessageId;
  }

  public java.lang.Integer getGiftMessageAvailable() {
    return this.giftMessageAvailable;
  }

  public java.lang.Integer getFreeShipping() {
    return this.freeShipping;
  }

  public java.lang.String getWeeeTaxApplied() {
    return this.weeeTaxApplied;
  }

  public java.math.BigDecimal getWeeeTaxAppliedAmount() {
    return this.weeeTaxAppliedAmount;
  }

  public java.math.BigDecimal getWeeeTaxAppliedRowAmount() {
    return this.weeeTaxAppliedRowAmount;
  }

  public java.math.BigDecimal getWeeeTaxDisposition() {
    return this.weeeTaxDisposition;
  }

  public java.math.BigDecimal getWeeeTaxRowDisposition() {
    return this.weeeTaxRowDisposition;
  }

  public java.math.BigDecimal getBaseWeeeTaxAppliedAmount() {
    return this.baseWeeeTaxAppliedAmount;
  }

  public java.math.BigDecimal getBaseWeeeTaxAppliedRowAmnt() {
    return this.baseWeeeTaxAppliedRowAmnt;
  }

  public java.math.BigDecimal getBaseWeeeTaxDisposition() {
    return this.baseWeeeTaxDisposition;
  }

  public java.math.BigDecimal getBaseWeeeTaxRowDisposition() {
    return this.baseWeeeTaxRowDisposition;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public void setParentItemId(java.lang.Integer parentItemId) {
    this.parentItemId = parentItemId;
  }

  public void setQuoteItemId(java.lang.Integer quoteItemId) {
    this.quoteItemId = quoteItemId;
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

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setProductType(java.lang.String productType) {
    this.productType = productType;
  }

  public void setProductOptions(java.lang.String productOptions) {
    this.productOptions = productOptions;
  }

  public void setWeight(java.math.BigDecimal weight) {
    this.weight = weight;
  }

  public void setIsVirtual(java.lang.Integer isVirtual) {
    this.isVirtual = isVirtual;
  }

  public void setSku(java.lang.String sku) {
    this.sku = sku;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setAppliedRuleIds(java.lang.String appliedRuleIds) {
    this.appliedRuleIds = appliedRuleIds;
  }

  public void setAdditionalData(java.lang.String additionalData) {
    this.additionalData = additionalData;
  }

  public void setIsQtyDecimal(java.lang.Integer isQtyDecimal) {
    this.isQtyDecimal = isQtyDecimal;
  }

  public void setNoDiscount(java.lang.Integer noDiscount) {
    this.noDiscount = noDiscount;
  }

  public void setQtyBackordered(java.math.BigDecimal qtyBackordered) {
    this.qtyBackordered = qtyBackordered;
  }

  public void setQtyCanceled(java.math.BigDecimal qtyCanceled) {
    this.qtyCanceled = qtyCanceled;
  }

  public void setQtyInvoiced(java.math.BigDecimal qtyInvoiced) {
    this.qtyInvoiced = qtyInvoiced;
  }

  public void setQtyOrdered(java.math.BigDecimal qtyOrdered) {
    this.qtyOrdered = qtyOrdered;
  }

  public void setQtyRefunded(java.math.BigDecimal qtyRefunded) {
    this.qtyRefunded = qtyRefunded;
  }

  public void setQtyShipped(java.math.BigDecimal qtyShipped) {
    this.qtyShipped = qtyShipped;
  }

  public void setBaseCost(java.math.BigDecimal baseCost) {
    this.baseCost = baseCost;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }

  public void setBasePrice(java.math.BigDecimal basePrice) {
    this.basePrice = basePrice;
  }

  public void setOriginalPrice(java.math.BigDecimal originalPrice) {
    this.originalPrice = originalPrice;
  }

  public void setBaseOriginalPrice(java.math.BigDecimal baseOriginalPrice) {
    this.baseOriginalPrice = baseOriginalPrice;
  }

  public void setTaxPercent(java.math.BigDecimal taxPercent) {
    this.taxPercent = taxPercent;
  }

  public void setTaxAmount(java.math.BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public void setBaseTaxAmount(java.math.BigDecimal baseTaxAmount) {
    this.baseTaxAmount = baseTaxAmount;
  }

  public void setTaxInvoiced(java.math.BigDecimal taxInvoiced) {
    this.taxInvoiced = taxInvoiced;
  }

  public void setBaseTaxInvoiced(java.math.BigDecimal baseTaxInvoiced) {
    this.baseTaxInvoiced = baseTaxInvoiced;
  }

  public void setDiscountPercent(java.math.BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }

  public void setDiscountAmount(java.math.BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public void setBaseDiscountAmount(java.math.BigDecimal baseDiscountAmount) {
    this.baseDiscountAmount = baseDiscountAmount;
  }

  public void setDiscountInvoiced(java.math.BigDecimal discountInvoiced) {
    this.discountInvoiced = discountInvoiced;
  }

  public void setBaseDiscountInvoiced(java.math.BigDecimal baseDiscountInvoiced) {
    this.baseDiscountInvoiced = baseDiscountInvoiced;
  }

  public void setAmountRefunded(java.math.BigDecimal amountRefunded) {
    this.amountRefunded = amountRefunded;
  }

  public void setBaseAmountRefunded(java.math.BigDecimal baseAmountRefunded) {
    this.baseAmountRefunded = baseAmountRefunded;
  }

  public void setRowTotal(java.math.BigDecimal rowTotal) {
    this.rowTotal = rowTotal;
  }

  public void setBaseRowTotal(java.math.BigDecimal baseRowTotal) {
    this.baseRowTotal = baseRowTotal;
  }

  public void setRowInvoiced(java.math.BigDecimal rowInvoiced) {
    this.rowInvoiced = rowInvoiced;
  }

  public void setBaseRowInvoiced(java.math.BigDecimal baseRowInvoiced) {
    this.baseRowInvoiced = baseRowInvoiced;
  }

  public void setRowWeight(java.math.BigDecimal rowWeight) {
    this.rowWeight = rowWeight;
  }

  public void setBaseTaxBeforeDiscount(java.math.BigDecimal baseTaxBeforeDiscount) {
    this.baseTaxBeforeDiscount = baseTaxBeforeDiscount;
  }

  public void setTaxBeforeDiscount(java.math.BigDecimal taxBeforeDiscount) {
    this.taxBeforeDiscount = taxBeforeDiscount;
  }

  public void setExtOrderItemId(java.lang.String extOrderItemId) {
    this.extOrderItemId = extOrderItemId;
  }

  public void setLockedDoInvoice(java.lang.Integer lockedDoInvoice) {
    this.lockedDoInvoice = lockedDoInvoice;
  }

  public void setLockedDoShip(java.lang.Integer lockedDoShip) {
    this.lockedDoShip = lockedDoShip;
  }

  public void setPriceInclTax(java.math.BigDecimal priceInclTax) {
    this.priceInclTax = priceInclTax;
  }

  public void setBasePriceInclTax(java.math.BigDecimal basePriceInclTax) {
    this.basePriceInclTax = basePriceInclTax;
  }

  public void setRowTotalInclTax(java.math.BigDecimal rowTotalInclTax) {
    this.rowTotalInclTax = rowTotalInclTax;
  }

  public void setBaseRowTotalInclTax(java.math.BigDecimal baseRowTotalInclTax) {
    this.baseRowTotalInclTax = baseRowTotalInclTax;
  }

  public void setDiscountTaxCompensationAmount(java.math.BigDecimal discountTaxCompensationAmount) {
    this.discountTaxCompensationAmount = discountTaxCompensationAmount;
  }

  public void setBaseDiscountTaxCompensationAmount(
      java.math.BigDecimal baseDiscountTaxCompensationAmount) {
    this.baseDiscountTaxCompensationAmount = baseDiscountTaxCompensationAmount;
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

  public void setTaxCanceled(java.math.BigDecimal taxCanceled) {
    this.taxCanceled = taxCanceled;
  }

  public void setDiscountTaxCompensationCanceled(
      java.math.BigDecimal discountTaxCompensationCanceled) {
    this.discountTaxCompensationCanceled = discountTaxCompensationCanceled;
  }

  public void setTaxRefunded(java.math.BigDecimal taxRefunded) {
    this.taxRefunded = taxRefunded;
  }

  public void setBaseTaxRefunded(java.math.BigDecimal baseTaxRefunded) {
    this.baseTaxRefunded = baseTaxRefunded;
  }

  public void setDiscountRefunded(java.math.BigDecimal discountRefunded) {
    this.discountRefunded = discountRefunded;
  }

  public void setBaseDiscountRefunded(java.math.BigDecimal baseDiscountRefunded) {
    this.baseDiscountRefunded = baseDiscountRefunded;
  }

  public void setGiftMessageId(java.lang.Integer giftMessageId) {
    this.giftMessageId = giftMessageId;
  }

  public void setGiftMessageAvailable(java.lang.Integer giftMessageAvailable) {
    this.giftMessageAvailable = giftMessageAvailable;
  }

  public void setFreeShipping(java.lang.Integer freeShipping) {
    this.freeShipping = freeShipping;
  }

  public void setWeeeTaxApplied(java.lang.String weeeTaxApplied) {
    this.weeeTaxApplied = weeeTaxApplied;
  }

  public void setWeeeTaxAppliedAmount(java.math.BigDecimal weeeTaxAppliedAmount) {
    this.weeeTaxAppliedAmount = weeeTaxAppliedAmount;
  }

  public void setWeeeTaxAppliedRowAmount(java.math.BigDecimal weeeTaxAppliedRowAmount) {
    this.weeeTaxAppliedRowAmount = weeeTaxAppliedRowAmount;
  }

  public void setWeeeTaxDisposition(java.math.BigDecimal weeeTaxDisposition) {
    this.weeeTaxDisposition = weeeTaxDisposition;
  }

  public void setWeeeTaxRowDisposition(java.math.BigDecimal weeeTaxRowDisposition) {
    this.weeeTaxRowDisposition = weeeTaxRowDisposition;
  }

  public void setBaseWeeeTaxAppliedAmount(java.math.BigDecimal baseWeeeTaxAppliedAmount) {
    this.baseWeeeTaxAppliedAmount = baseWeeeTaxAppliedAmount;
  }

  public void setBaseWeeeTaxAppliedRowAmnt(java.math.BigDecimal baseWeeeTaxAppliedRowAmnt) {
    this.baseWeeeTaxAppliedRowAmnt = baseWeeeTaxAppliedRowAmnt;
  }

  public void setBaseWeeeTaxDisposition(java.math.BigDecimal baseWeeeTaxDisposition) {
    this.baseWeeeTaxDisposition = baseWeeeTaxDisposition;
  }

  public void setBaseWeeeTaxRowDisposition(java.math.BigDecimal baseWeeeTaxRowDisposition) {
    this.baseWeeeTaxRowDisposition = baseWeeeTaxRowDisposition;
  }
}
