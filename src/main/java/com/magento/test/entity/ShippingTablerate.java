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
@IdClass(ShippingTablerateId.class)
@Table(name = "shipping_tablerate")
public class ShippingTablerate implements Serializable {
  private static final long serialVersionUID = 163445090690446178L;

  /** Description: dest_zip. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "dest_zip")
  private java.lang.String destZip;
  /** Description: condition_value. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "condition_value")
  private java.math.BigDecimal conditionValue;
  /** Description: pk. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "pk")
  private java.lang.Integer pk;
  /** Description: dest_country_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "dest_country_id")
  private java.lang.String destCountryId;
  /** Description: dest_region_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "dest_region_id")
  private java.lang.Integer destRegionId;
  /** Description: condition_name. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "condition_name")
  private java.lang.String conditionName;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Description: price. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "price")
  private java.math.BigDecimal price;
  /** Description: cost. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "cost")
  private java.math.BigDecimal cost;

  public ShippingTablerate() {}

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

  public java.math.BigDecimal getPrice() {
    return this.price;
  }

  public java.math.BigDecimal getCost() {
    return this.cost;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }

  public void setCost(java.math.BigDecimal cost) {
    this.cost = cost;
  }
}
