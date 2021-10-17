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
@Table(name = "catalog_product_option")
public class CatalogProductOption implements Serializable {
  private static final long serialVersionUID = 163445090434197019L;

  /** Description: option_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "option_id")
  private java.lang.Integer optionId;

  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: type. */
  @Basic
  @Column(name = "type", length = 50)
  private java.lang.String type;
  /** Description: is_require. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_require")
  private java.lang.Integer isRequire;
  /** Description: sku. */
  @Basic
  @Column(name = "sku", length = 64)
  private java.lang.String sku;
  /** Description: max_characters. */
  @Basic
  @Column(name = "max_characters")
  private java.lang.Integer maxCharacters;
  /** Description: file_extension. */
  @Basic
  @Column(name = "file_extension", length = 50)
  private java.lang.String fileExtension;
  /** Description: image_size_x. */
  @Basic
  @Column(name = "image_size_x")
  private java.lang.Integer imageSizex;
  /** Description: image_size_y. */
  @Basic
  @Column(name = "image_size_y")
  private java.lang.Integer imageSizey;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;

  public CatalogProductOption() {}

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public java.lang.Integer getIsRequire() {
    return this.isRequire;
  }

  public java.lang.String getSku() {
    return this.sku;
  }

  public java.lang.Integer getMaxCharacters() {
    return this.maxCharacters;
  }

  public java.lang.String getFileExtension() {
    return this.fileExtension;
  }

  public java.lang.Integer getImageSizex() {
    return this.imageSizex;
  }

  public java.lang.Integer getImageSizey() {
    return this.imageSizey;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void setIsRequire(java.lang.Integer isRequire) {
    this.isRequire = isRequire;
  }

  public void setSku(java.lang.String sku) {
    this.sku = sku;
  }

  public void setMaxCharacters(java.lang.Integer maxCharacters) {
    this.maxCharacters = maxCharacters;
  }

  public void setFileExtension(java.lang.String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public void setImageSizex(java.lang.Integer imageSizex) {
    this.imageSizex = imageSizex;
  }

  public void setImageSizey(java.lang.Integer imageSizey) {
    this.imageSizey = imageSizey;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }
}
