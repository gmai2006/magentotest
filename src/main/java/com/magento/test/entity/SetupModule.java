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
@Table(name = "setup_module")
public class SetupModule implements Serializable {
  private static final long serialVersionUID = 163445090689230102L;

  /** Description: module. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "module")
  private java.lang.String module;

  /** Description: schema_version. */
  @Basic
  @Column(name = "schema_version", length = 50)
  private java.lang.String schemaVersion;
  /** Description: data_version. */
  @Basic
  @Column(name = "data_version", length = 50)
  private java.lang.String dataVersion;

  public SetupModule() {}

  public java.lang.String getModule() {
    return this.module;
  }

  public void setModule(java.lang.String module) {
    this.module = module;
  }

  public java.lang.String getSchemaVersion() {
    return this.schemaVersion;
  }

  public java.lang.String getDataVersion() {
    return this.dataVersion;
  }

  public void setSchemaVersion(java.lang.String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }

  public void setDataVersion(java.lang.String dataVersion) {
    this.dataVersion = dataVersion;
  }
}
