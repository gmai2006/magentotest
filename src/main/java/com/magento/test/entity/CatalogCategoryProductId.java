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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** embeddable class Id for CatalogCategoryProduct. generated on 10/16/2021 from a schema. */
public class CatalogCategoryProductId implements Serializable {
  private static final long serialVersionUID = 163445090343668409L;

  @Column(name = "category_id")
  private java.lang.Integer categoryId;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Constructor: CatalogCategoryProductId. */
  public CatalogCategoryProductId() {}

  /**
   * Constructor: CatalogCategoryProductId.
   *
   * @param categoryId - categoryId.
   * @param productId - productId.
   * @param entityId - entityId.
   */
  public CatalogCategoryProductId(
      java.lang.Integer categoryId, java.lang.Integer productId, java.lang.Integer entityId) {
    this.categoryId = categoryId;
    this.productId = productId;
    this.entityId = entityId;
  }

  public java.lang.Integer getCategoryId() {
    return this.categoryId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setCategoryId(java.lang.Integer categoryId) {
    this.categoryId = categoryId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogCategoryProductId other = (CatalogCategoryProductId) obj;

    if (categoryId == null) {
      if (other.categoryId != null) return false;
    } else if (!categoryId.equals(other.categoryId)) return false;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    return true;
  }
}
