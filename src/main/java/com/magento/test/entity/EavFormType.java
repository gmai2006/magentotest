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
@IdClass(EavFormTypeId.class)
@Table(name = "eav_form_type")
public class EavFormType implements Serializable {
  private static final long serialVersionUID = 163445090536861093L;

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
  /** Description: type_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "type_id")
  private java.lang.Integer typeId;
  /** Description: theme. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "theme")
  private java.lang.String theme;

  /** Description: label. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "label", length = 255)
  private java.lang.String label;
  /** Description: is_system. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_system")
  private java.lang.Integer isSystem;

  public EavFormType() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.Integer getTypeId() {
    return this.typeId;
  }

  public java.lang.String getTheme() {
    return this.theme;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setTypeId(java.lang.Integer typeId) {
    this.typeId = typeId;
  }

  public void setTheme(java.lang.String theme) {
    this.theme = theme;
  }

  public java.lang.String getLabel() {
    return this.label;
  }

  public java.lang.Integer getIsSystem() {
    return this.isSystem;
  }

  public void setLabel(java.lang.String label) {
    this.label = label;
  }

  public void setIsSystem(java.lang.Integer isSystem) {
    this.isSystem = isSystem;
  }
}
