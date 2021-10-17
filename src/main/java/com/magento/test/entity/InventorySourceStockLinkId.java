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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** embeddable class Id for InventorySourceStockLink. generated on 10/16/2021 from a schema. */
public class InventorySourceStockLinkId implements Serializable {
  private static final long serialVersionUID = 163445090559620198L;

  @Column(name = "stock_id")
  private java.lang.Integer stockId;

  @Column(name = "source_code")
  private java.lang.String sourceCode;

  @Column(name = "link_id")
  private java.lang.Integer linkId;

  /** Constructor: InventorySourceStockLinkId. */
  public InventorySourceStockLinkId() {}

  /**
   * Constructor: InventorySourceStockLinkId.
   *
   * @param stockId - stockId.
   * @param sourceCode - sourceCode.
   * @param linkId - linkId.
   */
  public InventorySourceStockLinkId(
      java.lang.Integer stockId, java.lang.String sourceCode, java.lang.Integer linkId) {
    this.stockId = stockId;
    this.sourceCode = sourceCode;
    this.linkId = linkId;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((stockId == null) ? 0 : stockId.hashCode());
    result = prime * result + ((sourceCode == null) ? 0 : sourceCode.hashCode());
    result = prime * result + ((linkId == null) ? 0 : linkId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    InventorySourceStockLinkId other = (InventorySourceStockLinkId) obj;

    if (stockId == null) {
      if (other.stockId != null) return false;
    } else if (!stockId.equals(other.stockId)) return false;

    if (sourceCode == null) {
      if (other.sourceCode != null) return false;
    } else if (!sourceCode.equals(other.sourceCode)) return false;

    if (linkId == null) {
      if (other.linkId != null) return false;
    } else if (!linkId.equals(other.linkId)) return false;

    return true;
  }
}
