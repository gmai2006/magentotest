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
@Table(name = "quote_item_option")
public class QuoteItemOption implements Serializable {
  private static final long serialVersionUID = 163445090601249588L;

  /** Description: option_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "option_id")
  private java.lang.Integer optionId;

  /** Description: item_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "item_id")
  private java.lang.Integer itemId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "code", length = 255)
  private java.lang.String code;
  /** Description: value. */
  @Basic
  @Column(name = "value", length = 0)
  private java.lang.String value;

  public QuoteItemOption() {}

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public java.lang.Integer getItemId() {
    return this.itemId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setItemId(java.lang.Integer itemId) {
    this.itemId = itemId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }
}
