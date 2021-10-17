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
@IdClass(PersistentSessionId.class)
@Table(name = "persistent_session")
public class PersistentSession implements Serializable {
  private static final long serialVersionUID = 163445090584410192L;

  /** Description: persistent_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "persistent_id")
  private java.lang.Integer persistentId;
  /** Description: customer_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: key. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "key")
  private java.lang.String key;

  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;
  /** Description: info. */
  @Basic
  @Column(name = "info", length = 0)
  private java.lang.String info;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;

  public PersistentSession() {}

  public java.lang.Integer getPersistentId() {
    return this.persistentId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getKey() {
    return this.key;
  }

  public void setPersistentId(java.lang.Integer persistentId) {
    this.persistentId = persistentId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setKey(java.lang.String key) {
    this.key = key;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.String getInfo() {
    return this.info;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setInfo(java.lang.String info) {
    this.info = info;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
