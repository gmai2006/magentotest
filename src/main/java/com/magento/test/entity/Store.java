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
@IdClass(StoreId.class)
@Table(name = "store")
public class Store implements Serializable {
  private static final long serialVersionUID = 163445090692537509L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "code")
  private java.lang.String code;

  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;
  /** Description: group_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "group_id")
  private java.lang.Integer groupId;
  /** Description: name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;

  public Store() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.Integer getGroupId() {
    return this.groupId;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setGroupId(java.lang.Integer groupId) {
    this.groupId = groupId;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }
}
