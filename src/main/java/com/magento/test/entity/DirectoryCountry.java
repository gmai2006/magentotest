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
@Table(name = "directory_country")
public class DirectoryCountry implements Serializable {
  private static final long serialVersionUID = 163445090505089828L;

  /** Description: country_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "country_id")
  private java.lang.String countryId;

  /** Description: iso2_code. */
  @Basic
  @Column(name = "iso2_code", length = 2)
  private java.lang.String iso2Code;
  /** Description: iso3_code. */
  @Basic
  @Column(name = "iso3_code", length = 3)
  private java.lang.String iso3Code;

  public DirectoryCountry() {}

  public java.lang.String getCountryId() {
    return this.countryId;
  }

  public void setCountryId(java.lang.String countryId) {
    this.countryId = countryId;
  }

  public java.lang.String getIso2Code() {
    return this.iso2Code;
  }

  public java.lang.String getIso3Code() {
    return this.iso3Code;
  }

  public void setIso2Code(java.lang.String iso2Code) {
    this.iso2Code = iso2Code;
  }

  public void setIso3Code(java.lang.String iso3Code) {
    this.iso3Code = iso3Code;
  }
}
