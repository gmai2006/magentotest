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
@Table(name = "ui_bookmark")
public class UiBookmark implements Serializable {
  private static final long serialVersionUID = 163445090709991987L;

  /** Description: bookmark_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "bookmark_id")
  private java.lang.Integer bookmarkId;

  /** Description: user_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "user_id")
  private java.lang.Integer userId;
  /** Description: namespace. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "namespace", length = 255)
  private java.lang.String namespace;
  /** Description: identifier. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "identifier", length = 255)
  private java.lang.String identifier;
  /** Description: current. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "current")
  private java.lang.Integer current;
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: config. */
  @Basic
  @Column(name = "config", length = 0)
  private java.lang.String config;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.util.Date createdAt;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.util.Date updatedAt;

  public UiBookmark() {}

  public java.lang.Integer getBookmarkId() {
    return this.bookmarkId;
  }

  public void setBookmarkId(java.lang.Integer bookmarkId) {
    this.bookmarkId = bookmarkId;
  }

  public java.lang.Integer getUserId() {
    return this.userId;
  }

  public java.lang.String getNamespace() {
    return this.namespace;
  }

  public java.lang.String getIdentifier() {
    return this.identifier;
  }

  public java.lang.Integer getCurrent() {
    return this.current;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getConfig() {
    return this.config;
  }

  public java.util.Date getCreatedAt() {
    return this.createdAt;
  }

  public java.util.Date getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUserId(java.lang.Integer userId) {
    this.userId = userId;
  }

  public void setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
  }

  public void setIdentifier(java.lang.String identifier) {
    this.identifier = identifier;
  }

  public void setCurrent(java.lang.Integer current) {
    this.current = current;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setConfig(java.lang.String config) {
    this.config = config;
  }

  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
  }
}
