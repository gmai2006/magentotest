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
@Table(name = "temando_collection_point_search")
public class TemandoCollectionPointSearch implements Serializable {
  private static final long serialVersionUID = 163445090701589116L;

  /** Description: shipping_address_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "shipping_address_id")
  private java.lang.Integer shippingAddressId;

  /** Description: country_id. */
  @Basic
  @Column(name = "country_id", length = 2)
  private java.lang.String countryId;
  /** Description: postcode. */
  @Basic
  @Column(name = "postcode", length = 255)
  private java.lang.String postcode;
  /** Description: pending. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "pending")
  private java.lang.Integer pending;

  public TemandoCollectionPointSearch() {}

  public java.lang.Integer getShippingAddressId() {
    return this.shippingAddressId;
  }

  public void setShippingAddressId(java.lang.Integer shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }

  public java.lang.String getCountryId() {
    return this.countryId;
  }

  public java.lang.String getPostcode() {
    return this.postcode;
  }

  public java.lang.Integer getPending() {
    return this.pending;
  }

  public void setCountryId(java.lang.String countryId) {
    this.countryId = countryId;
  }

  public void setPostcode(java.lang.String postcode) {
    this.postcode = postcode;
  }

  public void setPending(java.lang.Integer pending) {
    this.pending = pending;
  }
}
