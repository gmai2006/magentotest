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
 * embeddable class Id for VertexSalesOrderItemVertexTaxCode. generated on 10/16/2021 from a schema.
 */
public class VertexSalesOrderItemVertexTaxCodeId implements Serializable {
  private static final long serialVersionUID = 163445090722950106L;

  @Column(name = "item_id")
  private java.lang.Integer itemId;

  @Column(name = "vertex_tax_code")
  private java.lang.String vertexTaxCode;

  /** Constructor: VertexSalesOrderItemVertexTaxCodeId. */
  public VertexSalesOrderItemVertexTaxCodeId() {}

  /**
   * Constructor: VertexSalesOrderItemVertexTaxCodeId.
   *
   * @param itemId - itemId.
   * @param vertexTaxCode - vertexTaxCode.
   */
  public VertexSalesOrderItemVertexTaxCodeId(
      java.lang.Integer itemId, java.lang.String vertexTaxCode) {
    this.itemId = itemId;
    this.vertexTaxCode = vertexTaxCode;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
    result = prime * result + ((vertexTaxCode == null) ? 0 : vertexTaxCode.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    VertexSalesOrderItemVertexTaxCodeId other = (VertexSalesOrderItemVertexTaxCodeId) obj;

    if (itemId == null) {
      if (other.itemId != null) return false;
    } else if (!itemId.equals(other.itemId)) return false;

    if (vertexTaxCode == null) {
      if (other.vertexTaxCode != null) return false;
    } else if (!vertexTaxCode.equals(other.vertexTaxCode)) return false;

    return true;
  }
}
