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

/** embeddable class Id for SalesPaymentTransaction. generated on 10/16/2021 from a schema. */
public class SalesPaymentTransactionId implements Serializable {
  private static final long serialVersionUID = 163445090663634160L;

  @Column(name = "transaction_id")
  private java.lang.Integer transactionId;

  @Column(name = "txn_id")
  private java.lang.String txnId;

  @Column(name = "payment_id")
  private java.lang.Integer paymentId;

  @Column(name = "order_id")
  private java.lang.Integer orderId;

  /** Constructor: SalesPaymentTransactionId. */
  public SalesPaymentTransactionId() {}

  /**
   * Constructor: SalesPaymentTransactionId.
   *
   * @param transactionId - transactionId.
   * @param txnId - txnId.
   * @param paymentId - paymentId.
   * @param orderId - orderId.
   */
  public SalesPaymentTransactionId(
      java.lang.Integer transactionId,
      java.lang.String txnId,
      java.lang.Integer paymentId,
      java.lang.Integer orderId) {
    this.transactionId = transactionId;
    this.txnId = txnId;
    this.paymentId = paymentId;
    this.orderId = orderId;
  }

  public java.lang.Integer getTransactionId() {
    return this.transactionId;
  }

  public java.lang.String getTxnId() {
    return this.txnId;
  }

  public java.lang.Integer getPaymentId() {
    return this.paymentId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public void setTransactionId(java.lang.Integer transactionId) {
    this.transactionId = transactionId;
  }

  public void setTxnId(java.lang.String txnId) {
    this.txnId = txnId;
  }

  public void setPaymentId(java.lang.Integer paymentId) {
    this.paymentId = paymentId;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
    result = prime * result + ((txnId == null) ? 0 : txnId.hashCode());
    result = prime * result + ((paymentId == null) ? 0 : paymentId.hashCode());
    result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    SalesPaymentTransactionId other = (SalesPaymentTransactionId) obj;

    if (transactionId == null) {
      if (other.transactionId != null) return false;
    } else if (!transactionId.equals(other.transactionId)) return false;

    if (txnId == null) {
      if (other.txnId != null) return false;
    } else if (!txnId.equals(other.txnId)) return false;

    if (paymentId == null) {
      if (other.paymentId != null) return false;
    } else if (!paymentId.equals(other.paymentId)) return false;

    if (orderId == null) {
      if (other.orderId != null) return false;
    } else if (!orderId.equals(other.orderId)) return false;

    return true;
  }
}
