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

/** embeddable class Id for CatalogProductWebsite. generated on 10/16/2021 from a schema. */
public class CatalogProductWebsiteId implements Serializable {
  private static final long serialVersionUID = 16344509044656969L;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Constructor: CatalogProductWebsiteId. */
  public CatalogProductWebsiteId() {}

  /**
   * Constructor: CatalogProductWebsiteId.
   *
   * @param productId - productId.
   * @param websiteId - websiteId.
   */
  public CatalogProductWebsiteId(java.lang.Integer productId, java.lang.Integer websiteId) {
    this.productId = productId;
    this.websiteId = websiteId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());
    result = prime * result + ((websiteId == null) ? 0 : websiteId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogProductWebsiteId other = (CatalogProductWebsiteId) obj;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    if (websiteId == null) {
      if (other.websiteId != null) return false;
    } else if (!websiteId.equals(other.websiteId)) return false;

    return true;
  }
}
