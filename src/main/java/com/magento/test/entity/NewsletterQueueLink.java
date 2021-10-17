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
@Table(name = "newsletter_queue_link")
public class NewsletterQueueLink implements Serializable {
  private static final long serialVersionUID = 163445090570822768L;

  /** Description: queue_link_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "queue_link_id")
  private java.lang.Integer queueLinkId;

  /** Description: queue_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "queue_id")
  private java.lang.Integer queueId;
  /** Description: subscriber_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "subscriber_id")
  private java.lang.Integer subscriberId;
  /** Description: letter_sent_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "letter_sent_at")
  private java.sql.Timestamp letterSentAt;

  public NewsletterQueueLink() {}

  public java.lang.Integer getQueueLinkId() {
    return this.queueLinkId;
  }

  public void setQueueLinkId(java.lang.Integer queueLinkId) {
    this.queueLinkId = queueLinkId;
  }

  public java.lang.Integer getQueueId() {
    return this.queueId;
  }

  public java.lang.Integer getSubscriberId() {
    return this.subscriberId;
  }

  public java.sql.Timestamp getLetterSentAt() {
    return this.letterSentAt;
  }

  public void setQueueId(java.lang.Integer queueId) {
    this.queueId = queueId;
  }

  public void setSubscriberId(java.lang.Integer subscriberId) {
    this.subscriberId = subscriberId;
  }

  public void setLetterSentAt(java.sql.Timestamp letterSentAt) {
    this.letterSentAt = letterSentAt;
  }
}
