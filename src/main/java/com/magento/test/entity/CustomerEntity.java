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
@IdClass(CustomerEntityId.class)
@Table(name = "customer_entity")
public class CustomerEntity implements Serializable {
  private static final long serialVersionUID = 163445090490699626L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "website_id")
  private java.lang.Integer websiteId;
  /** Description: email. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "email")
  private java.lang.String email;

  /** Description: group_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "group_id")
  private java.lang.Integer groupId;
  /** Description: increment_id. */
  @Basic
  @Column(name = "increment_id", length = 50)
  private java.lang.String incrementId;
  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
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
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: disable_auto_group_change. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "disable_auto_group_change")
  private java.lang.Integer disableAutoGroupChange;
  /** Description: created_in. */
  @Basic
  @Column(name = "created_in", length = 255)
  private java.lang.String createdIn;
  /** Description: prefix. */
  @Basic
  @Column(name = "prefix", length = 40)
  private java.lang.String prefix;
  /** Description: firstname. */
  @Basic
  @Column(name = "firstname", length = 255)
  private java.lang.String firstname;
  /** Description: middlename. */
  @Basic
  @Column(name = "middlename", length = 255)
  private java.lang.String middlename;
  /** Description: lastname. */
  @Basic
  @Column(name = "lastname", length = 255)
  private java.lang.String lastname;
  /** Description: suffix. */
  @Basic
  @Column(name = "suffix", length = 40)
  private java.lang.String suffix;
  /** Description: dob. */
  @Basic
  @Column(name = "dob")
  private java.util.Date dob;
  /** Description: password_hash. */
  @Basic
  @Column(name = "password_hash", length = 128)
  private java.lang.String passwordHash;
  /** Description: rp_token. */
  @Basic
  @Column(name = "rp_token", length = 128)
  private java.lang.String rpToken;
  /** Description: rp_token_created_at. */
  @Basic
  @Column(name = "rp_token_created_at")
  private java.util.Date rpTokenCreatedAt;
  /** Description: default_billing. */
  @Basic
  @Column(name = "default_billing")
  private java.lang.Integer defaultBilling;
  /** Description: default_shipping. */
  @Basic
  @Column(name = "default_shipping")
  private java.lang.Integer defaultShipping;
  /** Description: taxvat. */
  @Basic
  @Column(name = "taxvat", length = 50)
  private java.lang.String taxvat;
  /** Description: confirmation. */
  @Basic
  @Column(name = "confirmation", length = 64)
  private java.lang.String confirmation;
  /** Description: gender. */
  @Basic
  @Column(name = "gender")
  private java.lang.Integer gender;
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

  public CustomerEntity() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public java.lang.Integer getGroupId() {
    return this.groupId;
  }

  public java.lang.String getIncrementId() {
    return this.incrementId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.lang.Integer getDisableAutoGroupChange() {
    return this.disableAutoGroupChange;
  }

  public java.lang.String getCreatedIn() {
    return this.createdIn;
  }

  public java.lang.String getPrefix() {
    return this.prefix;
  }

  public java.lang.String getFirstname() {
    return this.firstname;
  }

  public java.lang.String getMiddlename() {
    return this.middlename;
  }

  public java.lang.String getLastname() {
    return this.lastname;
  }

  public java.lang.String getSuffix() {
    return this.suffix;
  }

  public java.util.Date getDob() {
    return this.dob;
  }

  public java.lang.String getPasswordHash() {
    return this.passwordHash;
  }

  public java.lang.String getRpToken() {
    return this.rpToken;
  }

  public java.util.Date getRpTokenCreatedAt() {
    return this.rpTokenCreatedAt;
  }

  public java.lang.Integer getDefaultBilling() {
    return this.defaultBilling;
  }

  public java.lang.Integer getDefaultShipping() {
    return this.defaultShipping;
  }

  public java.lang.String getTaxvat() {
    return this.taxvat;
  }

  public java.lang.String getConfirmation() {
    return this.confirmation;
  }

  public java.lang.Integer getGender() {
    return this.gender;
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

  public void setGroupId(java.lang.Integer groupId) {
    this.groupId = groupId;
  }

  public void setIncrementId(java.lang.String incrementId) {
    this.incrementId = incrementId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setDisableAutoGroupChange(java.lang.Integer disableAutoGroupChange) {
    this.disableAutoGroupChange = disableAutoGroupChange;
  }

  public void setCreatedIn(java.lang.String createdIn) {
    this.createdIn = createdIn;
  }

  public void setPrefix(java.lang.String prefix) {
    this.prefix = prefix;
  }

  public void setFirstname(java.lang.String firstname) {
    this.firstname = firstname;
  }

  public void setMiddlename(java.lang.String middlename) {
    this.middlename = middlename;
  }

  public void setLastname(java.lang.String lastname) {
    this.lastname = lastname;
  }

  public void setSuffix(java.lang.String suffix) {
    this.suffix = suffix;
  }

  public void setDob(java.util.Date dob) {
    this.dob = dob;
  }

  public void setPasswordHash(java.lang.String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public void setRpToken(java.lang.String rpToken) {
    this.rpToken = rpToken;
  }

  public void setRpTokenCreatedAt(java.util.Date rpTokenCreatedAt) {
    this.rpTokenCreatedAt = rpTokenCreatedAt;
  }

  public void setDefaultBilling(java.lang.Integer defaultBilling) {
    this.defaultBilling = defaultBilling;
  }

  public void setDefaultShipping(java.lang.Integer defaultShipping) {
    this.defaultShipping = defaultShipping;
  }

  public void setTaxvat(java.lang.String taxvat) {
    this.taxvat = taxvat;
  }

  public void setConfirmation(java.lang.String confirmation) {
    this.confirmation = confirmation;
  }

  public void setGender(java.lang.Integer gender) {
    this.gender = gender;
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
}
