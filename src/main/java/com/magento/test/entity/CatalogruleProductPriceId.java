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

/** embeddable class Id for CatalogruleProductPrice. generated on 10/16/2021 from a schema. */
public class CatalogruleProductPriceId implements Serializable {
  private static final long serialVersionUID = 163445090462314663L;

  @Column(name = "rule_date")
  private java.util.Date ruleDate;

  @Column(name = "rule_product_price_id")
  private java.lang.Integer ruleProductPriceId;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  @Column(name = "customer_group_id")
  private java.lang.Integer customerGroupId;

  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Constructor: CatalogruleProductPriceId. */
  public CatalogruleProductPriceId() {}

  /**
   * Constructor: CatalogruleProductPriceId.
   *
   * @param ruleDate - ruleDate.
   * @param ruleProductPriceId - ruleProductPriceId.
   * @param productId - productId.
   * @param customerGroupId - customerGroupId.
   * @param websiteId - websiteId.
   */
  public CatalogruleProductPriceId(
      java.util.Date ruleDate,
      java.lang.Integer ruleProductPriceId,
      java.lang.Integer productId,
      java.lang.Integer customerGroupId,
      java.lang.Integer websiteId) {
    this.ruleDate = ruleDate;
    this.ruleProductPriceId = ruleProductPriceId;
    this.productId = productId;
    this.customerGroupId = customerGroupId;
    this.websiteId = websiteId;
  }

  public java.util.Date getRuleDate() {
    return this.ruleDate;
  }

  public java.lang.Integer getRuleProductPriceId() {
    return this.ruleProductPriceId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setRuleDate(java.util.Date ruleDate) {
    this.ruleDate = ruleDate;
  }

  public void setRuleProductPriceId(java.lang.Integer ruleProductPriceId) {
    this.ruleProductPriceId = ruleProductPriceId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((ruleDate == null) ? 0 : ruleDate.hashCode());
    result = prime * result + ((ruleProductPriceId == null) ? 0 : ruleProductPriceId.hashCode());
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());
    result = prime * result + ((customerGroupId == null) ? 0 : customerGroupId.hashCode());
    result = prime * result + ((websiteId == null) ? 0 : websiteId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogruleProductPriceId other = (CatalogruleProductPriceId) obj;

    if (ruleDate == null) {
      if (other.ruleDate != null) return false;
    } else if (!ruleDate.equals(other.ruleDate)) return false;

    if (ruleProductPriceId == null) {
      if (other.ruleProductPriceId != null) return false;
    } else if (!ruleProductPriceId.equals(other.ruleProductPriceId)) return false;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    if (customerGroupId == null) {
      if (other.customerGroupId != null) return false;
    } else if (!customerGroupId.equals(other.customerGroupId)) return false;

    if (websiteId == null) {
      if (other.websiteId != null) return false;
    } else if (!websiteId.equals(other.websiteId)) return false;

    return true;
  }
}
