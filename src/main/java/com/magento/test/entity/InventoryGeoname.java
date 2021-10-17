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
@Table(name = "inventory_geoname")
public class InventoryGeoname implements Serializable {
  private static final long serialVersionUID = 163445090554247300L;

  /** Description: default_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "default_id")
  private java.lang.String defaultId;

  /** Description: country_code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "country_code", length = 64)
  private java.lang.String countryCode;
  /** Description: postcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "postcode", length = 64)
  private java.lang.String postcode;
  /** Description: city. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "city", length = 64)
  private java.lang.String city;
  /** Description: region. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "region", length = 64)
  private java.lang.String region;
  /** Description: province. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "province", length = 64)
  private java.lang.String province;
  /** Description: latitude. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "latitude")
  private java.lang.Double latitude;
  /** Description: longitude. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "longitude")
  private java.lang.Double longitude;

  public InventoryGeoname() {}

  public java.lang.String getDefaultId() {
    return this.defaultId;
  }

  public void setDefaultId(java.lang.String defaultId) {
    this.defaultId = defaultId;
  }

  public java.lang.String getCountryCode() {
    return this.countryCode;
  }

  public java.lang.String getPostcode() {
    return this.postcode;
  }

  public java.lang.String getCity() {
    return this.city;
  }

  public java.lang.String getRegion() {
    return this.region;
  }

  public java.lang.String getProvince() {
    return this.province;
  }

  public java.lang.Double getLatitude() {
    return this.latitude;
  }

  public java.lang.Double getLongitude() {
    return this.longitude;
  }

  public void setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
  }

  public void setPostcode(java.lang.String postcode) {
    this.postcode = postcode;
  }

  public void setCity(java.lang.String city) {
    this.city = city;
  }

  public void setRegion(java.lang.String region) {
    this.region = region;
  }

  public void setProvince(java.lang.String province) {
    this.province = province;
  }

  public void setLatitude(java.lang.Double latitude) {
    this.latitude = latitude;
  }

  public void setLongitude(java.lang.Double longitude) {
    this.longitude = longitude;
  }
}
