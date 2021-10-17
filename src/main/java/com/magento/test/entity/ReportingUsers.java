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
@Table(name = "reporting_users")
public class ReportingUsers implements Serializable {
  private static final long serialVersionUID = 163445090616681444L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: type. */
  @Basic
  @Column(name = "type", length = 255)
  private java.lang.String type;
  /** Description: action. */
  @Basic
  @Column(name = "action", length = 255)
  private java.lang.String action;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;

  public ReportingUsers() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public java.lang.String getAction() {
    return this.action;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void setAction(java.lang.String action) {
    this.action = action;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
