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
@IdClass(CatalogProductBundleSelectionPriceId.class)
@Table(name = "catalog_product_bundle_selection_price")
public class CatalogProductBundleSelectionPrice implements Serializable {
  private static final long serialVersionUID = 163445090360211276L;

  /** Description: parent_product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "parent_product_id")
  private java.lang.Integer parentProductId;
  /** Description: selection_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "selection_id")
  private java.lang.Integer selectionId;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "website_id")
  private java.lang.Integer websiteId;

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

  public CatalogProductBundleSelectionPrice() {}

  public java.lang.Integer getParentProductId() {
    return this.parentProductId;
  }

  public java.lang.Integer getSelectionId() {
    return this.selectionId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setParentProductId(java.lang.Integer parentProductId) {
    this.parentProductId = parentProductId;
  }

  public void setSelectionId(java.lang.Integer selectionId) {
    this.selectionId = selectionId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public java.lang.Integer getSelectionPriceType() {
    return this.selectionPriceType;
  }

  public java.math.BigDecimal getSelectionPriceValue() {
    return this.selectionPriceValue;
  }

  public void setSelectionPriceType(java.lang.Integer selectionPriceType) {
    this.selectionPriceType = selectionPriceType;
  }

  public void setSelectionPriceValue(java.math.BigDecimal selectionPriceValue) {
    this.selectionPriceValue = selectionPriceValue;
  }
}
