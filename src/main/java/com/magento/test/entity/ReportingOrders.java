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
@Table(name = "reporting_orders")
public class ReportingOrders implements Serializable {
  private static final long serialVersionUID = 163445090615978333L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: total. */
  @Basic
  @Column(name = "total")
  private java.math.BigDecimal total;
  /** Description: total_base. */
  @Basic
  @Column(name = "total_base")
  private java.math.BigDecimal totalBase;
  /** Description: item_count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "item_count")
  private java.lang.Integer itemCount;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;

  public ReportingOrders() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.math.BigDecimal getTotal() {
    return this.total;
  }

  public java.math.BigDecimal getTotalBase() {
    return this.totalBase;
  }

  public java.lang.Integer getItemCount() {
    return this.itemCount;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setTotal(java.math.BigDecimal total) {
    this.total = total;
  }

  public void setTotalBase(java.math.BigDecimal totalBase) {
    this.totalBase = totalBase;
  }

  public void setItemCount(java.lang.Integer itemCount) {
    this.itemCount = itemCount;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
