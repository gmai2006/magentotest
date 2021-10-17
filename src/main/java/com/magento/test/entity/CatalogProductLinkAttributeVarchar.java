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
@IdClass(CatalogProductLinkAttributeVarcharId.class)
@Table(name = "catalog_product_link_attribute_varchar")
public class CatalogProductLinkAttributeVarchar implements Serializable {
  private static final long serialVersionUID = 163445090433254085L;

  /** Description: product_link_attribute_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_link_attribute_id")
  private java.lang.Integer productLinkAttributeId;
  /** Description: value_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "value_id")
  private java.lang.Integer valueId;
  /** Description: link_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "link_id")
  private java.lang.Integer linkId;

  /** Description: value. */
  @Basic
  @Column(name = "value", length = 255)
  private java.lang.String value;

  public CatalogProductLinkAttributeVarchar() {}

  public java.lang.Integer getProductLinkAttributeId() {
    return this.productLinkAttributeId;
  }

  public java.lang.Integer getValueId() {
    return this.valueId;
  }

  public java.lang.Integer getLinkId() {
    return this.linkId;
  }

  public void setProductLinkAttributeId(java.lang.Integer productLinkAttributeId) {
    this.productLinkAttributeId = productLinkAttributeId;
  }

  public void setValueId(java.lang.Integer valueId) {
    this.valueId = valueId;
  }

  public void setLinkId(java.lang.Integer linkId) {
    this.linkId = linkId;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }
}
