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

/**
 * embeddable class Id for VaultPaymentTokenOrderPaymentLink. generated on 10/16/2021 from a schema.
 */
public class VaultPaymentTokenOrderPaymentLinkId implements Serializable {
  private static final long serialVersionUID = 163445090715999828L;

  @Column(name = "order_payment_id")
  private java.lang.Integer orderPaymentId;

  @Column(name = "payment_token_id")
  private java.lang.Integer paymentTokenId;

  /** Constructor: VaultPaymentTokenOrderPaymentLinkId. */
  public VaultPaymentTokenOrderPaymentLinkId() {}

  /**
   * Constructor: VaultPaymentTokenOrderPaymentLinkId.
   *
   * @param orderPaymentId - orderPaymentId.
   * @param paymentTokenId - paymentTokenId.
   */
  public VaultPaymentTokenOrderPaymentLinkId(
      java.lang.Integer orderPaymentId, java.lang.Integer paymentTokenId) {
    this.orderPaymentId = orderPaymentId;
    this.paymentTokenId = paymentTokenId;
  }

  public java.lang.Integer getOrderPaymentId() {
    return this.orderPaymentId;
  }

  public java.lang.Integer getPaymentTokenId() {
    return this.paymentTokenId;
  }

  public void setOrderPaymentId(java.lang.Integer orderPaymentId) {
    this.orderPaymentId = orderPaymentId;
  }

  public void setPaymentTokenId(java.lang.Integer paymentTokenId) {
    this.paymentTokenId = paymentTokenId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((orderPaymentId == null) ? 0 : orderPaymentId.hashCode());
    result = prime * result + ((paymentTokenId == null) ? 0 : paymentTokenId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    VaultPaymentTokenOrderPaymentLinkId other = (VaultPaymentTokenOrderPaymentLinkId) obj;

    if (orderPaymentId == null) {
      if (other.orderPaymentId != null) return false;
    } else if (!orderPaymentId.equals(other.orderPaymentId)) return false;

    if (paymentTokenId == null) {
      if (other.paymentTokenId != null) return false;
    } else if (!paymentTokenId.equals(other.paymentTokenId)) return false;

    return true;
  }
}
