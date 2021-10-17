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

/** embeddable class Id for EavEntityAttribute. generated on 10/16/2021 from a schema. */
public class EavEntityAttributeId implements Serializable {
  private static final long serialVersionUID = 163445090522738297L;

  @Column(name = "attribute_group_id")
  private java.lang.Integer attributeGroupId;

  @Column(name = "attribute_set_id")
  private java.lang.Integer attributeSetId;

  @Column(name = "entity_attribute_id")
  private java.lang.Integer entityAttributeId;

  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;

  /** Constructor: EavEntityAttributeId. */
  public EavEntityAttributeId() {}

  /**
   * Constructor: EavEntityAttributeId.
   *
   * @param attributeGroupId - attributeGroupId.
   * @param attributeSetId - attributeSetId.
   * @param entityAttributeId - entityAttributeId.
   * @param attributeId - attributeId.
   */
  public EavEntityAttributeId(
      java.lang.Integer attributeGroupId,
      java.lang.Integer attributeSetId,
      java.lang.Integer entityAttributeId,
      java.lang.Integer attributeId) {
    this.attributeGroupId = attributeGroupId;
    this.attributeSetId = attributeSetId;
    this.entityAttributeId = entityAttributeId;
    this.attributeId = attributeId;
  }

  public java.lang.Integer getAttributeGroupId() {
    return this.attributeGroupId;
  }

  public java.lang.Integer getAttributeSetId() {
    return this.attributeSetId;
  }

  public java.lang.Integer getEntityAttributeId() {
    return this.entityAttributeId;
  }

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public void setAttributeGroupId(java.lang.Integer attributeGroupId) {
    this.attributeGroupId = attributeGroupId;
  }

  public void setAttributeSetId(java.lang.Integer attributeSetId) {
    this.attributeSetId = attributeSetId;
  }

  public void setEntityAttributeId(java.lang.Integer entityAttributeId) {
    this.entityAttributeId = entityAttributeId;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((attributeGroupId == null) ? 0 : attributeGroupId.hashCode());
    result = prime * result + ((attributeSetId == null) ? 0 : attributeSetId.hashCode());
    result = prime * result + ((entityAttributeId == null) ? 0 : entityAttributeId.hashCode());
    result = prime * result + ((attributeId == null) ? 0 : attributeId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    EavEntityAttributeId other = (EavEntityAttributeId) obj;

    if (attributeGroupId == null) {
      if (other.attributeGroupId != null) return false;
    } else if (!attributeGroupId.equals(other.attributeGroupId)) return false;

    if (attributeSetId == null) {
      if (other.attributeSetId != null) return false;
    } else if (!attributeSetId.equals(other.attributeSetId)) return false;

    if (entityAttributeId == null) {
      if (other.entityAttributeId != null) return false;
    } else if (!entityAttributeId.equals(other.entityAttributeId)) return false;

    if (attributeId == null) {
      if (other.attributeId != null) return false;
    } else if (!attributeId.equals(other.attributeId)) return false;

    return true;
  }
}
