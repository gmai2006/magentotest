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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** embeddable class Id for CatalogProductSuperAttribute. generated on 10/16/2021 from a schema. */
public class CatalogProductSuperAttributeId implements Serializable {
  private static final long serialVersionUID = 163445090442846739L;

  @Column(name = "product_super_attribute_id")
  private java.lang.Integer productSuperAttributeId;

  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  /** Constructor: CatalogProductSuperAttributeId. */
  public CatalogProductSuperAttributeId() {}

  /**
   * Constructor: CatalogProductSuperAttributeId.
   *
   * @param productSuperAttributeId - productSuperAttributeId.
   * @param attributeId - attributeId.
   * @param productId - productId.
   */
  public CatalogProductSuperAttributeId(
      java.lang.Integer productSuperAttributeId,
      java.lang.Integer attributeId,
      java.lang.Integer productId) {
    this.productSuperAttributeId = productSuperAttributeId;
    this.attributeId = attributeId;
    this.productId = productId;
  }

  public java.lang.Integer getProductSuperAttributeId() {
    return this.productSuperAttributeId;
  }

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public void setProductSuperAttributeId(java.lang.Integer productSuperAttributeId) {
    this.productSuperAttributeId = productSuperAttributeId;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result
            + ((productSuperAttributeId == null) ? 0 : productSuperAttributeId.hashCode());
    result = prime * result + ((attributeId == null) ? 0 : attributeId.hashCode());
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductSuperAttributeId other = (CatalogProductSuperAttributeId) obj;

    if (productSuperAttributeId == null) {
      if (other.productSuperAttributeId != null) return false;
    } else if (!productSuperAttributeId.equals(other.productSuperAttributeId)) return false;

    if (attributeId == null) {
      if (other.attributeId != null) return false;
    } else if (!attributeId.equals(other.attributeId)) return false;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    return true;
  }
}
