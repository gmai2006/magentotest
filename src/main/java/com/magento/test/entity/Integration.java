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
@IdClass(IntegrationId.class)
@Table(name = "integration")
public class Integration implements Serializable {
  private static final long serialVersionUID = 163445090553415372L;

  /** Description: consumer_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "consumer_id")
  private java.lang.Integer consumerId;
  /** Description: integration_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "integration_id")
  private java.lang.Integer integrationId;
  /** Description: name. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "name")
  private java.lang.String name;

  /** Description: email. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "email", length = 255)
  private java.lang.String email;
  /** Description: endpoint. */
  @Basic
  @Column(name = "endpoint", length = 255)
  private java.lang.String endpoint;
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
  /** Description: setup_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "setup_type")
  private java.lang.Integer setupType;
  /** Description: identity_link_url. */
  @Basic
  @Column(name = "identity_link_url", length = 255)
  private java.lang.String identityLinkUrl;

  public Integration() {}

  public java.lang.Integer getConsumerId() {
    return this.consumerId;
  }

  public java.lang.Integer getIntegrationId() {
    return this.integrationId;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setConsumerId(java.lang.Integer consumerId) {
    this.consumerId = consumerId;
  }

  public void setIntegrationId(java.lang.Integer integrationId) {
    this.integrationId = integrationId;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.String getEndpoint() {
    return this.endpoint;
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

  public java.lang.Integer getSetupType() {
    return this.setupType;
  }

  public java.lang.String getIdentityLinkUrl() {
    return this.identityLinkUrl;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setEndpoint(java.lang.String endpoint) {
    this.endpoint = endpoint;
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

  public void setSetupType(java.lang.Integer setupType) {
    this.setupType = setupType;
  }

  public void setIdentityLinkUrl(java.lang.String identityLinkUrl) {
    this.identityLinkUrl = identityLinkUrl;
  }
}
