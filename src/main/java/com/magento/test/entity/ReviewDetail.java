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
@Table(name = "review_detail")
public class ReviewDetail implements Serializable {
  private static final long serialVersionUID = 163445090617338551L;

  /** Description: detail_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "detail_id")
  private java.lang.Long detailId;

  /** Description: review_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "review_id")
  private java.lang.Long reviewId;
  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: title. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: detail. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "detail", length = 0)
  private java.lang.String detail;
  /** Description: nickname. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "nickname", length = 128)
  private java.lang.String nickname;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;

  public ReviewDetail() {}

  public java.lang.Long getDetailId() {
    return this.detailId;
  }

  public void setDetailId(java.lang.Long detailId) {
    this.detailId = detailId;
  }

  public java.lang.Long getReviewId() {
    return this.reviewId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getDetail() {
    return this.detail;
  }

  public java.lang.String getNickname() {
    return this.nickname;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public void setReviewId(java.lang.Long reviewId) {
    this.reviewId = reviewId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setDetail(java.lang.String detail) {
    this.detail = detail;
  }

  public void setNickname(java.lang.String nickname) {
    this.nickname = nickname;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }
}
