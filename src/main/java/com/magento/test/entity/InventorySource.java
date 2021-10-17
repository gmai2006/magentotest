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
@Table(name = "inventory_source")
public class InventorySource implements Serializable {
  private static final long serialVersionUID = 163445090556824443L;

  /** Description: source_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "source_code")
  private java.lang.String sourceCode;

  /** Description: name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: enabled. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "enabled")
  private java.lang.Integer enabled;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 0)
  private java.lang.String description;
  /** Description: latitude. */
  @Basic
  @Column(name = "latitude")
  private java.math.BigDecimal latitude;
  /** Description: longitude. */
  @Basic
  @Column(name = "longitude")
  private java.math.BigDecimal longitude;
  /** Description: country_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "country_id", length = 2)
  private java.lang.String countryId;
  /** Description: region_id. */
  @Basic
  @Column(name = "region_id")
  private java.lang.Integer regionId;
  /** Description: region. */
  @Basic
  @Column(name = "region", length = 255)
  private java.lang.String region;
  /** Description: city. */
  @Basic
  @Column(name = "city", length = 255)
  private java.lang.String city;
  /** Description: street. */
  @Basic
  @Column(name = "street", length = 255)
  private java.lang.String street;
  /** Description: postcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "postcode", length = 255)
  private java.lang.String postcode;
  /** Description: contact_name. */
  @Basic
  @Column(name = "contact_name", length = 255)
  private java.lang.String contactName;
  /** Description: email. */
  @Basic
  @Column(name = "email", length = 255)
  private java.lang.String email;
  /** Description: phone. */
  @Basic
  @Column(name = "phone", length = 255)
  private java.lang.String phone;
  /** Description: fax. */
  @Basic
  @Column(name = "fax", length = 255)
  private java.lang.String fax;
  /** Description: use_default_carrier_config. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "use_default_carrier_config")
  private java.lang.Integer useDefaultCarrierConfig;

  public InventorySource() {}

  public java.lang.String getSourceCode() {
    return this.sourceCode;
  }

  public void setSourceCode(java.lang.String sourceCode) {
    this.sourceCode = sourceCode;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.Integer getEnabled() {
    return this.enabled;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.math.BigDecimal getLatitude() {
    return this.latitude;
  }

  public java.math.BigDecimal getLongitude() {
    return this.longitude;
  }

  public java.lang.String getCountryId() {
    return this.countryId;
  }

  public java.lang.Integer getRegionId() {
    return this.regionId;
  }

  public java.lang.String getRegion() {
    return this.region;
  }

  public java.lang.String getCity() {
    return this.city;
  }

  public java.lang.String getStreet() {
    return this.street;
  }

  public java.lang.String getPostcode() {
    return this.postcode;
  }

  public java.lang.String getContactName() {
    return this.contactName;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.String getPhone() {
    return this.phone;
  }

  public java.lang.String getFax() {
    return this.fax;
  }

  public java.lang.Integer getUseDefaultCarrierConfig() {
    return this.useDefaultCarrierConfig;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setEnabled(java.lang.Integer enabled) {
    this.enabled = enabled;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setLatitude(java.math.BigDecimal latitude) {
    this.latitude = latitude;
  }

  public void setLongitude(java.math.BigDecimal longitude) {
    this.longitude = longitude;
  }

  public void setCountryId(java.lang.String countryId) {
    this.countryId = countryId;
  }

  public void setRegionId(java.lang.Integer regionId) {
    this.regionId = regionId;
  }

  public void setRegion(java.lang.String region) {
    this.region = region;
  }

  public void setCity(java.lang.String city) {
    this.city = city;
  }

  public void setStreet(java.lang.String street) {
    this.street = street;
  }

  public void setPostcode(java.lang.String postcode) {
    this.postcode = postcode;
  }

  public void setContactName(java.lang.String contactName) {
    this.contactName = contactName;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setPhone(java.lang.String phone) {
    this.phone = phone;
  }

  public void setFax(java.lang.String fax) {
    this.fax = fax;
  }

  public void setUseDefaultCarrierConfig(java.lang.Integer useDefaultCarrierConfig) {
    this.useDefaultCarrierConfig = useDefaultCarrierConfig;
  }
}
