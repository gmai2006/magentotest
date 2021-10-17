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

/**
 * embeddable class Id for CatalogProductEntityMediaGalleryValueToEntity. generated on 10/16/2021
 * from a schema.
 */
public class CatalogProductEntityMediaGalleryValueToEntityId implements Serializable {
  private static final long serialVersionUID = 163445090371597656L;

  @Column(name = "value_id")
  private java.lang.Integer valueId;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Constructor: CatalogProductEntityMediaGalleryValueToEntityId. */
  public CatalogProductEntityMediaGalleryValueToEntityId() {}

  /**
   * Constructor: CatalogProductEntityMediaGalleryValueToEntityId.
   *
   * @param valueId - valueId.
   * @param entityId - entityId.
   */
  public CatalogProductEntityMediaGalleryValueToEntityId(
      java.lang.Integer valueId, java.lang.Integer entityId) {
    this.valueId = valueId;
    this.entityId = entityId;
  }

  public java.lang.Integer getValueId() {
    return this.valueId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setValueId(java.lang.Integer valueId) {
    this.valueId = valueId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((valueId == null) ? 0 : valueId.hashCode());
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductEntityMediaGalleryValueToEntityId other =
        (CatalogProductEntityMediaGalleryValueToEntityId) obj;

    if (valueId == null) {
      if (other.valueId != null) return false;
    } else if (!valueId.equals(other.valueId)) return false;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    return true;
  }
}
