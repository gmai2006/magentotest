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
@Table(name = "temando_quote_collection_point")
public class TemandoQuoteCollectionPoint implements Serializable {
  private static final long serialVersionUID = 163445090704126909L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: recipient_address_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "recipient_address_id")
  private java.lang.Integer recipientAddressId;
  /** Description: collection_point_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "collection_point_id", length = 64)
  private java.lang.String collectionPointId;
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
  /** Description: opening_hours. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "opening_hours", length = 0)
  private java.lang.String openingHours;
  /** Description: shipping_experiences. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "shipping_experiences", length = 0)
  private java.lang.String shippingExperiences;
  /** Description: selected. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "selected")
  private java.lang.Integer selected;
  /** Description: distance. */
  @Basic
  @Column(name = "distance")
  private java.lang.Integer distance;

  public TemandoQuoteCollectionPoint() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.Integer getRecipientAddressId() {
    return this.recipientAddressId;
  }

  public java.lang.String getCollectionPointId() {
    return this.collectionPointId;
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

  public java.lang.String getOpeningHours() {
    return this.openingHours;
  }

  public java.lang.String getShippingExperiences() {
    return this.shippingExperiences;
  }

  public java.lang.Integer getSelected() {
    return this.selected;
  }

  public java.lang.Integer getDistance() {
    return this.distance;
  }

  public void setRecipientAddressId(java.lang.Integer recipientAddressId) {
    this.recipientAddressId = recipientAddressId;
  }

  public void setCollectionPointId(java.lang.String collectionPointId) {
    this.collectionPointId = collectionPointId;
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

  public void setOpeningHours(java.lang.String openingHours) {
    this.openingHours = openingHours;
  }

  public void setShippingExperiences(java.lang.String shippingExperiences) {
    this.shippingExperiences = shippingExperiences;
  }

  public void setSelected(java.lang.Integer selected) {
    this.selected = selected;
  }

  public void setDistance(java.lang.Integer distance) {
    this.distance = distance;
  }
}
