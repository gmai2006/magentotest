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
@Table(name = "catalog_product_link_type")
public class CatalogProductLinkType implements Serializable {
  private static final long serialVersionUID = 163445090433782254L;

  /** Description: link_type_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "link_type_id")
  private java.lang.Integer linkTypeId;

  /** Description: code. */
  @Basic
  @Column(name = "code", length = 32)
  private java.lang.String code;

  public CatalogProductLinkType() {}

  public java.lang.Integer getLinkTypeId() {
    return this.linkTypeId;
  }

  public void setLinkTypeId(java.lang.Integer linkTypeId) {
    this.linkTypeId = linkTypeId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }
}
