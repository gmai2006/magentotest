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
@IdClass(OauthConsumerId.class)
@Table(name = "oauth_consumer")
public class OauthConsumer implements Serializable {
  private static final long serialVersionUID = 163445090574342660L;

  /** Description: secret. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "secret")
  private java.lang.String secret;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: key. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "key")
  private java.lang.String key;

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
  /** Description: name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: callback_url. */
  @Basic
  @Column(name = "callback_url", length = 0)
  private java.lang.String callbackUrl;
  /** Description: rejected_callback_url. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "rejected_callback_url", length = 0)
  private java.lang.String rejectedCallbackUrl;

  public OauthConsumer() {}

  public java.lang.String getSecret() {
    return this.secret;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.String getKey() {
    return this.key;
  }

  public void setSecret(java.lang.String secret) {
    this.secret = secret;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setKey(java.lang.String key) {
    this.key = key;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getCallbackUrl() {
    return this.callbackUrl;
  }

  public java.lang.String getRejectedCallbackUrl() {
    return this.rejectedCallbackUrl;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setCallbackUrl(java.lang.String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public void setRejectedCallbackUrl(java.lang.String rejectedCallbackUrl) {
    this.rejectedCallbackUrl = rejectedCallbackUrl;
  }
}
