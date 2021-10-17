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
@Table(name = "rating_option_vote_aggregated")
public class RatingOptionVoteAggregated implements Serializable {
  private static final long serialVersionUID = 163445090606825974L;

  /** Description: primary_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "primary_id")
  private java.lang.Integer primaryId;

  /** Description: rating_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "rating_id")
  private java.lang.Integer ratingId;
  /** Description: entity_pk_value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_pk_value")
  private java.lang.Long entityPkValue;
  /** Description: vote_count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "vote_count")
  private java.lang.Integer voteCount;
  /** Description: vote_value_sum. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "vote_value_sum")
  private java.lang.Integer voteValueSum;
  /** Description: percent. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "percent")
  private java.lang.Integer percent;
  /** Description: percent_approved. */
  @Basic
  @Column(name = "percent_approved")
  private java.lang.Integer percentApproved;
  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;

  public RatingOptionVoteAggregated() {}

  public java.lang.Integer getPrimaryId() {
    return this.primaryId;
  }

  public void setPrimaryId(java.lang.Integer primaryId) {
    this.primaryId = primaryId;
  }

  public java.lang.Integer getRatingId() {
    return this.ratingId;
  }

  public java.lang.Long getEntityPkValue() {
    return this.entityPkValue;
  }

  public java.lang.Integer getVoteCount() {
    return this.voteCount;
  }

  public java.lang.Integer getVoteValueSum() {
    return this.voteValueSum;
  }

  public java.lang.Integer getPercent() {
    return this.percent;
  }

  public java.lang.Integer getPercentApproved() {
    return this.percentApproved;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public void setRatingId(java.lang.Integer ratingId) {
    this.ratingId = ratingId;
  }

  public void setEntityPkValue(java.lang.Long entityPkValue) {
    this.entityPkValue = entityPkValue;
  }

  public void setVoteCount(java.lang.Integer voteCount) {
    this.voteCount = voteCount;
  }

  public void setVoteValueSum(java.lang.Integer voteValueSum) {
    this.voteValueSum = voteValueSum;
  }

  public void setPercent(java.lang.Integer percent) {
    this.percent = percent;
  }

  public void setPercentApproved(java.lang.Integer percentApproved) {
    this.percentApproved = percentApproved;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }
}
