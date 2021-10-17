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

/**
 * embeddable class Id for CatalogCategoryProductIndexStore1. generated on 10/16/2021 from a schema.
 */
public class CatalogCategoryProductIndexStore1Id implements Serializable {
  private static final long serialVersionUID = 163445090347425716L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "category_id")
  private java.lang.Integer categoryId;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  /** Constructor: CatalogCategoryProductIndexStore1Id. */
  public CatalogCategoryProductIndexStore1Id() {}

  /**
   * Constructor: CatalogCategoryProductIndexStore1Id.
   *
   * @param storeId - storeId.
   * @param categoryId - categoryId.
   * @param productId - productId.
   */
  public CatalogCategoryProductIndexStore1Id(
      java.lang.Integer storeId, java.lang.Integer categoryId, java.lang.Integer productId) {
    this.storeId = storeId;
    this.categoryId = categoryId;
    this.productId = productId;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogCategoryProductIndexStore1Id other = (CatalogCategoryProductIndexStore1Id) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (categoryId == null) {
      if (other.categoryId != null) return false;
    } else if (!categoryId.equals(other.categoryId)) return false;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    return true;
  }
}
