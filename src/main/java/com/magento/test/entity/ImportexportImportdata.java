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
@Table(name = "importexport_importdata")
public class ImportexportImportdata implements Serializable {
  private static final long serialVersionUID = 163445090551716646L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: entity. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity", length = 50)
  private java.lang.String entity;
  /** Description: behavior. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "behavior", length = 10)
  private java.lang.String behavior;
  /** Description: data. */
  @Basic
  @Column(name = "data", length = 0)
  private java.lang.String data;

  public ImportexportImportdata() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getEntity() {
    return this.entity;
  }

  public java.lang.String getBehavior() {
    return this.behavior;
  }

  public java.lang.String getData() {
    return this.data;
  }

  public void setEntity(java.lang.String entity) {
    this.entity = entity;
  }

  public void setBehavior(java.lang.String behavior) {
    this.behavior = behavior;
  }

  public void setData(java.lang.String data) {
    this.data = data;
  }
}
