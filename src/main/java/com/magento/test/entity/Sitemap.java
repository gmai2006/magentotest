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
@Table(name = "sitemap")
public class Sitemap implements Serializable {
  private static final long serialVersionUID = 163445090691842988L;

  /** Description: sitemap_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "sitemap_id")
  private java.lang.Integer sitemapId;

  /** Description: sitemap_type. */
  @Basic
  @Column(name = "sitemap_type", length = 32)
  private java.lang.String sitemapType;
  /** Description: sitemap_filename. */
  @Basic
  @Column(name = "sitemap_filename", length = 32)
  private java.lang.String sitemapFilename;
  /** Description: sitemap_path. */
  @Basic
  @Column(name = "sitemap_path", length = 255)
  private java.lang.String sitemapPath;
  /** Description: sitemap_time. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sitemap_time")
  private java.sql.Timestamp sitemapTime;
  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;

  public Sitemap() {}

  public java.lang.Integer getSitemapId() {
    return this.sitemapId;
  }

  public void setSitemapId(java.lang.Integer sitemapId) {
    this.sitemapId = sitemapId;
  }

  public java.lang.String getSitemapType() {
    return this.sitemapType;
  }

  public java.lang.String getSitemapFilename() {
    return this.sitemapFilename;
  }

  public java.lang.String getSitemapPath() {
    return this.sitemapPath;
  }

  public java.sql.Timestamp getSitemapTime() {
    return this.sitemapTime;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public void setSitemapType(java.lang.String sitemapType) {
    this.sitemapType = sitemapType;
  }

  public void setSitemapFilename(java.lang.String sitemapFilename) {
    this.sitemapFilename = sitemapFilename;
  }

  public void setSitemapPath(java.lang.String sitemapPath) {
    this.sitemapPath = sitemapPath;
  }

  public void setSitemapTime(java.sql.Timestamp sitemapTime) {
    this.sitemapTime = sitemapTime;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }
}
