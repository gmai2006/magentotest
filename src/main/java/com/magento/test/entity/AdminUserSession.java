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
@Table(name = "admin_user_session")
public class AdminUserSession implements Serializable {
  private static final long serialVersionUID = 163445090311599318L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: session_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "session_id", length = 128)
  private java.lang.String sessionId;
  /** Description: user_id. */
  @Basic
  @Column(name = "user_id")
  private java.lang.Integer userId;
  /** Description: status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "status")
  private java.lang.Integer status;
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
  /** Description: ip. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "ip", length = 15)
  private java.lang.String ip;

  public AdminUserSession() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getSessionId() {
    return this.sessionId;
  }

  public java.lang.Integer getUserId() {
    return this.userId;
  }

  public java.lang.Integer getStatus() {
    return this.status;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.String getIp() {
    return this.ip;
  }

  public void setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
  }

  public void setUserId(java.lang.Integer userId) {
    this.userId = userId;
  }

  public void setStatus(java.lang.Integer status) {
    this.status = status;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setIp(java.lang.String ip) {
    this.ip = ip;
  }
}
