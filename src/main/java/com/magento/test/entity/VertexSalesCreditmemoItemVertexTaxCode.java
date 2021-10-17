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
@IdClass(VertexSalesCreditmemoItemVertexTaxCodeId.class)
@Table(name = "vertex_sales_creditmemo_item_vertex_tax_code")
public class VertexSalesCreditmemoItemVertexTaxCode implements Serializable {
  private static final long serialVersionUID = 163445090720664707L;

  /** Description: item_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "item_id")
  private java.lang.Integer itemId;
  /** Description: vertex_tax_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "vertex_tax_code")
  private java.lang.String vertexTaxCode;

  public VertexSalesCreditmemoItemVertexTaxCode() {}

  public java.lang.Integer getItemId() {
    return this.itemId;
  }

  public java.lang.String getVertexTaxCode() {
    return this.vertexTaxCode;
  }

  public void setItemId(java.lang.Integer itemId) {
    this.itemId = itemId;
  }

  public void setVertexTaxCode(java.lang.String vertexTaxCode) {
    this.vertexTaxCode = vertexTaxCode;
  }
}
