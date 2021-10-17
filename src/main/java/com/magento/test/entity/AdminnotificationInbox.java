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
@Table(name = "adminnotification_inbox")
public class AdminnotificationInbox implements Serializable {
  private static final long serialVersionUID = 163445090312675726L;

  /** Description: notification_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "notification_id")
  private java.lang.Integer notificationId;

  /** Description: severity. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "severity")
  private java.lang.Integer severity;
  /** Description: date_added. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "date_added")
  private java.sql.Timestamp dateAdded;
  /** Description: title. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 0)
  private java.lang.String description;
  /** Description: url. */
  @Basic
  @Column(name = "url", length = 255)
  private java.lang.String url;
  /** Description: is_read. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_read")
  private java.lang.Integer isRead;
  /** Description: is_remove. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_remove")
  private java.lang.Integer isRemove;

  public AdminnotificationInbox() {}

  public java.lang.Integer getNotificationId() {
    return this.notificationId;
  }

  public void setNotificationId(java.lang.Integer notificationId) {
    this.notificationId = notificationId;
  }

  public java.lang.Integer getSeverity() {
    return this.severity;
  }

  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.lang.String getUrl() {
    return this.url;
  }

  public java.lang.Integer getIsRead() {
    return this.isRead;
  }

  public java.lang.Integer getIsRemove() {
    return this.isRemove;
  }

  public void setSeverity(java.lang.Integer severity) {
    this.severity = severity;
  }

  public void setDateAdded(java.sql.Timestamp dateAdded) {
    this.dateAdded = dateAdded;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setUrl(java.lang.String url) {
    this.url = url;
  }

  public void setIsRead(java.lang.Integer isRead) {
    this.isRead = isRead;
  }

  public void setIsRemove(java.lang.Integer isRemove) {
    this.isRemove = isRemove;
  }
}
