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
@Table(name = "customer_visitor")
public class CustomerVisitor implements Serializable {
  private static final long serialVersionUID = 163445090503414051L;

  /** Description: visitor_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "visitor_id")
  private java.lang.Long visitorId;

  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: session_id. */
  @Basic
  @Column(name = "session_id", length = 64)
  private java.lang.String sessionId;
  /** Description: last_visit_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "last_visit_at")
  private java.sql.Timestamp lastVisitAt;

  public CustomerVisitor() {}

  public java.lang.Long getVisitorId() {
    return this.visitorId;
  }

  public void setVisitorId(java.lang.Long visitorId) {
    this.visitorId = visitorId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getSessionId() {
    return this.sessionId;
  }

  public java.sql.Timestamp getLastVisitAt() {
    return this.lastVisitAt;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
  }

  public void setLastVisitAt(java.sql.Timestamp lastVisitAt) {
    this.lastVisitAt = lastVisitAt;
  }
}
