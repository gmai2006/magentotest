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
@Table(name = "catalog_product_index_website")
public class CatalogProductIndexWebsite implements Serializable {
  private static final long serialVersionUID = 163445090427438505L;

  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Description: default_store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "default_store_id")
  private java.lang.Integer defaultStoreId;
  /** Description: website_date. */
  @Basic
  @Column(name = "website_date")
  private java.util.Date websiteDate;
  /** Description: rate. */
  @Basic
  @Column(name = "rate")
  private java.lang.Float rate;

  public CatalogProductIndexWebsite() {}

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public java.lang.Integer getDefaultStoreId() {
    return this.defaultStoreId;
  }

  public java.util.Date getWebsiteDate() {
    return this.websiteDate;
  }

  public java.lang.Float getRate() {
    return this.rate;
  }

  public void setDefaultStoreId(java.lang.Integer defaultStoreId) {
    this.defaultStoreId = defaultStoreId;
  }

  public void setWebsiteDate(java.util.Date websiteDate) {
    this.websiteDate = websiteDate;
  }

  public void setRate(java.lang.Float rate) {
    this.rate = rate;
  }
}
