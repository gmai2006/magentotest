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

/** embeddable class Id for EavAttributeOptionSwatch. generated on 10/16/2021 from a schema. */
public class EavAttributeOptionSwatchId implements Serializable {
  private static final long serialVersionUID = 163445090519251076L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "swatch_id")
  private java.lang.Integer swatchId;

  @Column(name = "option_id")
  private java.lang.Integer optionId;

  /** Constructor: EavAttributeOptionSwatchId. */
  public EavAttributeOptionSwatchId() {}

  /**
   * Constructor: EavAttributeOptionSwatchId.
   *
   * @param storeId - storeId.
   * @param swatchId - swatchId.
   * @param optionId - optionId.
   */
  public EavAttributeOptionSwatchId(
      java.lang.Integer storeId, java.lang.Integer swatchId, java.lang.Integer optionId) {
    this.storeId = storeId;
    this.swatchId = swatchId;
    this.optionId = optionId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getSwatchId() {
    return this.swatchId;
  }

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setSwatchId(java.lang.Integer swatchId) {
    this.swatchId = swatchId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((swatchId == null) ? 0 : swatchId.hashCode());
    result = prime * result + ((optionId == null) ? 0 : optionId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    EavAttributeOptionSwatchId other = (EavAttributeOptionSwatchId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (swatchId == null) {
      if (other.swatchId != null) return false;
    } else if (!swatchId.equals(other.swatchId)) return false;

    if (optionId == null) {
      if (other.optionId != null) return false;
    } else if (!optionId.equals(other.optionId)) return false;

    return true;
  }
}
