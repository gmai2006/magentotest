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
@IdClass(SignifydCaseId.class)
@Table(name = "signifyd_case")
public class SignifydCase implements Serializable {
  private static final long serialVersionUID = 163445090691342866L;

  /** Description: case_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "case_id")
  private java.lang.Integer caseId;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "order_id")
  private java.lang.Integer orderId;

  /** Description: guarantee_eligible. */
  @Basic
  @Column(name = "guarantee_eligible")
  private java.lang.Integer guaranteeEligible;
  /** Description: guarantee_disposition. */
  @Basic
  @Column(name = "guarantee_disposition", length = 32)
  private java.lang.String guaranteeDisposition;
  /** Description: status. */
  @Basic
  @Column(name = "status", length = 32)
  private java.lang.String status;
  /** Description: score. */
  @Basic
  @Column(name = "score")
  private java.lang.Integer score;
  /** Description: associated_team. */
  @Basic
  @Column(name = "associated_team", length = 0)
  private java.lang.String associatedTeam;
  /** Description: review_disposition. */
  @Basic
  @Column(name = "review_disposition", length = 32)
  private java.lang.String reviewDisposition;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;

  public SignifydCase() {}

  public java.lang.Integer getCaseId() {
    return this.caseId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public void setCaseId(java.lang.Integer caseId) {
    this.caseId = caseId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public java.lang.Integer getGuaranteeEligible() {
    return this.guaranteeEligible;
  }

  public java.lang.String getGuaranteeDisposition() {
    return this.guaranteeDisposition;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.lang.Integer getScore() {
    return this.score;
  }

  public java.lang.String getAssociatedTeam() {
    return this.associatedTeam;
  }

  public java.lang.String getReviewDisposition() {
    return this.reviewDisposition;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setGuaranteeEligible(java.lang.Integer guaranteeEligible) {
    this.guaranteeEligible = guaranteeEligible;
  }

  public void setGuaranteeDisposition(java.lang.String guaranteeDisposition) {
    this.guaranteeDisposition = guaranteeDisposition;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setScore(java.lang.Integer score) {
    this.score = score;
  }

  public void setAssociatedTeam(java.lang.String associatedTeam) {
    this.associatedTeam = associatedTeam;
  }

  public void setReviewDisposition(java.lang.String reviewDisposition) {
    this.reviewDisposition = reviewDisposition;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
