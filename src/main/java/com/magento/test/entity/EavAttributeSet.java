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
@IdClass(EavAttributeSetId.class)
@Table(name = "eav_attribute_set")
public class EavAttributeSet implements Serializable {
  private static final long serialVersionUID = 163445090521599421L;

  /** Description: attribute_set_name. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_set_name")
  private java.lang.String attributeSetName;
  /** Description: attribute_set_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_set_id")
  private java.lang.Integer attributeSetId;
  /** Description: entity_type_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_type_id")
  private java.lang.Integer entityTypeId;

  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;

  public EavAttributeSet() {}

  public java.lang.String getAttributeSetName() {
    return this.attributeSetName;
  }

  public java.lang.Integer getAttributeSetId() {
    return this.attributeSetId;
  }

  public java.lang.Integer getEntityTypeId() {
    return this.entityTypeId;
  }

  public void setAttributeSetName(java.lang.String attributeSetName) {
    this.attributeSetName = attributeSetName;
  }

  public void setAttributeSetId(java.lang.Integer attributeSetId) {
    this.attributeSetId = attributeSetId;
  }

  public void setEntityTypeId(java.lang.Integer entityTypeId) {
    this.entityTypeId = entityTypeId;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }
}
