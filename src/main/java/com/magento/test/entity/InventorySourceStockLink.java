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
@IdClass(InventorySourceStockLinkId.class)
@Table(name = "inventory_source_stock_link")
public class InventorySourceStockLink implements Serializable {
  private static final long serialVersionUID = 163445090560276920L;

  /** Description: stock_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "stock_id")
  private java.lang.Integer stockId;
  /** Description: source_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "source_code")
  private java.lang.String sourceCode;
  /** Description: link_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "link_id")
  private java.lang.Integer linkId;

  /** Description: priority. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "priority")
  private java.lang.Integer priority;

  public InventorySourceStockLink() {}

  public java.lang.Integer getStockId() {
    return this.stockId;
  }

  public java.lang.String getSourceCode() {
    return this.sourceCode;
  }

  public java.lang.Integer getLinkId() {
    return this.linkId;
  }

  public void setStockId(java.lang.Integer stockId) {
    this.stockId = stockId;
  }

  public void setSourceCode(java.lang.String sourceCode) {
    this.sourceCode = sourceCode;
  }

  public void setLinkId(java.lang.Integer linkId) {
    this.linkId = linkId;
  }

  public java.lang.Integer getPriority() {
    return this.priority;
  }

  public void setPriority(java.lang.Integer priority) {
    this.priority = priority;
  }
}
