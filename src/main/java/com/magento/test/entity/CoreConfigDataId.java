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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** embeddable class Id for CoreConfigData. generated on 10/16/2021 from a schema. */
public class CoreConfigDataId implements Serializable {
  private static final long serialVersionUID = 163445090477221384L;

  @Column(name = "path")
  private java.lang.String path;

  @Column(name = "config_id")
  private java.lang.Integer configId;

  @Column(name = "scope_id")
  private java.lang.Integer scopeId;

  @Column(name = "scope")
  private java.lang.String scope;

  /** Constructor: CoreConfigDataId. */
  public CoreConfigDataId() {}

  /**
   * Constructor: CoreConfigDataId.
   *
   * @param path - path.
   * @param configId - configId.
   * @param scopeId - scopeId.
   * @param scope - scope.
   */
  public CoreConfigDataId(
      java.lang.String path,
      java.lang.Integer configId,
      java.lang.Integer scopeId,
      java.lang.String scope) {
    this.path = path;
    this.configId = configId;
    this.scopeId = scopeId;
    this.scope = scope;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((path == null) ? 0 : path.hashCode());
    result = prime * result + ((configId == null) ? 0 : configId.hashCode());
    result = prime * result + ((scopeId == null) ? 0 : scopeId.hashCode());
    result = prime * result + ((scope == null) ? 0 : scope.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CoreConfigDataId other = (CoreConfigDataId) obj;

    if (path == null) {
      if (other.path != null) return false;
    } else if (!path.equals(other.path)) return false;

    if (configId == null) {
      if (other.configId != null) return false;
    } else if (!configId.equals(other.configId)) return false;

    if (scopeId == null) {
      if (other.scopeId != null) return false;
    } else if (!scopeId.equals(other.scopeId)) return false;

    if (scope == null) {
      if (other.scope != null) return false;
    } else if (!scope.equals(other.scope)) return false;

    return true;
  }
}
