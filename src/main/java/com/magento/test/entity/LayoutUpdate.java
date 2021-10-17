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
@Table(name = "layout_update")
public class LayoutUpdate implements Serializable {
  private static final long serialVersionUID = 163445090563992486L;

  /** Description: layout_update_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "layout_update_id")
  private java.lang.Integer layoutUpdateId;

  /** Description: handle. */
  @Basic
  @Column(name = "handle", length = 255)
  private java.lang.String handle;
  /** Description: xml. */
  @Basic
  @Column(name = "xml", length = 0)
  private java.lang.String xml;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;

  public LayoutUpdate() {}

  public java.lang.Integer getLayoutUpdateId() {
    return this.layoutUpdateId;
  }

  public void setLayoutUpdateId(java.lang.Integer layoutUpdateId) {
    this.layoutUpdateId = layoutUpdateId;
  }

  public java.lang.String getHandle() {
    return this.handle;
  }

  public java.lang.String getXml() {
    return this.xml;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setHandle(java.lang.String handle) {
    this.handle = handle;
  }

  public void setXml(java.lang.String xml) {
    this.xml = xml;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
