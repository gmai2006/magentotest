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
 * embeddable class Id for CatalogProductBundleSelectionPrice. generated on 10/16/2021 from a
 * schema.
 */
public class CatalogProductBundleSelectionPriceId implements Serializable {
  private static final long serialVersionUID = 163445090359346778L;

  @Column(name = "parent_product_id")
  private java.lang.Integer parentProductId;

  @Column(name = "selection_id")
  private java.lang.Integer selectionId;

  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Constructor: CatalogProductBundleSelectionPriceId. */
  public CatalogProductBundleSelectionPriceId() {}

  /**
   * Constructor: CatalogProductBundleSelectionPriceId.
   *
   * @param parentProductId - parentProductId.
   * @param selectionId - selectionId.
   * @param websiteId - websiteId.
   */
  public CatalogProductBundleSelectionPriceId(
      java.lang.Integer parentProductId,
      java.lang.Integer selectionId,
      java.lang.Integer websiteId) {
    this.parentProductId = parentProductId;
    this.selectionId = selectionId;
    this.websiteId = websiteId;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((parentProductId == null) ? 0 : parentProductId.hashCode());
    result = prime * result + ((selectionId == null) ? 0 : selectionId.hashCode());
    result = prime * result + ((websiteId == null) ? 0 : websiteId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductBundleSelectionPriceId other = (CatalogProductBundleSelectionPriceId) obj;

    if (parentProductId == null) {
      if (other.parentProductId != null) return false;
    } else if (!parentProductId.equals(other.parentProductId)) return false;

    if (selectionId == null) {
      if (other.selectionId != null) return false;
    } else if (!selectionId.equals(other.selectionId)) return false;

    if (websiteId == null) {
      if (other.websiteId != null) return false;
    } else if (!websiteId.equals(other.websiteId)) return false;

    return true;
  }
}
