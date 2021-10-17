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
@IdClass(EavAttributeId.class)
@Table(name = "eav_attribute")
public class EavAttribute implements Serializable {
  private static final long serialVersionUID = 163445090515993380L;

  /** Description: attribute_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;
  /** Description: entity_type_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_type_id")
  private java.lang.Integer entityTypeId;
  /** Description: attribute_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_code")
  private java.lang.String attributeCode;

  /** Description: attribute_model. */
  @Basic
  @Column(name = "attribute_model", length = 255)
  private java.lang.String attributeModel;
  /** Description: backend_model. */
  @Basic
  @Column(name = "backend_model", length = 255)
  private java.lang.String backendModel;
  /** Description: backend_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "backend_type", length = 8)
  private java.lang.String backendType;
  /** Description: backend_table. */
  @Basic
  @Column(name = "backend_table", length = 255)
  private java.lang.String backendTable;
  /** Description: frontend_model. */
  @Basic
  @Column(name = "frontend_model", length = 255)
  private java.lang.String frontendModel;
  /** Description: frontend_input. */
  @Basic
  @Column(name = "frontend_input", length = 50)
  private java.lang.String frontendInput;
  /** Description: frontend_label. */
  @Basic
  @Column(name = "frontend_label", length = 255)
  private java.lang.String frontendLabel;
  /** Description: frontend_class. */
  @Basic
  @Column(name = "frontend_class", length = 255)
  private java.lang.String frontendClass;
  /** Description: source_model. */
  @Basic
  @Column(name = "source_model", length = 255)
  private java.lang.String sourceModel;
  /** Description: is_required. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_required")
  private java.lang.Integer isRequired;
  /** Description: is_user_defined. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_user_defined")
  private java.lang.Integer isUserDefined;
  /** Description: default_value. */
  @Basic
  @Column(name = "default_value", length = 0)
  private java.lang.String defaultValue;
  /** Description: is_unique. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_unique")
  private java.lang.Integer isUnique;
  /** Description: note. */
  @Basic
  @Column(name = "note", length = 255)
  private java.lang.String note;

  public EavAttribute() {}

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public java.lang.Integer getEntityTypeId() {
    return this.entityTypeId;
  }

  public java.lang.String getAttributeCode() {
    return this.attributeCode;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public void setEntityTypeId(java.lang.Integer entityTypeId) {
    this.entityTypeId = entityTypeId;
  }

  public void setAttributeCode(java.lang.String attributeCode) {
    this.attributeCode = attributeCode;
  }

  public java.lang.String getAttributeModel() {
    return this.attributeModel;
  }

  public java.lang.String getBackendModel() {
    return this.backendModel;
  }

  public java.lang.String getBackendType() {
    return this.backendType;
  }

  public java.lang.String getBackendTable() {
    return this.backendTable;
  }

  public java.lang.String getFrontendModel() {
    return this.frontendModel;
  }

  public java.lang.String getFrontendInput() {
    return this.frontendInput;
  }

  public java.lang.String getFrontendLabel() {
    return this.frontendLabel;
  }

  public java.lang.String getFrontendClass() {
    return this.frontendClass;
  }

  public java.lang.String getSourceModel() {
    return this.sourceModel;
  }

  public java.lang.Integer getIsRequired() {
    return this.isRequired;
  }

  public java.lang.Integer getIsUserDefined() {
    return this.isUserDefined;
  }

  public java.lang.String getDefaultValue() {
    return this.defaultValue;
  }

  public java.lang.Integer getIsUnique() {
    return this.isUnique;
  }

  public java.lang.String getNote() {
    return this.note;
  }

  public void setAttributeModel(java.lang.String attributeModel) {
    this.attributeModel = attributeModel;
  }

  public void setBackendModel(java.lang.String backendModel) {
    this.backendModel = backendModel;
  }

  public void setBackendType(java.lang.String backendType) {
    this.backendType = backendType;
  }

  public void setBackendTable(java.lang.String backendTable) {
    this.backendTable = backendTable;
  }

  public void setFrontendModel(java.lang.String frontendModel) {
    this.frontendModel = frontendModel;
  }

  public void setFrontendInput(java.lang.String frontendInput) {
    this.frontendInput = frontendInput;
  }

  public void setFrontendLabel(java.lang.String frontendLabel) {
    this.frontendLabel = frontendLabel;
  }

  public void setFrontendClass(java.lang.String frontendClass) {
    this.frontendClass = frontendClass;
  }

  public void setSourceModel(java.lang.String sourceModel) {
    this.sourceModel = sourceModel;
  }

  public void setIsRequired(java.lang.Integer isRequired) {
    this.isRequired = isRequired;
  }

  public void setIsUserDefined(java.lang.Integer isUserDefined) {
    this.isUserDefined = isUserDefined;
  }

  public void setDefaultValue(java.lang.String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public void setIsUnique(java.lang.Integer isUnique) {
    this.isUnique = isUnique;
  }

  public void setNote(java.lang.String note) {
    this.note = note;
  }
}
