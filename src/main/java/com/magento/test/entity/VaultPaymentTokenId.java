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

/** embeddable class Id for VaultPaymentToken. generated on 10/16/2021 from a schema. */
public class VaultPaymentTokenId implements Serializable {
  private static final long serialVersionUID = 163445090714267458L;

  @Column(name = "payment_method_code")
  private java.lang.String paymentMethodCode;

  @Column(name = "gateway_token")
  private java.lang.String gatewayToken;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "customer_id")
  private java.lang.Integer customerId;

  @Column(name = "public_hash")
  private java.lang.String publicHash;

  /** Constructor: VaultPaymentTokenId. */
  public VaultPaymentTokenId() {}

  /**
   * Constructor: VaultPaymentTokenId.
   *
   * @param paymentMethodCode - paymentMethodCode.
   * @param gatewayToken - gatewayToken.
   * @param entityId - entityId.
   * @param customerId - customerId.
   * @param publicHash - publicHash.
   */
  public VaultPaymentTokenId(
      java.lang.String paymentMethodCode,
      java.lang.String gatewayToken,
      java.lang.Integer entityId,
      java.lang.Integer customerId,
      java.lang.String publicHash) {
    this.paymentMethodCode = paymentMethodCode;
    this.gatewayToken = gatewayToken;
    this.entityId = entityId;
    this.customerId = customerId;
    this.publicHash = publicHash;
  }

  public java.lang.String getPaymentMethodCode() {
    return this.paymentMethodCode;
  }

  public java.lang.String getGatewayToken() {
    return this.gatewayToken;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getPublicHash() {
    return this.publicHash;
  }

  public void setPaymentMethodCode(java.lang.String paymentMethodCode) {
    this.paymentMethodCode = paymentMethodCode;
  }

  public void setGatewayToken(java.lang.String gatewayToken) {
    this.gatewayToken = gatewayToken;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setPublicHash(java.lang.String publicHash) {
    this.publicHash = publicHash;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((paymentMethodCode == null) ? 0 : paymentMethodCode.hashCode());
    result = prime * result + ((gatewayToken == null) ? 0 : gatewayToken.hashCode());
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
    result = prime * result + ((publicHash == null) ? 0 : publicHash.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    VaultPaymentTokenId other = (VaultPaymentTokenId) obj;

    if (paymentMethodCode == null) {
      if (other.paymentMethodCode != null) return false;
    } else if (!paymentMethodCode.equals(other.paymentMethodCode)) return false;

    if (gatewayToken == null) {
      if (other.gatewayToken != null) return false;
    } else if (!gatewayToken.equals(other.gatewayToken)) return false;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (customerId == null) {
      if (other.customerId != null) return false;
    } else if (!customerId.equals(other.customerId)) return false;

    if (publicHash == null) {
      if (other.publicHash != null) return false;
    } else if (!publicHash.equals(other.publicHash)) return false;

    return true;
  }
}
