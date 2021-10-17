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

/**
 * embeddable class Id for CatalogProductLinkAttributeInt. generated on 10/16/2021 from a schema.
 */
public class CatalogProductLinkAttributeIntId implements Serializable {
  private static final long serialVersionUID = 163445090430886311L;

  @Column(name = "product_link_attribute_id")
  private java.lang.Integer productLinkAttributeId;

  @Column(name = "value_id")
  private java.lang.Integer valueId;

  @Column(name = "link_id")
  private java.lang.Integer linkId;

  /** Constructor: CatalogProductLinkAttributeIntId. */
  public CatalogProductLinkAttributeIntId() {}

  /**
   * Constructor: CatalogProductLinkAttributeIntId.
   *
   * @param productLinkAttributeId - productLinkAttributeId.
   * @param valueId - valueId.
   * @param linkId - linkId.
   */
  public CatalogProductLinkAttributeIntId(
      java.lang.Integer productLinkAttributeId,
      java.lang.Integer valueId,
      java.lang.Integer linkId) {
    this.productLinkAttributeId = productLinkAttributeId;
    this.valueId = valueId;
    this.linkId = linkId;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result + ((productLinkAttributeId == null) ? 0 : productLinkAttributeId.hashCode());
    result = prime * result + ((valueId == null) ? 0 : valueId.hashCode());
    result = prime * result + ((linkId == null) ? 0 : linkId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductLinkAttributeIntId other = (CatalogProductLinkAttributeIntId) obj;

    if (productLinkAttributeId == null) {
      if (other.productLinkAttributeId != null) return false;
    } else if (!productLinkAttributeId.equals(other.productLinkAttributeId)) return false;

    if (valueId == null) {
      if (other.valueId != null) return false;
    } else if (!valueId.equals(other.valueId)) return false;

    if (linkId == null) {
      if (other.linkId != null) return false;
    } else if (!linkId.equals(other.linkId)) return false;

    return true;
  }
}
