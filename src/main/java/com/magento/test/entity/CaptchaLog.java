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
@IdClass(CaptchaLogId.class)
@Table(name = "captcha_log")
public class CaptchaLog implements Serializable {
  private static final long serialVersionUID = 163445090331759083L;

  /** Description: type. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "type")
  private java.lang.String type;
  /** Description: value. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "value")
  private java.lang.String value;

  /** Description: count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "count")
  private java.lang.Integer count;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;

  public CaptchaLog() {}

  public java.lang.String getType() {
    return this.type;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public java.lang.Integer getCount() {
    return this.count;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setCount(java.lang.Integer count) {
    this.count = count;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
