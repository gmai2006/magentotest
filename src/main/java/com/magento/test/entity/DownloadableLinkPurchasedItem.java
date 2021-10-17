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
@Table(name = "downloadable_link_purchased_item")
public class DownloadableLinkPurchasedItem implements Serializable {
  private static final long serialVersionUID = 163445090511270688L;

  /** Description: item_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "item_id")
  private java.lang.Integer itemId;

  /** Description: purchased_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "purchased_id")
  private java.lang.Integer purchasedId;
  /** Description: order_item_id. */
  @Basic
  @Column(name = "order_item_id")
  private java.lang.Integer orderItemId;
  /** Description: product_id. */
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: link_hash. */
  @Basic
  @Column(name = "link_hash", length = 255)
  private java.lang.String linkHash;
  /** Description: number_of_downloads_bought. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "number_of_downloads_bought")
  private java.lang.Integer numberOfDownloadsBought;
  /** Description: number_of_downloads_used. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "number_of_downloads_used")
  private java.lang.Integer numberOfDownloadsUsed;
  /** Description: link_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "link_id")
  private java.lang.Integer linkId;
  /** Description: link_title. */
  @Basic
  @Column(name = "link_title", length = 255)
  private java.lang.String linkTitle;
  /** Description: is_shareable. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_shareable")
  private java.lang.Integer isShareable;
  /** Description: link_url. */
  @Basic
  @Column(name = "link_url", length = 255)
  private java.lang.String linkUrl;
  /** Description: link_file. */
  @Basic
  @Column(name = "link_file", length = 255)
  private java.lang.String linkFile;
  /** Description: link_type. */
  @Basic
  @Column(name = "link_type", length = 255)
  private java.lang.String linkType;
  /** Description: status. */
  @Basic
  @Column(name = "status", length = 50)
  private java.lang.String status;
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

  public DownloadableLinkPurchasedItem() {}

  public java.lang.Integer getItemId() {
    return this.itemId;
  }

  public void setItemId(java.lang.Integer itemId) {
    this.itemId = itemId;
  }

  public java.lang.Integer getPurchasedId() {
    return this.purchasedId;
  }

  public java.lang.Integer getOrderItemId() {
    return this.orderItemId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.String getLinkHash() {
    return this.linkHash;
  }

  public java.lang.Integer getNumberOfDownloadsBought() {
    return this.numberOfDownloadsBought;
  }

  public java.lang.Integer getNumberOfDownloadsUsed() {
    return this.numberOfDownloadsUsed;
  }

  public java.lang.Integer getLinkId() {
    return this.linkId;
  }

  public java.lang.String getLinkTitle() {
    return this.linkTitle;
  }

  public java.lang.Integer getIsShareable() {
    return this.isShareable;
  }

  public java.lang.String getLinkUrl() {
    return this.linkUrl;
  }

  public java.lang.String getLinkFile() {
    return this.linkFile;
  }

  public java.lang.String getLinkType() {
    return this.linkType;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setPurchasedId(java.lang.Integer purchasedId) {
    this.purchasedId = purchasedId;
  }

  public void setOrderItemId(java.lang.Integer orderItemId) {
    this.orderItemId = orderItemId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setLinkHash(java.lang.String linkHash) {
    this.linkHash = linkHash;
  }

  public void setNumberOfDownloadsBought(java.lang.Integer numberOfDownloadsBought) {
    this.numberOfDownloadsBought = numberOfDownloadsBought;
  }

  public void setNumberOfDownloadsUsed(java.lang.Integer numberOfDownloadsUsed) {
    this.numberOfDownloadsUsed = numberOfDownloadsUsed;
  }

  public void setLinkId(java.lang.Integer linkId) {
    this.linkId = linkId;
  }

  public void setLinkTitle(java.lang.String linkTitle) {
    this.linkTitle = linkTitle;
  }

  public void setIsShareable(java.lang.Integer isShareable) {
    this.isShareable = isShareable;
  }

  public void setLinkUrl(java.lang.String linkUrl) {
    this.linkUrl = linkUrl;
  }

  public void setLinkFile(java.lang.String linkFile) {
    this.linkFile = linkFile;
  }

  public void setLinkType(java.lang.String linkType) {
    this.linkType = linkType;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
