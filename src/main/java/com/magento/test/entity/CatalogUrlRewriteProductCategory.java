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
@Table(name = "catalog_url_rewrite_product_category")
public class CatalogUrlRewriteProductCategory implements Serializable {
  private static final long serialVersionUID = 163445090447538284L;

  /** Description: default_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "default_id")
  private java.lang.String defaultId;

  /** Description: url_rewrite_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "url_rewrite_id")
  private java.lang.Integer urlRewriteId;
  /** Description: category_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "category_id")
  private java.lang.Integer categoryId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;

  public CatalogUrlRewriteProductCategory() {}

  public java.lang.String getDefaultId() {
    return this.defaultId;
  }

  public void setDefaultId(java.lang.String defaultId) {
    this.defaultId = defaultId;
  }

  public java.lang.Integer getUrlRewriteId() {
    return this.urlRewriteId;
  }

  public java.lang.Integer getCategoryId() {
    return this.categoryId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public void setUrlRewriteId(java.lang.Integer urlRewriteId) {
    this.urlRewriteId = urlRewriteId;
  }

  public void setCategoryId(java.lang.Integer categoryId) {
    this.categoryId = categoryId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }
}
