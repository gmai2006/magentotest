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

/** embeddable class Id for SalesSequenceMeta. generated on 10/16/2021 from a schema. */
public class SalesSequenceMetaId implements Serializable {
  private static final long serialVersionUID = 163445090667437267L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "entity_type")
  private java.lang.String entityType;

  @Column(name = "meta_id")
  private java.lang.Integer metaId;

  /** Constructor: SalesSequenceMetaId. */
  public SalesSequenceMetaId() {}

  /**
   * Constructor: SalesSequenceMetaId.
   *
   * @param storeId - storeId.
   * @param entityType - entityType.
   * @param metaId - metaId.
   */
  public SalesSequenceMetaId(
      java.lang.Integer storeId, java.lang.String entityType, java.lang.Integer metaId) {
    this.storeId = storeId;
    this.entityType = entityType;
    this.metaId = metaId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getEntityType() {
    return this.entityType;
  }

  public java.lang.Integer getMetaId() {
    return this.metaId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
  }

  public void setMetaId(java.lang.Integer metaId) {
    this.metaId = metaId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((entityType == null) ? 0 : entityType.hashCode());
    result = prime * result + ((metaId == null) ? 0 : metaId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    SalesSequenceMetaId other = (SalesSequenceMetaId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (entityType == null) {
      if (other.entityType != null) return false;
    } else if (!entityType.equals(other.entityType)) return false;

    if (metaId == null) {
      if (other.metaId != null) return false;
    } else if (!metaId.equals(other.metaId)) return false;

    return true;
  }
}
