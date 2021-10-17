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

/** embeddable class Id for CatalogProductOptionTypePrice. generated on 10/16/2021 from a schema. */
public class CatalogProductOptionTypePriceId implements Serializable {
  private static final long serialVersionUID = 163445090437667019L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "option_type_price_id")
  private java.lang.Integer optionTypePriceId;

  @Column(name = "option_type_id")
  private java.lang.Integer optionTypeId;

  /** Constructor: CatalogProductOptionTypePriceId. */
  public CatalogProductOptionTypePriceId() {}

  /**
   * Constructor: CatalogProductOptionTypePriceId.
   *
   * @param storeId - storeId.
   * @param optionTypePriceId - optionTypePriceId.
   * @param optionTypeId - optionTypeId.
   */
  public CatalogProductOptionTypePriceId(
      java.lang.Integer storeId,
      java.lang.Integer optionTypePriceId,
      java.lang.Integer optionTypeId) {
    this.storeId = storeId;
    this.optionTypePriceId = optionTypePriceId;
    this.optionTypeId = optionTypeId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getOptionTypePriceId() {
    return this.optionTypePriceId;
  }

  public java.lang.Integer getOptionTypeId() {
    return this.optionTypeId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setOptionTypePriceId(java.lang.Integer optionTypePriceId) {
    this.optionTypePriceId = optionTypePriceId;
  }

  public void setOptionTypeId(java.lang.Integer optionTypeId) {
    this.optionTypeId = optionTypeId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((optionTypePriceId == null) ? 0 : optionTypePriceId.hashCode());
    result = prime * result + ((optionTypeId == null) ? 0 : optionTypeId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductOptionTypePriceId other = (CatalogProductOptionTypePriceId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (optionTypePriceId == null) {
      if (other.optionTypePriceId != null) return false;
    } else if (!optionTypePriceId.equals(other.optionTypePriceId)) return false;

    if (optionTypeId == null) {
      if (other.optionTypeId != null) return false;
    } else if (!optionTypeId.equals(other.optionTypeId)) return false;

    return true;
  }
}
