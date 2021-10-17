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

/**
 * embeddable class Id for VertexSalesCreditmemoItemInvoiceTextCode. generated on 10/16/2021 from a
 * schema.
 */
public class VertexSalesCreditmemoItemInvoiceTextCodeId implements Serializable {
  private static final long serialVersionUID = 163445090718098216L;

  @Column(name = "item_id")
  private java.lang.Integer itemId;

  @Column(name = "invoice_text_code")
  private java.lang.String invoiceTextCode;

  /** Constructor: VertexSalesCreditmemoItemInvoiceTextCodeId. */
  public VertexSalesCreditmemoItemInvoiceTextCodeId() {}

  /**
   * Constructor: VertexSalesCreditmemoItemInvoiceTextCodeId.
   *
   * @param itemId - itemId.
   * @param invoiceTextCode - invoiceTextCode.
   */
  public VertexSalesCreditmemoItemInvoiceTextCodeId(
      java.lang.Integer itemId, java.lang.String invoiceTextCode) {
    this.itemId = itemId;
    this.invoiceTextCode = invoiceTextCode;
  }

  public java.lang.Integer getItemId() {
    return this.itemId;
  }

  public java.lang.String getInvoiceTextCode() {
    return this.invoiceTextCode;
  }

  public void setItemId(java.lang.Integer itemId) {
    this.itemId = itemId;
  }

  public void setInvoiceTextCode(java.lang.String invoiceTextCode) {
    this.invoiceTextCode = invoiceTextCode;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
    result = prime * result + ((invoiceTextCode == null) ? 0 : invoiceTextCode.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    VertexSalesCreditmemoItemInvoiceTextCodeId other =
        (VertexSalesCreditmemoItemInvoiceTextCodeId) obj;

    if (itemId == null) {
      if (other.itemId != null) return false;
    } else if (!itemId.equals(other.itemId)) return false;

    if (invoiceTextCode == null) {
      if (other.invoiceTextCode != null) return false;
    } else if (!invoiceTextCode.equals(other.invoiceTextCode)) return false;

    return true;
  }
}
