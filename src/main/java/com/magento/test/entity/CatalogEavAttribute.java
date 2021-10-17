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
@Table(name = "catalog_eav_attribute")
public class CatalogEavAttribute implements Serializable {
  private static final long serialVersionUID = 163445090352426718L;

  /** Description: attribute_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;

  /** Description: frontend_input_renderer. */
  @Basic
  @Column(name = "frontend_input_renderer", length = 255)
  private java.lang.String frontendInputRenderer;
  /** Description: is_global. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_global")
  private java.lang.Integer isGlobal;
  /** Description: is_visible. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_visible")
  private java.lang.Integer isVisible;
  /** Description: is_searchable. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_searchable")
  private java.lang.Integer isSearchable;
  /** Description: is_filterable. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_filterable")
  private java.lang.Integer isFilterable;
  /** Description: is_comparable. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_comparable")
  private java.lang.Integer isComparable;
  /** Description: is_visible_on_front. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_visible_on_front")
  private java.lang.Integer isVisibleOnFront;
  /** Description: is_html_allowed_on_front. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_html_allowed_on_front")
  private java.lang.Integer isHtmlAllowedOnFront;
  /** Description: is_used_for_price_rules. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_used_for_price_rules")
  private java.lang.Integer isUsedForPriceRules;
  /** Description: is_filterable_in_search. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_filterable_in_search")
  private java.lang.Integer isFilterableInSearch;
  /** Description: used_in_product_listing. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "used_in_product_listing")
  private java.lang.Integer usedInProductListing;
  /** Description: used_for_sort_by. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "used_for_sort_by")
  private java.lang.Integer usedForSortBy;
  /** Description: apply_to. */
  @Basic
  @Column(name = "apply_to", length = 255)
  private java.lang.String applyTo;
  /** Description: is_visible_in_advanced_search. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_visible_in_advanced_search")
  private java.lang.Integer isVisibleInAdvancedSearch;
  /** Description: position. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "position")
  private java.lang.Integer position;
  /** Description: is_wysiwyg_enabled. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_wysiwyg_enabled")
  private java.lang.Integer isWysiwygEnabled;
  /** Description: is_used_for_promo_rules. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_used_for_promo_rules")
  private java.lang.Integer isUsedForPromoRules;
  /** Description: is_required_in_admin_store. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_required_in_admin_store")
  private java.lang.Integer isRequiredInAdminStore;
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
  /** Description: search_weight. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "search_weight")
  private java.lang.Float searchWeight;
  /** Description: additional_data. */
  @Basic
  @Column(name = "additional_data", length = 0)
  private java.lang.String additionalData;

  public CatalogEavAttribute() {}

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public java.lang.String getFrontendInputRenderer() {
    return this.frontendInputRenderer;
  }

  public java.lang.Integer getIsGlobal() {
    return this.isGlobal;
  }

  public java.lang.Integer getIsVisible() {
    return this.isVisible;
  }

  public java.lang.Integer getIsSearchable() {
    return this.isSearchable;
  }

  public java.lang.Integer getIsFilterable() {
    return this.isFilterable;
  }

  public java.lang.Integer getIsComparable() {
    return this.isComparable;
  }

  public java.lang.Integer getIsVisibleOnFront() {
    return this.isVisibleOnFront;
  }

  public java.lang.Integer getIsHtmlAllowedOnFront() {
    return this.isHtmlAllowedOnFront;
  }

  public java.lang.Integer getIsUsedForPriceRules() {
    return this.isUsedForPriceRules;
  }

  public java.lang.Integer getIsFilterableInSearch() {
    return this.isFilterableInSearch;
  }

  public java.lang.Integer getUsedInProductListing() {
    return this.usedInProductListing;
  }

  public java.lang.Integer getUsedForSortBy() {
    return this.usedForSortBy;
  }

  public java.lang.String getApplyTo() {
    return this.applyTo;
  }

  public java.lang.Integer getIsVisibleInAdvancedSearch() {
    return this.isVisibleInAdvancedSearch;
  }

  public java.lang.Integer getPosition() {
    return this.position;
  }

  public java.lang.Integer getIsWysiwygEnabled() {
    return this.isWysiwygEnabled;
  }

  public java.lang.Integer getIsUsedForPromoRules() {
    return this.isUsedForPromoRules;
  }

  public java.lang.Integer getIsRequiredInAdminStore() {
    return this.isRequiredInAdminStore;
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

  public java.lang.Float getSearchWeight() {
    return this.searchWeight;
  }

  public java.lang.String getAdditionalData() {
    return this.additionalData;
  }

  public void setFrontendInputRenderer(java.lang.String frontendInputRenderer) {
    this.frontendInputRenderer = frontendInputRenderer;
  }

  public void setIsGlobal(java.lang.Integer isGlobal) {
    this.isGlobal = isGlobal;
  }

  public void setIsVisible(java.lang.Integer isVisible) {
    this.isVisible = isVisible;
  }

  public void setIsSearchable(java.lang.Integer isSearchable) {
    this.isSearchable = isSearchable;
  }

  public void setIsFilterable(java.lang.Integer isFilterable) {
    this.isFilterable = isFilterable;
  }

  public void setIsComparable(java.lang.Integer isComparable) {
    this.isComparable = isComparable;
  }

  public void setIsVisibleOnFront(java.lang.Integer isVisibleOnFront) {
    this.isVisibleOnFront = isVisibleOnFront;
  }

  public void setIsHtmlAllowedOnFront(java.lang.Integer isHtmlAllowedOnFront) {
    this.isHtmlAllowedOnFront = isHtmlAllowedOnFront;
  }

  public void setIsUsedForPriceRules(java.lang.Integer isUsedForPriceRules) {
    this.isUsedForPriceRules = isUsedForPriceRules;
  }

  public void setIsFilterableInSearch(java.lang.Integer isFilterableInSearch) {
    this.isFilterableInSearch = isFilterableInSearch;
  }

  public void setUsedInProductListing(java.lang.Integer usedInProductListing) {
    this.usedInProductListing = usedInProductListing;
  }

  public void setUsedForSortBy(java.lang.Integer usedForSortBy) {
    this.usedForSortBy = usedForSortBy;
  }

  public void setApplyTo(java.lang.String applyTo) {
    this.applyTo = applyTo;
  }

  public void setIsVisibleInAdvancedSearch(java.lang.Integer isVisibleInAdvancedSearch) {
    this.isVisibleInAdvancedSearch = isVisibleInAdvancedSearch;
  }

  public void setPosition(java.lang.Integer position) {
    this.position = position;
  }

  public void setIsWysiwygEnabled(java.lang.Integer isWysiwygEnabled) {
    this.isWysiwygEnabled = isWysiwygEnabled;
  }

  public void setIsUsedForPromoRules(java.lang.Integer isUsedForPromoRules) {
    this.isUsedForPromoRules = isUsedForPromoRules;
  }

  public void setIsRequiredInAdminStore(java.lang.Integer isRequiredInAdminStore) {
    this.isRequiredInAdminStore = isRequiredInAdminStore;
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

  public void setSearchWeight(java.lang.Float searchWeight) {
    this.searchWeight = searchWeight;
  }

  public void setAdditionalData(java.lang.String additionalData) {
    this.additionalData = additionalData;
  }
}
