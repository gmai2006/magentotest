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
@IdClass(VariableValueId.class)
@Table(name = "variable_value")
public class VariableValue implements Serializable {
  private static final long serialVersionUID = 163445090713758343L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: variable_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "variable_id")
  private java.lang.Integer variableId;
  /** Description: value_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "value_id")
  private java.lang.Integer valueId;

  /** Description: plain_value. */
  @Basic
  @Column(name = "plain_value", length = 0)
  private java.lang.String plainValue;
  /** Description: html_value. */
  @Basic
  @Column(name = "html_value", length = 0)
  private java.lang.String htmlValue;

  public VariableValue() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getVariableId() {
    return this.variableId;
  }

  public java.lang.Integer getValueId() {
    return this.valueId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setVariableId(java.lang.Integer variableId) {
    this.variableId = variableId;
  }

  public void setValueId(java.lang.Integer valueId) {
    this.valueId = valueId;
  }

  public java.lang.String getPlainValue() {
    return this.plainValue;
  }

  public java.lang.String getHtmlValue() {
    return this.htmlValue;
  }

  public void setPlainValue(java.lang.String plainValue) {
    this.plainValue = plainValue;
  }

  public void setHtmlValue(java.lang.String htmlValue) {
    this.htmlValue = htmlValue;
  }
}
