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

/** embeddable class Id for CatalogProductSuperLink. generated on 10/16/2021 from a schema. */
public class CatalogProductSuperLinkId implements Serializable {
  private static final long serialVersionUID = 163445090445394187L;

  @Column(name = "parent_id")
  private java.lang.Integer parentId;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  @Column(name = "link_id")
  private java.lang.Integer linkId;

  /** Constructor: CatalogProductSuperLinkId. */
  public CatalogProductSuperLinkId() {}

  /**
   * Constructor: CatalogProductSuperLinkId.
   *
   * @param parentId - parentId.
   * @param productId - productId.
   * @param linkId - linkId.
   */
  public CatalogProductSuperLinkId(
      java.lang.Integer parentId, java.lang.Integer productId, java.lang.Integer linkId) {
    this.parentId = parentId;
    this.productId = productId;
    this.linkId = linkId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getLinkId() {
    return this.linkId;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setLinkId(java.lang.Integer linkId) {
    this.linkId = linkId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((parentId == null) ? 0 : parentId.hashCode());
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());
    result = prime * result + ((linkId == null) ? 0 : linkId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductSuperLinkId other = (CatalogProductSuperLinkId) obj;

    if (parentId == null) {
      if (other.parentId != null) return false;
    } else if (!parentId.equals(other.parentId)) return false;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    if (linkId == null) {
      if (other.linkId != null) return false;
    } else if (!linkId.equals(other.linkId)) return false;

    return true;
  }
}
