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
@IdClass(AdminUserId.class)
@Table(name = "admin_user")
public class AdminUser implements Serializable {
  private static final long serialVersionUID = 163445090309465233L;

  /** Description: user_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "user_id")
  private java.lang.Integer userId;
  /** Description: username. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "username")
  private java.lang.String username;

  /** Description: firstname. */
  @Basic
  @Column(name = "firstname", length = 32)
  private java.lang.String firstname;
  /** Description: lastname. */
  @Basic
  @Column(name = "lastname", length = 32)
  private java.lang.String lastname;
  /** Description: email. */
  @Basic
  @Column(name = "email", length = 128)
  private java.lang.String email;
  /** Description: password. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "password", length = 255)
  private java.lang.String password;
  /** Description: created. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created")
  private java.sql.Timestamp created;
  /** Description: modified. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "modified")
  private java.sql.Timestamp modified;
  /** Description: logdate. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "logdate")
  private java.sql.Timestamp logdate;
  /** Description: lognum. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "lognum")
  private java.lang.Integer lognum;
  /** Description: reload_acl_flag. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "reload_acl_flag")
  private java.lang.Integer reloadAclFlag;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: extra. */
  @Basic
  @Column(name = "extra", length = 0)
  private java.lang.String extra;
  /** Description: rp_token. */
  @Basic
  @Column(name = "rp_token", length = 0)
  private java.lang.String rpToken;
  /** Description: rp_token_created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "rp_token_created_at")
  private java.sql.Timestamp rpTokenCreatedAt;
  /** Description: interface_locale. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "interface_locale", length = 16)
  private java.lang.String interfaceLocale;
  /** Description: failures_num. */
  @Basic
  @Column(name = "failures_num")
  private java.lang.Integer failuresNum;
  /** Description: first_failure. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "first_failure")
  private java.sql.Timestamp firstFailure;
  /** Description: lock_expires. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "lock_expires")
  private java.sql.Timestamp lockExpires;
  /** Description: refresh_token. */
  @Basic
  @Column(name = "refresh_token", length = 0)
  private java.lang.String refreshToken;

  public AdminUser() {}

  public java.lang.Integer getUserId() {
    return this.userId;
  }

  public java.lang.String getUsername() {
    return this.username;
  }

  public void setUserId(java.lang.Integer userId) {
    this.userId = userId;
  }

  public void setUsername(java.lang.String username) {
    this.username = username;
  }

  public java.lang.String getFirstname() {
    return this.firstname;
  }

  public java.lang.String getLastname() {
    return this.lastname;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.String getPassword() {
    return this.password;
  }

  public java.sql.Timestamp getCreated() {
    return this.created;
  }

  public java.sql.Timestamp getModified() {
    return this.modified;
  }

  public java.sql.Timestamp getLogdate() {
    return this.logdate;
  }

  public java.lang.Integer getLognum() {
    return this.lognum;
  }

  public java.lang.Integer getReloadAclFlag() {
    return this.reloadAclFlag;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.lang.String getExtra() {
    return this.extra;
  }

  public java.lang.String getRpToken() {
    return this.rpToken;
  }

  public java.sql.Timestamp getRpTokenCreatedAt() {
    return this.rpTokenCreatedAt;
  }

  public java.lang.String getInterfaceLocale() {
    return this.interfaceLocale;
  }

  public java.lang.Integer getFailuresNum() {
    return this.failuresNum;
  }

  public java.sql.Timestamp getFirstFailure() {
    return this.firstFailure;
  }

  public java.sql.Timestamp getLockExpires() {
    return this.lockExpires;
  }

  public java.lang.String getRefreshToken() {
    return this.refreshToken;
  }

  public void setFirstname(java.lang.String firstname) {
    this.firstname = firstname;
  }

  public void setLastname(java.lang.String lastname) {
    this.lastname = lastname;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setPassword(java.lang.String password) {
    this.password = password;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }

  public void setModified(java.sql.Timestamp modified) {
    this.modified = modified;
  }

  public void setLogdate(java.sql.Timestamp logdate) {
    this.logdate = logdate;
  }

  public void setLognum(java.lang.Integer lognum) {
    this.lognum = lognum;
  }

  public void setReloadAclFlag(java.lang.Integer reloadAclFlag) {
    this.reloadAclFlag = reloadAclFlag;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setExtra(java.lang.String extra) {
    this.extra = extra;
  }

  public void setRpToken(java.lang.String rpToken) {
    this.rpToken = rpToken;
  }

  public void setRpTokenCreatedAt(java.sql.Timestamp rpTokenCreatedAt) {
    this.rpTokenCreatedAt = rpTokenCreatedAt;
  }

  public void setInterfaceLocale(java.lang.String interfaceLocale) {
    this.interfaceLocale = interfaceLocale;
  }

  public void setFailuresNum(java.lang.Integer failuresNum) {
    this.failuresNum = failuresNum;
  }

  public void setFirstFailure(java.sql.Timestamp firstFailure) {
    this.firstFailure = firstFailure;
  }

  public void setLockExpires(java.sql.Timestamp lockExpires) {
    this.lockExpires = lockExpires;
  }

  public void setRefreshToken(java.lang.String refreshToken) {
    this.refreshToken = refreshToken;
  }
}
