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

/** embeddable class Id for CatalogProductLink. generated on 10/16/2021 from a schema. */
public class CatalogProductLinkId implements Serializable {
  private static final long serialVersionUID = 163445090427993534L;

  @Column(name = "link_type_id")
  private java.lang.Integer linkTypeId;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  @Column(name = "linked_product_id")
  private java.lang.Integer linkedProductId;

  @Column(name = "link_id")
  private java.lang.Integer linkId;

  /** Constructor: CatalogProductLinkId. */
  public CatalogProductLinkId() {}

  /**
   * Constructor: CatalogProductLinkId.
   *
   * @param linkTypeId - linkTypeId.
   * @param productId - productId.
   * @param linkedProductId - linkedProductId.
   * @param linkId - linkId.
   */
  public CatalogProductLinkId(
      java.lang.Integer linkTypeId,
      java.lang.Integer productId,
      java.lang.Integer linkedProductId,
      java.lang.Integer linkId) {
    this.linkTypeId = linkTypeId;
    this.productId = productId;
    this.linkedProductId = linkedProductId;
    this.linkId = linkId;
  }

  public java.lang.Integer getLinkTypeId() {
    return this.linkTypeId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getLinkedProductId() {
    return this.linkedProductId;
  }

  public java.lang.Integer getLinkId() {
    return this.linkId;
  }

  public void setLinkTypeId(java.lang.Integer linkTypeId) {
    this.linkTypeId = linkTypeId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setLinkedProductId(java.lang.Integer linkedProductId) {
    this.linkedProductId = linkedProductId;
  }

  public void setLinkId(java.lang.Integer linkId) {
    this.linkId = linkId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((linkTypeId == null) ? 0 : linkTypeId.hashCode());
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());
    result = prime * result + ((linkedProductId == null) ? 0 : linkedProductId.hashCode());
    result = prime * result + ((linkId == null) ? 0 : linkId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductLinkId other = (CatalogProductLinkId) obj;

    if (linkTypeId == null) {
      if (other.linkTypeId != null) return false;
    } else if (!linkTypeId.equals(other.linkTypeId)) return false;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    if (linkedProductId == null) {
      if (other.linkedProductId != null) return false;
    } else if (!linkedProductId.equals(other.linkedProductId)) return false;

    if (linkId == null) {
      if (other.linkId != null) return false;
    } else if (!linkId.equals(other.linkId)) return false;

    return true;
  }
}
