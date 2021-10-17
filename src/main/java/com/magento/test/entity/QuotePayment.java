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
@Table(name = "quote_payment")
public class QuotePayment implements Serializable {
  private static final long serialVersionUID = 163445090601797883L;

  /** Description: payment_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "payment_id")
  private java.lang.Integer paymentId;

  /** Description: quote_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "quote_id")
  private java.lang.Integer quoteId;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;
  /** Description: method. */
  @Basic
  @Column(name = "method", length = 255)
  private java.lang.String method;
  /** Description: cc_type. */
  @Basic
  @Column(name = "cc_type", length = 255)
  private java.lang.String ccType;
  /** Description: cc_number_enc. */
  @Basic
  @Column(name = "cc_number_enc", length = 255)
  private java.lang.String ccNumberEnc;
  /** Description: cc_last_4. */
  @Basic
  @Column(name = "cc_last_4", length = 255)
  private java.lang.String ccLast4;
  /** Description: cc_cid_enc. */
  @Basic
  @Column(name = "cc_cid_enc", length = 255)
  private java.lang.String ccCidEnc;
  /** Description: cc_owner. */
  @Basic
  @Column(name = "cc_owner", length = 255)
  private java.lang.String ccOwner;
  /** Description: cc_exp_month. */
  @Basic
  @Column(name = "cc_exp_month", length = 255)
  private java.lang.String ccExpMonth;
  /** Description: cc_exp_year. */
  @Basic
  @Column(name = "cc_exp_year")
  private java.lang.Integer ccExpYear;
  /** Description: cc_ss_owner. */
  @Basic
  @Column(name = "cc_ss_owner", length = 255)
  private java.lang.String ccSsOwner;
  /** Description: cc_ss_start_month. */
  @Basic
  @Column(name = "cc_ss_start_month")
  private java.lang.Integer ccSsStartMonth;
  /** Description: cc_ss_start_year. */
  @Basic
  @Column(name = "cc_ss_start_year")
  private java.lang.Integer ccSsStartYear;
  /** Description: po_number. */
  @Basic
  @Column(name = "po_number", length = 255)
  private java.lang.String poNumber;
  /** Description: additional_data. */
  @Basic
  @Column(name = "additional_data", length = 0)
  private java.lang.String additionalData;
  /** Description: cc_ss_issue. */
  @Basic
  @Column(name = "cc_ss_issue", length = 255)
  private java.lang.String ccSsIssue;
  /** Description: additional_information. */
  @Basic
  @Column(name = "additional_information", length = 0)
  private java.lang.String additionalInformation;
  /** Description: paypal_payer_id. */
  @Basic
  @Column(name = "paypal_payer_id", length = 255)
  private java.lang.String paypalPayerId;
  /** Description: paypal_payer_status. */
  @Basic
  @Column(name = "paypal_payer_status", length = 255)
  private java.lang.String paypalPayerStatus;
  /** Description: paypal_correlation_id. */
  @Basic
  @Column(name = "paypal_correlation_id", length = 255)
  private java.lang.String paypalCorrelationId;

  public QuotePayment() {}

  public java.lang.Integer getPaymentId() {
    return this.paymentId;
  }

  public void setPaymentId(java.lang.Integer paymentId) {
    this.paymentId = paymentId;
  }

  public java.lang.Integer getQuoteId() {
    return this.quoteId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.String getMethod() {
    return this.method;
  }

  public java.lang.String getCcType() {
    return this.ccType;
  }

  public java.lang.String getCcNumberEnc() {
    return this.ccNumberEnc;
  }

  public java.lang.String getCcLast4() {
    return this.ccLast4;
  }

  public java.lang.String getCcCidEnc() {
    return this.ccCidEnc;
  }

  public java.lang.String getCcOwner() {
    return this.ccOwner;
  }

  public java.lang.String getCcExpMonth() {
    return this.ccExpMonth;
  }

  public java.lang.Integer getCcExpYear() {
    return this.ccExpYear;
  }

  public java.lang.String getCcSsOwner() {
    return this.ccSsOwner;
  }

  public java.lang.Integer getCcSsStartMonth() {
    return this.ccSsStartMonth;
  }

  public java.lang.Integer getCcSsStartYear() {
    return this.ccSsStartYear;
  }

  public java.lang.String getPoNumber() {
    return this.poNumber;
  }

  public java.lang.String getAdditionalData() {
    return this.additionalData;
  }

  public java.lang.String getCcSsIssue() {
    return this.ccSsIssue;
  }

  public java.lang.String getAdditionalInformation() {
    return this.additionalInformation;
  }

  public java.lang.String getPaypalPayerId() {
    return this.paypalPayerId;
  }

  public java.lang.String getPaypalPayerStatus() {
    return this.paypalPayerStatus;
  }

  public java.lang.String getPaypalCorrelationId() {
    return this.paypalCorrelationId;
  }

  public void setQuoteId(java.lang.Integer quoteId) {
    this.quoteId = quoteId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setMethod(java.lang.String method) {
    this.method = method;
  }

  public void setCcType(java.lang.String ccType) {
    this.ccType = ccType;
  }

  public void setCcNumberEnc(java.lang.String ccNumberEnc) {
    this.ccNumberEnc = ccNumberEnc;
  }

  public void setCcLast4(java.lang.String ccLast4) {
    this.ccLast4 = ccLast4;
  }

  public void setCcCidEnc(java.lang.String ccCidEnc) {
    this.ccCidEnc = ccCidEnc;
  }

  public void setCcOwner(java.lang.String ccOwner) {
    this.ccOwner = ccOwner;
  }

  public void setCcExpMonth(java.lang.String ccExpMonth) {
    this.ccExpMonth = ccExpMonth;
  }

  public void setCcExpYear(java.lang.Integer ccExpYear) {
    this.ccExpYear = ccExpYear;
  }

  public void setCcSsOwner(java.lang.String ccSsOwner) {
    this.ccSsOwner = ccSsOwner;
  }

  public void setCcSsStartMonth(java.lang.Integer ccSsStartMonth) {
    this.ccSsStartMonth = ccSsStartMonth;
  }

  public void setCcSsStartYear(java.lang.Integer ccSsStartYear) {
    this.ccSsStartYear = ccSsStartYear;
  }

  public void setPoNumber(java.lang.String poNumber) {
    this.poNumber = poNumber;
  }

  public void setAdditionalData(java.lang.String additionalData) {
    this.additionalData = additionalData;
  }

  public void setCcSsIssue(java.lang.String ccSsIssue) {
    this.ccSsIssue = ccSsIssue;
  }

  public void setAdditionalInformation(java.lang.String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public void setPaypalPayerId(java.lang.String paypalPayerId) {
    this.paypalPayerId = paypalPayerId;
  }

  public void setPaypalPayerStatus(java.lang.String paypalPayerStatus) {
    this.paypalPayerStatus = paypalPayerStatus;
  }

  public void setPaypalCorrelationId(java.lang.String paypalCorrelationId) {
    this.paypalCorrelationId = paypalCorrelationId;
  }
}
