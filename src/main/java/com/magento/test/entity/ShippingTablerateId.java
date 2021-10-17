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

/** embeddable class Id for ShippingTablerate. generated on 10/16/2021 from a schema. */
public class ShippingTablerateId implements Serializable {
  private static final long serialVersionUID = 163445090689674129L;

  @Column(name = "dest_zip")
  private java.lang.String destZip;

  @Column(name = "condition_value")
  private java.math.BigDecimal conditionValue;

  @Column(name = "pk")
  private java.lang.Integer pk;

  @Column(name = "dest_country_id")
  private java.lang.String destCountryId;

  @Column(name = "dest_region_id")
  private java.lang.Integer destRegionId;

  @Column(name = "condition_name")
  private java.lang.String conditionName;

  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Constructor: ShippingTablerateId. */
  public ShippingTablerateId() {}

  /**
   * Constructor: ShippingTablerateId.
   *
   * @param destZip - destZip.
   * @param conditionValue - conditionValue.
   * @param pk - pk.
   * @param destCountryId - destCountryId.
   * @param destRegionId - destRegionId.
   * @param conditionName - conditionName.
   * @param websiteId - websiteId.
   */
  public ShippingTablerateId(
      java.lang.String destZip,
      java.math.BigDecimal conditionValue,
      java.lang.Integer pk,
      java.lang.String destCountryId,
      java.lang.Integer destRegionId,
      java.lang.String conditionName,
      java.lang.Integer websiteId) {
    this.destZip = destZip;
    this.conditionValue = conditionValue;
    this.pk = pk;
    this.destCountryId = destCountryId;
    this.destRegionId = destRegionId;
    this.conditionName = conditionName;
    this.websiteId = websiteId;
  }

  public java.lang.String getDestZip() {
    return this.destZip;
  }

  public java.math.BigDecimal getConditionValue() {
    return this.conditionValue;
  }

  public java.lang.Integer getPk() {
    return this.pk;
  }

  public java.lang.String getDestCountryId() {
    return this.destCountryId;
  }

  public java.lang.Integer getDestRegionId() {
    return this.destRegionId;
  }

  public java.lang.String getConditionName() {
    return this.conditionName;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setDestZip(java.lang.String destZip) {
    this.destZip = destZip;
  }

  public void setConditionValue(java.math.BigDecimal conditionValue) {
    this.conditionValue = conditionValue;
  }

  public void setPk(java.lang.Integer pk) {
    this.pk = pk;
  }

  public void setDestCountryId(java.lang.String destCountryId) {
    this.destCountryId = destCountryId;
  }

  public void setDestRegionId(java.lang.Integer destRegionId) {
    this.destRegionId = destRegionId;
  }

  public void setConditionName(java.lang.String conditionName) {
    this.conditionName = conditionName;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((destZip == null) ? 0 : destZip.hashCode());
    result = prime * result + ((conditionValue == null) ? 0 : conditionValue.hashCode());
    result = prime * result + ((pk == null) ? 0 : pk.hashCode());
    result = prime * result + ((destCountryId == null) ? 0 : destCountryId.hashCode());
    result = prime * result + ((destRegionId == null) ? 0 : destRegionId.hashCode());
    result = prime * result + ((conditionName == null) ? 0 : conditionName.hashCode());
    result = prime * result + ((websiteId == null) ? 0 : websiteId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    ShippingTablerateId other = (ShippingTablerateId) obj;

    if (destZip == null) {
      if (other.destZip != null) return false;
    } else if (!destZip.equals(other.destZip)) return false;

    if (conditionValue == null) {
      if (other.conditionValue != null) return false;
    } else if (!conditionValue.equals(other.conditionValue)) return false;

    if (pk == null) {
      if (other.pk != null) return false;
    } else if (!pk.equals(other.pk)) return false;

    if (destCountryId == null) {
      if (other.destCountryId != null) return false;
    } else if (!destCountryId.equals(other.destCountryId)) return false;

    if (destRegionId == null) {
      if (other.destRegionId != null) return false;
    } else if (!destRegionId.equals(other.destRegionId)) return false;

    if (conditionName == null) {
      if (other.conditionName != null) return false;
    } else if (!conditionName.equals(other.conditionName)) return false;

    if (websiteId == null) {
      if (other.websiteId != null) return false;
    } else if (!websiteId.equals(other.websiteId)) return false;

    return true;
  }
}
