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

/** embeddable class Id for GoogleoptimizerCode. generated on 10/16/2021 from a schema. */
public class GoogleoptimizerCodeId implements Serializable {
  private static final long serialVersionUID = 163445090549821662L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "entity_type")
  private java.lang.String entityType;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "code_id")
  private java.lang.Integer codeId;

  /** Constructor: GoogleoptimizerCodeId. */
  public GoogleoptimizerCodeId() {}

  /**
   * Constructor: GoogleoptimizerCodeId.
   *
   * @param storeId - storeId.
   * @param entityType - entityType.
   * @param entityId - entityId.
   * @param codeId - codeId.
   */
  public GoogleoptimizerCodeId(
      java.lang.Integer storeId,
      java.lang.String entityType,
      java.lang.Integer entityId,
      java.lang.Integer codeId) {
    this.storeId = storeId;
    this.entityType = entityType;
    this.entityId = entityId;
    this.codeId = codeId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getEntityType() {
    return this.entityType;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getCodeId() {
    return this.codeId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setCodeId(java.lang.Integer codeId) {
    this.codeId = codeId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((entityType == null) ? 0 : entityType.hashCode());
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((codeId == null) ? 0 : codeId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    GoogleoptimizerCodeId other = (GoogleoptimizerCodeId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (entityType == null) {
      if (other.entityType != null) return false;
    } else if (!entityType.equals(other.entityType)) return false;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (codeId == null) {
      if (other.codeId != null) return false;
    } else if (!codeId.equals(other.codeId)) return false;

    return true;
  }
}
