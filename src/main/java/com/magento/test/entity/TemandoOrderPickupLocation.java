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
@Table(name = "temando_order_pickup_location")
public class TemandoOrderPickupLocation implements Serializable {
  private static final long serialVersionUID = 163445090703020693L;

  /** Description: recipient_address_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "recipient_address_id")
  private java.lang.Integer recipientAddressId;

  /** Description: pickup_location_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "pickup_location_id", length = 64)
  private java.lang.String pickupLocationId;
  /** Description: name. */
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: country. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "country", length = 2)
  private java.lang.String country;
  /** Description: region. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "region", length = 255)
  private java.lang.String region;
  /** Description: postcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "postcode", length = 255)
  private java.lang.String postcode;
  /** Description: city. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "city", length = 255)
  private java.lang.String city;
  /** Description: street. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "street", length = 0)
  private java.lang.String street;

  public TemandoOrderPickupLocation() {}

  public java.lang.Integer getRecipientAddressId() {
    return this.recipientAddressId;
  }

  public void setRecipientAddressId(java.lang.Integer recipientAddressId) {
    this.recipientAddressId = recipientAddressId;
  }

  public java.lang.String getPickupLocationId() {
    return this.pickupLocationId;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getCountry() {
    return this.country;
  }

  public java.lang.String getRegion() {
    return this.region;
  }

  public java.lang.String getPostcode() {
    return this.postcode;
  }

  public java.lang.String getCity() {
    return this.city;
  }

  public java.lang.String getStreet() {
    return this.street;
  }

  public void setPickupLocationId(java.lang.String pickupLocationId) {
    this.pickupLocationId = pickupLocationId;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setCountry(java.lang.String country) {
    this.country = country;
  }

  public void setRegion(java.lang.String region) {
    this.region = region;
  }

  public void setPostcode(java.lang.String postcode) {
    this.postcode = postcode;
  }

  public void setCity(java.lang.String city) {
    this.city = city;
  }

  public void setStreet(java.lang.String street) {
    this.street = street;
  }
}
