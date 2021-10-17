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
@Table(name = "report_event")
public class ReportEvent implements Serializable {
  private static final long serialVersionUID = 163445090610822588L;

  /** Description: event_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "event_id")
  private java.lang.Long eventId;

  /** Description: logged_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "logged_at")
  private java.sql.Timestamp loggedAt;
  /** Description: event_type_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "event_type_id")
  private java.lang.Integer eventTypeId;
  /** Description: object_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "object_id")
  private java.lang.Integer objectId;
  /** Description: subject_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "subject_id")
  private java.lang.Integer subjectId;
  /** Description: subtype. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "subtype")
  private java.lang.Integer subtype;
  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;

  public ReportEvent() {}

  public java.lang.Long getEventId() {
    return this.eventId;
  }

  public void setEventId(java.lang.Long eventId) {
    this.eventId = eventId;
  }

  public java.sql.Timestamp getLoggedAt() {
    return this.loggedAt;
  }

  public java.lang.Integer getEventTypeId() {
    return this.eventTypeId;
  }

  public java.lang.Integer getObjectId() {
    return this.objectId;
  }

  public java.lang.Integer getSubjectId() {
    return this.subjectId;
  }

  public java.lang.Integer getSubtype() {
    return this.subtype;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public void setLoggedAt(java.sql.Timestamp loggedAt) {
    this.loggedAt = loggedAt;
  }

  public void setEventTypeId(java.lang.Integer eventTypeId) {
    this.eventTypeId = eventTypeId;
  }

  public void setObjectId(java.lang.Integer objectId) {
    this.objectId = objectId;
  }

  public void setSubjectId(java.lang.Integer subjectId) {
    this.subjectId = subjectId;
  }

  public void setSubtype(java.lang.Integer subtype) {
    this.subtype = subtype;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }
}
