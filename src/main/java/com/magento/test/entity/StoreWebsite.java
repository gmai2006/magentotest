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
@IdClass(StoreWebsiteId.class)
@Table(name = "store_website")
public class StoreWebsite implements Serializable {
  private static final long serialVersionUID = 163445090694739313L;

  /** Description: code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "code")
  private java.lang.String code;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Description: name. */
  @Basic
  @Column(name = "name", length = 64)
  private java.lang.String name;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: default_group_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "default_group_id")
  private java.lang.Integer defaultGroupId;
  /** Description: is_default. */
  @Basic
  @Column(name = "is_default")
  private java.lang.Integer isDefault;

  public StoreWebsite() {}

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.Integer getDefaultGroupId() {
    return this.defaultGroupId;
  }

  public java.lang.Integer getIsDefault() {
    return this.isDefault;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setDefaultGroupId(java.lang.Integer defaultGroupId) {
    this.defaultGroupId = defaultGroupId;
  }

  public void setIsDefault(java.lang.Integer isDefault) {
    this.isDefault = isDefault;
  }
}
