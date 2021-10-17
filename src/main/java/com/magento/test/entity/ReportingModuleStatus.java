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
@Table(name = "reporting_module_status")
public class ReportingModuleStatus implements Serializable {
  private static final long serialVersionUID = 163445090615646269L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: name. */
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: active. */
  @Basic
  @Column(name = "active", length = 255)
  private java.lang.String active;
  /** Description: setup_version. */
  @Basic
  @Column(name = "setup_version", length = 255)
  private java.lang.String setupVersion;
  /** Description: state. */
  @Basic
  @Column(name = "state", length = 255)
  private java.lang.String state;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;

  public ReportingModuleStatus() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getActive() {
    return this.active;
  }

  public java.lang.String getSetupVersion() {
    return this.setupVersion;
  }

  public java.lang.String getState() {
    return this.state;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setActive(java.lang.String active) {
    this.active = active;
  }

  public void setSetupVersion(java.lang.String setupVersion) {
    this.setupVersion = setupVersion;
  }

  public void setState(java.lang.String state) {
    this.state = state;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
