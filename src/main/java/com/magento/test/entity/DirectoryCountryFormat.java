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
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(DirectoryCountryFormatId.class)
@Table(name = "directory_country_format")
public class DirectoryCountryFormat implements Serializable {
  private static final long serialVersionUID = 163445090506196714L;

  /** Description: country_format_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "country_format_id")
  private java.lang.Integer countryFormatId;
  /** Description: type. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "type")
  private java.lang.String type;
  /** Description: country_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "country_id")
  private java.lang.String countryId;

  /** Description: format. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "format", length = 0)
  private java.lang.String format;

  public DirectoryCountryFormat() {}

  public java.lang.Integer getCountryFormatId() {
    return this.countryFormatId;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public java.lang.String getCountryId() {
    return this.countryId;
  }

  public void setCountryFormatId(java.lang.Integer countryFormatId) {
    this.countryFormatId = countryFormatId;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void setCountryId(java.lang.String countryId) {
    this.countryId = countryId;
  }

  public java.lang.String getFormat() {
    return this.format;
  }

  public void setFormat(java.lang.String format) {
    this.format = format;
  }
}
