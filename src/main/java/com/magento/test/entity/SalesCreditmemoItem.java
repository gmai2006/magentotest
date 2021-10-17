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
@Table(name = "sales_creditmemo_item")
public class SalesCreditmemoItem implements Serializable {
  private static final long serialVersionUID = 163445090626610850L;

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
  /** Description: base_price. */
  @Basic
  @Column(name = "base_price")
  private java.math.BigDecimal basePrice;
  /** Description: tax_amount. */
  @Basic
  @Column(name = "tax_amount")
  private java.math.BigDecimal taxAmount;
  /** Description: base_row_total. */
  @Basic
  @Column(name = "base_row_total")
  private java.math.BigDecimal baseRowTotal;
  /** Description: discount_amount. */
  @Basic
  @Column(name = "discount_amount")
  private java.math.BigDecimal discountAmount;
  /** Description: row_total. */
  @Basic
  @Column(name = "row_total")
  private java.math.BigDecimal rowTotal;
  /** Description: base_discount_amount. */
  @Basic
  @Column(name = "base_discount_amount")
  private java.math.BigDecimal baseDiscountAmount;
  /** Description: price_incl_tax. */
  @Basic
  @Column(name = "price_incl_tax")
  private java.math.BigDecimal priceInclTax;
  /** Description: base_tax_amount. */
  @Basic
  @Column(name = "base_tax_amount")
  private java.math.BigDecimal baseTaxAmount;
  /** Description: base_price_incl_tax. */
  @Basic
  @Column(name = "base_price_incl_tax")
  private java.math.BigDecimal basePriceInclTax;
  /** Description: qty. */
  @Basic
  @Column(name = "qty")
  private java.math.BigDecimal qty;
  /** Description: base_cost. */
  @Basic
  @Column(name = "base_cost")
  private java.math.BigDecimal baseCost;
  /** Description: price. */
  @Basic
  @Column(name = "price")
  private java.math.BigDecimal price;
  /** Description: base_row_total_incl_tax. */
  @Basic
  @Column(name = "base_row_total_incl_tax")
  private java.math.BigDecimal baseRowTotalInclTax;
  /** Description: row_total_incl_tax. */
  @Basic
  @Column(name = "row_total_incl_tax")
  private java.math.BigDecimal rowTotalInclTax;
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
  /** Description: sku. */
  @Basic
  @Column(name = "sku", length = 255)
  private java.lang.String sku;
  /** Description: name. */
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: discount_tax_compensation_amount. */
  @Basic
  @Column(name = "discount_tax_compensation_amount")
  private java.math.BigDecimal discountTaxCompensationAmount;
  /** Description: base_discount_tax_compensation_amount. */
  @Basic
  @Column(name = "base_discount_tax_compensation_amount")
  private java.math.BigDecimal baseDiscountTaxCompensationAmount;
  /** Description: tax_ratio. */
  @Basic
  @Column(name = "tax_ratio", length = 0)
  private java.lang.String taxRatio;
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

  public SalesCreditmemoItem() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.math.BigDecimal getBasePrice() {
    return this.basePrice;
  }

  public java.math.BigDecimal getTaxAmount() {
    return this.taxAmount;
  }

  public java.math.BigDecimal getBaseRowTotal() {
    return this.baseRowTotal;
  }

  public java.math.BigDecimal getDiscountAmount() {
    return this.discountAmount;
  }

  public java.math.BigDecimal getRowTotal() {
    return this.rowTotal;
  }

  public java.math.BigDecimal getBaseDiscountAmount() {
    return this.baseDiscountAmount;
  }

  public java.math.BigDecimal getPriceInclTax() {
    return this.priceInclTax;
  }

  public java.math.BigDecimal getBaseTaxAmount() {
    return this.baseTaxAmount;
  }

  public java.math.BigDecimal getBasePriceInclTax() {
    return this.basePriceInclTax;
  }

  public java.math.BigDecimal getQty() {
    return this.qty;
  }

  public java.math.BigDecimal getBaseCost() {
    return this.baseCost;
  }

  public java.math.BigDecimal getPrice() {
    return this.price;
  }

  public java.math.BigDecimal getBaseRowTotalInclTax() {
    return this.baseRowTotalInclTax;
  }

  public java.math.BigDecimal getRowTotalInclTax() {
    return this.rowTotalInclTax;
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

  public java.lang.String getSku() {
    return this.sku;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.math.BigDecimal getDiscountTaxCompensationAmount() {
    return this.discountTaxCompensationAmount;
  }

  public java.math.BigDecimal getBaseDiscountTaxCompensationAmount() {
    return this.baseDiscountTaxCompensationAmount;
  }

  public java.lang.String getTaxRatio() {
    return this.taxRatio;
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

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setBasePrice(java.math.BigDecimal basePrice) {
    this.basePrice = basePrice;
  }

  public void setTaxAmount(java.math.BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public void setBaseRowTotal(java.math.BigDecimal baseRowTotal) {
    this.baseRowTotal = baseRowTotal;
  }

  public void setDiscountAmount(java.math.BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public void setRowTotal(java.math.BigDecimal rowTotal) {
    this.rowTotal = rowTotal;
  }

  public void setBaseDiscountAmount(java.math.BigDecimal baseDiscountAmount) {
    this.baseDiscountAmount = baseDiscountAmount;
  }

  public void setPriceInclTax(java.math.BigDecimal priceInclTax) {
    this.priceInclTax = priceInclTax;
  }

  public void setBaseTaxAmount(java.math.BigDecimal baseTaxAmount) {
    this.baseTaxAmount = baseTaxAmount;
  }

  public void setBasePriceInclTax(java.math.BigDecimal basePriceInclTax) {
    this.basePriceInclTax = basePriceInclTax;
  }

  public void setQty(java.math.BigDecimal qty) {
    this.qty = qty;
  }

  public void setBaseCost(java.math.BigDecimal baseCost) {
    this.baseCost = baseCost;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }

  public void setBaseRowTotalInclTax(java.math.BigDecimal baseRowTotalInclTax) {
    this.baseRowTotalInclTax = baseRowTotalInclTax;
  }

  public void setRowTotalInclTax(java.math.BigDecimal rowTotalInclTax) {
    this.rowTotalInclTax = rowTotalInclTax;
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

  public void setSku(java.lang.String sku) {
    this.sku = sku;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setDiscountTaxCompensationAmount(java.math.BigDecimal discountTaxCompensationAmount) {
    this.discountTaxCompensationAmount = discountTaxCompensationAmount;
  }

  public void setBaseDiscountTaxCompensationAmount(
      java.math.BigDecimal baseDiscountTaxCompensationAmount) {
    this.baseDiscountTaxCompensationAmount = baseDiscountTaxCompensationAmount;
  }

  public void setTaxRatio(java.lang.String taxRatio) {
    this.taxRatio = taxRatio;
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
