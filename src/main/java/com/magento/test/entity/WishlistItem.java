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
@Table(name = "wishlist_item")
public class WishlistItem implements Serializable {
  private static final long serialVersionUID = 163445090729117532L;

  /** Description: wishlist_item_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "wishlist_item_id")
  private java.lang.Integer wishlistItemId;

  /** Description: wishlist_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "wishlist_id")
  private java.lang.Integer wishlistId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: added_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "added_at")
  private java.sql.Timestamp addedAt;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 0)
  private java.lang.String description;
  /** Description: qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "qty")
  private java.math.BigDecimal qty;

  public WishlistItem() {}

  public java.lang.Integer getWishlistItemId() {
    return this.wishlistItemId;
  }

  public void setWishlistItemId(java.lang.Integer wishlistItemId) {
    this.wishlistItemId = wishlistItemId;
  }

  public java.lang.Integer getWishlistId() {
    return this.wishlistId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.sql.Timestamp getAddedAt() {
    return this.addedAt;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.math.BigDecimal getQty() {
    return this.qty;
  }

  public void setWishlistId(java.lang.Integer wishlistId) {
    this.wishlistId = wishlistId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setAddedAt(java.sql.Timestamp addedAt) {
    this.addedAt = addedAt;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setQty(java.math.BigDecimal qty) {
    this.qty = qty;
  }
}
