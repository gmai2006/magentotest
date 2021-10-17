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
@Table(name = "queue_message")
public class QueueMessage implements Serializable {
  private static final long serialVersionUID = 163445090588398549L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Long id;

  /** Description: topic_name. */
  @Basic
  @Column(name = "topic_name", length = 255)
  private java.lang.String topicName;
  /** Description: body. */
  @Basic
  @Column(name = "body", length = 0)
  private java.lang.String body;

  public QueueMessage() {}

  public java.lang.Long getId() {
    return this.id;
  }

  public void setId(java.lang.Long id) {
    this.id = id;
  }

  public java.lang.String getTopicName() {
    return this.topicName;
  }

  public java.lang.String getBody() {
    return this.body;
  }

  public void setTopicName(java.lang.String topicName) {
    this.topicName = topicName;
  }

  public void setBody(java.lang.String body) {
    this.body = body;
  }
}
