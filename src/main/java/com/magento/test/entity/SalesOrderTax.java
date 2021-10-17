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
@Table(name = "sales_order_tax")
public class SalesOrderTax implements Serializable {
  private static final long serialVersionUID = 163445090661630588L;

  /** Description: tax_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "tax_id")
  private java.lang.Integer taxId;

  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_id")
  private java.lang.Integer orderId;
  /** Description: code. */
  @Basic
  @Column(name = "code", length = 255)
  private java.lang.String code;
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: percent. */
  @Basic
  @Column(name = "percent")
  private java.math.BigDecimal percent;
  /** Description: amount. */
  @Basic
  @Column(name = "amount")
  private java.math.BigDecimal amount;
  /** Description: priority. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "priority")
  private java.lang.Integer priority;
  /** Description: position. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "position")
  private java.lang.Integer position;
  /** Description: base_amount. */
  @Basic
  @Column(name = "base_amount")
  private java.math.BigDecimal baseAmount;
  /** Description: process. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "process")
  private java.lang.Integer process;
  /** Description: base_real_amount. */
  @Basic
  @Column(name = "base_real_amount")
  private java.math.BigDecimal baseRealAmount;

  public SalesOrderTax() {}

  public java.lang.Integer getTaxId() {
    return this.taxId;
  }

  public void setTaxId(java.lang.Integer taxId) {
    this.taxId = taxId;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.math.BigDecimal getPercent() {
    return this.percent;
  }

  public java.math.BigDecimal getAmount() {
    return this.amount;
  }

  public java.lang.Integer getPriority() {
    return this.priority;
  }

  public java.lang.Integer getPosition() {
    return this.position;
  }

  public java.math.BigDecimal getBaseAmount() {
    return this.baseAmount;
  }

  public java.lang.Integer getProcess() {
    return this.process;
  }

  public java.math.BigDecimal getBaseRealAmount() {
    return this.baseRealAmount;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setPercent(java.math.BigDecimal percent) {
    this.percent = percent;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public void setPriority(java.lang.Integer priority) {
    this.priority = priority;
  }

  public void setPosition(java.lang.Integer position) {
    this.position = position;
  }

  public void setBaseAmount(java.math.BigDecimal baseAmount) {
    this.baseAmount = baseAmount;
  }

  public void setProcess(java.lang.Integer process) {
    this.process = process;
  }

  public void setBaseRealAmount(java.math.BigDecimal baseRealAmount) {
    this.baseRealAmount = baseRealAmount;
  }
}
