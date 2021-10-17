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

/** embeddable class Id for RatingEntity. generated on 10/16/2021 from a schema. */
public class RatingEntityId implements Serializable {
  private static final long serialVersionUID = 163445090604779314L;

  @Column(name = "entity_code")
  private java.lang.String entityCode;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Constructor: RatingEntityId. */
  public RatingEntityId() {}

  /**
   * Constructor: RatingEntityId.
   *
   * @param entityCode - entityCode.
   * @param entityId - entityId.
   */
  public RatingEntityId(java.lang.String entityCode, java.lang.Integer entityId) {
    this.entityCode = entityCode;
    this.entityId = entityId;
  }

  public java.lang.String getEntityCode() {
    return this.entityCode;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityCode(java.lang.String entityCode) {
    this.entityCode = entityCode;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((entityCode == null) ? 0 : entityCode.hashCode());
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    RatingEntityId other = (RatingEntityId) obj;

    if (entityCode == null) {
      if (other.entityCode != null) return false;
    } else if (!entityCode.equals(other.entityCode)) return false;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    return true;
  }
}
