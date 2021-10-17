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
@IdClass(MagentoBulkId.class)
@Table(name = "magento_bulk")
public class MagentoBulk implements Serializable {
  private static final long serialVersionUID = 163445090566073705L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;
  /** Description: uuid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "uuid")
  private byte[] uuid;

  /** Description: user_id. */
  @Basic
  @Column(name = "user_id")
  private java.lang.Integer userId;
  /** Description: user_type. */
  @Basic
  @Column(name = "user_type")
  private java.lang.Integer userType;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 255)
  private java.lang.String description;
  /** Description: operation_count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "operation_count")
  private java.lang.Integer operationCount;
  /** Description: start_time. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "start_time")
  private java.sql.Timestamp startTime;

  public MagentoBulk() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public byte[] getUuid() {
    return this.uuid;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public void setUuid(byte[] uuid) {
    this.uuid = uuid;
  }

  public java.lang.Integer getUserId() {
    return this.userId;
  }

  public java.lang.Integer getUserType() {
    return this.userType;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.lang.Integer getOperationCount() {
    return this.operationCount;
  }

  public java.sql.Timestamp getStartTime() {
    return this.startTime;
  }

  public void setUserId(java.lang.Integer userId) {
    this.userId = userId;
  }

  public void setUserType(java.lang.Integer userType) {
    this.userType = userType;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setOperationCount(java.lang.Integer operationCount) {
    this.operationCount = operationCount;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }
}
