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

/** embeddable class Id for EavFormTypeEntity. generated on 10/16/2021 from a schema. */
public class EavFormTypeEntityId implements Serializable {
  private static final long serialVersionUID = 163445090537419979L;

  @Column(name = "type_id")
  private java.lang.Integer typeId;

  @Column(name = "entity_type_id")
  private java.lang.Integer entityTypeId;

  /** Constructor: EavFormTypeEntityId. */
  public EavFormTypeEntityId() {}

  /**
   * Constructor: EavFormTypeEntityId.
   *
   * @param typeId - typeId.
   * @param entityTypeId - entityTypeId.
   */
  public EavFormTypeEntityId(java.lang.Integer typeId, java.lang.Integer entityTypeId) {
    this.typeId = typeId;
    this.entityTypeId = entityTypeId;
  }

  public java.lang.Integer getTypeId() {
    return this.typeId;
  }

  public java.lang.Integer getEntityTypeId() {
    return this.entityTypeId;
  }

  public void setTypeId(java.lang.Integer typeId) {
    this.typeId = typeId;
  }

  public void setEntityTypeId(java.lang.Integer entityTypeId) {
    this.entityTypeId = entityTypeId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((typeId == null) ? 0 : typeId.hashCode());
    result = prime * result + ((entityTypeId == null) ? 0 : entityTypeId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    EavFormTypeEntityId other = (EavFormTypeEntityId) obj;

    if (typeId == null) {
      if (other.typeId != null) return false;
    } else if (!typeId.equals(other.typeId)) return false;

    if (entityTypeId == null) {
      if (other.entityTypeId != null) return false;
    } else if (!entityTypeId.equals(other.entityTypeId)) return false;

    return true;
  }
}
