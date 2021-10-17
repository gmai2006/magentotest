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
@IdClass(OauthTokenId.class)
@Table(name = "oauth_token")
public class OauthToken implements Serializable {
  private static final long serialVersionUID = 163445090576466549L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: token. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "token")
  private java.lang.String token;

  /** Description: consumer_id. */
  @Basic
  @Column(name = "consumer_id")
  private java.lang.Integer consumerId;
  /** Description: admin_id. */
  @Basic
  @Column(name = "admin_id")
  private java.lang.Integer adminId;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "type", length = 16)
  private java.lang.String type;
  /** Description: secret. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "secret", length = 32)
  private java.lang.String secret;
  /** Description: verifier. */
  @Basic
  @Column(name = "verifier", length = 32)
  private java.lang.String verifier;
  /** Description: callback_url. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "callback_url", length = 0)
  private java.lang.String callbackUrl;
  /** Description: revoked. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "revoked")
  private java.lang.Integer revoked;
  /** Description: authorized. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "authorized")
  private java.lang.Integer authorized;
  /** Description: user_type. */
  @Basic
  @Column(name = "user_type")
  private java.lang.Integer userType;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;

  public OauthToken() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.String getToken() {
    return this.token;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setToken(java.lang.String token) {
    this.token = token;
  }

  public java.lang.Integer getConsumerId() {
    return this.consumerId;
  }

  public java.lang.Integer getAdminId() {
    return this.adminId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public java.lang.String getSecret() {
    return this.secret;
  }

  public java.lang.String getVerifier() {
    return this.verifier;
  }

  public java.lang.String getCallbackUrl() {
    return this.callbackUrl;
  }

  public java.lang.Integer getRevoked() {
    return this.revoked;
  }

  public java.lang.Integer getAuthorized() {
    return this.authorized;
  }

  public java.lang.Integer getUserType() {
    return this.userType;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public void setConsumerId(java.lang.Integer consumerId) {
    this.consumerId = consumerId;
  }

  public void setAdminId(java.lang.Integer adminId) {
    this.adminId = adminId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void setSecret(java.lang.String secret) {
    this.secret = secret;
  }

  public void setVerifier(java.lang.String verifier) {
    this.verifier = verifier;
  }

  public void setCallbackUrl(java.lang.String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public void setRevoked(java.lang.Integer revoked) {
    this.revoked = revoked;
  }

  public void setAuthorized(java.lang.Integer authorized) {
    this.authorized = authorized;
  }

  public void setUserType(java.lang.Integer userType) {
    this.userType = userType;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }
}
