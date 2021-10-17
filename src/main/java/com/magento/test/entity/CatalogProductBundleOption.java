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
@Table(name = "catalog_product_bundle_option")
public class CatalogProductBundleOption implements Serializable {
  private static final long serialVersionUID = 163445090354270225L;

  /** Description: option_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "option_id")
  private java.lang.Integer optionId;

  /** Description: parent_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "parent_id")
  private java.lang.Integer parentId;
  /** Description: required. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "required")
  private java.lang.Integer required;
  /** Description: position. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "position")
  private java.lang.Integer position;
  /** Description: type. */
  @Basic
  @Column(name = "type", length = 255)
  private java.lang.String type;

  public CatalogProductBundleOption() {}

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.lang.Integer getRequired() {
    return this.required;
  }

  public java.lang.Integer getPosition() {
    return this.position;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setRequired(java.lang.Integer required) {
    this.required = required;
  }

  public void setPosition(java.lang.Integer position) {
    this.position = position;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }
}
