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
@IdClass(StoreGroupId.class)
@Table(name = "store_group")
public class StoreGroup implements Serializable {
  private static final long serialVersionUID = 16344509069365137L;

  /** Description: code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "code")
  private java.lang.String code;
  /** Description: group_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "group_id")
  private java.lang.Integer groupId;

  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;
  /** Description: name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: root_category_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "root_category_id")
  private java.lang.Integer rootCategoryId;
  /** Description: default_store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "default_store_id")
  private java.lang.Integer defaultStoreId;

  public StoreGroup() {}

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.Integer getGroupId() {
    return this.groupId;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setGroupId(java.lang.Integer groupId) {
    this.groupId = groupId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.Integer getRootCategoryId() {
    return this.rootCategoryId;
  }

  public java.lang.Integer getDefaultStoreId() {
    return this.defaultStoreId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setRootCategoryId(java.lang.Integer rootCategoryId) {
    this.rootCategoryId = rootCategoryId;
  }

  public void setDefaultStoreId(java.lang.Integer defaultStoreId) {
    this.defaultStoreId = defaultStoreId;
  }
}
