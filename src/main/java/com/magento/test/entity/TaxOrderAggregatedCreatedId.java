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

/** embeddable class Id for TaxOrderAggregatedCreated. generated on 10/16/2021 from a schema. */
public class TaxOrderAggregatedCreatedId implements Serializable {
  private static final long serialVersionUID = 163445090698380891L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "order_status")
  private java.lang.String orderStatus;

  @Column(name = "period")
  private java.util.Date period;

  @Column(name = "code")
  private java.lang.String code;

  @Column(name = "id")
  private java.lang.Integer id;

  @Column(name = "percent")
  private java.lang.Float percent;

  /** Constructor: TaxOrderAggregatedCreatedId. */
  public TaxOrderAggregatedCreatedId() {}

  /**
   * Constructor: TaxOrderAggregatedCreatedId.
   *
   * @param storeId - storeId.
   * @param orderStatus - orderStatus.
   * @param period - period.
   * @param code - code.
   * @param id - id.
   * @param percent - percent.
   */
  public TaxOrderAggregatedCreatedId(
      java.lang.Integer storeId,
      java.lang.String orderStatus,
      java.util.Date period,
      java.lang.String code,
      java.lang.Integer id,
      java.lang.Float percent) {
    this.storeId = storeId;
    this.orderStatus = orderStatus;
    this.period = period;
    this.code = code;
    this.id = id;
    this.percent = percent;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getOrderStatus() {
    return this.orderStatus;
  }

  public java.util.Date getPeriod() {
    return this.period;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public java.lang.Float getPercent() {
    return this.percent;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setOrderStatus(java.lang.String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public void setPeriod(java.util.Date period) {
    this.period = period;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public void setPercent(java.lang.Float percent) {
    this.percent = percent;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
    result = prime * result + ((period == null) ? 0 : period.hashCode());
    result = prime * result + ((code == null) ? 0 : code.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((percent == null) ? 0 : percent.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    TaxOrderAggregatedCreatedId other = (TaxOrderAggregatedCreatedId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (orderStatus == null) {
      if (other.orderStatus != null) return false;
    } else if (!orderStatus.equals(other.orderStatus)) return false;

    if (period == null) {
      if (other.period != null) return false;
    } else if (!period.equals(other.period)) return false;

    if (code == null) {
      if (other.code != null) return false;
    } else if (!code.equals(other.code)) return false;

    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;

    if (percent == null) {
      if (other.percent != null) return false;
    } else if (!percent.equals(other.percent)) return false;

    return true;
  }
}
