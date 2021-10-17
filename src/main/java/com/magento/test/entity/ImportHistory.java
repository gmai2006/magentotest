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
@Table(name = "import_history")
public class ImportHistory implements Serializable {
  private static final long serialVersionUID = 163445090551138947L;

  /** Description: history_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "history_id")
  private java.lang.Integer historyId;

  /** Description: started_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "started_at")
  private java.sql.Timestamp startedAt;
  /** Description: user_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "user_id")
  private java.lang.Integer userId;
  /** Description: imported_file. */
  @Basic
  @Column(name = "imported_file", length = 255)
  private java.lang.String importedFile;
  /** Description: execution_time. */
  @Basic
  @Column(name = "execution_time", length = 255)
  private java.lang.String executionTime;
  /** Description: summary. */
  @Basic
  @Column(name = "summary", length = 255)
  private java.lang.String summary;
  /** Description: error_file. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "error_file", length = 255)
  private java.lang.String errorFile;

  public ImportHistory() {}

  public java.lang.Integer getHistoryId() {
    return this.historyId;
  }

  public void setHistoryId(java.lang.Integer historyId) {
    this.historyId = historyId;
  }

  public java.sql.Timestamp getStartedAt() {
    return this.startedAt;
  }

  public java.lang.Integer getUserId() {
    return this.userId;
  }

  public java.lang.String getImportedFile() {
    return this.importedFile;
  }

  public java.lang.String getExecutionTime() {
    return this.executionTime;
  }

  public java.lang.String getSummary() {
    return this.summary;
  }

  public java.lang.String getErrorFile() {
    return this.errorFile;
  }

  public void setStartedAt(java.sql.Timestamp startedAt) {
    this.startedAt = startedAt;
  }

  public void setUserId(java.lang.Integer userId) {
    this.userId = userId;
  }

  public void setImportedFile(java.lang.String importedFile) {
    this.importedFile = importedFile;
  }

  public void setExecutionTime(java.lang.String executionTime) {
    this.executionTime = executionTime;
  }

  public void setSummary(java.lang.String summary) {
    this.summary = summary;
  }

  public void setErrorFile(java.lang.String errorFile) {
    this.errorFile = errorFile;
  }
}
