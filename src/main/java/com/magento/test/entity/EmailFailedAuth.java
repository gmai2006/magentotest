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
@Table(name = "email_failed_auth")
public class EmailFailedAuth implements Serializable {
  private static final long serialVersionUID = 163445090543049289L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: failures_num. */
  @Basic
  @Column(name = "failures_num")
  private java.lang.Integer failuresNum;
  /** Description: first_attempt_date. */
  @Basic
  @Column(name = "first_attempt_date")
  private java.util.Date firstAttemptDate;
  /** Description: last_attempt_date. */
  @Basic
  @Column(name = "last_attempt_date")
  private java.util.Date lastAttemptDate;
  /** Description: url. */
  @Basic
  @Column(name = "url", length = 255)
  private java.lang.String url;
  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;

  public EmailFailedAuth() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getFailuresNum() {
    return this.failuresNum;
  }

  public java.util.Date getFirstAttemptDate() {
    return this.firstAttemptDate;
  }

  public java.util.Date getLastAttemptDate() {
    return this.lastAttemptDate;
  }

  public java.lang.String getUrl() {
    return this.url;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public void setFailuresNum(java.lang.Integer failuresNum) {
    this.failuresNum = failuresNum;
  }

  public void setFirstAttemptDate(java.util.Date firstAttemptDate) {
    this.firstAttemptDate = firstAttemptDate;
  }

  public void setLastAttemptDate(java.util.Date lastAttemptDate) {
    this.lastAttemptDate = lastAttemptDate;
  }

  public void setUrl(java.lang.String url) {
    this.url = url;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }
}
