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
@Table(name = "eav_attribute_option")
public class EavAttributeOption implements Serializable {
  private static final long serialVersionUID = 163445090518811974L;

  /** Description: option_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "option_id")
  private java.lang.Integer optionId;

  /** Description: attribute_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;

  public EavAttributeOption() {}

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }
}
