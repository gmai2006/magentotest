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

/** embeddable class Id for CatalogProductOptionTypeTitle. generated on 10/16/2021 from a schema. */
public class CatalogProductOptionTypeTitleId implements Serializable {
  private static final long serialVersionUID = 163445090439795711L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "option_type_title_id")
  private java.lang.Integer optionTypeTitleId;

  @Column(name = "option_type_id")
  private java.lang.Integer optionTypeId;

  /** Constructor: CatalogProductOptionTypeTitleId. */
  public CatalogProductOptionTypeTitleId() {}

  /**
   * Constructor: CatalogProductOptionTypeTitleId.
   *
   * @param storeId - storeId.
   * @param optionTypeTitleId - optionTypeTitleId.
   * @param optionTypeId - optionTypeId.
   */
  public CatalogProductOptionTypeTitleId(
      java.lang.Integer storeId,
      java.lang.Integer optionTypeTitleId,
      java.lang.Integer optionTypeId) {
    this.storeId = storeId;
    this.optionTypeTitleId = optionTypeTitleId;
    this.optionTypeId = optionTypeId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getOptionTypeTitleId() {
    return this.optionTypeTitleId;
  }

  public java.lang.Integer getOptionTypeId() {
    return this.optionTypeId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setOptionTypeTitleId(java.lang.Integer optionTypeTitleId) {
    this.optionTypeTitleId = optionTypeTitleId;
  }

  public void setOptionTypeId(java.lang.Integer optionTypeId) {
    this.optionTypeId = optionTypeId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((optionTypeTitleId == null) ? 0 : optionTypeTitleId.hashCode());
    result = prime * result + ((optionTypeId == null) ? 0 : optionTypeId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductOptionTypeTitleId other = (CatalogProductOptionTypeTitleId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (optionTypeTitleId == null) {
      if (other.optionTypeTitleId != null) return false;
    } else if (!optionTypeTitleId.equals(other.optionTypeTitleId)) return false;

    if (optionTypeId == null) {
      if (other.optionTypeId != null) return false;
    } else if (!optionTypeId.equals(other.optionTypeId)) return false;

    return true;
  }
}
