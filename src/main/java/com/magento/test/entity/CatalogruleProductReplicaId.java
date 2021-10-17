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

/** embeddable class Id for CatalogruleProductReplica. generated on 10/16/2021 from a schema. */
public class CatalogruleProductReplicaId implements Serializable {
  private static final long serialVersionUID = 163445090465776185L;

  @Column(name = "rule_id")
  private java.lang.Integer ruleId;

  @Column(name = "rule_product_id")
  private java.lang.Integer ruleProductId;

  @Column(name = "product_id")
  private java.lang.Integer productId;

  @Column(name = "to_time")
  private java.lang.Integer toTime;

  @Column(name = "from_time")
  private java.lang.Integer fromTime;

  @Column(name = "customer_group_id")
  private java.lang.Integer customerGroupId;

  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;

  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Constructor: CatalogruleProductReplicaId. */
  public CatalogruleProductReplicaId() {}

  /**
   * Constructor: CatalogruleProductReplicaId.
   *
   * @param ruleId - ruleId.
   * @param ruleProductId - ruleProductId.
   * @param productId - productId.
   * @param toTime - toTime.
   * @param fromTime - fromTime.
   * @param customerGroupId - customerGroupId.
   * @param sortOrder - sortOrder.
   * @param websiteId - websiteId.
   */
  public CatalogruleProductReplicaId(
      java.lang.Integer ruleId,
      java.lang.Integer ruleProductId,
      java.lang.Integer productId,
      java.lang.Integer toTime,
      java.lang.Integer fromTime,
      java.lang.Integer customerGroupId,
      java.lang.Integer sortOrder,
      java.lang.Integer websiteId) {
    this.ruleId = ruleId;
    this.ruleProductId = ruleProductId;
    this.productId = productId;
    this.toTime = toTime;
    this.fromTime = fromTime;
    this.customerGroupId = customerGroupId;
    this.sortOrder = sortOrder;
    this.websiteId = websiteId;
  }

  public java.lang.Integer getRuleId() {
    return this.ruleId;
  }

  public java.lang.Integer getRuleProductId() {
    return this.ruleProductId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.Integer getToTime() {
    return this.toTime;
  }

  public java.lang.Integer getFromTime() {
    return this.fromTime;
  }

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setRuleId(java.lang.Integer ruleId) {
    this.ruleId = ruleId;
  }

  public void setRuleProductId(java.lang.Integer ruleProductId) {
    this.ruleProductId = ruleProductId;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setToTime(java.lang.Integer toTime) {
    this.toTime = toTime;
  }

  public void setFromTime(java.lang.Integer fromTime) {
    this.fromTime = fromTime;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((ruleId == null) ? 0 : ruleId.hashCode());
    result = prime * result + ((ruleProductId == null) ? 0 : ruleProductId.hashCode());
    result = prime * result + ((productId == null) ? 0 : productId.hashCode());
    result = prime * result + ((toTime == null) ? 0 : toTime.hashCode());
    result = prime * result + ((fromTime == null) ? 0 : fromTime.hashCode());
    result = prime * result + ((customerGroupId == null) ? 0 : customerGroupId.hashCode());
    result = prime * result + ((sortOrder == null) ? 0 : sortOrder.hashCode());
    result = prime * result + ((websiteId == null) ? 0 : websiteId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogruleProductReplicaId other = (CatalogruleProductReplicaId) obj;

    if (ruleId == null) {
      if (other.ruleId != null) return false;
    } else if (!ruleId.equals(other.ruleId)) return false;

    if (ruleProductId == null) {
      if (other.ruleProductId != null) return false;
    } else if (!ruleProductId.equals(other.ruleProductId)) return false;

    if (productId == null) {
      if (other.productId != null) return false;
    } else if (!productId.equals(other.productId)) return false;

    if (toTime == null) {
      if (other.toTime != null) return false;
    } else if (!toTime.equals(other.toTime)) return false;

    if (fromTime == null) {
      if (other.fromTime != null) return false;
    } else if (!fromTime.equals(other.fromTime)) return false;

    if (customerGroupId == null) {
      if (other.customerGroupId != null) return false;
    } else if (!customerGroupId.equals(other.customerGroupId)) return false;

    if (sortOrder == null) {
      if (other.sortOrder != null) return false;
    } else if (!sortOrder.equals(other.sortOrder)) return false;

    if (websiteId == null) {
      if (other.websiteId != null) return false;
    } else if (!websiteId.equals(other.websiteId)) return false;

    return true;
  }
}
