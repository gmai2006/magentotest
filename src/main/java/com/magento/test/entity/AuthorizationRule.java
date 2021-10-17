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
@Table(name = "authorization_rule")
public class AuthorizationRule implements Serializable {
  private static final long serialVersionUID = 163445090327562113L;

  /** Description: rule_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "rule_id")
  private java.lang.Integer ruleId;

  /** Description: role_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "role_id")
  private java.lang.Integer roleId;
  /** Description: resource_id. */
  @Basic
  @Column(name = "resource_id", length = 255)
  private java.lang.String resourceId;
  /** Description: privileges. */
  @Basic
  @Column(name = "privileges", length = 20)
  private java.lang.String privileges;
  /** Description: permission. */
  @Basic
  @Column(name = "permission", length = 10)
  private java.lang.String permission;

  public AuthorizationRule() {}

  public java.lang.Integer getRuleId() {
    return this.ruleId;
  }

  public void setRuleId(java.lang.Integer ruleId) {
    this.ruleId = ruleId;
  }

  public java.lang.Integer getRoleId() {
    return this.roleId;
  }

  public java.lang.String getResourceId() {
    return this.resourceId;
  }

  public java.lang.String getPrivileges() {
    return this.privileges;
  }

  public java.lang.String getPermission() {
    return this.permission;
  }

  public void setRoleId(java.lang.Integer roleId) {
    this.roleId = roleId;
  }

  public void setResourceId(java.lang.String resourceId) {
    this.resourceId = resourceId;
  }

  public void setPrivileges(java.lang.String privileges) {
    this.privileges = privileges;
  }

  public void setPermission(java.lang.String permission) {
    this.permission = permission;
  }
}
