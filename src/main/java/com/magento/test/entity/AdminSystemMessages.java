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
@Table(name = "admin_system_messages")
public class AdminSystemMessages implements Serializable {
  private static final long serialVersionUID = 163445090306350870L;

  /** Description: identity. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "identity")
  private java.lang.String identity;

  /** Description: severity. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "severity")
  private java.lang.Integer severity;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;

  public AdminSystemMessages() {}

  public java.lang.String getIdentity() {
    return this.identity;
  }

  public void setIdentity(java.lang.String identity) {
    this.identity = identity;
  }

  public java.lang.Integer getSeverity() {
    return this.severity;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public void setSeverity(java.lang.Integer severity) {
    this.severity = severity;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }
}
