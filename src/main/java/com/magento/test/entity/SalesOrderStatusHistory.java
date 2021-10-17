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
@Table(name = "sales_order_status_history")
public class SalesOrderStatusHistory implements Serializable {
  private static final long serialVersionUID = 163445090659092948L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: parent_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "parent_id")
  private java.lang.Integer parentId;
  /** Description: is_customer_notified. */
  @Basic
  @Column(name = "is_customer_notified")
  private java.lang.Integer isCustomerNotified;
  /** Description: is_visible_on_front. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_visible_on_front")
  private java.lang.Integer isVisibleOnFront;
  /** Description: comment. */
  @Basic
  @Column(name = "comment", length = 0)
  private java.lang.String comment;
  /** Description: status. */
  @Basic
  @Column(name = "status", length = 32)
  private java.lang.String status;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: entity_name. */
  @Basic
  @Column(name = "entity_name", length = 32)
  private java.lang.String entityName;

  public SalesOrderStatusHistory() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.lang.Integer getIsCustomerNotified() {
    return this.isCustomerNotified;
  }

  public java.lang.Integer getIsVisibleOnFront() {
    return this.isVisibleOnFront;
  }

  public java.lang.String getComment() {
    return this.comment;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.lang.String getEntityName() {
    return this.entityName;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setIsCustomerNotified(java.lang.Integer isCustomerNotified) {
    this.isCustomerNotified = isCustomerNotified;
  }

  public void setIsVisibleOnFront(java.lang.Integer isVisibleOnFront) {
    this.isVisibleOnFront = isVisibleOnFront;
  }

  public void setComment(java.lang.String comment) {
    this.comment = comment;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setEntityName(java.lang.String entityName) {
    this.entityName = entityName;
  }
}
