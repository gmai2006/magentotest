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
@Table(name = "email_wishlist")
public class EmailWishlist implements Serializable {
  private static final long serialVersionUID = 163445090548024836L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: wishlist_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "wishlist_id")
  private java.lang.Integer wishlistId;
  /** Description: item_count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "item_count")
  private java.lang.Integer itemCount;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: wishlist_imported. */
  @Basic
  @Column(name = "wishlist_imported")
  private java.lang.Integer wishlistImported;
  /** Description: wishlist_modified. */
  @Basic
  @Column(name = "wishlist_modified")
  private java.lang.Integer wishlistModified;
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

  public EmailWishlist() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getWishlistId() {
    return this.wishlistId;
  }

  public java.lang.Integer getItemCount() {
    return this.itemCount;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getWishlistImported() {
    return this.wishlistImported;
  }

  public java.lang.Integer getWishlistModified() {
    return this.wishlistModified;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setWishlistId(java.lang.Integer wishlistId) {
    this.wishlistId = wishlistId;
  }

  public void setItemCount(java.lang.Integer itemCount) {
    this.itemCount = itemCount;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setWishlistImported(java.lang.Integer wishlistImported) {
    this.wishlistImported = wishlistImported;
  }

  public void setWishlistModified(java.lang.Integer wishlistModified) {
    this.wishlistModified = wishlistModified;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
