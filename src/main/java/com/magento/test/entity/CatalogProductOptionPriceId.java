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

/** embeddable class Id for CatalogProductOptionPrice. generated on 10/16/2021 from a schema. */
public class CatalogProductOptionPriceId implements Serializable {
  private static final long serialVersionUID = 163445090435072933L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "option_price_id")
  private java.lang.Integer optionPriceId;

  @Column(name = "option_id")
  private java.lang.Integer optionId;

  /** Constructor: CatalogProductOptionPriceId. */
  public CatalogProductOptionPriceId() {}

  /**
   * Constructor: CatalogProductOptionPriceId.
   *
   * @param storeId - storeId.
   * @param optionPriceId - optionPriceId.
   * @param optionId - optionId.
   */
  public CatalogProductOptionPriceId(
      java.lang.Integer storeId, java.lang.Integer optionPriceId, java.lang.Integer optionId) {
    this.storeId = storeId;
    this.optionPriceId = optionPriceId;
    this.optionId = optionId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getOptionPriceId() {
    return this.optionPriceId;
  }

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setOptionPriceId(java.lang.Integer optionPriceId) {
    this.optionPriceId = optionPriceId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((optionPriceId == null) ? 0 : optionPriceId.hashCode());
    result = prime * result + ((optionId == null) ? 0 : optionId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductOptionPriceId other = (CatalogProductOptionPriceId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (optionPriceId == null) {
      if (other.optionPriceId != null) return false;
    } else if (!optionPriceId.equals(other.optionPriceId)) return false;

    if (optionId == null) {
      if (other.optionId != null) return false;
    } else if (!optionId.equals(other.optionId)) return false;

    return true;
  }
}
