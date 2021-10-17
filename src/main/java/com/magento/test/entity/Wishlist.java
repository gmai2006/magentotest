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
@IdClass(WishlistId.class)
@Table(name = "wishlist")
public class Wishlist implements Serializable {
  private static final long serialVersionUID = 163445090728597327L;

  /** Description: wishlist_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "wishlist_id")
  private java.lang.Integer wishlistId;
  /** Description: customer_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "customer_id")
  private java.lang.Integer customerId;

  /** Description: shared. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "shared")
  private java.lang.Integer shared;
  /** Description: sharing_code. */
  @Basic
  @Column(name = "sharing_code", length = 32)
  private java.lang.String sharingCode;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;

  public Wishlist() {}

  public java.lang.Integer getWishlistId() {
    return this.wishlistId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public void setWishlistId(java.lang.Integer wishlistId) {
    this.wishlistId = wishlistId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public java.lang.Integer getShared() {
    return this.shared;
  }

  public java.lang.String getSharingCode() {
    return this.sharingCode;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setShared(java.lang.Integer shared) {
    this.shared = shared;
  }

  public void setSharingCode(java.lang.String sharingCode) {
    this.sharingCode = sharingCode;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
