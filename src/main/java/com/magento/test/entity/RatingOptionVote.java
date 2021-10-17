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
@Table(name = "rating_option_vote")
public class RatingOptionVote implements Serializable {
  private static final long serialVersionUID = 163445090606175864L;

  /** Description: vote_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "vote_id")
  private java.lang.Long voteId;

  /** Description: option_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "option_id")
  private java.lang.Integer optionId;
  /** Description: remote_ip. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "remote_ip", length = 16)
  private java.lang.String remoteIp;
  /** Description: remote_ip_long. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "remote_ip_long")
  private java.lang.Long remoteIpLong;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: entity_pk_value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_pk_value")
  private java.lang.Long entityPkValue;
  /** Description: rating_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "rating_id")
  private java.lang.Integer ratingId;
  /** Description: review_id. */
  @Basic
  @Column(name = "review_id")
  private java.lang.Long reviewId;
  /** Description: percent. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "percent")
  private java.lang.Integer percent;
  /** Description: value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "value")
  private java.lang.Integer value;

  public RatingOptionVote() {}

  public java.lang.Long getVoteId() {
    return this.voteId;
  }

  public void setVoteId(java.lang.Long voteId) {
    this.voteId = voteId;
  }

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public java.lang.String getRemoteIp() {
    return this.remoteIp;
  }

  public java.lang.Long getRemoteIpLong() {
    return this.remoteIpLong;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.Long getEntityPkValue() {
    return this.entityPkValue;
  }

  public java.lang.Integer getRatingId() {
    return this.ratingId;
  }

  public java.lang.Long getReviewId() {
    return this.reviewId;
  }

  public java.lang.Integer getPercent() {
    return this.percent;
  }

  public java.lang.Integer getValue() {
    return this.value;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public void setRemoteIp(java.lang.String remoteIp) {
    this.remoteIp = remoteIp;
  }

  public void setRemoteIpLong(java.lang.Long remoteIpLong) {
    this.remoteIpLong = remoteIpLong;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setEntityPkValue(java.lang.Long entityPkValue) {
    this.entityPkValue = entityPkValue;
  }

  public void setRatingId(java.lang.Integer ratingId) {
    this.ratingId = ratingId;
  }

  public void setReviewId(java.lang.Long reviewId) {
    this.reviewId = reviewId;
  }

  public void setPercent(java.lang.Integer percent) {
    this.percent = percent;
  }

  public void setValue(java.lang.Integer value) {
    this.value = value;
  }
}
