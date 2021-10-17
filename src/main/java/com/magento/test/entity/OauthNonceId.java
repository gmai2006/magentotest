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

/** embeddable class Id for OauthNonce. generated on 10/16/2021 from a schema. */
public class OauthNonceId implements Serializable {
  private static final long serialVersionUID = 163445090575099339L;

  @Column(name = "consumer_id")
  private java.lang.Integer consumerId;

  @Column(name = "nonce")
  private java.lang.String nonce;

  /** Constructor: OauthNonceId. */
  public OauthNonceId() {}

  /**
   * Constructor: OauthNonceId.
   *
   * @param consumerId - consumerId.
   * @param nonce - nonce.
   */
  public OauthNonceId(java.lang.Integer consumerId, java.lang.String nonce) {
    this.consumerId = consumerId;
    this.nonce = nonce;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((consumerId == null) ? 0 : consumerId.hashCode());
    result = prime * result + ((nonce == null) ? 0 : nonce.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    OauthNonceId other = (OauthNonceId) obj;

    if (consumerId == null) {
      if (other.consumerId != null) return false;
    } else if (!consumerId.equals(other.consumerId)) return false;

    if (nonce == null) {
      if (other.nonce != null) return false;
    } else if (!nonce.equals(other.nonce)) return false;

    return true;
  }
}
