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
@IdClass(CatalogProductEntityMediaGalleryValueVideoId.class)
@Table(name = "catalog_product_entity_media_gallery_value_video")
public class CatalogProductEntityMediaGalleryValueVideo implements Serializable {
  private static final long serialVersionUID = 163445090373192072L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: value_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "value_id")
  private java.lang.Integer valueId;

  /** Description: provider. */
  @Basic
  @Column(name = "provider", length = 32)
  private java.lang.String provider;
  /** Description: url. */
  @Basic
  @Column(name = "url", length = 0)
  private java.lang.String url;
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 0)
  private java.lang.String description;
  /** Description: metadata. */
  @Basic
  @Column(name = "metadata", length = 0)
  private java.lang.String metadata;

  public CatalogProductEntityMediaGalleryValueVideo() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getValueId() {
    return this.valueId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setValueId(java.lang.Integer valueId) {
    this.valueId = valueId;
  }

  public java.lang.String getProvider() {
    return this.provider;
  }

  public java.lang.String getUrl() {
    return this.url;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.lang.String getMetadata() {
    return this.metadata;
  }

  public void setProvider(java.lang.String provider) {
    this.provider = provider;
  }

  public void setUrl(java.lang.String url) {
    this.url = url;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setMetadata(java.lang.String metadata) {
    this.metadata = metadata;
  }
}
