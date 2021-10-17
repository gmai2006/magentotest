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
@Table(name = "klarna_payments_quote")
public class KlarnaPaymentsQuote implements Serializable {
  private static final long serialVersionUID = 16344509056274682L;

  /** Description: payments_quote_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "payments_quote_id")
  private java.lang.Integer paymentsQuoteId;

  /** Description: session_id. */
  @Basic
  @Column(name = "session_id", length = 255)
  private java.lang.String sessionId;
  /** Description: client_token. */
  @Basic
  @Column(name = "client_token", length = 0)
  private java.lang.String clientToken;
  /** Description: authorization_token. */
  @Basic
  @Column(name = "authorization_token", length = 255)
  private java.lang.String authorizationToken;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: quote_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "quote_id")
  private java.lang.Integer quoteId;
  /** Description: payment_methods. */
  @Basic
  @Column(name = "payment_methods", length = 255)
  private java.lang.String paymentMethods;
  /** Description: payment_method_info. */
  @Basic
  @Column(name = "payment_method_info", length = 0)
  private java.lang.String paymentMethodInfo;

  public KlarnaPaymentsQuote() {}

  public java.lang.Integer getPaymentsQuoteId() {
    return this.paymentsQuoteId;
  }

  public void setPaymentsQuoteId(java.lang.Integer paymentsQuoteId) {
    this.paymentsQuoteId = paymentsQuoteId;
  }

  public java.lang.String getSessionId() {
    return this.sessionId;
  }

  public java.lang.String getClientToken() {
    return this.clientToken;
  }

  public java.lang.String getAuthorizationToken() {
    return this.authorizationToken;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.lang.Integer getQuoteId() {
    return this.quoteId;
  }

  public java.lang.String getPaymentMethods() {
    return this.paymentMethods;
  }

  public java.lang.String getPaymentMethodInfo() {
    return this.paymentMethodInfo;
  }

  public void setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
  }

  public void setClientToken(java.lang.String clientToken) {
    this.clientToken = clientToken;
  }

  public void setAuthorizationToken(java.lang.String authorizationToken) {
    this.authorizationToken = authorizationToken;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setQuoteId(java.lang.Integer quoteId) {
    this.quoteId = quoteId;
  }

  public void setPaymentMethods(java.lang.String paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public void setPaymentMethodInfo(java.lang.String paymentMethodInfo) {
    this.paymentMethodInfo = paymentMethodInfo;
  }
}
