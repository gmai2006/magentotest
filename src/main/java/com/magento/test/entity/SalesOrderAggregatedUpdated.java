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
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(SalesOrderAggregatedUpdatedId.class)
@Table(name = "sales_order_aggregated_updated")
public class SalesOrderAggregatedUpdated implements Serializable {
  private static final long serialVersionUID = 163445090649368738L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: order_status. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "order_status")
  private java.lang.String orderStatus;
  /** Description: period. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "period")
  private java.util.Date period;
  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: orders_count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "orders_count")
  private java.lang.Integer ordersCount;
  /** Description: total_qty_ordered. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_qty_ordered")
  private java.math.BigDecimal totalQtyOrdered;
  /** Description: total_qty_invoiced. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_qty_invoiced")
  private java.math.BigDecimal totalQtyInvoiced;
  /** Description: total_income_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_income_amount")
  private java.math.BigDecimal totalIncomeAmount;
  /** Description: total_revenue_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_revenue_amount")
  private java.math.BigDecimal totalRevenueAmount;
  /** Description: total_profit_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_profit_amount")
  private java.math.BigDecimal totalProfitAmount;
  /** Description: total_invoiced_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_invoiced_amount")
  private java.math.BigDecimal totalInvoicedAmount;
  /** Description: total_canceled_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_canceled_amount")
  private java.math.BigDecimal totalCanceledAmount;
  /** Description: total_paid_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_paid_amount")
  private java.math.BigDecimal totalPaidAmount;
  /** Description: total_refunded_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_refunded_amount")
  private java.math.BigDecimal totalRefundedAmount;
  /** Description: total_tax_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_tax_amount")
  private java.math.BigDecimal totalTaxAmount;
  /** Description: total_tax_amount_actual. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_tax_amount_actual")
  private java.math.BigDecimal totalTaxAmountActual;
  /** Description: total_shipping_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_shipping_amount")
  private java.math.BigDecimal totalShippingAmount;
  /** Description: total_shipping_amount_actual. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_shipping_amount_actual")
  private java.math.BigDecimal totalShippingAmountActual;
  /** Description: total_discount_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_discount_amount")
  private java.math.BigDecimal totalDiscountAmount;
  /** Description: total_discount_amount_actual. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_discount_amount_actual")
  private java.math.BigDecimal totalDiscountAmountActual;

  public SalesOrderAggregatedUpdated() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getOrderStatus() {
    return this.orderStatus;
  }

  public java.util.Date getPeriod() {
    return this.period;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setOrderStatus(java.lang.String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public void setPeriod(java.util.Date period) {
    this.period = period;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getOrdersCount() {
    return this.ordersCount;
  }

  public java.math.BigDecimal getTotalQtyOrdered() {
    return this.totalQtyOrdered;
  }

  public java.math.BigDecimal getTotalQtyInvoiced() {
    return this.totalQtyInvoiced;
  }

  public java.math.BigDecimal getTotalIncomeAmount() {
    return this.totalIncomeAmount;
  }

  public java.math.BigDecimal getTotalRevenueAmount() {
    return this.totalRevenueAmount;
  }

  public java.math.BigDecimal getTotalProfitAmount() {
    return this.totalProfitAmount;
  }

  public java.math.BigDecimal getTotalInvoicedAmount() {
    return this.totalInvoicedAmount;
  }

  public java.math.BigDecimal getTotalCanceledAmount() {
    return this.totalCanceledAmount;
  }

  public java.math.BigDecimal getTotalPaidAmount() {
    return this.totalPaidAmount;
  }

  public java.math.BigDecimal getTotalRefundedAmount() {
    return this.totalRefundedAmount;
  }

  public java.math.BigDecimal getTotalTaxAmount() {
    return this.totalTaxAmount;
  }

  public java.math.BigDecimal getTotalTaxAmountActual() {
    return this.totalTaxAmountActual;
  }

  public java.math.BigDecimal getTotalShippingAmount() {
    return this.totalShippingAmount;
  }

  public java.math.BigDecimal getTotalShippingAmountActual() {
    return this.totalShippingAmountActual;
  }

  public java.math.BigDecimal getTotalDiscountAmount() {
    return this.totalDiscountAmount;
  }

  public java.math.BigDecimal getTotalDiscountAmountActual() {
    return this.totalDiscountAmountActual;
  }

  public void setOrdersCount(java.lang.Integer ordersCount) {
    this.ordersCount = ordersCount;
  }

  public void setTotalQtyOrdered(java.math.BigDecimal totalQtyOrdered) {
    this.totalQtyOrdered = totalQtyOrdered;
  }

  public void setTotalQtyInvoiced(java.math.BigDecimal totalQtyInvoiced) {
    this.totalQtyInvoiced = totalQtyInvoiced;
  }

  public void setTotalIncomeAmount(java.math.BigDecimal totalIncomeAmount) {
    this.totalIncomeAmount = totalIncomeAmount;
  }

  public void setTotalRevenueAmount(java.math.BigDecimal totalRevenueAmount) {
    this.totalRevenueAmount = totalRevenueAmount;
  }

  public void setTotalProfitAmount(java.math.BigDecimal totalProfitAmount) {
    this.totalProfitAmount = totalProfitAmount;
  }

  public void setTotalInvoicedAmount(java.math.BigDecimal totalInvoicedAmount) {
    this.totalInvoicedAmount = totalInvoicedAmount;
  }

  public void setTotalCanceledAmount(java.math.BigDecimal totalCanceledAmount) {
    this.totalCanceledAmount = totalCanceledAmount;
  }

  public void setTotalPaidAmount(java.math.BigDecimal totalPaidAmount) {
    this.totalPaidAmount = totalPaidAmount;
  }

  public void setTotalRefundedAmount(java.math.BigDecimal totalRefundedAmount) {
    this.totalRefundedAmount = totalRefundedAmount;
  }

  public void setTotalTaxAmount(java.math.BigDecimal totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  public void setTotalTaxAmountActual(java.math.BigDecimal totalTaxAmountActual) {
    this.totalTaxAmountActual = totalTaxAmountActual;
  }

  public void setTotalShippingAmount(java.math.BigDecimal totalShippingAmount) {
    this.totalShippingAmount = totalShippingAmount;
  }

  public void setTotalShippingAmountActual(java.math.BigDecimal totalShippingAmountActual) {
    this.totalShippingAmountActual = totalShippingAmountActual;
  }

  public void setTotalDiscountAmount(java.math.BigDecimal totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }

  public void setTotalDiscountAmountActual(java.math.BigDecimal totalDiscountAmountActual) {
    this.totalDiscountAmountActual = totalDiscountAmountActual;
  }
}
