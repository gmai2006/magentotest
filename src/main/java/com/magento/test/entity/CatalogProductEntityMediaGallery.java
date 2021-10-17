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
@Table(name = "catalog_product_entity_media_gallery")
public class CatalogProductEntityMediaGallery implements Serializable {
  private static final long serialVersionUID = 163445090370040772L;

  /** Description: value_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "value_id")
  private java.lang.Integer valueId;

  /** Description: attribute_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;
  /** Description: value. */
  @Basic
  @Column(name = "value", length = 255)
  private java.lang.String value;
  /** Description: media_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "media_type", length = 32)
  private java.lang.String mediaType;
  /** Description: disabled. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "disabled")
  private java.lang.Integer disabled;

  public CatalogProductEntityMediaGallery() {}

  public java.lang.Integer getValueId() {
    return this.valueId;
  }

  public void setValueId(java.lang.Integer valueId) {
    this.valueId = valueId;
  }

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public java.lang.String getMediaType() {
    return this.mediaType;
  }

  public java.lang.Integer getDisabled() {
    return this.disabled;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public void setMediaType(java.lang.String mediaType) {
    this.mediaType = mediaType;
  }

  public void setDisabled(java.lang.Integer disabled) {
    this.disabled = disabled;
  }
}
