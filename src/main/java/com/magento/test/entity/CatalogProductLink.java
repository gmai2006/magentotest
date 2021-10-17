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
@IdClass(CatalogProductLinkId.class)
@Table(name = "catalog_product_link")
public class CatalogProductLink implements Serializable {
  private static final long serialVersionUID = 163445090428637418L;

  /** Description: link_type_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "link_type_id")
  private java.lang.Integer linkTypeId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: linked_product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "linked_product_id")
  private java.lang.Integer linkedProductId;
  /** Description: link_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "link_id")
  private java.lang.Integer linkId;

  public CatalogProductLink() {}

  public java.lang.Integer getLinkTypeId() {
    return this.linkTypeId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getLinkedProductId() {
    return this.linkedProductId;
  }

  public java.lang.Integer getLinkId() {
    return this.linkId;
  }

  public void setLinkTypeId(java.lang.Integer linkTypeId) {
    this.linkTypeId = linkTypeId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setLinkedProductId(java.lang.Integer linkedProductId) {
    this.linkedProductId = linkedProductId;
  }

  public void setLinkId(java.lang.Integer linkId) {
    this.linkId = linkId;
  }
}
