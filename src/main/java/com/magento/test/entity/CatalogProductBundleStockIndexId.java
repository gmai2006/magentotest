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
 * embeddable class Id for CatalogProductBundleStockIndex. generated on 10/16/2021 from a schema.
 */
public class CatalogProductBundleStockIndexId implements Serializable {
  private static final long serialVersionUID = 163445090360869468L;

  @Column(name = "option_id")
  private java.lang.Integer optionId;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  @Column(name = "stock_id")
  private java.lang.Integer stockId;

  /** Constructor: CatalogProductBundleStockIndexId. */
  public CatalogProductBundleStockIndexId() {}

  /**
   * Constructor: CatalogProductBundleStockIndexId.
   *
   * @param optionId - optionId.
   * @param entityId - entityId.
   * @param websiteId - websiteId.
   * @param stockId - stockId.
   */
  public CatalogProductBundleStockIndexId(
      java.lang.Integer optionId,
      java.lang.Integer entityId,
      java.lang.Integer websiteId,
      java.lang.Integer stockId) {
    this.optionId = optionId;
    this.entityId = entityId;
    this.websiteId = websiteId;
    this.stockId = stockId;
  }

  public java.lang.Integer getOptionId() {
    return this.optionId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.Integer getStockId() {
    return this.stockId;
  }

  public void setOptionId(java.lang.Integer optionId) {
    this.optionId = optionId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setStockId(java.lang.Integer stockId) {
    this.stockId = stockId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((optionId == null) ? 0 : optionId.hashCode());
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((websiteId == null) ? 0 : websiteId.hashCode());
    result = prime * result + ((stockId == null) ? 0 : stockId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductBundleStockIndexId other = (CatalogProductBundleStockIndexId) obj;

    if (optionId == null) {
      if (other.optionId != null) return false;
    } else if (!optionId.equals(other.optionId)) return false;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (websiteId == null) {
      if (other.websiteId != null) return false;
    } else if (!websiteId.equals(other.websiteId)) return false;

    if (stockId == null) {
      if (other.stockId != null) return false;
    } else if (!stockId.equals(other.stockId)) return false;

    return true;
  }
}
