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
 * embeddable class Id for CatalogProductBundleOptionValue. generated on 10/16/2021 from a schema.
 */
public class CatalogProductBundleOptionValueId implements Serializable {
  private static final long serialVersionUID = 163445090354756145L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "parent_product_id")
  private java.lang.Integer parentProductId;

  @Column(name = "option_id")
  private java.lang.Integer optionId;

  @Column(name = "value_id")
  private java.lang.Integer valueId;

  /** Constructor: CatalogProductBundleOptionValueId. */
  public CatalogProductBundleOptionValueId() {}

  /**
   * Constructor: CatalogProductBundleOptionValueId.
   *
   * @param storeId - storeId.
   * @param parentProductId - parentProductId.
   * @param optionId - optionId.
   * @param valueId - valueId.
   */
  public CatalogProductBundleOptionValueId(
      java.lang.Integer storeId,
      java.lang.Integer parentProductId,
      java.lang.Integer optionId,
      java.lang.Integer valueId) {
    this.storeId = storeId;
    this.parentProductId = parentProductId;
    this.optionId = optionId;
    this.valueId = valueId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getParentProductId() {
    return this.parentProductId;
  }

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public java.lang.Integer getValueId() {
    return this.valueId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setParentProductId(java.lang.Integer parentProductId) {
    this.parentProductId = parentProductId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public void setValueId(java.lang.Integer valueId) {
    this.valueId = valueId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((parentProductId == null) ? 0 : parentProductId.hashCode());
    result = prime * result + ((optionId == null) ? 0 : optionId.hashCode());
    result = prime * result + ((valueId == null) ? 0 : valueId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductBundleOptionValueId other = (CatalogProductBundleOptionValueId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (parentProductId == null) {
      if (other.parentProductId != null) return false;
    } else if (!parentProductId.equals(other.parentProductId)) return false;

    if (optionId == null) {
      if (other.optionId != null) return false;
    } else if (!optionId.equals(other.optionId)) return false;

    if (valueId == null) {
      if (other.valueId != null) return false;
    } else if (!valueId.equals(other.valueId)) return false;

    return true;
  }
}
