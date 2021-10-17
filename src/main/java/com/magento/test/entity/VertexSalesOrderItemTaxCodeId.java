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

/** embeddable class Id for VertexSalesOrderItemTaxCode. generated on 10/16/2021 from a schema. */
public class VertexSalesOrderItemTaxCodeId implements Serializable {
  private static final long serialVersionUID = 163445090721965087L;

  @Column(name = "tax_code")
  private java.lang.String taxCode;

  @Column(name = "item_id")
  private java.lang.Integer itemId;

  /** Constructor: VertexSalesOrderItemTaxCodeId. */
  public VertexSalesOrderItemTaxCodeId() {}

  /**
   * Constructor: VertexSalesOrderItemTaxCodeId.
   *
   * @param taxCode - taxCode.
   * @param itemId - itemId.
   */
  public VertexSalesOrderItemTaxCodeId(java.lang.String taxCode, java.lang.Integer itemId) {
    this.taxCode = taxCode;
    this.itemId = itemId;
  }

  public java.lang.String getTaxCode() {
    return this.taxCode;
  }

  public java.lang.Integer getItemId() {
    return this.itemId;
  }

  public void setTaxCode(java.lang.String taxCode) {
    this.taxCode = taxCode;
  }

  public void setItemId(java.lang.Integer itemId) {
    this.itemId = itemId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((taxCode == null) ? 0 : taxCode.hashCode());
    result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    VertexSalesOrderItemTaxCodeId other = (VertexSalesOrderItemTaxCodeId) obj;

    if (taxCode == null) {
      if (other.taxCode != null) return false;
    } else if (!taxCode.equals(other.taxCode)) return false;

    if (itemId == null) {
      if (other.itemId != null) return false;
    } else if (!itemId.equals(other.itemId)) return false;

    return true;
  }
}
