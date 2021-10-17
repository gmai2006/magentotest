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
@Table(name = "session")
public class Session implements Serializable {
  private static final long serialVersionUID = 163445090688955465L;

  /** Description: session_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "session_id")
  private java.lang.String sessionId;

  /** Description: session_expires. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "session_expires")
  private java.lang.Integer sessionExpires;
  /** Description: session_data. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "session_data")
  private java.lang.String sessionData;

  public Session() {}

  public java.lang.String getSessionId() {
    return this.sessionId;
  }

  public void setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
  }

  public java.lang.Integer getSessionExpires() {
    return this.sessionExpires;
  }

  public java.lang.String getSessionData() {
    return this.sessionData;
  }

  public void setSessionExpires(java.lang.Integer sessionExpires) {
    this.sessionExpires = sessionExpires;
  }

  public void setSessionData(java.lang.String sessionData) {
    this.sessionData = sessionData;
  }
}
