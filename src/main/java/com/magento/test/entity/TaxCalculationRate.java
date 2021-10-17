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
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "tax_calculation_rate")
public class TaxCalculationRate implements Serializable {
  private static final long serialVersionUID = 163445090695880707L;

  /** Description: tax_calculation_rate_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "tax_calculation_rate_id")
  private java.lang.Integer taxCalculationRateId;

  /** Description: tax_country_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "tax_country_id", length = 2)
  private java.lang.String taxCountryId;
  /** Description: tax_region_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "tax_region_id")
  private java.lang.Integer taxRegionId;
  /** Description: tax_postcode. */
  @Basic
  @Column(name = "tax_postcode", length = 21)
  private java.lang.String taxPostcode;
  /** Description: code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "code", length = 255)
  private java.lang.String code;
  /** Description: rate. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "rate")
  private java.math.BigDecimal rate;
  /** Description: zip_is_range. */
  @Basic
  @Column(name = "zip_is_range")
  private java.lang.Integer zipIsRange;
  /** Description: zip_from. */
  @Basic
  @Column(name = "zip_from")
  private java.lang.Integer zipFrom;
  /** Description: zip_to. */
  @Basic
  @Column(name = "zip_to")
  private java.lang.Integer zipTo;

  public TaxCalculationRate() {}

  public java.lang.Integer getTaxCalculationRateId() {
    return this.taxCalculationRateId;
  }

  public void setTaxCalculationRateId(java.lang.Integer taxCalculationRateId) {
    this.taxCalculationRateId = taxCalculationRateId;
  }

  public java.lang.String getTaxCountryId() {
    return this.taxCountryId;
  }

  public java.lang.Integer getTaxRegionId() {
    return this.taxRegionId;
  }

  public java.lang.String getTaxPostcode() {
    return this.taxPostcode;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.math.BigDecimal getRate() {
    return this.rate;
  }

  public java.lang.Integer getZipIsRange() {
    return this.zipIsRange;
  }

  public java.lang.Integer getZipFrom() {
    return this.zipFrom;
  }

  public java.lang.Integer getZipTo() {
    return this.zipTo;
  }

  public void setTaxCountryId(java.lang.String taxCountryId) {
    this.taxCountryId = taxCountryId;
  }

  public void setTaxRegionId(java.lang.Integer taxRegionId) {
    this.taxRegionId = taxRegionId;
  }

  public void setTaxPostcode(java.lang.String taxPostcode) {
    this.taxPostcode = taxPostcode;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setRate(java.math.BigDecimal rate) {
    this.rate = rate;
  }

  public void setZipIsRange(java.lang.Integer zipIsRange) {
    this.zipIsRange = zipIsRange;
  }

  public void setZipFrom(java.lang.Integer zipFrom) {
    this.zipFrom = zipFrom;
  }

  public void setZipTo(java.lang.Integer zipTo) {
    this.zipTo = zipTo;
  }
}
