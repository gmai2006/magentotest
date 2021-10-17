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
@Table(name = "email_automation")
public class EmailAutomation implements Serializable {
  private static final long serialVersionUID = 163445090539347250L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: automation_type. */
  @Basic
  @Column(name = "automation_type", length = 255)
  private java.lang.String automationType;
  /** Description: store_name. */
  @Basic
  @Column(name = "store_name", length = 255)
  private java.lang.String storeName;
  /** Description: enrolment_status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "enrolment_status", length = 255)
  private java.lang.String enrolmentStatus;
  /** Description: email. */
  @Basic
  @Column(name = "email", length = 255)
  private java.lang.String email;
  /** Description: type_id. */
  @Basic
  @Column(name = "type_id", length = 255)
  private java.lang.String typeId;
  /** Description: program_id. */
  @Basic
  @Column(name = "program_id", length = 255)
  private java.lang.String programId;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;
  /** Description: message. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "message", length = 255)
  private java.lang.String message;
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

  public EmailAutomation() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getAutomationType() {
    return this.automationType;
  }

  public java.lang.String getStoreName() {
    return this.storeName;
  }

  public java.lang.String getEnrolmentStatus() {
    return this.enrolmentStatus;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.String getTypeId() {
    return this.typeId;
  }

  public java.lang.String getProgramId() {
    return this.programId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.String getMessage() {
    return this.message;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setAutomationType(java.lang.String automationType) {
    this.automationType = automationType;
  }

  public void setStoreName(java.lang.String storeName) {
    this.storeName = storeName;
  }

  public void setEnrolmentStatus(java.lang.String enrolmentStatus) {
    this.enrolmentStatus = enrolmentStatus;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setTypeId(java.lang.String typeId) {
    this.typeId = typeId;
  }

  public void setProgramId(java.lang.String programId) {
    this.programId = programId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setMessage(java.lang.String message) {
    this.message = message;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
