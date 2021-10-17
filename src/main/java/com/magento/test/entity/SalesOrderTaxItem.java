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
@IdClass(SalesOrderTaxItemId.class)
@Table(name = "sales_order_tax_item")
public class SalesOrderTaxItem implements Serializable {
  private static final long serialVersionUID = 163445090662977194L;

  /** Description: item_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "item_id")
  private java.lang.Integer itemId;
  /** Description: tax_item_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "tax_item_id")
  private java.lang.Integer taxItemId;
  /** Description: tax_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "tax_id")
  private java.lang.Integer taxId;

  /** Description: tax_percent. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "tax_percent")
  private java.math.BigDecimal taxPercent;
  /** Description: amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "amount")
  private java.math.BigDecimal amount;
  /** Description: base_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "base_amount")
  private java.math.BigDecimal baseAmount;
  /** Description: real_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "real_amount")
  private java.math.BigDecimal realAmount;
  /** Description: real_base_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "real_base_amount")
  private java.math.BigDecimal realBaseAmount;
  /** Description: associated_item_id. */
  @Basic
  @Column(name = "associated_item_id")
  private java.lang.Integer associatedItemId;
  /** Description: taxable_item_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "taxable_item_type", length = 32)
  private java.lang.String taxableItemType;

  public SalesOrderTaxItem() {}

  public java.lang.Integer getItemId() {
    return this.itemId;
  }

  public java.lang.Integer getTaxItemId() {
    return this.taxItemId;
  }

  public java.lang.Integer getTaxId() {
    return this.taxId;
  }

  public void setItemId(java.lang.Integer itemId) {
    this.itemId = itemId;
  }

  public void setTaxItemId(java.lang.Integer taxItemId) {
    this.taxItemId = taxItemId;
  }

  public void setTaxId(java.lang.Integer taxId) {
    this.taxId = taxId;
  }

  public java.math.BigDecimal getTaxPercent() {
    return this.taxPercent;
  }

  public java.math.BigDecimal getAmount() {
    return this.amount;
  }

  public java.math.BigDecimal getBaseAmount() {
    return this.baseAmount;
  }

  public java.math.BigDecimal getRealAmount() {
    return this.realAmount;
  }

  public java.math.BigDecimal getRealBaseAmount() {
    return this.realBaseAmount;
  }

  public java.lang.Integer getAssociatedItemId() {
    return this.associatedItemId;
  }

  public java.lang.String getTaxableItemType() {
    return this.taxableItemType;
  }

  public void setTaxPercent(java.math.BigDecimal taxPercent) {
    this.taxPercent = taxPercent;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public void setBaseAmount(java.math.BigDecimal baseAmount) {
    this.baseAmount = baseAmount;
  }

  public void setRealAmount(java.math.BigDecimal realAmount) {
    this.realAmount = realAmount;
  }

  public void setRealBaseAmount(java.math.BigDecimal realBaseAmount) {
    this.realBaseAmount = realBaseAmount;
  }

  public void setAssociatedItemId(java.lang.Integer associatedItemId) {
    this.associatedItemId = associatedItemId;
  }

  public void setTaxableItemType(java.lang.String taxableItemType) {
    this.taxableItemType = taxableItemType;
  }
}
