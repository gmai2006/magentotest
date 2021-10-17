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
@Table(name = "review_entity_summary")
public class ReviewEntitySummary implements Serializable {
  private static final long serialVersionUID = 163445090617929817L;

  /** Description: primary_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "primary_id")
  private java.lang.Long primaryId;

  /** Description: entity_pk_value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_pk_value")
  private java.lang.Long entityPkValue;
  /** Description: entity_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_type")
  private java.lang.Integer entityType;
  /** Description: reviews_count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "reviews_count")
  private java.lang.Integer reviewsCount;
  /** Description: rating_summary. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "rating_summary")
  private java.lang.Integer ratingSummary;
  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;

  public ReviewEntitySummary() {}

  public java.lang.Long getPrimaryId() {
    return this.primaryId;
  }

  public void setPrimaryId(java.lang.Long primaryId) {
    this.primaryId = primaryId;
  }

  public java.lang.Long getEntityPkValue() {
    return this.entityPkValue;
  }

  public java.lang.Integer getEntityType() {
    return this.entityType;
  }

  public java.lang.Integer getReviewsCount() {
    return this.reviewsCount;
  }

  public java.lang.Integer getRatingSummary() {
    return this.ratingSummary;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public void setEntityPkValue(java.lang.Long entityPkValue) {
    this.entityPkValue = entityPkValue;
  }

  public void setEntityType(java.lang.Integer entityType) {
    this.entityType = entityType;
  }

  public void setReviewsCount(java.lang.Integer reviewsCount) {
    this.reviewsCount = reviewsCount;
  }

  public void setRatingSummary(java.lang.Integer ratingSummary) {
    this.ratingSummary = ratingSummary;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }
}
