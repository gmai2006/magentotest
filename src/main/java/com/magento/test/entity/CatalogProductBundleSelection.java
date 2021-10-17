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
@Table(name = "catalog_product_bundle_selection")
public class CatalogProductBundleSelection implements Serializable {
  private static final long serialVersionUID = 163445090357914809L;

  /** Description: selection_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "selection_id")
  private java.lang.Integer selectionId;

  /** Description: option_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "option_id")
  private java.lang.Integer optionId;
  /** Description: parent_product_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "parent_product_id")
  private java.lang.Integer parentProductId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: position. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "position")
  private java.lang.Integer position;
  /** Description: is_default. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_default")
  private java.lang.Integer isDefault;
  /** Description: selection_price_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "selection_price_type")
  private java.lang.Integer selectionPriceType;
  /** Description: selection_price_value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "selection_price_value")
  private java.math.BigDecimal selectionPriceValue;
  /** Description: selection_qty. */
  @Basic
  @Column(name = "selection_qty")
  private java.math.BigDecimal selectionQty;
  /** Description: selection_can_change_qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "selection_can_change_qty")
  private java.lang.Integer selectionCanChangeQty;

  public CatalogProductBundleSelection() {}

  public java.lang.Integer getSelectionId() {
    return this.selectionId;
  }

  public void setSelectionId(java.lang.Integer selectionId) {
    this.selectionId = selectionId;
  }

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public java.lang.Integer getParentProductId() {
    return this.parentProductId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getPosition() {
    return this.position;
  }

  public java.lang.Integer getIsDefault() {
    return this.isDefault;
  }

  public java.lang.Integer getSelectionPriceType() {
    return this.selectionPriceType;
  }

  public java.math.BigDecimal getSelectionPriceValue() {
    return this.selectionPriceValue;
  }

  public java.math.BigDecimal getSelectionQty() {
    return this.selectionQty;
  }

  public java.lang.Integer getSelectionCanChangeQty() {
    return this.selectionCanChangeQty;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public void setParentProductId(java.lang.Integer parentProductId) {
    this.parentProductId = parentProductId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setPosition(java.lang.Integer position) {
    this.position = position;
  }

  public void setIsDefault(java.lang.Integer isDefault) {
    this.isDefault = isDefault;
  }

  public void setSelectionPriceType(java.lang.Integer selectionPriceType) {
    this.selectionPriceType = selectionPriceType;
  }

  public void setSelectionPriceValue(java.math.BigDecimal selectionPriceValue) {
    this.selectionPriceValue = selectionPriceValue;
  }

  public void setSelectionQty(java.math.BigDecimal selectionQty) {
    this.selectionQty = selectionQty;
  }

  public void setSelectionCanChangeQty(java.lang.Integer selectionCanChangeQty) {
    this.selectionCanChangeQty = selectionCanChangeQty;
  }
}
