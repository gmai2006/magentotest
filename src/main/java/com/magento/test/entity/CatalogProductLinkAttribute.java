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
@Table(name = "catalog_product_link_attribute")
public class CatalogProductLinkAttribute implements Serializable {
  private static final long serialVersionUID = 163445090429183481L;

  /** Description: product_link_attribute_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_link_attribute_id")
  private java.lang.Integer productLinkAttributeId;

  /** Description: link_type_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "link_type_id")
  private java.lang.Integer linkTypeId;
  /** Description: product_link_attribute_code. */
  @Basic
  @Column(name = "product_link_attribute_code", length = 32)
  private java.lang.String productLinkAttributeCode;
  /** Description: data_type. */
  @Basic
  @Column(name = "data_type", length = 32)
  private java.lang.String dataType;

  public CatalogProductLinkAttribute() {}

  public java.lang.Integer getProductLinkAttributeId() {
    return this.productLinkAttributeId;
  }

  public void setProductLinkAttributeId(java.lang.Integer productLinkAttributeId) {
    this.productLinkAttributeId = productLinkAttributeId;
  }

  public java.lang.Integer getLinkTypeId() {
    return this.linkTypeId;
  }

  public java.lang.String getProductLinkAttributeCode() {
    return this.productLinkAttributeCode;
  }

  public java.lang.String getDataType() {
    return this.dataType;
  }

  public void setLinkTypeId(java.lang.Integer linkTypeId) {
    this.linkTypeId = linkTypeId;
  }

  public void setProductLinkAttributeCode(java.lang.String productLinkAttributeCode) {
    this.productLinkAttributeCode = productLinkAttributeCode;
  }

  public void setDataType(java.lang.String dataType) {
    this.dataType = dataType;
  }
}
