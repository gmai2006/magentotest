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
@IdClass(InventoryLowStockNotificationConfigurationId.class)
@Table(name = "inventory_low_stock_notification_configuration")
public class InventoryLowStockNotificationConfiguration implements Serializable {
  private static final long serialVersionUID = 163445090555482148L;

  /** Description: sku. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "sku")
  private java.lang.String sku;
  /** Description: source_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "source_code")
  private java.lang.String sourceCode;

  /** Description: notify_stock_qty. */
  @Basic
  @Column(name = "notify_stock_qty")
  private java.math.BigDecimal notifyStockQty;

  public InventoryLowStockNotificationConfiguration() {}

  public java.lang.String getSku() {
    return this.sku;
  }

  public java.lang.String getSourceCode() {
    return this.sourceCode;
  }

  public void setSku(java.lang.String sku) {
    this.sku = sku;
  }

  public void setSourceCode(java.lang.String sourceCode) {
    this.sourceCode = sourceCode;
  }

  public java.math.BigDecimal getNotifyStockQty() {
    return this.notifyStockQty;
  }

  public void setNotifyStockQty(java.math.BigDecimal notifyStockQty) {
    this.notifyStockQty = notifyStockQty;
  }
}
