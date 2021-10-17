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
@IdClass(RatingId.class)
@Table(name = "rating")
public class Rating implements Serializable {
  private static final long serialVersionUID = 163445090604265949L;

  /** Description: rating_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "rating_id")
  private java.lang.Integer ratingId;
  /** Description: rating_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "rating_code")
  private java.lang.String ratingCode;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: position. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "position")
  private java.lang.Integer position;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;

  public Rating() {}

  public java.lang.Integer getRatingId() {
    return this.ratingId;
  }

  public java.lang.String getRatingCode() {
    return this.ratingCode;
  }

  public void setRatingId(java.lang.Integer ratingId) {
    this.ratingId = ratingId;
  }

  public void setRatingCode(java.lang.String ratingCode) {
    this.ratingCode = ratingCode;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getPosition() {
    return this.position;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setPosition(java.lang.Integer position) {
    this.position = position;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }
}
