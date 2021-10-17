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
@Table(name = "cms_block")
public class CmsBlock implements Serializable {
  private static final long serialVersionUID = 163445090472778650L;

  /** Description: block_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "block_id")
  private java.lang.Integer blockId;

  /** Description: title. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: identifier. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "identifier", length = 255)
  private java.lang.String identifier;
  /** Description: content. */
  @Basic
  @Column(name = "content", length = 0)
  private java.lang.String content;
  /** Description: creation_time. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "creation_time")
  private java.sql.Timestamp creationTime;
  /** Description: update_time. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "update_time")
  private java.sql.Timestamp updateTime;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;

  public CmsBlock() {}

  public java.lang.Integer getBlockId() {
    return this.blockId;
  }

  public void setBlockId(java.lang.Integer blockId) {
    this.blockId = blockId;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getIdentifier() {
    return this.identifier;
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public java.sql.Timestamp getCreationTime() {
    return this.creationTime;
  }

  public java.sql.Timestamp getUpdateTime() {
    return this.updateTime;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setIdentifier(java.lang.String identifier) {
    this.identifier = identifier;
  }

  public void setContent(java.lang.String content) {
    this.content = content;
  }

  public void setCreationTime(java.sql.Timestamp creationTime) {
    this.creationTime = creationTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }
}
