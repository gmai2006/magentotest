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
@Table(name = "quote_address_item")
public class QuoteAddressItem implements Serializable {
  private static final long serialVersionUID = 163445090594964086L;

  /** Description: address_item_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "address_item_id")
  private java.lang.Integer addressItemId;

  /** Description: parent_item_id. */
  @Basic
  @Column(name = "parent_item_id")
  private java.lang.Integer parentItemId;
  /** Description: quote_address_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "quote_address_id")
  private java.lang.Integer quoteAddressId;
  /** Description: quote_item_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "quote_item_id")
  private java.lang.Integer quoteItemId;
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
  /** Description: applied_rule_ids. */
  @Basic
  @Column(name = "applied_rule_ids", length = 0)
  private java.lang.String appliedRuleIds;
  /** Description: additional_data. */
  @Basic
  @Column(name = "additional_data", length = 0)
  private java.lang.String additionalData;
  /** Description: weight. */
  @Basic
  @Column(name = "weight")
  private java.math.BigDecimal weight;
  /** Description: qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "qty")
  private java.math.BigDecimal qty;
  /** Description: discount_amount. */
  @Basic
  @Column(name = "discount_amount")
  private java.math.BigDecimal discountAmount;
  /** Description: tax_amount. */
  @Basic
  @Column(name = "tax_amount")
  private java.math.BigDecimal taxAmount;
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
  /** Description: row_total_with_discount. */
  @Basic
  @Column(name = "row_total_with_discount")
  private java.math.BigDecimal rowTotalWithDiscount;
  /** Description: base_discount_amount. */
  @Basic
  @Column(name = "base_discount_amount")
  private java.math.BigDecimal baseDiscountAmount;
  /** Description: base_tax_amount. */
  @Basic
  @Column(name = "base_tax_amount")
  private java.math.BigDecimal baseTaxAmount;
  /** Description: row_weight. */
  @Basic
  @Column(name = "row_weight")
  private java.math.BigDecimal rowWeight;
  /** Description: product_id. */
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: super_product_id. */
  @Basic
  @Column(name = "super_product_id")
  private java.lang.Integer superProductId;
  /** Description: parent_product_id. */
  @Basic
  @Column(name = "parent_product_id")
  private java.lang.Integer parentProductId;
  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: sku. */
  @Basic
  @Column(name = "sku", length = 255)
  private java.lang.String sku;
  /** Description: image. */
  @Basic
  @Column(name = "image", length = 255)
  private java.lang.String image;
  /** Description: name. */
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 0)
  private java.lang.String description;
  /** Description: is_qty_decimal. */
  @Basic
  @Column(name = "is_qty_decimal")
  private java.lang.Integer isQtyDecimal;
  /** Description: price. */
  @Basic
  @Column(name = "price")
  private java.math.BigDecimal price;
  /** Description: discount_percent. */
  @Basic
  @Column(name = "discount_percent")
  private java.math.BigDecimal discountPercent;
  /** Description: no_discount. */
  @Basic
  @Column(name = "no_discount")
  private java.lang.Integer noDiscount;
  /** Description: tax_percent. */
  @Basic
  @Column(name = "tax_percent")
  private java.math.BigDecimal taxPercent;
  /** Description: base_price. */
  @Basic
  @Column(name = "base_price")
  private java.math.BigDecimal basePrice;
  /** Description: base_cost. */
  @Basic
  @Column(name = "base_cost")
  private java.math.BigDecimal baseCost;
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
  /** Description: gift_message_id. */
  @Basic
  @Column(name = "gift_message_id")
  private java.lang.Integer giftMessageId;
  /** Description: free_shipping. */
  @Basic
  @Column(name = "free_shipping")
  private java.lang.Integer freeShipping;

  public QuoteAddressItem() {}

  public java.lang.Integer getAddressItemId() {
    return this.addressItemId;
  }

  public void setAddressItemId(java.lang.Integer addressItemId) {
    this.addressItemId = addressItemId;
  }

  public java.lang.Integer getParentItemId() {
    return this.parentItemId;
  }

  public java.lang.Integer getQuoteAddressId() {
    return this.quoteAddressId;
  }

  public java.lang.Integer getQuoteItemId() {
    return this.quoteItemId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.String getAppliedRuleIds() {
    return this.appliedRuleIds;
  }

  public java.lang.String getAdditionalData() {
    return this.additionalData;
  }

  public java.math.BigDecimal getWeight() {
    return this.weight;
  }

  public java.math.BigDecimal getQty() {
    return this.qty;
  }

  public java.math.BigDecimal getDiscountAmount() {
    return this.discountAmount;
  }

  public java.math.BigDecimal getTaxAmount() {
    return this.taxAmount;
  }

  public java.math.BigDecimal getRowTotal() {
    return this.rowTotal;
  }

  public java.math.BigDecimal getBaseRowTotal() {
    return this.baseRowTotal;
  }

  public java.math.BigDecimal getRowTotalWithDiscount() {
    return this.rowTotalWithDiscount;
  }

  public java.math.BigDecimal getBaseDiscountAmount() {
    return this.baseDiscountAmount;
  }

  public java.math.BigDecimal getBaseTaxAmount() {
    return this.baseTaxAmount;
  }

  public java.math.BigDecimal getRowWeight() {
    return this.rowWeight;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getSuperProductId() {
    return this.superProductId;
  }

  public java.lang.Integer getParentProductId() {
    return this.parentProductId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getSku() {
    return this.sku;
  }

  public java.lang.String getImage() {
    return this.image;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.lang.Integer getIsQtyDecimal() {
    return this.isQtyDecimal;
  }

  public java.math.BigDecimal getPrice() {
    return this.price;
  }

  public java.math.BigDecimal getDiscountPercent() {
    return this.discountPercent;
  }

  public java.lang.Integer getNoDiscount() {
    return this.noDiscount;
  }

  public java.math.BigDecimal getTaxPercent() {
    return this.taxPercent;
  }

  public java.math.BigDecimal getBasePrice() {
    return this.basePrice;
  }

  public java.math.BigDecimal getBaseCost() {
    return this.baseCost;
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

  public java.lang.Integer getGiftMessageId() {
    return this.giftMessageId;
  }

  public java.lang.Integer getFreeShipping() {
    return this.freeShipping;
  }

  public void setParentItemId(java.lang.Integer parentItemId) {
    this.parentItemId = parentItemId;
  }

  public void setQuoteAddressId(java.lang.Integer quoteAddressId) {
    this.quoteAddressId = quoteAddressId;
  }

  public void setQuoteItemId(java.lang.Integer quoteItemId) {
    this.quoteItemId = quoteItemId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setAppliedRuleIds(java.lang.String appliedRuleIds) {
    this.appliedRuleIds = appliedRuleIds;
  }

  public void setAdditionalData(java.lang.String additionalData) {
    this.additionalData = additionalData;
  }

  public void setWeight(java.math.BigDecimal weight) {
    this.weight = weight;
  }

  public void setQty(java.math.BigDecimal qty) {
    this.qty = qty;
  }

  public void setDiscountAmount(java.math.BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public void setTaxAmount(java.math.BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public void setRowTotal(java.math.BigDecimal rowTotal) {
    this.rowTotal = rowTotal;
  }

  public void setBaseRowTotal(java.math.BigDecimal baseRowTotal) {
    this.baseRowTotal = baseRowTotal;
  }

  public void setRowTotalWithDiscount(java.math.BigDecimal rowTotalWithDiscount) {
    this.rowTotalWithDiscount = rowTotalWithDiscount;
  }

  public void setBaseDiscountAmount(java.math.BigDecimal baseDiscountAmount) {
    this.baseDiscountAmount = baseDiscountAmount;
  }

  public void setBaseTaxAmount(java.math.BigDecimal baseTaxAmount) {
    this.baseTaxAmount = baseTaxAmount;
  }

  public void setRowWeight(java.math.BigDecimal rowWeight) {
    this.rowWeight = rowWeight;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setSuperProductId(java.lang.Integer superProductId) {
    this.superProductId = superProductId;
  }

  public void setParentProductId(java.lang.Integer parentProductId) {
    this.parentProductId = parentProductId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setSku(java.lang.String sku) {
    this.sku = sku;
  }

  public void setImage(java.lang.String image) {
    this.image = image;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setIsQtyDecimal(java.lang.Integer isQtyDecimal) {
    this.isQtyDecimal = isQtyDecimal;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }

  public void setDiscountPercent(java.math.BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }

  public void setNoDiscount(java.lang.Integer noDiscount) {
    this.noDiscount = noDiscount;
  }

  public void setTaxPercent(java.math.BigDecimal taxPercent) {
    this.taxPercent = taxPercent;
  }

  public void setBasePrice(java.math.BigDecimal basePrice) {
    this.basePrice = basePrice;
  }

  public void setBaseCost(java.math.BigDecimal baseCost) {
    this.baseCost = baseCost;
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

  public void setGiftMessageId(java.lang.Integer giftMessageId) {
    this.giftMessageId = giftMessageId;
  }

  public void setFreeShipping(java.lang.Integer freeShipping) {
    this.freeShipping = freeShipping;
  }
}
