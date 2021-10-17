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
@IdClass(EavAttributeOptionSwatchId.class)
@Table(name = "eav_attribute_option_swatch")
public class EavAttributeOptionSwatch implements Serializable {
  private static final long serialVersionUID = 163445090519860756L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: swatch_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "swatch_id")
  private java.lang.Integer swatchId;
  /** Description: option_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "option_id")
  private java.lang.Integer optionId;

  /** Description: type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "type")
  private java.lang.Integer type;
  /** Description: value. */
  @Basic
  @Column(name = "value", length = 255)
  private java.lang.String value;

  public EavAttributeOptionSwatch() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getSwatchId() {
    return this.swatchId;
  }

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setSwatchId(java.lang.Integer swatchId) {
    this.swatchId = swatchId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public java.lang.Integer getType() {
    return this.type;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setType(java.lang.Integer type) {
    this.type = type;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }
}
