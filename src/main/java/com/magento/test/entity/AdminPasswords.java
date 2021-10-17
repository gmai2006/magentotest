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
@Table(name = "admin_passwords")
public class AdminPasswords implements Serializable {
  private static final long serialVersionUID = 163445090303547864L;

  /** Description: password_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "password_id")
  private java.lang.Integer passwordId;

  /** Description: user_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "user_id")
  private java.lang.Integer userId;
  /** Description: password_hash. */
  @Basic
  @Column(name = "password_hash", length = 100)
  private java.lang.String passwordHash;
  /** Description: expires. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "expires")
  private java.lang.Integer expires;
  /** Description: last_updated. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "last_updated")
  private java.lang.Integer lastUpdated;

  public AdminPasswords() {}

  public java.lang.Integer getPasswordId() {
    return this.passwordId;
  }

  public void setPasswordId(java.lang.Integer passwordId) {
    this.passwordId = passwordId;
  }

  public java.lang.Integer getUserId() {
    return this.userId;
  }

  public java.lang.String getPasswordHash() {
    return this.passwordHash;
  }

  public java.lang.Integer getExpires() {
    return this.expires;
  }

  public java.lang.Integer getLastUpdated() {
    return this.lastUpdated;
  }

  public void setUserId(java.lang.Integer userId) {
    this.userId = userId;
  }

  public void setPasswordHash(java.lang.String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public void setExpires(java.lang.Integer expires) {
    this.expires = expires;
  }

  public void setLastUpdated(java.lang.Integer lastUpdated) {
    this.lastUpdated = lastUpdated;
  }
}
