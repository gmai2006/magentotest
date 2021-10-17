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
@Table(name = "catalog_product_entity")
public class CatalogProductEntity implements Serializable {
  private static final long serialVersionUID = 163445090362556051L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: attribute_set_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "attribute_set_id")
  private java.lang.Integer attributeSetId;
  /** Description: type_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "type_id", length = 32)
  private java.lang.String typeId;
  /** Description: sku. */
  @Basic
  @Column(name = "sku", length = 64)
  private java.lang.String sku;
  /** Description: has_options. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "has_options")
  private java.lang.Integer hasOptions;
  /** Description: required_options. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "required_options")
  private java.lang.Integer requiredOptions;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;

  public CatalogProductEntity() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.Integer getAttributeSetId() {
    return this.attributeSetId;
  }

  public java.lang.String getTypeId() {
    return this.typeId;
  }

  public java.lang.String getSku() {
    return this.sku;
  }

  public java.lang.Integer getHasOptions() {
    return this.hasOptions;
  }

  public java.lang.Integer getRequiredOptions() {
    return this.requiredOptions;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setAttributeSetId(java.lang.Integer attributeSetId) {
    this.attributeSetId = attributeSetId;
  }

  public void setTypeId(java.lang.String typeId) {
    this.typeId = typeId;
  }

  public void setSku(java.lang.String sku) {
    this.sku = sku;
  }

  public void setHasOptions(java.lang.Integer hasOptions) {
    this.hasOptions = hasOptions;
  }

  public void setRequiredOptions(java.lang.Integer requiredOptions) {
    this.requiredOptions = requiredOptions;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
