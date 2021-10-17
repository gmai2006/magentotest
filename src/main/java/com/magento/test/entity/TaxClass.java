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
@Table(name = "tax_class")
public class TaxClass implements Serializable {
  private static final long serialVersionUID = 16344509069798288L;

  /** Description: class_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "class_id")
  private java.lang.Integer classId;

  /** Description: class_name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "class_name", length = 255)
  private java.lang.String className;
  /** Description: class_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "class_type", length = 8)
  private java.lang.String classType;

  public TaxClass() {}

  public java.lang.Integer getClassId() {
    return this.classId;
  }

  public void setClassId(java.lang.Integer classId) {
    this.classId = classId;
  }

  public java.lang.String getClassName() {
    return this.className;
  }

  public java.lang.String getClassType() {
    return this.classType;
  }

  public void setClassName(java.lang.String className) {
    this.className = className;
  }

  public void setClassType(java.lang.String classType) {
    this.classType = classType;
  }
}
