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
@IdClass(EavFormElementId.class)
@Table(name = "eav_form_element")
public class EavFormElement implements Serializable {
  private static final long serialVersionUID = 163445090533472097L;

  /** Description: type_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "type_id")
  private java.lang.Integer typeId;
  /** Description: attribute_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;
  /** Description: element_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "element_id")
  private java.lang.Integer elementId;

  /** Description: fieldset_id. */
  @Basic
  @Column(name = "fieldset_id")
  private java.lang.Integer fieldsetId;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;

  public EavFormElement() {}

  public java.lang.Integer getTypeId() {
    return this.typeId;
  }

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public java.lang.Integer getElementId() {
    return this.elementId;
  }

  public void setTypeId(java.lang.Integer typeId) {
    this.typeId = typeId;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public void setElementId(java.lang.Integer elementId) {
    this.elementId = elementId;
  }

  public java.lang.Integer getFieldsetId() {
    return this.fieldsetId;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public void setFieldsetId(java.lang.Integer fieldsetId) {
    this.fieldsetId = fieldsetId;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }
}
