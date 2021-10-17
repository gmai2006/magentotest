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
@Table(name = "directory_country_region")
public class DirectoryCountryRegion implements Serializable {
  private static final long serialVersionUID = 163445090506699196L;

  /** Description: region_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "region_id")
  private java.lang.Integer regionId;

  /** Description: country_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "country_id", length = 4)
  private java.lang.String countryId;
  /** Description: code. */
  @Basic
  @Column(name = "code", length = 32)
  private java.lang.String code;
  /** Description: default_name. */
  @Basic
  @Column(name = "default_name", length = 255)
  private java.lang.String defaultName;

  public DirectoryCountryRegion() {}

  public java.lang.Integer getRegionId() {
    return this.regionId;
  }

  public void setRegionId(java.lang.Integer regionId) {
    this.regionId = regionId;
  }

  public java.lang.String getCountryId() {
    return this.countryId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.String getDefaultName() {
    return this.defaultName;
  }

  public void setCountryId(java.lang.String countryId) {
    this.countryId = countryId;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setDefaultName(java.lang.String defaultName) {
    this.defaultName = defaultName;
  }
}
