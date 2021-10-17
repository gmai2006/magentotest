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
@Table(name = "eav_entity_type")
public class EavEntityType implements Serializable {
  private static final long serialVersionUID = 163445090530474251L;

  /** Description: entity_type_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_type_id")
  private java.lang.Integer entityTypeId;

  /** Description: entity_type_code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_type_code", length = 50)
  private java.lang.String entityTypeCode;
  /** Description: entity_model. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_model", length = 255)
  private java.lang.String entityModel;
  /** Description: attribute_model. */
  @Basic
  @Column(name = "attribute_model", length = 255)
  private java.lang.String attributeModel;
  /** Description: entity_table. */
  @Basic
  @Column(name = "entity_table", length = 255)
  private java.lang.String entityTable;
  /** Description: value_table_prefix. */
  @Basic
  @Column(name = "value_table_prefix", length = 255)
  private java.lang.String valueTablePrefix;
  /** Description: entity_id_field. */
  @Basic
  @Column(name = "entity_id_field", length = 255)
  private java.lang.String entityIdField;
  /** Description: is_data_sharing. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_data_sharing")
  private java.lang.Integer isDataSharing;
  /** Description: data_sharing_key. */
  @Basic
  @Column(name = "data_sharing_key", length = 100)
  private java.lang.String dataSharingKey;
  /** Description: default_attribute_set_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "default_attribute_set_id")
  private java.lang.Integer defaultAttributeSetId;
  /** Description: increment_model. */
  @Basic
  @Column(name = "increment_model", length = 255)
  private java.lang.String incrementModel;
  /** Description: increment_per_store. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "increment_per_store")
  private java.lang.Integer incrementPerStore;
  /** Description: increment_pad_length. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "increment_pad_length")
  private java.lang.Integer incrementPadLength;
  /** Description: increment_pad_char. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "increment_pad_char", length = 1)
  private java.lang.String incrementPadChar;
  /** Description: additional_attribute_table. */
  @Basic
  @Column(name = "additional_attribute_table", length = 255)
  private java.lang.String additionalAttributeTable;
  /** Description: entity_attribute_collection. */
  @Basic
  @Column(name = "entity_attribute_collection", length = 255)
  private java.lang.String entityAttributeCollection;

  public EavEntityType() {}

  public java.lang.Integer getEntityTypeId() {
    return this.entityTypeId;
  }

  public void setEntityTypeId(java.lang.Integer entityTypeId) {
    this.entityTypeId = entityTypeId;
  }

  public java.lang.String getEntityTypeCode() {
    return this.entityTypeCode;
  }

  public java.lang.String getEntityModel() {
    return this.entityModel;
  }

  public java.lang.String getAttributeModel() {
    return this.attributeModel;
  }

  public java.lang.String getEntityTable() {
    return this.entityTable;
  }

  public java.lang.String getValueTablePrefix() {
    return this.valueTablePrefix;
  }

  public java.lang.String getEntityIdField() {
    return this.entityIdField;
  }

  public java.lang.Integer getIsDataSharing() {
    return this.isDataSharing;
  }

  public java.lang.String getDataSharingKey() {
    return this.dataSharingKey;
  }

  public java.lang.Integer getDefaultAttributeSetId() {
    return this.defaultAttributeSetId;
  }

  public java.lang.String getIncrementModel() {
    return this.incrementModel;
  }

  public java.lang.Integer getIncrementPerStore() {
    return this.incrementPerStore;
  }

  public java.lang.Integer getIncrementPadLength() {
    return this.incrementPadLength;
  }

  public java.lang.String getIncrementPadChar() {
    return this.incrementPadChar;
  }

  public java.lang.String getAdditionalAttributeTable() {
    return this.additionalAttributeTable;
  }

  public java.lang.String getEntityAttributeCollection() {
    return this.entityAttributeCollection;
  }

  public void setEntityTypeCode(java.lang.String entityTypeCode) {
    this.entityTypeCode = entityTypeCode;
  }

  public void setEntityModel(java.lang.String entityModel) {
    this.entityModel = entityModel;
  }

  public void setAttributeModel(java.lang.String attributeModel) {
    this.attributeModel = attributeModel;
  }

  public void setEntityTable(java.lang.String entityTable) {
    this.entityTable = entityTable;
  }

  public void setValueTablePrefix(java.lang.String valueTablePrefix) {
    this.valueTablePrefix = valueTablePrefix;
  }

  public void setEntityIdField(java.lang.String entityIdField) {
    this.entityIdField = entityIdField;
  }

  public void setIsDataSharing(java.lang.Integer isDataSharing) {
    this.isDataSharing = isDataSharing;
  }

  public void setDataSharingKey(java.lang.String dataSharingKey) {
    this.dataSharingKey = dataSharingKey;
  }

  public void setDefaultAttributeSetId(java.lang.Integer defaultAttributeSetId) {
    this.defaultAttributeSetId = defaultAttributeSetId;
  }

  public void setIncrementModel(java.lang.String incrementModel) {
    this.incrementModel = incrementModel;
  }

  public void setIncrementPerStore(java.lang.Integer incrementPerStore) {
    this.incrementPerStore = incrementPerStore;
  }

  public void setIncrementPadLength(java.lang.Integer incrementPadLength) {
    this.incrementPadLength = incrementPadLength;
  }

  public void setIncrementPadChar(java.lang.String incrementPadChar) {
    this.incrementPadChar = incrementPadChar;
  }

  public void setAdditionalAttributeTable(java.lang.String additionalAttributeTable) {
    this.additionalAttributeTable = additionalAttributeTable;
  }

  public void setEntityAttributeCollection(java.lang.String entityAttributeCollection) {
    this.entityAttributeCollection = entityAttributeCollection;
  }
}
