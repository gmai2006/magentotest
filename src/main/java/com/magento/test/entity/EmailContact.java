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
@Table(name = "email_contact")
public class EmailContact implements Serializable {
  private static final long serialVersionUID = 163445090541696218L;

  /** Description: email_contact_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "email_contact_id")
  private java.lang.Integer emailContactId;

  /** Description: is_guest. */
  @Basic
  @Column(name = "is_guest")
  private java.lang.Integer isGuest;
  /** Description: contact_id. */
  @Basic
  @Column(name = "contact_id", length = 15)
  private java.lang.String contactId;
  /** Description: customer_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;
  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: email. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "email", length = 255)
  private java.lang.String email;
  /** Description: is_subscriber. */
  @Basic
  @Column(name = "is_subscriber")
  private java.lang.Integer isSubscriber;
  /** Description: subscriber_status. */
  @Basic
  @Column(name = "subscriber_status")
  private java.lang.Integer subscriberStatus;
  /** Description: email_imported. */
  @Basic
  @Column(name = "email_imported")
  private java.lang.Integer emailImported;
  /** Description: subscriber_imported. */
  @Basic
  @Column(name = "subscriber_imported")
  private java.lang.Integer subscriberImported;
  /** Description: suppressed. */
  @Basic
  @Column(name = "suppressed")
  private java.lang.Integer suppressed;

  public EmailContact() {}

  public java.lang.Integer getEmailContactId() {
    return this.emailContactId;
  }

  public void setEmailContactId(java.lang.Integer emailContactId) {
    this.emailContactId = emailContactId;
  }

  public java.lang.Integer getIsGuest() {
    return this.isGuest;
  }

  public java.lang.String getContactId() {
    return this.contactId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.Integer getIsSubscriber() {
    return this.isSubscriber;
  }

  public java.lang.Integer getSubscriberStatus() {
    return this.subscriberStatus;
  }

  public java.lang.Integer getEmailImported() {
    return this.emailImported;
  }

  public java.lang.Integer getSubscriberImported() {
    return this.subscriberImported;
  }

  public java.lang.Integer getSuppressed() {
    return this.suppressed;
  }

  public void setIsGuest(java.lang.Integer isGuest) {
    this.isGuest = isGuest;
  }

  public void setContactId(java.lang.String contactId) {
    this.contactId = contactId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setIsSubscriber(java.lang.Integer isSubscriber) {
    this.isSubscriber = isSubscriber;
  }

  public void setSubscriberStatus(java.lang.Integer subscriberStatus) {
    this.subscriberStatus = subscriberStatus;
  }

  public void setEmailImported(java.lang.Integer emailImported) {
    this.emailImported = emailImported;
  }

  public void setSubscriberImported(java.lang.Integer subscriberImported) {
    this.subscriberImported = subscriberImported;
  }

  public void setSuppressed(java.lang.Integer suppressed) {
    this.suppressed = suppressed;
  }
}
