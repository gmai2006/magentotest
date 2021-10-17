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
@Table(name = "newsletter_subscriber")
public class NewsletterSubscriber implements Serializable {
  private static final long serialVersionUID = 163445090572292021L;

  /** Description: subscriber_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "subscriber_id")
  private java.lang.Integer subscriberId;

  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: change_status_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "change_status_at")
  private java.sql.Timestamp changeStatusAt;
  /** Description: customer_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: subscriber_email. */
  @Basic
  @Column(name = "subscriber_email", length = 150)
  private java.lang.String subscriberEmail;
  /** Description: subscriber_status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "subscriber_status")
  private java.lang.Integer subscriberStatus;
  /** Description: subscriber_confirm_code. */
  @Basic
  @Column(name = "subscriber_confirm_code", length = 32)
  private java.lang.String subscriberConfirmCode;

  public NewsletterSubscriber() {}

  public java.lang.Integer getSubscriberId() {
    return this.subscriberId;
  }

  public void setSubscriberId(java.lang.Integer subscriberId) {
    this.subscriberId = subscriberId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.sql.Timestamp getChangeStatusAt() {
    return this.changeStatusAt;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getSubscriberEmail() {
    return this.subscriberEmail;
  }

  public java.lang.Integer getSubscriberStatus() {
    return this.subscriberStatus;
  }

  public java.lang.String getSubscriberConfirmCode() {
    return this.subscriberConfirmCode;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setChangeStatusAt(java.sql.Timestamp changeStatusAt) {
    this.changeStatusAt = changeStatusAt;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setSubscriberEmail(java.lang.String subscriberEmail) {
    this.subscriberEmail = subscriberEmail;
  }

  public void setSubscriberStatus(java.lang.Integer subscriberStatus) {
    this.subscriberStatus = subscriberStatus;
  }

  public void setSubscriberConfirmCode(java.lang.String subscriberConfirmCode) {
    this.subscriberConfirmCode = subscriberConfirmCode;
  }
}
