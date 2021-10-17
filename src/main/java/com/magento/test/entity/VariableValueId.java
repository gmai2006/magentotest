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

/** embeddable class Id for VariableValue. generated on 10/16/2021 from a schema. */
public class VariableValueId implements Serializable {
  private static final long serialVersionUID = 163445090713046738L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "variable_id")
  private java.lang.Integer variableId;

  @Column(name = "value_id")
  private java.lang.Integer valueId;

  /** Constructor: VariableValueId. */
  public VariableValueId() {}

  /**
   * Constructor: VariableValueId.
   *
   * @param storeId - storeId.
   * @param variableId - variableId.
   * @param valueId - valueId.
   */
  public VariableValueId(
      java.lang.Integer storeId, java.lang.Integer variableId, java.lang.Integer valueId) {
    this.storeId = storeId;
    this.variableId = variableId;
    this.valueId = valueId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getVariableId() {
    return this.variableId;
  }

  public java.lang.Integer getValueId() {
    return this.valueId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setVariableId(java.lang.Integer variableId) {
    this.variableId = variableId;
  }

  public void setValueId(java.lang.Integer valueId) {
    this.valueId = valueId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((variableId == null) ? 0 : variableId.hashCode());
    result = prime * result + ((valueId == null) ? 0 : valueId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    VariableValueId other = (VariableValueId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (variableId == null) {
      if (other.variableId != null) return false;
    } else if (!variableId.equals(other.variableId)) return false;

    if (valueId == null) {
      if (other.valueId != null) return false;
    } else if (!valueId.equals(other.valueId)) return false;

    return true;
  }
}
