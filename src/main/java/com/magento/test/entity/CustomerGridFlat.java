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
@Table(name = "customer_grid_flat")
public class CustomerGridFlat implements Serializable {
  private static final long serialVersionUID = 163445090499773569L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: name. */
  @Basic
  @Column(name = "name", length = 0)
  private java.lang.String name;
  /** Description: email. */
  @Basic
  @Column(name = "email", length = 255)
  private java.lang.String email;
  /** Description: group_id. */
  @Basic
  @Column(name = "group_id")
  private java.lang.Integer groupId;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: website_id. */
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;
  /** Description: confirmation. */
  @Basic
  @Column(name = "confirmation", length = 255)
  private java.lang.String confirmation;
  /** Description: created_in. */
  @Basic
  @Column(name = "created_in", length = 0)
  private java.lang.String createdIn;
  /** Description: dob. */
  @Basic
  @Column(name = "dob")
  private java.util.Date dob;
  /** Description: gender. */
  @Basic
  @Column(name = "gender")
  private java.lang.Integer gender;
  /** Description: taxvat. */
  @Basic
  @Column(name = "taxvat", length = 255)
  private java.lang.String taxvat;
  /** Description: lock_expires. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "lock_expires")
  private java.sql.Timestamp lockExpires;
  /** Description: shipping_full. */
  @Basic
  @Column(name = "shipping_full", length = 0)
  private java.lang.String shippingFull;
  /** Description: billing_full. */
  @Basic
  @Column(name = "billing_full", length = 0)
  private java.lang.String billingFull;
  /** Description: billing_firstname. */
  @Basic
  @Column(name = "billing_firstname", length = 255)
  private java.lang.String billingFirstname;
  /** Description: billing_lastname. */
  @Basic
  @Column(name = "billing_lastname", length = 255)
  private java.lang.String billingLastname;
  /** Description: billing_telephone. */
  @Basic
  @Column(name = "billing_telephone", length = 255)
  private java.lang.String billingTelephone;
  /** Description: billing_postcode. */
  @Basic
  @Column(name = "billing_postcode", length = 255)
  private java.lang.String billingPostcode;
  /** Description: billing_country_id. */
  @Basic
  @Column(name = "billing_country_id", length = 255)
  private java.lang.String billingCountryId;
  /** Description: billing_region. */
  @Basic
  @Column(name = "billing_region", length = 255)
  private java.lang.String billingRegion;
  /** Description: billing_street. */
  @Basic
  @Column(name = "billing_street", length = 255)
  private java.lang.String billingStreet;
  /** Description: billing_city. */
  @Basic
  @Column(name = "billing_city", length = 255)
  private java.lang.String billingCity;
  /** Description: billing_fax. */
  @Basic
  @Column(name = "billing_fax", length = 255)
  private java.lang.String billingFax;
  /** Description: billing_vat_id. */
  @Basic
  @Column(name = "billing_vat_id", length = 255)
  private java.lang.String billingVatId;
  /** Description: billing_company. */
  @Basic
  @Column(name = "billing_company", length = 255)
  private java.lang.String billingCompany;

  public CustomerGridFlat() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.Integer getGroupId() {
    return this.groupId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.String getConfirmation() {
    return this.confirmation;
  }

  public java.lang.String getCreatedIn() {
    return this.createdIn;
  }

  public java.util.Date getDob() {
    return this.dob;
  }

  public java.lang.Integer getGender() {
    return this.gender;
  }

  public java.lang.String getTaxvat() {
    return this.taxvat;
  }

  public java.sql.Timestamp getLockExpires() {
    return this.lockExpires;
  }

  public java.lang.String getShippingFull() {
    return this.shippingFull;
  }

  public java.lang.String getBillingFull() {
    return this.billingFull;
  }

  public java.lang.String getBillingFirstname() {
    return this.billingFirstname;
  }

  public java.lang.String getBillingLastname() {
    return this.billingLastname;
  }

  public java.lang.String getBillingTelephone() {
    return this.billingTelephone;
  }

  public java.lang.String getBillingPostcode() {
    return this.billingPostcode;
  }

  public java.lang.String getBillingCountryId() {
    return this.billingCountryId;
  }

  public java.lang.String getBillingRegion() {
    return this.billingRegion;
  }

  public java.lang.String getBillingStreet() {
    return this.billingStreet;
  }

  public java.lang.String getBillingCity() {
    return this.billingCity;
  }

  public java.lang.String getBillingFax() {
    return this.billingFax;
  }

  public java.lang.String getBillingVatId() {
    return this.billingVatId;
  }

  public java.lang.String getBillingCompany() {
    return this.billingCompany;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setGroupId(java.lang.Integer groupId) {
    this.groupId = groupId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setConfirmation(java.lang.String confirmation) {
    this.confirmation = confirmation;
  }

  public void setCreatedIn(java.lang.String createdIn) {
    this.createdIn = createdIn;
  }

  public void setDob(java.util.Date dob) {
    this.dob = dob;
  }

  public void setGender(java.lang.Integer gender) {
    this.gender = gender;
  }

  public void setTaxvat(java.lang.String taxvat) {
    this.taxvat = taxvat;
  }

  public void setLockExpires(java.sql.Timestamp lockExpires) {
    this.lockExpires = lockExpires;
  }

  public void setShippingFull(java.lang.String shippingFull) {
    this.shippingFull = shippingFull;
  }

  public void setBillingFull(java.lang.String billingFull) {
    this.billingFull = billingFull;
  }

  public void setBillingFirstname(java.lang.String billingFirstname) {
    this.billingFirstname = billingFirstname;
  }

  public void setBillingLastname(java.lang.String billingLastname) {
    this.billingLastname = billingLastname;
  }

  public void setBillingTelephone(java.lang.String billingTelephone) {
    this.billingTelephone = billingTelephone;
  }

  public void setBillingPostcode(java.lang.String billingPostcode) {
    this.billingPostcode = billingPostcode;
  }

  public void setBillingCountryId(java.lang.String billingCountryId) {
    this.billingCountryId = billingCountryId;
  }

  public void setBillingRegion(java.lang.String billingRegion) {
    this.billingRegion = billingRegion;
  }

  public void setBillingStreet(java.lang.String billingStreet) {
    this.billingStreet = billingStreet;
  }

  public void setBillingCity(java.lang.String billingCity) {
    this.billingCity = billingCity;
  }

  public void setBillingFax(java.lang.String billingFax) {
    this.billingFax = billingFax;
  }

  public void setBillingVatId(java.lang.String billingVatId) {
    this.billingVatId = billingVatId;
  }

  public void setBillingCompany(java.lang.String billingCompany) {
    this.billingCompany = billingCompany;
  }
}
