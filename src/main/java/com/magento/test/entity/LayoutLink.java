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
@Table(name = "layout_link")
public class LayoutLink implements Serializable {
  private static final long serialVersionUID = 163445090563467046L;

  /** Description: layout_link_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "layout_link_id")
  private java.lang.Integer layoutLinkId;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: theme_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "theme_id")
  private java.lang.Integer themeId;
  /** Description: layout_update_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "layout_update_id")
  private java.lang.Integer layoutUpdateId;
  /** Description: is_temporary. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_temporary")
  private java.lang.Integer isTemporary;

  public LayoutLink() {}

  public java.lang.Integer getLayoutLinkId() {
    return this.layoutLinkId;
  }

  public void setLayoutLinkId(java.lang.Integer layoutLinkId) {
    this.layoutLinkId = layoutLinkId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getThemeId() {
    return this.themeId;
  }

  public java.lang.Integer getLayoutUpdateId() {
    return this.layoutUpdateId;
  }

  public java.lang.Integer getIsTemporary() {
    return this.isTemporary;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setThemeId(java.lang.Integer themeId) {
    this.themeId = themeId;
  }

  public void setLayoutUpdateId(java.lang.Integer layoutUpdateId) {
    this.layoutUpdateId = layoutUpdateId;
  }

  public void setIsTemporary(java.lang.Integer isTemporary) {
    this.isTemporary = isTemporary;
  }
}
