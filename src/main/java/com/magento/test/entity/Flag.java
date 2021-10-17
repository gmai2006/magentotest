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
@Table(name = "flag")
public class Flag implements Serializable {
  private static final long serialVersionUID = 163445090548785159L;

  /** Description: flag_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "flag_id")
  private java.lang.Integer flagId;

  /** Description: flag_code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "flag_code", length = 255)
  private java.lang.String flagCode;
  /** Description: state. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "state")
  private java.lang.Integer state;
  /** Description: flag_data. */
  @Basic
  @Column(name = "flag_data", length = 0)
  private java.lang.String flagData;
  /** Description: last_update. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "last_update")
  private java.sql.Timestamp lastUpdate;

  public Flag() {}

  public java.lang.Integer getFlagId() {
    return this.flagId;
  }

  public void setFlagId(java.lang.Integer flagId) {
    this.flagId = flagId;
  }

  public java.lang.String getFlagCode() {
    return this.flagCode;
  }

  public java.lang.Integer getState() {
    return this.state;
  }

  public java.lang.String getFlagData() {
    return this.flagData;
  }

  public java.sql.Timestamp getLastUpdate() {
    return this.lastUpdate;
  }

  public void setFlagCode(java.lang.String flagCode) {
    this.flagCode = flagCode;
  }

  public void setState(java.lang.Integer state) {
    this.state = state;
  }

  public void setFlagData(java.lang.String flagData) {
    this.flagData = flagData;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }
}
