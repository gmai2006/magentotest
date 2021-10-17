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
@Table(name = "newsletter_problem")
public class NewsletterProblem implements Serializable {
  private static final long serialVersionUID = 163445090569487676L;

  /** Description: problem_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "problem_id")
  private java.lang.Integer problemId;

  /** Description: subscriber_id. */
  @Basic
  @Column(name = "subscriber_id")
  private java.lang.Integer subscriberId;
  /** Description: queue_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "queue_id")
  private java.lang.Integer queueId;
  /** Description: problem_error_code. */
  @Basic
  @Column(name = "problem_error_code")
  private java.lang.Integer problemErrorCode;
  /** Description: problem_error_text. */
  @Basic
  @Column(name = "problem_error_text", length = 200)
  private java.lang.String problemErrorText;

  public NewsletterProblem() {}

  public java.lang.Integer getProblemId() {
    return this.problemId;
  }

  public void setProblemId(java.lang.Integer problemId) {
    this.problemId = problemId;
  }

  public java.lang.Integer getSubscriberId() {
    return this.subscriberId;
  }

  public java.lang.Integer getQueueId() {
    return this.queueId;
  }

  public java.lang.Integer getProblemErrorCode() {
    return this.problemErrorCode;
  }

  public java.lang.String getProblemErrorText() {
    return this.problemErrorText;
  }

  public void setSubscriberId(java.lang.Integer subscriberId) {
    this.subscriberId = subscriberId;
  }

  public void setQueueId(java.lang.Integer queueId) {
    this.queueId = queueId;
  }

  public void setProblemErrorCode(java.lang.Integer problemErrorCode) {
    this.problemErrorCode = problemErrorCode;
  }

  public void setProblemErrorText(java.lang.String problemErrorText) {
    this.problemErrorText = problemErrorText;
  }
}
