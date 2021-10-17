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
@Table(name = "paypal_settlement_report_row")
public class PaypalSettlementReportRow implements Serializable {
  private static final long serialVersionUID = 163445090582676618L;

  /** Description: row_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "row_id")
  private java.lang.Integer rowId;

  /** Description: report_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "report_id")
  private java.lang.Integer reportId;
  /** Description: transaction_id. */
  @Basic
  @Column(name = "transaction_id", length = 19)
  private java.lang.String transactionId;
  /** Description: invoice_id. */
  @Basic
  @Column(name = "invoice_id", length = 127)
  private java.lang.String invoiceId;
  /** Description: paypal_reference_id. */
  @Basic
  @Column(name = "paypal_reference_id", length = 19)
  private java.lang.String paypalReferenceId;
  /** Description: paypal_reference_id_type. */
  @Basic
  @Column(name = "paypal_reference_id_type", length = 3)
  private java.lang.String paypalReferenceIdType;
  /** Description: transaction_event_code. */
  @Basic
  @Column(name = "transaction_event_code", length = 5)
  private java.lang.String transactionEventCode;
  /** Description: transaction_initiation_date. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "transaction_initiation_date")
  private java.sql.Timestamp transactionInitiationDate;
  /** Description: transaction_completion_date. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "transaction_completion_date")
  private java.sql.Timestamp transactionCompletionDate;
  /** Description: transaction_debit_or_credit. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "transaction_debit_or_credit", length = 2)
  private java.lang.String transactionDebitOrCredit;
  /** Description: gross_transaction_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "gross_transaction_amount")
  private java.math.BigDecimal grossTransactionAmount;
  /** Description: gross_transaction_currency. */
  @Basic
  @Column(name = "gross_transaction_currency", length = 3)
  private java.lang.String grossTransactionCurrency;
  /** Description: fee_debit_or_credit. */
  @Basic
  @Column(name = "fee_debit_or_credit", length = 2)
  private java.lang.String feeDebitOrCredit;
  /** Description: fee_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "fee_amount")
  private java.math.BigDecimal feeAmount;
  /** Description: fee_currency. */
  @Basic
  @Column(name = "fee_currency", length = 3)
  private java.lang.String feeCurrency;
  /** Description: custom_field. */
  @Basic
  @Column(name = "custom_field", length = 255)
  private java.lang.String customField;
  /** Description: consumer_id. */
  @Basic
  @Column(name = "consumer_id", length = 127)
  private java.lang.String consumerId;
  /** Description: payment_tracking_id. */
  @Basic
  @Column(name = "payment_tracking_id", length = 255)
  private java.lang.String paymentTrackingId;
  /** Description: store_id. */
  @Basic
  @Column(name = "store_id", length = 50)
  private java.lang.String storeId;

  public PaypalSettlementReportRow() {}

  public java.lang.Integer getRowId() {
    return this.rowId;
  }

  public void setRowId(java.lang.Integer rowId) {
    this.rowId = rowId;
  }

  public java.lang.Integer getReportId() {
    return this.reportId;
  }

  public java.lang.String getTransactionId() {
    return this.transactionId;
  }

  public java.lang.String getInvoiceId() {
    return this.invoiceId;
  }

  public java.lang.String getPaypalReferenceId() {
    return this.paypalReferenceId;
  }

  public java.lang.String getPaypalReferenceIdType() {
    return this.paypalReferenceIdType;
  }

  public java.lang.String getTransactionEventCode() {
    return this.transactionEventCode;
  }

  public java.sql.Timestamp getTransactionInitiationDate() {
    return this.transactionInitiationDate;
  }

  public java.sql.Timestamp getTransactionCompletionDate() {
    return this.transactionCompletionDate;
  }

  public java.lang.String getTransactionDebitOrCredit() {
    return this.transactionDebitOrCredit;
  }

  public java.math.BigDecimal getGrossTransactionAmount() {
    return this.grossTransactionAmount;
  }

  public java.lang.String getGrossTransactionCurrency() {
    return this.grossTransactionCurrency;
  }

  public java.lang.String getFeeDebitOrCredit() {
    return this.feeDebitOrCredit;
  }

  public java.math.BigDecimal getFeeAmount() {
    return this.feeAmount;
  }

  public java.lang.String getFeeCurrency() {
    return this.feeCurrency;
  }

  public java.lang.String getCustomField() {
    return this.customField;
  }

  public java.lang.String getConsumerId() {
    return this.consumerId;
  }

  public java.lang.String getPaymentTrackingId() {
    return this.paymentTrackingId;
  }

  public java.lang.String getStoreId() {
    return this.storeId;
  }

  public void setReportId(java.lang.Integer reportId) {
    this.reportId = reportId;
  }

  public void setTransactionId(java.lang.String transactionId) {
    this.transactionId = transactionId;
  }

  public void setInvoiceId(java.lang.String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public void setPaypalReferenceId(java.lang.String paypalReferenceId) {
    this.paypalReferenceId = paypalReferenceId;
  }

  public void setPaypalReferenceIdType(java.lang.String paypalReferenceIdType) {
    this.paypalReferenceIdType = paypalReferenceIdType;
  }

  public void setTransactionEventCode(java.lang.String transactionEventCode) {
    this.transactionEventCode = transactionEventCode;
  }

  public void setTransactionInitiationDate(java.sql.Timestamp transactionInitiationDate) {
    this.transactionInitiationDate = transactionInitiationDate;
  }

  public void setTransactionCompletionDate(java.sql.Timestamp transactionCompletionDate) {
    this.transactionCompletionDate = transactionCompletionDate;
  }

  public void setTransactionDebitOrCredit(java.lang.String transactionDebitOrCredit) {
    this.transactionDebitOrCredit = transactionDebitOrCredit;
  }

  public void setGrossTransactionAmount(java.math.BigDecimal grossTransactionAmount) {
    this.grossTransactionAmount = grossTransactionAmount;
  }

  public void setGrossTransactionCurrency(java.lang.String grossTransactionCurrency) {
    this.grossTransactionCurrency = grossTransactionCurrency;
  }

  public void setFeeDebitOrCredit(java.lang.String feeDebitOrCredit) {
    this.feeDebitOrCredit = feeDebitOrCredit;
  }

  public void setFeeAmount(java.math.BigDecimal feeAmount) {
    this.feeAmount = feeAmount;
  }

  public void setFeeCurrency(java.lang.String feeCurrency) {
    this.feeCurrency = feeCurrency;
  }

  public void setCustomField(java.lang.String customField) {
    this.customField = customField;
  }

  public void setConsumerId(java.lang.String consumerId) {
    this.consumerId = consumerId;
  }

  public void setPaymentTrackingId(java.lang.String paymentTrackingId) {
    this.paymentTrackingId = paymentTrackingId;
  }

  public void setStoreId(java.lang.String storeId) {
    this.storeId = storeId;
  }
}
