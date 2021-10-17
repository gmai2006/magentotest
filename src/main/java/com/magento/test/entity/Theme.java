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
@Table(name = "theme")
public class Theme implements Serializable {
  private static final long serialVersionUID = 163445090707072546L;

  /** Description: theme_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "theme_id")
  private java.lang.Integer themeId;

  /** Description: parent_id. */
  @Basic
  @Column(name = "parent_id")
  private java.lang.Integer parentId;
  /** Description: theme_path. */
  @Basic
  @Column(name = "theme_path", length = 255)
  private java.lang.String themePath;
  /** Description: theme_title. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "theme_title", length = 255)
  private java.lang.String themeTitle;
  /** Description: preview_image. */
  @Basic
  @Column(name = "preview_image", length = 255)
  private java.lang.String previewImage;
  /** Description: is_featured. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_featured")
  private java.lang.Integer isFeatured;
  /** Description: area. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "area", length = 255)
  private java.lang.String area;
  /** Description: type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "type")
  private java.lang.Integer type;
  /** Description: code. */
  @Basic
  @Column(name = "code", length = 0)
  private java.lang.String code;

  public Theme() {}

  public java.lang.Integer getThemeId() {
    return this.themeId;
  }

  public void setThemeId(java.lang.Integer themeId) {
    this.themeId = themeId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.lang.String getThemePath() {
    return this.themePath;
  }

  public java.lang.String getThemeTitle() {
    return this.themeTitle;
  }

  public java.lang.String getPreviewImage() {
    return this.previewImage;
  }

  public java.lang.Integer getIsFeatured() {
    return this.isFeatured;
  }

  public java.lang.String getArea() {
    return this.area;
  }

  public java.lang.Integer getType() {
    return this.type;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setThemePath(java.lang.String themePath) {
    this.themePath = themePath;
  }

  public void setThemeTitle(java.lang.String themeTitle) {
    this.themeTitle = themeTitle;
  }

  public void setPreviewImage(java.lang.String previewImage) {
    this.previewImage = previewImage;
  }

  public void setIsFeatured(java.lang.Integer isFeatured) {
    this.isFeatured = isFeatured;
  }

  public void setArea(java.lang.String area) {
    this.area = area;
  }

  public void setType(java.lang.Integer type) {
    this.type = type;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }
}
