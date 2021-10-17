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
@IdClass(CoreConfigDataId.class)
@Table(name = "core_config_data")
public class CoreConfigData implements Serializable {
  private static final long serialVersionUID = 163445090478184565L;

  /** Description: path. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "path")
  private java.lang.String path;
  /** Description: config_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "config_id")
  private java.lang.Integer configId;
  /** Description: scope_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "scope_id")
  private java.lang.Integer scopeId;
  /** Description: scope. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "scope")
  private java.lang.String scope;

  /** Description: value. */
  @Basic
  @Column(name = "value", length = 0)
  private java.lang.String value;

  public CoreConfigData() {}

  public java.lang.String getPath() {
    return this.path;
  }

  public java.lang.Integer getConfigId() {
    return this.configId;
  }

  public java.lang.Integer getScopeId() {
    return this.scopeId;
  }

  public java.lang.String getScope() {
    return this.scope;
  }

  public void setPath(java.lang.String path) {
    this.path = path;
  }

  public void setConfigId(java.lang.Integer configId) {
    this.configId = configId;
  }

  public void setScopeId(java.lang.Integer scopeId) {
    this.scopeId = scopeId;
  }

  public void setScope(java.lang.String scope) {
    this.scope = scope;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }
}
