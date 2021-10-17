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
@Table(name = "customer_eav_attribute")
public class CustomerEavAttribute implements Serializable {
  private static final long serialVersionUID = 163445090487760760L;

  /** Description: attribute_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;

  /** Description: is_visible. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_visible")
  private java.lang.Integer isVisible;
  /** Description: input_filter. */
  @Basic
  @Column(name = "input_filter", length = 255)
  private java.lang.String inputFilter;
  /** Description: multiline_count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "multiline_count")
  private java.lang.Integer multilineCount;
  /** Description: validate_rules. */
  @Basic
  @Column(name = "validate_rules", length = 0)
  private java.lang.String validateRules;
  /** Description: is_system. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_system")
  private java.lang.Integer isSystem;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: data_model. */
  @Basic
  @Column(name = "data_model", length = 255)
  private java.lang.String dataModel;
  /** Description: is_used_in_grid. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_used_in_grid")
  private java.lang.Integer isUsedInGrid;
  /** Description: is_visible_in_grid. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_visible_in_grid")
  private java.lang.Integer isVisibleInGrid;
  /** Description: is_filterable_in_grid. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_filterable_in_grid")
  private java.lang.Integer isFilterableInGrid;
  /** Description: is_searchable_in_grid. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_searchable_in_grid")
  private java.lang.Integer isSearchableInGrid;

  public CustomerEavAttribute() {}

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public java.lang.Integer getIsVisible() {
    return this.isVisible;
  }

  public java.lang.String getInputFilter() {
    return this.inputFilter;
  }

  public java.lang.Integer getMultilineCount() {
    return this.multilineCount;
  }

  public java.lang.String getValidateRules() {
    return this.validateRules;
  }

  public java.lang.Integer getIsSystem() {
    return this.isSystem;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.String getDataModel() {
    return this.dataModel;
  }

  public java.lang.Integer getIsUsedInGrid() {
    return this.isUsedInGrid;
  }

  public java.lang.Integer getIsVisibleInGrid() {
    return this.isVisibleInGrid;
  }

  public java.lang.Integer getIsFilterableInGrid() {
    return this.isFilterableInGrid;
  }

  public java.lang.Integer getIsSearchableInGrid() {
    return this.isSearchableInGrid;
  }

  public void setIsVisible(java.lang.Integer isVisible) {
    this.isVisible = isVisible;
  }

  public void setInputFilter(java.lang.String inputFilter) {
    this.inputFilter = inputFilter;
  }

  public void setMultilineCount(java.lang.Integer multilineCount) {
    this.multilineCount = multilineCount;
  }

  public void setValidateRules(java.lang.String validateRules) {
    this.validateRules = validateRules;
  }

  public void setIsSystem(java.lang.Integer isSystem) {
    this.isSystem = isSystem;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setDataModel(java.lang.String dataModel) {
    this.dataModel = dataModel;
  }

  public void setIsUsedInGrid(java.lang.Integer isUsedInGrid) {
    this.isUsedInGrid = isUsedInGrid;
  }

  public void setIsVisibleInGrid(java.lang.Integer isVisibleInGrid) {
    this.isVisibleInGrid = isVisibleInGrid;
  }

  public void setIsFilterableInGrid(java.lang.Integer isFilterableInGrid) {
    this.isFilterableInGrid = isFilterableInGrid;
  }

  public void setIsSearchableInGrid(java.lang.Integer isSearchableInGrid) {
    this.isSearchableInGrid = isSearchableInGrid;
  }
}
