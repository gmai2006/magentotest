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
@IdClass(OauthNonceId.class)
@Table(name = "oauth_nonce")
public class OauthNonce implements Serializable {
  private static final long serialVersionUID = 163445090575526070L;

  /** Description: consumer_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "consumer_id")
  private java.lang.Integer consumerId;
  /** Description: nonce. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "nonce")
  private java.lang.String nonce;

  /** Description: timestamp. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "timestamp")
  private java.lang.Integer timestamp;

  public OauthNonce() {}

  public java.lang.Integer getConsumerId() {
    return this.consumerId;
  }

  public java.lang.String getNonce() {
    return this.nonce;
  }

  public void setConsumerId(java.lang.Integer consumerId) {
    this.consumerId = consumerId;
  }

  public void setNonce(java.lang.String nonce) {
    this.nonce = nonce;
  }

  public java.lang.Integer getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(java.lang.Integer timestamp) {
    this.timestamp = timestamp;
  }
}
