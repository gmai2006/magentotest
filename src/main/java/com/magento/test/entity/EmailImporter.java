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
@Table(name = "email_importer")
public class EmailImporter implements Serializable {
  private static final long serialVersionUID = 163445090543621054L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: import_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "import_type", length = 255)
  private java.lang.String importType;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;
  /** Description: import_status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "import_status")
  private java.lang.Integer importStatus;
  /** Description: import_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "import_id", length = 255)
  private java.lang.String importId;
  /** Description: import_data. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "import_data")
  private java.lang.String importData;
  /** Description: import_mode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "import_mode", length = 255)
  private java.lang.String importMode;
  /** Description: import_file. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "import_file", length = 0)
  private java.lang.String importFile;
  /** Description: message. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "message", length = 255)
  private java.lang.String message;
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
  /** Description: import_started. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "import_started")
  private java.sql.Timestamp importStarted;
  /** Description: import_finished. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "import_finished")
  private java.sql.Timestamp importFinished;

  public EmailImporter() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getImportType() {
    return this.importType;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.Integer getImportStatus() {
    return this.importStatus;
  }

  public java.lang.String getImportId() {
    return this.importId;
  }

  public java.lang.String getImportData() {
    return this.importData;
  }

  public java.lang.String getImportMode() {
    return this.importMode;
  }

  public java.lang.String getImportFile() {
    return this.importFile;
  }

  public java.lang.String getMessage() {
    return this.message;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.sql.Timestamp getImportStarted() {
    return this.importStarted;
  }

  public java.sql.Timestamp getImportFinished() {
    return this.importFinished;
  }

  public void setImportType(java.lang.String importType) {
    this.importType = importType;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setImportStatus(java.lang.Integer importStatus) {
    this.importStatus = importStatus;
  }

  public void setImportId(java.lang.String importId) {
    this.importId = importId;
  }

  public void setImportData(java.lang.String importData) {
    this.importData = importData;
  }

  public void setImportMode(java.lang.String importMode) {
    this.importMode = importMode;
  }

  public void setImportFile(java.lang.String importFile) {
    this.importFile = importFile;
  }

  public void setMessage(java.lang.String message) {
    this.message = message;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setImportStarted(java.sql.Timestamp importStarted) {
    this.importStarted = importStarted;
  }

  public void setImportFinished(java.sql.Timestamp importFinished) {
    this.importFinished = importFinished;
  }
}
