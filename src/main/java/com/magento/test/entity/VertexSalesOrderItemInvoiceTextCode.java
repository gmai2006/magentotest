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
@IdClass(VertexSalesOrderItemInvoiceTextCodeId.class)
@Table(name = "vertex_sales_order_item_invoice_text_code")
public class VertexSalesOrderItemInvoiceTextCode implements Serializable {
  private static final long serialVersionUID = 163445090721576624L;

  /** Description: item_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "item_id")
  private java.lang.Integer itemId;
  /** Description: invoice_text_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "invoice_text_code")
  private java.lang.String invoiceTextCode;

  public VertexSalesOrderItemInvoiceTextCode() {}

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
}
