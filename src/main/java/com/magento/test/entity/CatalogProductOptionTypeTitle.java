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
@IdClass(CatalogProductOptionTypeTitleId.class)
@Table(name = "catalog_product_option_type_title")
public class CatalogProductOptionTypeTitle implements Serializable {
  private static final long serialVersionUID = 163445090440836099L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: option_type_title_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "option_type_title_id")
  private java.lang.Integer optionTypeTitleId;
  /** Description: option_type_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "option_type_id")
  private java.lang.Integer optionTypeId;

  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;

  public CatalogProductOptionTypeTitle() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getOptionTypeTitleId() {
    return this.optionTypeTitleId;
  }

  public java.lang.Integer getOptionTypeId() {
    return this.optionTypeId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setOptionTypeTitleId(java.lang.Integer optionTypeTitleId) {
    this.optionTypeTitleId = optionTypeTitleId;
  }

  public void setOptionTypeId(java.lang.Integer optionTypeId) {
    this.optionTypeId = optionTypeId;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }
}
