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
@IdClass(EavAttributeGroupId.class)
@Table(name = "eav_attribute_group")
public class EavAttributeGroup implements Serializable {
  private static final long serialVersionUID = 163445090517758148L;

  /** Description: attribute_group_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_group_id")
  private java.lang.Integer attributeGroupId;
  /** Description: attribute_group_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_group_code")
  private java.lang.String attributeGroupCode;
  /** Description: attribute_set_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_set_id")
  private java.lang.Integer attributeSetId;
  /** Description: attribute_group_name. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_group_name")
  private java.lang.String attributeGroupName;

  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: default_id. */
  @Basic
  @Column(name = "default_id")
  private java.lang.Integer defaultId;
  /** Description: tab_group_code. */
  @Basic
  @Column(name = "tab_group_code", length = 255)
  private java.lang.String tabGroupCode;

  public EavAttributeGroup() {}

  public java.lang.Integer getAttributeGroupId() {
    return this.attributeGroupId;
  }

  public java.lang.String getAttributeGroupCode() {
    return this.attributeGroupCode;
  }

  public java.lang.Integer getAttributeSetId() {
    return this.attributeSetId;
  }

  public java.lang.String getAttributeGroupName() {
    return this.attributeGroupName;
  }

  public void setAttributeGroupId(java.lang.Integer attributeGroupId) {
    this.attributeGroupId = attributeGroupId;
  }

  public void setAttributeGroupCode(java.lang.String attributeGroupCode) {
    this.attributeGroupCode = attributeGroupCode;
  }

  public void setAttributeSetId(java.lang.Integer attributeSetId) {
    this.attributeSetId = attributeSetId;
  }

  public void setAttributeGroupName(java.lang.String attributeGroupName) {
    this.attributeGroupName = attributeGroupName;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.Integer getDefaultId() {
    return this.defaultId;
  }

  public java.lang.String getTabGroupCode() {
    return this.tabGroupCode;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setDefaultId(java.lang.Integer defaultId) {
    this.defaultId = defaultId;
  }

  public void setTabGroupCode(java.lang.String tabGroupCode) {
    this.tabGroupCode = tabGroupCode;
  }
}
