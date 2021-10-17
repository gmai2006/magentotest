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
@Table(name = "rating_option")
public class RatingOption implements Serializable {
  private static final long serialVersionUID = 163445090605664279L;

  /** Description: option_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "option_id")
  private java.lang.Integer optionId;

  /** Description: rating_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "rating_id")
  private java.lang.Integer ratingId;
  /** Description: code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "code", length = 32)
  private java.lang.String code;
  /** Description: value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "value")
  private java.lang.Integer value;
  /** Description: position. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "position")
  private java.lang.Integer position;

  public RatingOption() {}

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public java.lang.Integer getRatingId() {
    return this.ratingId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.Integer getValue() {
    return this.value;
  }

  public java.lang.Integer getPosition() {
    return this.position;
  }

  public void setRatingId(java.lang.Integer ratingId) {
    this.ratingId = ratingId;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setValue(java.lang.Integer value) {
    this.value = value;
  }

  public void setPosition(java.lang.Integer position) {
    this.position = position;
  }
}
