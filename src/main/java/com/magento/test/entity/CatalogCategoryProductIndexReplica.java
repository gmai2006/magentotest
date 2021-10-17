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
@IdClass(CatalogCategoryProductIndexReplicaId.class)
@Table(name = "catalog_category_product_index_replica")
public class CatalogCategoryProductIndexReplica implements Serializable {
  private static final long serialVersionUID = 163445090346886803L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: category_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "category_id")
  private java.lang.Integer categoryId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_id")
  private java.lang.Integer productId;

  /** Description: position. */
  @Basic
  @Column(name = "position")
  private java.lang.Integer position;
  /** Description: is_parent. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_parent")
  private java.lang.Integer isParent;
  /** Description: visibility. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "visibility")
  private java.lang.Integer visibility;

  public CatalogCategoryProductIndexReplica() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getCategoryId() {
    return this.categoryId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setCategoryId(java.lang.Integer categoryId) {
    this.categoryId = categoryId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public java.lang.Integer getPosition() {
    return this.position;
  }

  public java.lang.Integer getIsParent() {
    return this.isParent;
  }

  public java.lang.Integer getVisibility() {
    return this.visibility;
  }

  public void setPosition(java.lang.Integer position) {
    this.position = position;
  }

  public void setIsParent(java.lang.Integer isParent) {
    this.isParent = isParent;
  }

  public void setVisibility(java.lang.Integer visibility) {
    this.visibility = visibility;
  }
}
