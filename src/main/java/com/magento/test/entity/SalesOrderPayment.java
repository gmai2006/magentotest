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
@Table(name = "sales_order_payment")
public class SalesOrderPayment implements Serializable {
  private static final long serialVersionUID = 163445090656260500L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: parent_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "parent_id")
  private java.lang.Integer parentId;
  /** Description: base_shipping_captured. */
  @Basic
  @Column(name = "base_shipping_captured")
  private java.math.BigDecimal baseShippingCaptured;
  /** Description: shipping_captured. */
  @Basic
  @Column(name = "shipping_captured")
  private java.math.BigDecimal shippingCaptured;
  /** Description: amount_refunded. */
  @Basic
  @Column(name = "amount_refunded")
  private java.math.BigDecimal amountRefunded;
  /** Description: base_amount_paid. */
  @Basic
  @Column(name = "base_amount_paid")
  private java.math.BigDecimal baseAmountPaid;
  /** Description: amount_canceled. */
  @Basic
  @Column(name = "amount_canceled")
  private java.math.BigDecimal amountCanceled;
  /** Description: base_amount_authorized. */
  @Basic
  @Column(name = "base_amount_authorized")
  private java.math.BigDecimal baseAmountAuthorized;
  /** Description: base_amount_paid_online. */
  @Basic
  @Column(name = "base_amount_paid_online")
  private java.math.BigDecimal baseAmountPaidOnline;
  /** Description: base_amount_refunded_online. */
  @Basic
  @Column(name = "base_amount_refunded_online")
  private java.math.BigDecimal baseAmountRefundedOnline;
  /** Description: base_shipping_amount. */
  @Basic
  @Column(name = "base_shipping_amount")
  private java.math.BigDecimal baseShippingAmount;
  /** Description: shipping_amount. */
  @Basic
  @Column(name = "shipping_amount")
  private java.math.BigDecimal shippingAmount;
  /** Description: amount_paid. */
  @Basic
  @Column(name = "amount_paid")
  private java.math.BigDecimal amountPaid;
  /** Description: amount_authorized. */
  @Basic
  @Column(name = "amount_authorized")
  private java.math.BigDecimal amountAuthorized;
  /** Description: base_amount_ordered. */
  @Basic
  @Column(name = "base_amount_ordered")
  private java.math.BigDecimal baseAmountOrdered;
  /** Description: base_shipping_refunded. */
  @Basic
  @Column(name = "base_shipping_refunded")
  private java.math.BigDecimal baseShippingRefunded;
  /** Description: shipping_refunded. */
  @Basic
  @Column(name = "shipping_refunded")
  private java.math.BigDecimal shippingRefunded;
  /** Description: base_amount_refunded. */
  @Basic
  @Column(name = "base_amount_refunded")
  private java.math.BigDecimal baseAmountRefunded;
  /** Description: amount_ordered. */
  @Basic
  @Column(name = "amount_ordered")
  private java.math.BigDecimal amountOrdered;
  /** Description: base_amount_canceled. */
  @Basic
  @Column(name = "base_amount_canceled")
  private java.math.BigDecimal baseAmountCanceled;
  /** Description: quote_payment_id. */
  @Basic
  @Column(name = "quote_payment_id")
  private java.lang.Integer quotePaymentId;
  /** Description: additional_data. */
  @Basic
  @Column(name = "additional_data", length = 0)
  private java.lang.String additionalData;
  /** Description: cc_exp_month. */
  @Basic
  @Column(name = "cc_exp_month", length = 12)
  private java.lang.String ccExpMonth;
  /** Description: cc_ss_start_year. */
  @Basic
  @Column(name = "cc_ss_start_year", length = 12)
  private java.lang.String ccSsStartYear;
  /** Description: echeck_bank_name. */
  @Basic
  @Column(name = "echeck_bank_name", length = 128)
  private java.lang.String echeckBankName;
  /** Description: method. */
  @Basic
  @Column(name = "method", length = 128)
  private java.lang.String method;
  /** Description: cc_debug_request_body. */
  @Basic
  @Column(name = "cc_debug_request_body", length = 32)
  private java.lang.String ccDebugRequestBody;
  /** Description: cc_secure_verify. */
  @Basic
  @Column(name = "cc_secure_verify", length = 32)
  private java.lang.String ccSecureVerify;
  /** Description: protection_eligibility. */
  @Basic
  @Column(name = "protection_eligibility", length = 32)
  private java.lang.String protectionEligibility;
  /** Description: cc_approval. */
  @Basic
  @Column(name = "cc_approval", length = 32)
  private java.lang.String ccApproval;
  /** Description: cc_last_4. */
  @Basic
  @Column(name = "cc_last_4", length = 100)
  private java.lang.String ccLast4;
  /** Description: cc_status_description. */
  @Basic
  @Column(name = "cc_status_description", length = 32)
  private java.lang.String ccStatusDescription;
  /** Description: echeck_type. */
  @Basic
  @Column(name = "echeck_type", length = 32)
  private java.lang.String echeckType;
  /** Description: cc_debug_response_serialized. */
  @Basic
  @Column(name = "cc_debug_response_serialized", length = 32)
  private java.lang.String ccDebugResponseSerialized;
  /** Description: cc_ss_start_month. */
  @Basic
  @Column(name = "cc_ss_start_month", length = 128)
  private java.lang.String ccSsStartMonth;
  /** Description: echeck_account_type. */
  @Basic
  @Column(name = "echeck_account_type", length = 255)
  private java.lang.String echeckAccountType;
  /** Description: last_trans_id. */
  @Basic
  @Column(name = "last_trans_id", length = 255)
  private java.lang.String lastTransId;
  /** Description: cc_cid_status. */
  @Basic
  @Column(name = "cc_cid_status", length = 32)
  private java.lang.String ccCidStatus;
  /** Description: cc_owner. */
  @Basic
  @Column(name = "cc_owner", length = 128)
  private java.lang.String ccOwner;
  /** Description: cc_type. */
  @Basic
  @Column(name = "cc_type", length = 32)
  private java.lang.String ccType;
  /** Description: po_number. */
  @Basic
  @Column(name = "po_number", length = 32)
  private java.lang.String poNumber;
  /** Description: cc_exp_year. */
  @Basic
  @Column(name = "cc_exp_year", length = 4)
  private java.lang.String ccExpYear;
  /** Description: cc_status. */
  @Basic
  @Column(name = "cc_status", length = 4)
  private java.lang.String ccStatus;
  /** Description: echeck_routing_number. */
  @Basic
  @Column(name = "echeck_routing_number", length = 32)
  private java.lang.String echeckRoutingNumber;
  /** Description: account_status. */
  @Basic
  @Column(name = "account_status", length = 32)
  private java.lang.String accountStatus;
  /** Description: anet_trans_method. */
  @Basic
  @Column(name = "anet_trans_method", length = 32)
  private java.lang.String anetTransMethod;
  /** Description: cc_debug_response_body. */
  @Basic
  @Column(name = "cc_debug_response_body", length = 32)
  private java.lang.String ccDebugResponseBody;
  /** Description: cc_ss_issue. */
  @Basic
  @Column(name = "cc_ss_issue", length = 32)
  private java.lang.String ccSsIssue;
  /** Description: echeck_account_name. */
  @Basic
  @Column(name = "echeck_account_name", length = 32)
  private java.lang.String echeckAccountName;
  /** Description: cc_avs_status. */
  @Basic
  @Column(name = "cc_avs_status", length = 32)
  private java.lang.String ccAvsStatus;
  /** Description: cc_number_enc. */
  @Basic
  @Column(name = "cc_number_enc", length = 128)
  private java.lang.String ccNumberEnc;
  /** Description: cc_trans_id. */
  @Basic
  @Column(name = "cc_trans_id", length = 32)
  private java.lang.String ccTransId;
  /** Description: address_status. */
  @Basic
  @Column(name = "address_status", length = 32)
  private java.lang.String addressStatus;
  /** Description: additional_information. */
  @Basic
  @Column(name = "additional_information", length = 0)
  private java.lang.String additionalInformation;

  public SalesOrderPayment() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.math.BigDecimal getBaseShippingCaptured() {
    return this.baseShippingCaptured;
  }

  public java.math.BigDecimal getShippingCaptured() {
    return this.shippingCaptured;
  }

  public java.math.BigDecimal getAmountRefunded() {
    return this.amountRefunded;
  }

  public java.math.BigDecimal getBaseAmountPaid() {
    return this.baseAmountPaid;
  }

  public java.math.BigDecimal getAmountCanceled() {
    return this.amountCanceled;
  }

  public java.math.BigDecimal getBaseAmountAuthorized() {
    return this.baseAmountAuthorized;
  }

  public java.math.BigDecimal getBaseAmountPaidOnline() {
    return this.baseAmountPaidOnline;
  }

  public java.math.BigDecimal getBaseAmountRefundedOnline() {
    return this.baseAmountRefundedOnline;
  }

  public java.math.BigDecimal getBaseShippingAmount() {
    return this.baseShippingAmount;
  }

  public java.math.BigDecimal getShippingAmount() {
    return this.shippingAmount;
  }

  public java.math.BigDecimal getAmountPaid() {
    return this.amountPaid;
  }

  public java.math.BigDecimal getAmountAuthorized() {
    return this.amountAuthorized;
  }

  public java.math.BigDecimal getBaseAmountOrdered() {
    return this.baseAmountOrdered;
  }

  public java.math.BigDecimal getBaseShippingRefunded() {
    return this.baseShippingRefunded;
  }

  public java.math.BigDecimal getShippingRefunded() {
    return this.shippingRefunded;
  }

  public java.math.BigDecimal getBaseAmountRefunded() {
    return this.baseAmountRefunded;
  }

  public java.math.BigDecimal getAmountOrdered() {
    return this.amountOrdered;
  }

  public java.math.BigDecimal getBaseAmountCanceled() {
    return this.baseAmountCanceled;
  }

  public java.lang.Integer getQuotePaymentId() {
    return this.quotePaymentId;
  }

  public java.lang.String getAdditionalData() {
    return this.additionalData;
  }

  public java.lang.String getCcExpMonth() {
    return this.ccExpMonth;
  }

  public java.lang.String getCcSsStartYear() {
    return this.ccSsStartYear;
  }

  public java.lang.String getEcheckBankName() {
    return this.echeckBankName;
  }

  public java.lang.String getMethod() {
    return this.method;
  }

  public java.lang.String getCcDebugRequestBody() {
    return this.ccDebugRequestBody;
  }

  public java.lang.String getCcSecureVerify() {
    return this.ccSecureVerify;
  }

  public java.lang.String getProtectionEligibility() {
    return this.protectionEligibility;
  }

  public java.lang.String getCcApproval() {
    return this.ccApproval;
  }

  public java.lang.String getCcLast4() {
    return this.ccLast4;
  }

  public java.lang.String getCcStatusDescription() {
    return this.ccStatusDescription;
  }

  public java.lang.String getEcheckType() {
    return this.echeckType;
  }

  public java.lang.String getCcDebugResponseSerialized() {
    return this.ccDebugResponseSerialized;
  }

  public java.lang.String getCcSsStartMonth() {
    return this.ccSsStartMonth;
  }

  public java.lang.String getEcheckAccountType() {
    return this.echeckAccountType;
  }

  public java.lang.String getLastTransId() {
    return this.lastTransId;
  }

  public java.lang.String getCcCidStatus() {
    return this.ccCidStatus;
  }

  public java.lang.String getCcOwner() {
    return this.ccOwner;
  }

  public java.lang.String getCcType() {
    return this.ccType;
  }

  public java.lang.String getPoNumber() {
    return this.poNumber;
  }

  public java.lang.String getCcExpYear() {
    return this.ccExpYear;
  }

  public java.lang.String getCcStatus() {
    return this.ccStatus;
  }

  public java.lang.String getEcheckRoutingNumber() {
    return this.echeckRoutingNumber;
  }

  public java.lang.String getAccountStatus() {
    return this.accountStatus;
  }

  public java.lang.String getAnetTransMethod() {
    return this.anetTransMethod;
  }

  public java.lang.String getCcDebugResponseBody() {
    return this.ccDebugResponseBody;
  }

  public java.lang.String getCcSsIssue() {
    return this.ccSsIssue;
  }

  public java.lang.String getEcheckAccountName() {
    return this.echeckAccountName;
  }

  public java.lang.String getCcAvsStatus() {
    return this.ccAvsStatus;
  }

  public java.lang.String getCcNumberEnc() {
    return this.ccNumberEnc;
  }

  public java.lang.String getCcTransId() {
    return this.ccTransId;
  }

  public java.lang.String getAddressStatus() {
    return this.addressStatus;
  }

  public java.lang.String getAdditionalInformation() {
    return this.additionalInformation;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setBaseShippingCaptured(java.math.BigDecimal baseShippingCaptured) {
    this.baseShippingCaptured = baseShippingCaptured;
  }

  public void setShippingCaptured(java.math.BigDecimal shippingCaptured) {
    this.shippingCaptured = shippingCaptured;
  }

  public void setAmountRefunded(java.math.BigDecimal amountRefunded) {
    this.amountRefunded = amountRefunded;
  }

  public void setBaseAmountPaid(java.math.BigDecimal baseAmountPaid) {
    this.baseAmountPaid = baseAmountPaid;
  }

  public void setAmountCanceled(java.math.BigDecimal amountCanceled) {
    this.amountCanceled = amountCanceled;
  }

  public void setBaseAmountAuthorized(java.math.BigDecimal baseAmountAuthorized) {
    this.baseAmountAuthorized = baseAmountAuthorized;
  }

  public void setBaseAmountPaidOnline(java.math.BigDecimal baseAmountPaidOnline) {
    this.baseAmountPaidOnline = baseAmountPaidOnline;
  }

  public void setBaseAmountRefundedOnline(java.math.BigDecimal baseAmountRefundedOnline) {
    this.baseAmountRefundedOnline = baseAmountRefundedOnline;
  }

  public void setBaseShippingAmount(java.math.BigDecimal baseShippingAmount) {
    this.baseShippingAmount = baseShippingAmount;
  }

  public void setShippingAmount(java.math.BigDecimal shippingAmount) {
    this.shippingAmount = shippingAmount;
  }

  public void setAmountPaid(java.math.BigDecimal amountPaid) {
    this.amountPaid = amountPaid;
  }

  public void setAmountAuthorized(java.math.BigDecimal amountAuthorized) {
    this.amountAuthorized = amountAuthorized;
  }

  public void setBaseAmountOrdered(java.math.BigDecimal baseAmountOrdered) {
    this.baseAmountOrdered = baseAmountOrdered;
  }

  public void setBaseShippingRefunded(java.math.BigDecimal baseShippingRefunded) {
    this.baseShippingRefunded = baseShippingRefunded;
  }

  public void setShippingRefunded(java.math.BigDecimal shippingRefunded) {
    this.shippingRefunded = shippingRefunded;
  }

  public void setBaseAmountRefunded(java.math.BigDecimal baseAmountRefunded) {
    this.baseAmountRefunded = baseAmountRefunded;
  }

  public void setAmountOrdered(java.math.BigDecimal amountOrdered) {
    this.amountOrdered = amountOrdered;
  }

  public void setBaseAmountCanceled(java.math.BigDecimal baseAmountCanceled) {
    this.baseAmountCanceled = baseAmountCanceled;
  }

  public void setQuotePaymentId(java.lang.Integer quotePaymentId) {
    this.quotePaymentId = quotePaymentId;
  }

  public void setAdditionalData(java.lang.String additionalData) {
    this.additionalData = additionalData;
  }

  public void setCcExpMonth(java.lang.String ccExpMonth) {
    this.ccExpMonth = ccExpMonth;
  }

  public void setCcSsStartYear(java.lang.String ccSsStartYear) {
    this.ccSsStartYear = ccSsStartYear;
  }

  public void setEcheckBankName(java.lang.String echeckBankName) {
    this.echeckBankName = echeckBankName;
  }

  public void setMethod(java.lang.String method) {
    this.method = method;
  }

  public void setCcDebugRequestBody(java.lang.String ccDebugRequestBody) {
    this.ccDebugRequestBody = ccDebugRequestBody;
  }

  public void setCcSecureVerify(java.lang.String ccSecureVerify) {
    this.ccSecureVerify = ccSecureVerify;
  }

  public void setProtectionEligibility(java.lang.String protectionEligibility) {
    this.protectionEligibility = protectionEligibility;
  }

  public void setCcApproval(java.lang.String ccApproval) {
    this.ccApproval = ccApproval;
  }

  public void setCcLast4(java.lang.String ccLast4) {
    this.ccLast4 = ccLast4;
  }

  public void setCcStatusDescription(java.lang.String ccStatusDescription) {
    this.ccStatusDescription = ccStatusDescription;
  }

  public void setEcheckType(java.lang.String echeckType) {
    this.echeckType = echeckType;
  }

  public void setCcDebugResponseSerialized(java.lang.String ccDebugResponseSerialized) {
    this.ccDebugResponseSerialized = ccDebugResponseSerialized;
  }

  public void setCcSsStartMonth(java.lang.String ccSsStartMonth) {
    this.ccSsStartMonth = ccSsStartMonth;
  }

  public void setEcheckAccountType(java.lang.String echeckAccountType) {
    this.echeckAccountType = echeckAccountType;
  }

  public void setLastTransId(java.lang.String lastTransId) {
    this.lastTransId = lastTransId;
  }

  public void setCcCidStatus(java.lang.String ccCidStatus) {
    this.ccCidStatus = ccCidStatus;
  }

  public void setCcOwner(java.lang.String ccOwner) {
    this.ccOwner = ccOwner;
  }

  public void setCcType(java.lang.String ccType) {
    this.ccType = ccType;
  }

  public void setPoNumber(java.lang.String poNumber) {
    this.poNumber = poNumber;
  }

  public void setCcExpYear(java.lang.String ccExpYear) {
    this.ccExpYear = ccExpYear;
  }

  public void setCcStatus(java.lang.String ccStatus) {
    this.ccStatus = ccStatus;
  }

  public void setEcheckRoutingNumber(java.lang.String echeckRoutingNumber) {
    this.echeckRoutingNumber = echeckRoutingNumber;
  }

  public void setAccountStatus(java.lang.String accountStatus) {
    this.accountStatus = accountStatus;
  }

  public void setAnetTransMethod(java.lang.String anetTransMethod) {
    this.anetTransMethod = anetTransMethod;
  }

  public void setCcDebugResponseBody(java.lang.String ccDebugResponseBody) {
    this.ccDebugResponseBody = ccDebugResponseBody;
  }

  public void setCcSsIssue(java.lang.String ccSsIssue) {
    this.ccSsIssue = ccSsIssue;
  }

  public void setEcheckAccountName(java.lang.String echeckAccountName) {
    this.echeckAccountName = echeckAccountName;
  }

  public void setCcAvsStatus(java.lang.String ccAvsStatus) {
    this.ccAvsStatus = ccAvsStatus;
  }

  public void setCcNumberEnc(java.lang.String ccNumberEnc) {
    this.ccNumberEnc = ccNumberEnc;
  }

  public void setCcTransId(java.lang.String ccTransId) {
    this.ccTransId = ccTransId;
  }

  public void setAddressStatus(java.lang.String addressStatus) {
    this.addressStatus = addressStatus;
  }

  public void setAdditionalInformation(java.lang.String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }
}
