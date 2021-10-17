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

/** embeddable class Id for CustomerFormAttribute. generated on 10/16/2021 from a schema. */
public class CustomerFormAttributeId implements Serializable {
  private static final long serialVersionUID = 163445090498731610L;

  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;

  @Column(name = "form_code")
  private java.lang.String formCode;

  /** Constructor: CustomerFormAttributeId. */
  public CustomerFormAttributeId() {}

  /**
   * Constructor: CustomerFormAttributeId.
   *
   * @param attributeId - attributeId.
   * @param formCode - formCode.
   */
  public CustomerFormAttributeId(java.lang.Integer attributeId, java.lang.String formCode) {
    this.attributeId = attributeId;
    this.formCode = formCode;
  }

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public java.lang.String getFormCode() {
    return this.formCode;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public void setFormCode(java.lang.String formCode) {
    this.formCode = formCode;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((attributeId == null) ? 0 : attributeId.hashCode());
    result = prime * result + ((formCode == null) ? 0 : formCode.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CustomerFormAttributeId other = (CustomerFormAttributeId) obj;

    if (attributeId == null) {
      if (other.attributeId != null) return false;
    } else if (!attributeId.equals(other.attributeId)) return false;

    if (formCode == null) {
      if (other.formCode != null) return false;
    } else if (!formCode.equals(other.formCode)) return false;

    return true;
  }
}
