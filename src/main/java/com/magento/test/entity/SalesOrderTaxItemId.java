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

/** embeddable class Id for SalesOrderTaxItem. generated on 10/16/2021 from a schema. */
public class SalesOrderTaxItemId implements Serializable {
  private static final long serialVersionUID = 163445090662398023L;

  @Column(name = "item_id")
  private java.lang.Integer itemId;

  @Column(name = "tax_item_id")
  private java.lang.Integer taxItemId;

  @Column(name = "tax_id")
  private java.lang.Integer taxId;

  /** Constructor: SalesOrderTaxItemId. */
  public SalesOrderTaxItemId() {}

  /**
   * Constructor: SalesOrderTaxItemId.
   *
   * @param itemId - itemId.
   * @param taxItemId - taxItemId.
   * @param taxId - taxId.
   */
  public SalesOrderTaxItemId(
      java.lang.Integer itemId, java.lang.Integer taxItemId, java.lang.Integer taxId) {
    this.itemId = itemId;
    this.taxItemId = taxItemId;
    this.taxId = taxId;
  }

  public java.lang.Integer getItemId() {
    return this.itemId;
  }

  public java.lang.Integer getTaxItemId() {
    return this.taxItemId;
  }

  public java.lang.Integer getTaxId() {
    return this.taxId;
  }

  public void setItemId(java.lang.Integer itemId) {
    this.itemId = itemId;
  }

  public void setTaxItemId(java.lang.Integer taxItemId) {
    this.taxItemId = taxItemId;
  }

  public void setTaxId(java.lang.Integer taxId) {
    this.taxId = taxId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
    result = prime * result + ((taxItemId == null) ? 0 : taxItemId.hashCode());
    result = prime * result + ((taxId == null) ? 0 : taxId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    SalesOrderTaxItemId other = (SalesOrderTaxItemId) obj;

    if (itemId == null) {
      if (other.itemId != null) return false;
    } else if (!itemId.equals(other.itemId)) return false;

    if (taxItemId == null) {
      if (other.taxItemId != null) return false;
    } else if (!taxItemId.equals(other.taxItemId)) return false;

    if (taxId == null) {
      if (other.taxId != null) return false;
    } else if (!taxId.equals(other.taxId)) return false;

    return true;
  }
}
