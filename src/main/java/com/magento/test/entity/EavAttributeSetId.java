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

/** embeddable class Id for EavAttributeSet. generated on 10/16/2021 from a schema. */
public class EavAttributeSetId implements Serializable {
  private static final long serialVersionUID = 163445090520893406L;

  @Column(name = "attribute_set_name")
  private java.lang.String attributeSetName;

  @Column(name = "attribute_set_id")
  private java.lang.Integer attributeSetId;

  @Column(name = "entity_type_id")
  private java.lang.Integer entityTypeId;

  /** Constructor: EavAttributeSetId. */
  public EavAttributeSetId() {}

  /**
   * Constructor: EavAttributeSetId.
   *
   * @param attributeSetName - attributeSetName.
   * @param attributeSetId - attributeSetId.
   * @param entityTypeId - entityTypeId.
   */
  public EavAttributeSetId(
      java.lang.String attributeSetName,
      java.lang.Integer attributeSetId,
      java.lang.Integer entityTypeId) {
    this.attributeSetName = attributeSetName;
    this.attributeSetId = attributeSetId;
    this.entityTypeId = entityTypeId;
  }

  public java.lang.String getAttributeSetName() {
    return this.attributeSetName;
  }

  public java.lang.Integer getAttributeSetId() {
    return this.attributeSetId;
  }

  public java.lang.Integer getEntityTypeId() {
    return this.entityTypeId;
  }

  public void setAttributeSetName(java.lang.String attributeSetName) {
    this.attributeSetName = attributeSetName;
  }

  public void setAttributeSetId(java.lang.Integer attributeSetId) {
    this.attributeSetId = attributeSetId;
  }

  public void setEntityTypeId(java.lang.Integer entityTypeId) {
    this.entityTypeId = entityTypeId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((attributeSetName == null) ? 0 : attributeSetName.hashCode());
    result = prime * result + ((attributeSetId == null) ? 0 : attributeSetId.hashCode());
    result = prime * result + ((entityTypeId == null) ? 0 : entityTypeId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    EavAttributeSetId other = (EavAttributeSetId) obj;

    if (attributeSetName == null) {
      if (other.attributeSetName != null) return false;
    } else if (!attributeSetName.equals(other.attributeSetName)) return false;

    if (attributeSetId == null) {
      if (other.attributeSetId != null) return false;
    } else if (!attributeSetId.equals(other.attributeSetId)) return false;

    if (entityTypeId == null) {
      if (other.entityTypeId != null) return false;
    } else if (!entityTypeId.equals(other.entityTypeId)) return false;

    return true;
  }
}
