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
@IdClass(CataloginventoryStockItemId.class)
@Table(name = "cataloginventory_stock_item")
public class CataloginventoryStockItem implements Serializable {
  private static final long serialVersionUID = 163445090449242114L;

  /** Description: item_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "item_id")
  private java.lang.Integer itemId;
  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: stock_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "stock_id")
  private java.lang.Integer stockId;

  /** Description: qty. */
  @Basic
  @Column(name = "qty")
  private java.math.BigDecimal qty;
  /** Description: min_qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "min_qty")
  private java.math.BigDecimal minQty;
  /** Description: use_config_min_qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "use_config_min_qty")
  private java.lang.Integer useConfigMinQty;
  /** Description: is_qty_decimal. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_qty_decimal")
  private java.lang.Integer isQtyDecimal;
  /** Description: backorders. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "backorders")
  private java.lang.Integer backorders;
  /** Description: use_config_backorders. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "use_config_backorders")
  private java.lang.Integer useConfigBackorders;
  /** Description: min_sale_qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "min_sale_qty")
  private java.math.BigDecimal minSaleQty;
  /** Description: use_config_min_sale_qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "use_config_min_sale_qty")
  private java.lang.Integer useConfigMinSaleQty;
  /** Description: max_sale_qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "max_sale_qty")
  private java.math.BigDecimal maxSaleQty;
  /** Description: use_config_max_sale_qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "use_config_max_sale_qty")
  private java.lang.Integer useConfigMaxSaleQty;
  /** Description: is_in_stock. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_in_stock")
  private java.lang.Integer isInStock;
  /** Description: low_stock_date. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "low_stock_date")
  private java.sql.Timestamp lowStockDate;
  /** Description: notify_stock_qty. */
  @Basic
  @Column(name = "notify_stock_qty")
  private java.math.BigDecimal notifyStockQty;
  /** Description: use_config_notify_stock_qty. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "use_config_notify_stock_qty")
  private java.lang.Integer useConfigNotifyStockQty;
  /** Description: manage_stock. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "manage_stock")
  private java.lang.Integer manageStock;
  /** Description: use_config_manage_stock. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "use_config_manage_stock")
  private java.lang.Integer useConfigManageStock;
  /** Description: stock_status_changed_auto. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "stock_status_changed_auto")
  private java.lang.Integer stockStatusChangedAuto;
  /** Description: use_config_qty_increments. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "use_config_qty_increments")
  private java.lang.Integer useConfigQtyIncrements;
  /** Description: qty_increments. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "qty_increments")
  private java.math.BigDecimal qtyIncrements;
  /** Description: use_config_enable_qty_inc. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "use_config_enable_qty_inc")
  private java.lang.Integer useConfigEnableQtyInc;
  /** Description: enable_qty_increments. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "enable_qty_increments")
  private java.lang.Integer enableQtyIncrements;
  /** Description: is_decimal_divided. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_decimal_divided")
  private java.lang.Integer isDecimalDivided;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  public CataloginventoryStockItem() {}

  public java.lang.Integer getItemId() {
    return this.itemId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getStockId() {
    return this.stockId;
  }

  public void setItemId(java.lang.Integer itemId) {
    this.itemId = itemId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setStockId(java.lang.Integer stockId) {
    this.stockId = stockId;
  }

  public java.math.BigDecimal getQty() {
    return this.qty;
  }

  public java.math.BigDecimal getMinQty() {
    return this.minQty;
  }

  public java.lang.Integer getUseConfigMinQty() {
    return this.useConfigMinQty;
  }

  public java.lang.Integer getIsQtyDecimal() {
    return this.isQtyDecimal;
  }

  public java.lang.Integer getBackorders() {
    return this.backorders;
  }

  public java.lang.Integer getUseConfigBackorders() {
    return this.useConfigBackorders;
  }

  public java.math.BigDecimal getMinSaleQty() {
    return this.minSaleQty;
  }

  public java.lang.Integer getUseConfigMinSaleQty() {
    return this.useConfigMinSaleQty;
  }

  public java.math.BigDecimal getMaxSaleQty() {
    return this.maxSaleQty;
  }

  public java.lang.Integer getUseConfigMaxSaleQty() {
    return this.useConfigMaxSaleQty;
  }

  public java.lang.Integer getIsInStock() {
    return this.isInStock;
  }

  public java.sql.Timestamp getLowStockDate() {
    return this.lowStockDate;
  }

  public java.math.BigDecimal getNotifyStockQty() {
    return this.notifyStockQty;
  }

  public java.lang.Integer getUseConfigNotifyStockQty() {
    return this.useConfigNotifyStockQty;
  }

  public java.lang.Integer getManageStock() {
    return this.manageStock;
  }

  public java.lang.Integer getUseConfigManageStock() {
    return this.useConfigManageStock;
  }

  public java.lang.Integer getStockStatusChangedAuto() {
    return this.stockStatusChangedAuto;
  }

  public java.lang.Integer getUseConfigQtyIncrements() {
    return this.useConfigQtyIncrements;
  }

  public java.math.BigDecimal getQtyIncrements() {
    return this.qtyIncrements;
  }

  public java.lang.Integer getUseConfigEnableQtyInc() {
    return this.useConfigEnableQtyInc;
  }

  public java.lang.Integer getEnableQtyIncrements() {
    return this.enableQtyIncrements;
  }

  public java.lang.Integer getIsDecimalDivided() {
    return this.isDecimalDivided;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setQty(java.math.BigDecimal qty) {
    this.qty = qty;
  }

  public void setMinQty(java.math.BigDecimal minQty) {
    this.minQty = minQty;
  }

  public void setUseConfigMinQty(java.lang.Integer useConfigMinQty) {
    this.useConfigMinQty = useConfigMinQty;
  }

  public void setIsQtyDecimal(java.lang.Integer isQtyDecimal) {
    this.isQtyDecimal = isQtyDecimal;
  }

  public void setBackorders(java.lang.Integer backorders) {
    this.backorders = backorders;
  }

  public void setUseConfigBackorders(java.lang.Integer useConfigBackorders) {
    this.useConfigBackorders = useConfigBackorders;
  }

  public void setMinSaleQty(java.math.BigDecimal minSaleQty) {
    this.minSaleQty = minSaleQty;
  }

  public void setUseConfigMinSaleQty(java.lang.Integer useConfigMinSaleQty) {
    this.useConfigMinSaleQty = useConfigMinSaleQty;
  }

  public void setMaxSaleQty(java.math.BigDecimal maxSaleQty) {
    this.maxSaleQty = maxSaleQty;
  }

  public void setUseConfigMaxSaleQty(java.lang.Integer useConfigMaxSaleQty) {
    this.useConfigMaxSaleQty = useConfigMaxSaleQty;
  }

  public void setIsInStock(java.lang.Integer isInStock) {
    this.isInStock = isInStock;
  }

  public void setLowStockDate(java.sql.Timestamp lowStockDate) {
    this.lowStockDate = lowStockDate;
  }

  public void setNotifyStockQty(java.math.BigDecimal notifyStockQty) {
    this.notifyStockQty = notifyStockQty;
  }

  public void setUseConfigNotifyStockQty(java.lang.Integer useConfigNotifyStockQty) {
    this.useConfigNotifyStockQty = useConfigNotifyStockQty;
  }

  public void setManageStock(java.lang.Integer manageStock) {
    this.manageStock = manageStock;
  }

  public void setUseConfigManageStock(java.lang.Integer useConfigManageStock) {
    this.useConfigManageStock = useConfigManageStock;
  }

  public void setStockStatusChangedAuto(java.lang.Integer stockStatusChangedAuto) {
    this.stockStatusChangedAuto = stockStatusChangedAuto;
  }

  public void setUseConfigQtyIncrements(java.lang.Integer useConfigQtyIncrements) {
    this.useConfigQtyIncrements = useConfigQtyIncrements;
  }

  public void setQtyIncrements(java.math.BigDecimal qtyIncrements) {
    this.qtyIncrements = qtyIncrements;
  }

  public void setUseConfigEnableQtyInc(java.lang.Integer useConfigEnableQtyInc) {
    this.useConfigEnableQtyInc = useConfigEnableQtyInc;
  }

  public void setEnableQtyIncrements(java.lang.Integer enableQtyIncrements) {
    this.enableQtyIncrements = enableQtyIncrements;
  }

  public void setIsDecimalDivided(java.lang.Integer isDecimalDivided) {
    this.isDecimalDivided = isDecimalDivided;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }
}
