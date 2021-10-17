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
@IdClass(CatalogProductSuperAttributeLabelId.class)
@Table(name = "catalog_product_super_attribute_label")
public class CatalogProductSuperAttributeLabel implements Serializable {
  private static final long serialVersionUID = 163445090444778901L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: product_super_attribute_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_super_attribute_id")
  private java.lang.Integer productSuperAttributeId;
  /** Description: value_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "value_id")
  private java.lang.Integer valueId;

  /** Description: use_default. */
  @Basic
  @Column(name = "use_default")
  private java.lang.Integer useDefault;
  /** Description: value. */
  @Basic
  @Column(name = "value", length = 255)
  private java.lang.String value;

  public CatalogProductSuperAttributeLabel() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getProductSuperAttributeId() {
    return this.productSuperAttributeId;
  }

  public java.lang.Integer getValueId() {
    return this.valueId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setProductSuperAttributeId(java.lang.Integer productSuperAttributeId) {
    this.productSuperAttributeId = productSuperAttributeId;
  }

  public void setValueId(java.lang.Integer valueId) {
    this.valueId = valueId;
  }

  public java.lang.Integer getUseDefault() {
    return this.useDefault;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setUseDefault(java.lang.Integer useDefault) {
    this.useDefault = useDefault;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }
}
