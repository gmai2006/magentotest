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
@Table(name = "cron_schedule")
public class CronSchedule implements Serializable {
  private static final long serialVersionUID = 163445090478727102L;

  /** Description: schedule_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "schedule_id")
  private java.lang.Integer scheduleId;

  /** Description: job_code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "job_code", length = 255)
  private java.lang.String jobCode;
  /** Description: status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "status", length = 7)
  private java.lang.String status;
  /** Description: messages. */
  @Basic
  @Column(name = "messages", length = 0)
  private java.lang.String messages;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: scheduled_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "scheduled_at")
  private java.sql.Timestamp scheduledAt;
  /** Description: executed_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "executed_at")
  private java.sql.Timestamp executedAt;
  /** Description: finished_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "finished_at")
  private java.sql.Timestamp finishedAt;

  public CronSchedule() {}

  public java.lang.Integer getScheduleId() {
    return this.scheduleId;
  }

  public void setScheduleId(java.lang.Integer scheduleId) {
    this.scheduleId = scheduleId;
  }

  public java.lang.String getJobCode() {
    return this.jobCode;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.lang.String getMessages() {
    return this.messages;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getScheduledAt() {
    return this.scheduledAt;
  }

  public java.sql.Timestamp getExecutedAt() {
    return this.executedAt;
  }

  public java.sql.Timestamp getFinishedAt() {
    return this.finishedAt;
  }

  public void setJobCode(java.lang.String jobCode) {
    this.jobCode = jobCode;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setMessages(java.lang.String messages) {
    this.messages = messages;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setScheduledAt(java.sql.Timestamp scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public void setExecutedAt(java.sql.Timestamp executedAt) {
    this.executedAt = executedAt;
  }

  public void setFinishedAt(java.sql.Timestamp finishedAt) {
    this.finishedAt = finishedAt;
  }
}
