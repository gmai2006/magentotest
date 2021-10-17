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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** embeddable class Id for OauthTokenRequestLog. generated on 10/16/2021 from a schema. */
public class OauthTokenRequestLogId implements Serializable {
  private static final long serialVersionUID = 163445090577363191L;

  @Column(name = "log_id")
  private java.lang.Integer logId;

  @Column(name = "user_type")
  private java.lang.Integer userType;

  @Column(name = "user_name")
  private java.lang.String userName;

  /** Constructor: OauthTokenRequestLogId. */
  public OauthTokenRequestLogId() {}

  /**
   * Constructor: OauthTokenRequestLogId.
   *
   * @param logId - logId.
   * @param userType - userType.
   * @param userName - userName.
   */
  public OauthTokenRequestLogId(
      java.lang.Integer logId, java.lang.Integer userType, java.lang.String userName) {
    this.logId = logId;
    this.userType = userType;
    this.userName = userName;
  }

  public java.lang.Integer getLogId() {
    return this.logId;
  }

  public java.lang.Integer getUserType() {
    return this.userType;
  }

  public java.lang.String getUserName() {
    return this.userName;
  }

  public void setLogId(java.lang.Integer logId) {
    this.logId = logId;
  }

  public void setUserType(java.lang.Integer userType) {
    this.userType = userType;
  }

  public void setUserName(java.lang.String userName) {
    this.userName = userName;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((logId == null) ? 0 : logId.hashCode());
    result = prime * result + ((userType == null) ? 0 : userType.hashCode());
    result = prime * result + ((userName == null) ? 0 : userName.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    OauthTokenRequestLogId other = (OauthTokenRequestLogId) obj;

    if (logId == null) {
      if (other.logId != null) return false;
    } else if (!logId.equals(other.logId)) return false;

    if (userType == null) {
      if (other.userType != null) return false;
    } else if (!userType.equals(other.userType)) return false;

    if (userName == null) {
      if (other.userName != null) return false;
    } else if (!userName.equals(other.userName)) return false;

    return true;
  }
}
