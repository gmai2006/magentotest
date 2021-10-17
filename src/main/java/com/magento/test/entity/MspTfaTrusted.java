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
@Table(name = "msp_tfa_trusted")
public class MspTfaTrusted implements Serializable {
  private static final long serialVersionUID = 163445090567870211L;

  /** Description: msp_tfa_trusted_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "msp_tfa_trusted_id")
  private java.lang.Integer mspTfaTrustedId;

  /** Description: date_time. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "date_time")
  private java.util.Date dateTime;
  /** Description: user_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "user_id")
  private java.lang.Integer userId;
  /** Description: device_name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "device_name", length = 0)
  private java.lang.String deviceName;
  /** Description: token. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "token", length = 0)
  private java.lang.String token;
  /** Description: last_ip. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "last_ip", length = 0)
  private java.lang.String lastIp;

  public MspTfaTrusted() {}

  public java.lang.Integer getMspTfaTrustedId() {
    return this.mspTfaTrustedId;
  }

  public void setMspTfaTrustedId(java.lang.Integer mspTfaTrustedId) {
    this.mspTfaTrustedId = mspTfaTrustedId;
  }

  public java.util.Date getDateTime() {
    return this.dateTime;
  }

  public java.lang.Integer getUserId() {
    return this.userId;
  }

  public java.lang.String getDeviceName() {
    return this.deviceName;
  }

  public java.lang.String getToken() {
    return this.token;
  }

  public java.lang.String getLastIp() {
    return this.lastIp;
  }

  public void setDateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
  }

  public void setUserId(java.lang.Integer userId) {
    this.userId = userId;
  }

  public void setDeviceName(java.lang.String deviceName) {
    this.deviceName = deviceName;
  }

  public void setToken(java.lang.String token) {
    this.token = token;
  }

  public void setLastIp(java.lang.String lastIp) {
    this.lastIp = lastIp;
  }
}
