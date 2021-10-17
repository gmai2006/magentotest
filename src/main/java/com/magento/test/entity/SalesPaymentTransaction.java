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
@IdClass(SalesPaymentTransactionId.class)
@Table(name = "sales_payment_transaction")
public class SalesPaymentTransaction implements Serializable {
  private static final long serialVersionUID = 16344509066423328L;

  /** Description: transaction_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "transaction_id")
  private java.lang.Integer transactionId;
  /** Description: txn_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "txn_id")
  private java.lang.String txnId;
  /** Description: payment_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "payment_id")
  private java.lang.Integer paymentId;
  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "order_id")
  private java.lang.Integer orderId;

  /** Description: parent_id. */
  @Basic
  @Column(name = "parent_id")
  private java.lang.Integer parentId;
  /** Description: parent_txn_id. */
  @Basic
  @Column(name = "parent_txn_id", length = 100)
  private java.lang.String parentTxnId;
  /** Description: txn_type. */
  @Basic
  @Column(name = "txn_type", length = 15)
  private java.lang.String txnType;
  /** Description: is_closed. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_closed")
  private java.lang.Integer isClosed;
  /** Description: additional_information. */
  @Basic
  @Column(name = "additional_information")
  private java.lang.String additionalInformation;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;

  public SalesPaymentTransaction() {}

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

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.lang.String getParentTxnId() {
    return this.parentTxnId;
  }

  public java.lang.String getTxnType() {
    return this.txnType;
  }

  public java.lang.Integer getIsClosed() {
    return this.isClosed;
  }

  public java.lang.String getAdditionalInformation() {
    return this.additionalInformation;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setParentTxnId(java.lang.String parentTxnId) {
    this.parentTxnId = parentTxnId;
  }

  public void setTxnType(java.lang.String txnType) {
    this.txnType = txnType;
  }

  public void setIsClosed(java.lang.Integer isClosed) {
    this.isClosed = isClosed;
  }

  public void setAdditionalInformation(java.lang.String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }
}
