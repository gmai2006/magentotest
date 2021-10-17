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

/** embeddable class Id for PaypalBillingAgreementOrder. generated on 10/16/2021 from a schema. */
public class PaypalBillingAgreementOrderId implements Serializable {
  private static final long serialVersionUID = 163445090579842437L;

  @Column(name = "agreement_id")
  private java.lang.Integer agreementId;

  @Column(name = "order_id")
  private java.lang.Integer orderId;

  /** Constructor: PaypalBillingAgreementOrderId. */
  public PaypalBillingAgreementOrderId() {}

  /**
   * Constructor: PaypalBillingAgreementOrderId.
   *
   * @param agreementId - agreementId.
   * @param orderId - orderId.
   */
  public PaypalBillingAgreementOrderId(java.lang.Integer agreementId, java.lang.Integer orderId) {
    this.agreementId = agreementId;
    this.orderId = orderId;
  }

  public java.lang.Integer getAgreementId() {
    return this.agreementId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public void setAgreementId(java.lang.Integer agreementId) {
    this.agreementId = agreementId;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((agreementId == null) ? 0 : agreementId.hashCode());
    result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    PaypalBillingAgreementOrderId other = (PaypalBillingAgreementOrderId) obj;

    if (agreementId == null) {
      if (other.agreementId != null) return false;
    } else if (!agreementId.equals(other.agreementId)) return false;

    if (orderId == null) {
      if (other.orderId != null) return false;
    } else if (!orderId.equals(other.orderId)) return false;

    return true;
  }
}
