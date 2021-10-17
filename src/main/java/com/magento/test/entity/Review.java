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
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "review")
public class Review implements Serializable {
  private static final long serialVersionUID = 163445090616973198L;

  /** Description: review_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "review_id")
  private java.lang.Long reviewId;

  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: entity_pk_value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_pk_value")
  private java.lang.Integer entityPkValue;
  /** Description: status_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "status_id")
  private java.lang.Integer statusId;

  public Review() {}

  public java.lang.Long getReviewId() {
    return this.reviewId;
  }

  public void setReviewId(java.lang.Long reviewId) {
    this.reviewId = reviewId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getEntityPkValue() {
    return this.entityPkValue;
  }

  public java.lang.Integer getStatusId() {
    return this.statusId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setEntityPkValue(java.lang.Integer entityPkValue) {
    this.entityPkValue = entityPkValue;
  }

  public void setStatusId(java.lang.Integer statusId) {
    this.statusId = statusId;
  }
}
