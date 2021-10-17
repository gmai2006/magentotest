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

/** embeddable class Id for CataloginventoryStockItem. generated on 10/16/2021 from a schema. */
public class CataloginventoryStockItemId implements Serializable {
  private static final long serialVersionUID = 163445090448562201L;

  @Column(name = "item_id")
  private java.lang.Integer itemId;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  @Column(name = "stock_id")
  private java.lang.Integer stockId;

  /** Constructor: CataloginventoryStockItemId. */
  public CataloginventoryStockItemId() {}

  /**
   * Constructor: CataloginventoryStockItemId.
   *
   * @param itemId - itemId.
   * @param productId - productId.
   * @param stockId - stockId.
   */
  public CataloginventoryStockItemId(
      java.lang.Integer itemId, java.lang.Integer productId, java.lang.Integer stockId) {
    this.itemId = itemId;
    this.productId = productId;
    this.stockId = stockId;
  }

  public java.lang.Integer getItemId() {
    return this.itemId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getStockId() {
    return this.stockId;
  }

  public void setItemId(java.lang.Integer itemId) {
    this.itemId = itemId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setStockId(java.lang.Integer stockId) {
    this.stockId = stockId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());
    result = prime * result + ((stockId == null) ? 0 : stockId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CataloginventoryStockItemId other = (CataloginventoryStockItemId) obj;

    if (itemId == null) {
      if (other.itemId != null) return false;
    } else if (!itemId.equals(other.itemId)) return false;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    if (stockId == null) {
      if (other.stockId != null) return false;
    } else if (!stockId.equals(other.stockId)) return false;

    return true;
  }
}
