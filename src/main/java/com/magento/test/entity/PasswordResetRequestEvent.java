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
@Table(name = "password_reset_request_event")
public class PasswordResetRequestEvent implements Serializable {
  private static final long serialVersionUID = 163445090578433134L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: request_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "request_type")
  private java.lang.Integer requestType;
  /** Description: account_reference. */
  @Basic
  @Column(name = "account_reference", length = 255)
  private java.lang.String accountReference;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: ip. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "ip", length = 15)
  private java.lang.String ip;

  public PasswordResetRequestEvent() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getRequestType() {
    return this.requestType;
  }

  public java.lang.String getAccountReference() {
    return this.accountReference;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.lang.String getIp() {
    return this.ip;
  }

  public void setRequestType(java.lang.Integer requestType) {
    this.requestType = requestType;
  }

  public void setAccountReference(java.lang.String accountReference) {
    this.accountReference = accountReference;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setIp(java.lang.String ip) {
    this.ip = ip;
  }
}
