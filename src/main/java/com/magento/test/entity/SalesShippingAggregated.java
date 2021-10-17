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
@IdClass(SalesShippingAggregatedId.class)
@Table(name = "sales_shipping_aggregated")
public class SalesShippingAggregated implements Serializable {
  private static final long serialVersionUID = 163445090674714638L;

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
  /** Description: shipping_description. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "shipping_description")
  private java.lang.String shippingDescription;

  /** Description: orders_count. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "orders_count")
  private java.lang.Integer ordersCount;
  /** Description: total_shipping. */
  @Basic
  @Column(name = "total_shipping")
  private java.math.BigDecimal totalShipping;
  /** Description: total_shipping_actual. */
  @Basic
  @Column(name = "total_shipping_actual")
  private java.math.BigDecimal totalShippingActual;

  public SalesShippingAggregated() {}

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

  public java.lang.String getShippingDescription() {
    return this.shippingDescription;
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

  public void setShippingDescription(java.lang.String shippingDescription) {
    this.shippingDescription = shippingDescription;
  }

  public java.lang.Integer getOrdersCount() {
    return this.ordersCount;
  }

  public java.math.BigDecimal getTotalShipping() {
    return this.totalShipping;
  }

  public java.math.BigDecimal getTotalShippingActual() {
    return this.totalShippingActual;
  }

  public void setOrdersCount(java.lang.Integer ordersCount) {
    this.ordersCount = ordersCount;
  }

  public void setTotalShipping(java.math.BigDecimal totalShipping) {
    this.totalShipping = totalShipping;
  }

  public void setTotalShippingActual(java.math.BigDecimal totalShippingActual) {
    this.totalShippingActual = totalShippingActual;
  }
}
