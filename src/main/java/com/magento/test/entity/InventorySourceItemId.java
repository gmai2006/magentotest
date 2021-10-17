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

/** embeddable class Id for InventorySourceItem. generated on 10/16/2021 from a schema. */
public class InventorySourceItemId implements Serializable {
  private static final long serialVersionUID = 163445090558457554L;

  @Column(name = "source_item_id")
  private java.lang.Integer sourceItemId;

  @Column(name = "sku")
  private java.lang.String sku;

  @Column(name = "source_code")
  private java.lang.String sourceCode;

  /** Constructor: InventorySourceItemId. */
  public InventorySourceItemId() {}

  /**
   * Constructor: InventorySourceItemId.
   *
   * @param sourceItemId - sourceItemId.
   * @param sku - sku.
   * @param sourceCode - sourceCode.
   */
  public InventorySourceItemId(
      java.lang.Integer sourceItemId, java.lang.String sku, java.lang.String sourceCode) {
    this.sourceItemId = sourceItemId;
    this.sku = sku;
    this.sourceCode = sourceCode;
  }

  public java.lang.Integer getSourceItemId() {
    return this.sourceItemId;
  }

  public java.lang.String getSku() {
    return this.sku;
  }

  public java.lang.String getSourceCode() {
    return this.sourceCode;
  }

  public void setSourceItemId(java.lang.Integer sourceItemId) {
    this.sourceItemId = sourceItemId;
  }

  public void setSku(java.lang.String sku) {
    this.sku = sku;
  }

  public void setSourceCode(java.lang.String sourceCode) {
    this.sourceCode = sourceCode;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((sourceItemId == null) ? 0 : sourceItemId.hashCode());
    result = prime * result + ((sku == null) ? 0 : sku.hashCode());
    result = prime * result + ((sourceCode == null) ? 0 : sourceCode.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    InventorySourceItemId other = (InventorySourceItemId) obj;

    if (sourceItemId == null) {
      if (other.sourceItemId != null) return false;
    } else if (!sourceItemId.equals(other.sourceItemId)) return false;

    if (sku == null) {
      if (other.sku != null) return false;
    } else if (!sku.equals(other.sku)) return false;

    if (sourceCode == null) {
      if (other.sourceCode != null) return false;
    } else if (!sourceCode.equals(other.sourceCode)) return false;

    return true;
  }
}
