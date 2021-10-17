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
@Table(name = "email_contact_consent")
public class EmailContactConsent implements Serializable {
  private static final long serialVersionUID = 163445090542471812L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: email_contact_id. */
  @Basic
  @Column(name = "email_contact_id")
  private java.lang.Integer emailContactId;
  /** Description: consent_url. */
  @Basic
  @Column(name = "consent_url", length = 255)
  private java.lang.String consentUrl;
  /** Description: consent_datetime. */
  @Basic
  @Column(name = "consent_datetime")
  private java.util.Date consentDatetime;
  /** Description: consent_ip. */
  @Basic
  @Column(name = "consent_ip", length = 255)
  private java.lang.String consentIp;
  /** Description: consent_user_agent. */
  @Basic
  @Column(name = "consent_user_agent", length = 255)
  private java.lang.String consentUserAgent;

  public EmailContactConsent() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getEmailContactId() {
    return this.emailContactId;
  }

  public java.lang.String getConsentUrl() {
    return this.consentUrl;
  }

  public java.util.Date getConsentDatetime() {
    return this.consentDatetime;
  }

  public java.lang.String getConsentIp() {
    return this.consentIp;
  }

  public java.lang.String getConsentUserAgent() {
    return this.consentUserAgent;
  }

  public void setEmailContactId(java.lang.Integer emailContactId) {
    this.emailContactId = emailContactId;
  }

  public void setConsentUrl(java.lang.String consentUrl) {
    this.consentUrl = consentUrl;
  }

  public void setConsentDatetime(java.util.Date consentDatetime) {
    this.consentDatetime = consentDatetime;
  }

  public void setConsentIp(java.lang.String consentIp) {
    this.consentIp = consentIp;
  }

  public void setConsentUserAgent(java.lang.String consentUserAgent) {
    this.consentUserAgent = consentUserAgent;
  }
}
