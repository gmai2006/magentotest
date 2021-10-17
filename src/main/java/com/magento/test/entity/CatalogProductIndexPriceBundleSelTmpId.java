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
 * embeddable class Id for CatalogProductIndexPriceBundleSelTmp. generated on 10/16/2021 from a
 * schema.
 */
public class CatalogProductIndexPriceBundleSelTmpId implements Serializable {
  private static final long serialVersionUID = 163445090401787981L;

  @Column(name = "selection_id")
  private java.lang.Integer selectionId;

  @Column(name = "option_id")
  private java.lang.Integer optionId;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "customer_group_id")
  private java.lang.Integer customerGroupId;

  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Constructor: CatalogProductIndexPriceBundleSelTmpId. */
  public CatalogProductIndexPriceBundleSelTmpId() {}

  /**
   * Constructor: CatalogProductIndexPriceBundleSelTmpId.
   *
   * @param selectionId - selectionId.
   * @param optionId - optionId.
   * @param entityId - entityId.
   * @param customerGroupId - customerGroupId.
   * @param websiteId - websiteId.
   */
  public CatalogProductIndexPriceBundleSelTmpId(
      java.lang.Integer selectionId,
      java.lang.Integer optionId,
      java.lang.Integer entityId,
      java.lang.Integer customerGroupId,
      java.lang.Integer websiteId) {
    this.selectionId = selectionId;
    this.optionId = optionId;
    this.entityId = entityId;
    this.customerGroupId = customerGroupId;
    this.websiteId = websiteId;
  }

  public java.lang.Integer getSelectionId() {
    return this.selectionId;
  }

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setSelectionId(java.lang.Integer selectionId) {
    this.selectionId = selectionId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
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
    result = prime * result + ((selectionId == null) ? 0 : selectionId.hashCode());
    result = prime * result + ((optionId == null) ? 0 : optionId.hashCode());
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((customerGroupId == null) ? 0 : customerGroupId.hashCode());
    result = prime * result + ((websiteId == null) ? 0 : websiteId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductIndexPriceBundleSelTmpId other = (CatalogProductIndexPriceBundleSelTmpId) obj;

    if (selectionId == null) {
      if (other.selectionId != null) return false;
    } else if (!selectionId.equals(other.selectionId)) return false;

    if (optionId == null) {
      if (other.optionId != null) return false;
    } else if (!optionId.equals(other.optionId)) return false;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (customerGroupId == null) {
      if (other.customerGroupId != null) return false;
    } else if (!customerGroupId.equals(other.customerGroupId)) return false;

    if (websiteId == null) {
      if (other.websiteId != null) return false;
    } else if (!websiteId.equals(other.websiteId)) return false;

    return true;
  }
}
