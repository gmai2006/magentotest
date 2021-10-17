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

/** embeddable class Id for EavAttribute. generated on 10/16/2021 from a schema. */
public class EavAttributeId implements Serializable {
  private static final long serialVersionUID = 163445090515288114L;

  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;

  @Column(name = "entity_type_id")
  private java.lang.Integer entityTypeId;

  @Column(name = "attribute_code")
  private java.lang.String attributeCode;

  /** Constructor: EavAttributeId. */
  public EavAttributeId() {}

  /**
   * Constructor: EavAttributeId.
   *
   * @param attributeId - attributeId.
   * @param entityTypeId - entityTypeId.
   * @param attributeCode - attributeCode.
   */
  public EavAttributeId(
      java.lang.Integer attributeId,
      java.lang.Integer entityTypeId,
      java.lang.String attributeCode) {
    this.attributeId = attributeId;
    this.entityTypeId = entityTypeId;
    this.attributeCode = attributeCode;
  }

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public java.lang.Integer getEntityTypeId() {
    return this.entityTypeId;
  }

  public java.lang.String getAttributeCode() {
    return this.attributeCode;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public void setEntityTypeId(java.lang.Integer entityTypeId) {
    this.entityTypeId = entityTypeId;
  }

  public void setAttributeCode(java.lang.String attributeCode) {
    this.attributeCode = attributeCode;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((attributeId == null) ? 0 : attributeId.hashCode());
    result = prime * result + ((entityTypeId == null) ? 0 : entityTypeId.hashCode());
    result = prime * result + ((attributeCode == null) ? 0 : attributeCode.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    EavAttributeId other = (EavAttributeId) obj;

    if (attributeId == null) {
      if (other.attributeId != null) return false;
    } else if (!attributeId.equals(other.attributeId)) return false;

    if (entityTypeId == null) {
      if (other.entityTypeId != null) return false;
    } else if (!entityTypeId.equals(other.entityTypeId)) return false;

    if (attributeCode == null) {
      if (other.attributeCode != null) return false;
    } else if (!attributeCode.equals(other.attributeCode)) return false;

    return true;
  }
}
