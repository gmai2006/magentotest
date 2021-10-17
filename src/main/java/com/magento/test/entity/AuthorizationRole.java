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
@Table(name = "authorization_role")
public class AuthorizationRole implements Serializable {
  private static final long serialVersionUID = 163445090326313219L;

  /** Description: role_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "role_id")
  private java.lang.Integer roleId;

  /** Description: parent_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "parent_id")
  private java.lang.Integer parentId;
  /** Description: tree_level. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "tree_level")
  private java.lang.Integer treeLevel;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: role_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "role_type", length = 1)
  private java.lang.String roleType;
  /** Description: user_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "user_id")
  private java.lang.Integer userId;
  /** Description: user_type. */
  @Basic
  @Column(name = "user_type", length = 16)
  private java.lang.String userType;
  /** Description: role_name. */
  @Basic
  @Column(name = "role_name", length = 50)
  private java.lang.String roleName;

  public AuthorizationRole() {}

  public java.lang.Integer getRoleId() {
    return this.roleId;
  }

  public void setRoleId(java.lang.Integer roleId) {
    this.roleId = roleId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.lang.Integer getTreeLevel() {
    return this.treeLevel;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.String getRoleType() {
    return this.roleType;
  }

  public java.lang.Integer getUserId() {
    return this.userId;
  }

  public java.lang.String getUserType() {
    return this.userType;
  }

  public java.lang.String getRoleName() {
    return this.roleName;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setTreeLevel(java.lang.Integer treeLevel) {
    this.treeLevel = treeLevel;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setRoleType(java.lang.String roleType) {
    this.roleType = roleType;
  }

  public void setUserId(java.lang.Integer userId) {
    this.userId = userId;
  }

  public void setUserType(java.lang.String userType) {
    this.userType = userType;
  }

  public void setRoleName(java.lang.String roleName) {
    this.roleName = roleName;
  }
}
