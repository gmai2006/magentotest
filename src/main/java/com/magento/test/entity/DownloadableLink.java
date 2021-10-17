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
@Table(name = "downloadable_link")
public class DownloadableLink implements Serializable {
  private static final long serialVersionUID = 16344509050911089L;

  /** Description: link_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "link_id")
  private java.lang.Integer linkId;

  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: number_of_downloads. */
  @Basic
  @Column(name = "number_of_downloads")
  private java.lang.Integer numberOfDownloads;
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
  @Column(name = "link_type", length = 20)
  private java.lang.String linkType;
  /** Description: sample_url. */
  @Basic
  @Column(name = "sample_url", length = 255)
  private java.lang.String sampleUrl;
  /** Description: sample_file. */
  @Basic
  @Column(name = "sample_file", length = 255)
  private java.lang.String sampleFile;
  /** Description: sample_type. */
  @Basic
  @Column(name = "sample_type", length = 20)
  private java.lang.String sampleType;

  public DownloadableLink() {}

  public java.lang.Integer getLinkId() {
    return this.linkId;
  }

  public void setLinkId(java.lang.Integer linkId) {
    this.linkId = linkId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.Integer getNumberOfDownloads() {
    return this.numberOfDownloads;
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

  public java.lang.String getSampleUrl() {
    return this.sampleUrl;
  }

  public java.lang.String getSampleFile() {
    return this.sampleFile;
  }

  public java.lang.String getSampleType() {
    return this.sampleType;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setNumberOfDownloads(java.lang.Integer numberOfDownloads) {
    this.numberOfDownloads = numberOfDownloads;
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

  public void setSampleUrl(java.lang.String sampleUrl) {
    this.sampleUrl = sampleUrl;
  }

  public void setSampleFile(java.lang.String sampleFile) {
    this.sampleFile = sampleFile;
  }

  public void setSampleType(java.lang.String sampleType) {
    this.sampleType = sampleType;
  }
}
