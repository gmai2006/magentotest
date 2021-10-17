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
@IdClass(QueueMessageStatusId.class)
@Table(name = "queue_message_status")
public class QueueMessageStatus implements Serializable {
  private static final long serialVersionUID = 163445090589197808L;

  /** Description: message_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "message_id")
  private java.lang.Long messageId;
  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Long id;
  /** Description: queue_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "queue_id")
  private java.lang.Integer queueId;

  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;
  /** Description: status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "status")
  private java.lang.Integer status;
  /** Description: number_of_trials. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "number_of_trials")
  private java.lang.Integer numberOfTrials;

  public QueueMessageStatus() {}

  public java.lang.Long getMessageId() {
    return this.messageId;
  }

  public java.lang.Long getId() {
    return this.id;
  }

  public java.lang.Integer getQueueId() {
    return this.queueId;
  }

  public void setMessageId(java.lang.Long messageId) {
    this.messageId = messageId;
  }

  public void setId(java.lang.Long id) {
    this.id = id;
  }

  public void setQueueId(java.lang.Integer queueId) {
    this.queueId = queueId;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.Integer getStatus() {
    return this.status;
  }

  public java.lang.Integer getNumberOfTrials() {
    return this.numberOfTrials;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setStatus(java.lang.Integer status) {
    this.status = status;
  }

  public void setNumberOfTrials(java.lang.Integer numberOfTrials) {
    this.numberOfTrials = numberOfTrials;
  }
}
