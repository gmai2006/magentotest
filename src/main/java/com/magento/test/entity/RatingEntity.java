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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(RatingEntityId.class)
@Table(name = "rating_entity")
public class RatingEntity implements Serializable {
  private static final long serialVersionUID = 163445090605223261L;

  /** Description: entity_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_code")
  private java.lang.String entityCode;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  public RatingEntity() {}

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
}
