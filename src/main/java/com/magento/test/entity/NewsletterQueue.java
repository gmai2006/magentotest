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
@Table(name = "newsletter_queue")
public class NewsletterQueue implements Serializable {
  private static final long serialVersionUID = 163445090570048072L;

  /** Description: queue_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "queue_id")
  private java.lang.Integer queueId;

  /** Description: template_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "template_id")
  private java.lang.Integer templateId;
  /** Description: newsletter_type. */
  @Basic
  @Column(name = "newsletter_type")
  private java.lang.Integer newsletterType;
  /** Description: newsletter_text. */
  @Basic
  @Column(name = "newsletter_text", length = 0)
  private java.lang.String newsletterText;
  /** Description: newsletter_styles. */
  @Basic
  @Column(name = "newsletter_styles", length = 0)
  private java.lang.String newsletterStyles;
  /** Description: newsletter_subject. */
  @Basic
  @Column(name = "newsletter_subject", length = 200)
  private java.lang.String newsletterSubject;
  /** Description: newsletter_sender_name. */
  @Basic
  @Column(name = "newsletter_sender_name", length = 200)
  private java.lang.String newsletterSenderName;
  /** Description: newsletter_sender_email. */
  @Basic
  @Column(name = "newsletter_sender_email", length = 200)
  private java.lang.String newsletterSenderEmail;
  /** Description: queue_status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "queue_status")
  private java.lang.Integer queueStatus;
  /** Description: queue_start_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "queue_start_at")
  private java.sql.Timestamp queueStartAt;
  /** Description: queue_finish_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "queue_finish_at")
  private java.sql.Timestamp queueFinishAt;

  public NewsletterQueue() {}

  public java.lang.Integer getQueueId() {
    return this.queueId;
  }

  public void setQueueId(java.lang.Integer queueId) {
    this.queueId = queueId;
  }

  public java.lang.Integer getTemplateId() {
    return this.templateId;
  }

  public java.lang.Integer getNewsletterType() {
    return this.newsletterType;
  }

  public java.lang.String getNewsletterText() {
    return this.newsletterText;
  }

  public java.lang.String getNewsletterStyles() {
    return this.newsletterStyles;
  }

  public java.lang.String getNewsletterSubject() {
    return this.newsletterSubject;
  }

  public java.lang.String getNewsletterSenderName() {
    return this.newsletterSenderName;
  }

  public java.lang.String getNewsletterSenderEmail() {
    return this.newsletterSenderEmail;
  }

  public java.lang.Integer getQueueStatus() {
    return this.queueStatus;
  }

  public java.sql.Timestamp getQueueStartAt() {
    return this.queueStartAt;
  }

  public java.sql.Timestamp getQueueFinishAt() {
    return this.queueFinishAt;
  }

  public void setTemplateId(java.lang.Integer templateId) {
    this.templateId = templateId;
  }

  public void setNewsletterType(java.lang.Integer newsletterType) {
    this.newsletterType = newsletterType;
  }

  public void setNewsletterText(java.lang.String newsletterText) {
    this.newsletterText = newsletterText;
  }

  public void setNewsletterStyles(java.lang.String newsletterStyles) {
    this.newsletterStyles = newsletterStyles;
  }

  public void setNewsletterSubject(java.lang.String newsletterSubject) {
    this.newsletterSubject = newsletterSubject;
  }

  public void setNewsletterSenderName(java.lang.String newsletterSenderName) {
    this.newsletterSenderName = newsletterSenderName;
  }

  public void setNewsletterSenderEmail(java.lang.String newsletterSenderEmail) {
    this.newsletterSenderEmail = newsletterSenderEmail;
  }

  public void setQueueStatus(java.lang.Integer queueStatus) {
    this.queueStatus = queueStatus;
  }

  public void setQueueStartAt(java.sql.Timestamp queueStartAt) {
    this.queueStartAt = queueStartAt;
  }

  public void setQueueFinishAt(java.sql.Timestamp queueFinishAt) {
    this.queueFinishAt = queueFinishAt;
  }
}
