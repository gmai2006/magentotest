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
@Table(name = "customer_address_entity")
public class CustomerAddressEntity implements Serializable {
  private static final long serialVersionUID = 163445090479476930L;

  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: increment_id. */
  @Basic
  @Column(name = "increment_id", length = 50)
  private java.lang.String incrementId;
  /** Description: parent_id. */
  @Basic
  @Column(name = "parent_id")
  private java.lang.Integer parentId;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: city. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "city", length = 255)
  private java.lang.String city;
  /** Description: company. */
  @Basic
  @Column(name = "company", length = 255)
  private java.lang.String company;
  /** Description: country_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "country_id", length = 255)
  private java.lang.String countryId;
  /** Description: fax. */
  @Basic
  @Column(name = "fax", length = 255)
  private java.lang.String fax;
  /** Description: firstname. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "firstname", length = 255)
  private java.lang.String firstname;
  /** Description: lastname. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "lastname", length = 255)
  private java.lang.String lastname;
  /** Description: middlename. */
  @Basic
  @Column(name = "middlename", length = 255)
  private java.lang.String middlename;
  /** Description: postcode. */
  @Basic
  @Column(name = "postcode", length = 255)
  private java.lang.String postcode;
  /** Description: prefix. */
  @Basic
  @Column(name = "prefix", length = 40)
  private java.lang.String prefix;
  /** Description: region. */
  @Basic
  @Column(name = "region", length = 255)
  private java.lang.String region;
  /** Description: region_id. */
  @Basic
  @Column(name = "region_id")
  private java.lang.Integer regionId;
  /** Description: street. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "street", length = 0)
  private java.lang.String street;
  /** Description: suffix. */
  @Basic
  @Column(name = "suffix", length = 40)
  private java.lang.String suffix;
  /** Description: telephone. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "telephone", length = 255)
  private java.lang.String telephone;
  /** Description: vat_id. */
  @Basic
  @Column(name = "vat_id", length = 255)
  private java.lang.String vatId;
  /** Description: vat_is_valid. */
  @Basic
  @Column(name = "vat_is_valid")
  private java.lang.Integer vatIsValid;
  /** Description: vat_request_date. */
  @Basic
  @Column(name = "vat_request_date", length = 255)
  private java.lang.String vatRequestDate;
  /** Description: vat_request_id. */
  @Basic
  @Column(name = "vat_request_id", length = 255)
  private java.lang.String vatRequestId;
  /** Description: vat_request_success. */
  @Basic
  @Column(name = "vat_request_success")
  private java.lang.Integer vatRequestSuccess;

  public CustomerAddressEntity() {}

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.String getIncrementId() {
    return this.incrementId;
  }

  public java.lang.Integer getParentId() {
    return this.parentId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.lang.String getCity() {
    return this.city;
  }

  public java.lang.String getCompany() {
    return this.company;
  }

  public java.lang.String getCountryId() {
    return this.countryId;
  }

  public java.lang.String getFax() {
    return this.fax;
  }

  public java.lang.String getFirstname() {
    return this.firstname;
  }

  public java.lang.String getLastname() {
    return this.lastname;
  }

  public java.lang.String getMiddlename() {
    return this.middlename;
  }

  public java.lang.String getPostcode() {
    return this.postcode;
  }

  public java.lang.String getPrefix() {
    return this.prefix;
  }

  public java.lang.String getRegion() {
    return this.region;
  }

  public java.lang.Integer getRegionId() {
    return this.regionId;
  }

  public java.lang.String getStreet() {
    return this.street;
  }

  public java.lang.String getSuffix() {
    return this.suffix;
  }

  public java.lang.String getTelephone() {
    return this.telephone;
  }

  public java.lang.String getVatId() {
    return this.vatId;
  }

  public java.lang.Integer getVatIsValid() {
    return this.vatIsValid;
  }

  public java.lang.String getVatRequestDate() {
    return this.vatRequestDate;
  }

  public java.lang.String getVatRequestId() {
    return this.vatRequestId;
  }

  public java.lang.Integer getVatRequestSuccess() {
    return this.vatRequestSuccess;
  }

  public void setIncrementId(java.lang.String incrementId) {
    this.incrementId = incrementId;
  }

  public void setParentId(java.lang.Integer parentId) {
    this.parentId = parentId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setCity(java.lang.String city) {
    this.city = city;
  }

  public void setCompany(java.lang.String company) {
    this.company = company;
  }

  public void setCountryId(java.lang.String countryId) {
    this.countryId = countryId;
  }

  public void setFax(java.lang.String fax) {
    this.fax = fax;
  }

  public void setFirstname(java.lang.String firstname) {
    this.firstname = firstname;
  }

  public void setLastname(java.lang.String lastname) {
    this.lastname = lastname;
  }

  public void setMiddlename(java.lang.String middlename) {
    this.middlename = middlename;
  }

  public void setPostcode(java.lang.String postcode) {
    this.postcode = postcode;
  }

  public void setPrefix(java.lang.String prefix) {
    this.prefix = prefix;
  }

  public void setRegion(java.lang.String region) {
    this.region = region;
  }

  public void setRegionId(java.lang.Integer regionId) {
    this.regionId = regionId;
  }

  public void setStreet(java.lang.String street) {
    this.street = street;
  }

  public void setSuffix(java.lang.String suffix) {
    this.suffix = suffix;
  }

  public void setTelephone(java.lang.String telephone) {
    this.telephone = telephone;
  }

  public void setVatId(java.lang.String vatId) {
    this.vatId = vatId;
  }

  public void setVatIsValid(java.lang.Integer vatIsValid) {
    this.vatIsValid = vatIsValid;
  }

  public void setVatRequestDate(java.lang.String vatRequestDate) {
    this.vatRequestDate = vatRequestDate;
  }

  public void setVatRequestId(java.lang.String vatRequestId) {
    this.vatRequestId = vatRequestId;
  }

  public void setVatRequestSuccess(java.lang.Integer vatRequestSuccess) {
    this.vatRequestSuccess = vatRequestSuccess;
  }
}
