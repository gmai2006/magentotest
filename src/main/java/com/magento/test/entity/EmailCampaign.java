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
@Table(name = "email_campaign")
public class EmailCampaign implements Serializable {
  private static final long serialVersionUID = 163445090540016778L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: campaign_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "campaign_id")
  private java.lang.Integer campaignId;
  /** Description: email. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "email", length = 255)
  private java.lang.String email;
  /** Description: customer_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: sent_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sent_at")
  private java.sql.Timestamp sentAt;
  /** Description: order_increment_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_increment_id", length = 50)
  private java.lang.String orderIncrementId;
  /** Description: quote_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "quote_id")
  private java.lang.Integer quoteId;
  /** Description: message. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "message", length = 255)
  private java.lang.String message;
  /** Description: checkout_method. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "checkout_method", length = 255)
  private java.lang.String checkoutMethod;
  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: event_name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "event_name", length = 255)
  private java.lang.String eventName;
  /** Description: send_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "send_id", length = 255)
  private java.lang.String sendId;
  /** Description: send_status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "send_status")
  private java.lang.Integer sendStatus;
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

  public EmailCampaign() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getCampaignId() {
    return this.campaignId;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.sql.Timestamp getSentAt() {
    return this.sentAt;
  }

  public java.lang.String getOrderIncrementId() {
    return this.orderIncrementId;
  }

  public java.lang.Integer getQuoteId() {
    return this.quoteId;
  }

  public java.lang.String getMessage() {
    return this.message;
  }

  public java.lang.String getCheckoutMethod() {
    return this.checkoutMethod;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getEventName() {
    return this.eventName;
  }

  public java.lang.String getSendId() {
    return this.sendId;
  }

  public java.lang.Integer getSendStatus() {
    return this.sendStatus;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setCampaignId(java.lang.Integer campaignId) {
    this.campaignId = campaignId;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setSentAt(java.sql.Timestamp sentAt) {
    this.sentAt = sentAt;
  }

  public void setOrderIncrementId(java.lang.String orderIncrementId) {
    this.orderIncrementId = orderIncrementId;
  }

  public void setQuoteId(java.lang.Integer quoteId) {
    this.quoteId = quoteId;
  }

  public void setMessage(java.lang.String message) {
    this.message = message;
  }

  public void setCheckoutMethod(java.lang.String checkoutMethod) {
    this.checkoutMethod = checkoutMethod;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setEventName(java.lang.String eventName) {
    this.eventName = eventName;
  }

  public void setSendId(java.lang.String sendId) {
    this.sendId = sendId;
  }

  public void setSendStatus(java.lang.Integer sendStatus) {
    this.sendStatus = sendStatus;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
