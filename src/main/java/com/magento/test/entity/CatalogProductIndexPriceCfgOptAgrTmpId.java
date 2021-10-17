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
 * embeddable class Id for CatalogProductIndexPriceCfgOptAgrTmp. generated on 10/16/2021 from a
 * schema.
 */
public class CatalogProductIndexPriceCfgOptAgrTmpId implements Serializable {
  private static final long serialVersionUID = 163445090406573127L;

  @Column(name = "child_id")
  private java.lang.Integer childId;

  @Column(name = "parent_id")
  private java.lang.Integer parentId;

  @Column(name = "customer_group_id")
  private java.lang.Integer customerGroupId;

  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Constructor: CatalogProductIndexPriceCfgOptAgrTmpId. */
  public CatalogProductIndexPriceCfgOptAgrTmpId() {}

  /**
   * Constructor: CatalogProductIndexPriceCfgOptAgrTmpId.
   *
   * @param childId - childId.
   * @param parentId - parentId.
   * @param customerGroupId - customerGroupId.
   * @param websiteId - websiteId.
   */
  public CatalogProductIndexPriceCfgOptAgrTmpId(
      java.lang.Integer childId,
      java.lang.Integer parentId,
      java.lang.Integer customerGroupId,
      java.lang.Integer websiteId) {
    this.childId = childId;
    this.parentId = parentId;
    this.customerGroupId = customerGroupId;
    this.websiteId = websiteId;
  }

  public java.lang.Integer getChildId() {
    return this.childId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setChildId(java.lang.Integer childId) {
    this.childId = childId;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((childId == null) ? 0 : childId.hashCode());
    result = prime * result + ((parentId == null) ? 0 : parentId.hashCode());
    result = prime * result + ((customerGroupId == null) ? 0 : customerGroupId.hashCode());
    result = prime * result + ((websiteId == null) ? 0 : websiteId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductIndexPriceCfgOptAgrTmpId other = (CatalogProductIndexPriceCfgOptAgrTmpId) obj;

    if (childId == null) {
      if (other.childId != null) return false;
    } else if (!childId.equals(other.childId)) return false;

    if (parentId == null) {
      if (other.parentId != null) return false;
    } else if (!parentId.equals(other.parentId)) return false;

    if (customerGroupId == null) {
      if (other.customerGroupId != null) return false;
    } else if (!customerGroupId.equals(other.customerGroupId)) return false;

    if (websiteId == null) {
      if (other.websiteId != null) return false;
    } else if (!websiteId.equals(other.websiteId)) return false;

    return true;
  }
}
