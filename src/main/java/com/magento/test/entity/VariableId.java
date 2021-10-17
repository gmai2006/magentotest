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

/** embeddable class Id for Variable. generated on 10/16/2021 from a schema. */
public class VariableId implements Serializable {
  private static final long serialVersionUID = 163445090712084285L;

  @Column(name = "code")
  private java.lang.String code;

  @Column(name = "variable_id")
  private java.lang.Integer variableId;

  /** Constructor: VariableId. */
  public VariableId() {}

  /**
   * Constructor: VariableId.
   *
   * @param code - code.
   * @param variableId - variableId.
   */
  public VariableId(java.lang.String code, java.lang.Integer variableId) {
    this.code = code;
    this.variableId = variableId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.Integer getVariableId() {
    return this.variableId;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setVariableId(java.lang.Integer variableId) {
    this.variableId = variableId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((code == null) ? 0 : code.hashCode());
    result = prime * result + ((variableId == null) ? 0 : variableId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    VariableId other = (VariableId) obj;

    if (code == null) {
      if (other.code != null) return false;
    } else if (!code.equals(other.code)) return false;

    if (variableId == null) {
      if (other.variableId != null) return false;
    } else if (!variableId.equals(other.variableId)) return false;

    return true;
  }
}
