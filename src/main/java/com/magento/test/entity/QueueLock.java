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
@IdClass(QueueLockId.class)
@Table(name = "queue_lock")
public class QueueLock implements Serializable {
  private static final long serialVersionUID = 163445090588095953L;

  /** Description: message_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "message_code")
  private java.lang.String messageCode;
  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;

  public QueueLock() {}

  public java.lang.String getMessageCode() {
    return this.messageCode;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setMessageCode(java.lang.String messageCode) {
    this.messageCode = messageCode;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }
}
