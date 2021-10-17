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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** embeddable class Id for DirectoryCountryFormat. generated on 10/16/2021 from a schema. */
public class DirectoryCountryFormatId implements Serializable {
  private static final long serialVersionUID = 163445090505418019L;

  @Column(name = "country_format_id")
  private java.lang.Integer countryFormatId;

  @Column(name = "type")
  private java.lang.String type;

  @Column(name = "country_id")
  private java.lang.String countryId;

  /** Constructor: DirectoryCountryFormatId. */
  public DirectoryCountryFormatId() {}

  /**
   * Constructor: DirectoryCountryFormatId.
   *
   * @param countryFormatId - countryFormatId.
   * @param type - type.
   * @param countryId - countryId.
   */
  public DirectoryCountryFormatId(
      java.lang.Integer countryFormatId, java.lang.String type, java.lang.String countryId) {
    this.countryFormatId = countryFormatId;
    this.type = type;
    this.countryId = countryId;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((countryFormatId == null) ? 0 : countryFormatId.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    result = prime * result + ((countryId == null) ? 0 : countryId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    DirectoryCountryFormatId other = (DirectoryCountryFormatId) obj;

    if (countryFormatId == null) {
      if (other.countryFormatId != null) return false;
    } else if (!countryFormatId.equals(other.countryFormatId)) return false;

    if (type == null) {
      if (other.type != null) return false;
    } else if (!type.equals(other.type)) return false;

    if (countryId == null) {
      if (other.countryId != null) return false;
    } else if (!countryId.equals(other.countryId)) return false;

    return true;
  }
}
