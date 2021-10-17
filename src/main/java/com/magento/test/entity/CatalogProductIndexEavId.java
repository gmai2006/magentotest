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

/** embeddable class Id for CatalogProductIndexEav. generated on 10/16/2021 from a schema. */
public class CatalogProductIndexEavId implements Serializable {
  private static final long serialVersionUID = 163445090380472639L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;

  @Column(name = "source_id")
  private java.lang.Integer sourceId;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "value")
  private java.lang.Integer value;

  /** Constructor: CatalogProductIndexEavId. */
  public CatalogProductIndexEavId() {}

  /**
   * Constructor: CatalogProductIndexEavId.
   *
   * @param storeId - storeId.
   * @param attributeId - attributeId.
   * @param sourceId - sourceId.
   * @param entityId - entityId.
   * @param value - value.
   */
  public CatalogProductIndexEavId(
      java.lang.Integer storeId,
      java.lang.Integer attributeId,
      java.lang.Integer sourceId,
      java.lang.Integer entityId,
      java.lang.Integer value) {
    this.storeId = storeId;
    this.attributeId = attributeId;
    this.sourceId = sourceId;
    this.entityId = entityId;
    this.value = value;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public java.lang.Integer getSourceId() {
    return this.sourceId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getValue() {
    return this.value;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public void setSourceId(java.lang.Integer sourceId) {
    this.sourceId = sourceId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setValue(java.lang.Integer value) {
    this.value = value;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((attributeId == null) ? 0 : attributeId.hashCode());
    result = prime * result + ((sourceId == null) ? 0 : sourceId.hashCode());
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((value == null) ? 0 : value.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductIndexEavId other = (CatalogProductIndexEavId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (attributeId == null) {
      if (other.attributeId != null) return false;
    } else if (!attributeId.equals(other.attributeId)) return false;

    if (sourceId == null) {
      if (other.sourceId != null) return false;
    } else if (!sourceId.equals(other.sourceId)) return false;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (value == null) {
      if (other.value != null) return false;
    } else if (!value.equals(other.value)) return false;

    return true;
  }
}
