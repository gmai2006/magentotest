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
@Table(name = "theme_file")
public class ThemeFile implements Serializable {
  private static final long serialVersionUID = 163445090707798389L;

  /** Description: theme_files_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "theme_files_id")
  private java.lang.Integer themeFilesId;

  /** Description: theme_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "theme_id")
  private java.lang.Integer themeId;
  /** Description: file_path. */
  @Basic
  @Column(name = "file_path", length = 255)
  private java.lang.String filePath;
  /** Description: file_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "file_type", length = 32)
  private java.lang.String fileType;
  /** Description: content. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "content", length = 0)
  private java.lang.String content;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: is_temporary. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_temporary")
  private java.lang.Integer isTemporary;

  public ThemeFile() {}

  public java.lang.Integer getThemeFilesId() {
    return this.themeFilesId;
  }

  public void setThemeFilesId(java.lang.Integer themeFilesId) {
    this.themeFilesId = themeFilesId;
  }

  public java.lang.Integer getThemeId() {
    return this.themeId;
  }

  public java.lang.String getFilePath() {
    return this.filePath;
  }

  public java.lang.String getFileType() {
    return this.fileType;
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.Integer getIsTemporary() {
    return this.isTemporary;
  }

  public void setThemeId(java.lang.Integer themeId) {
    this.themeId = themeId;
  }

  public void setFilePath(java.lang.String filePath) {
    this.filePath = filePath;
  }

  public void setFileType(java.lang.String fileType) {
    this.fileType = fileType;
  }

  public void setContent(java.lang.String content) {
    this.content = content;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setIsTemporary(java.lang.Integer isTemporary) {
    this.isTemporary = isTemporary;
  }
}
