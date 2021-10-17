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

/** embeddable class Id for DirectoryCountryRegionName. generated on 10/16/2021 from a schema. */
public class DirectoryCountryRegionNameId implements Serializable {
  private static final long serialVersionUID = 163445090507184004L;

  @Column(name = "region_id")
  private java.lang.Integer regionId;

  @Column(name = "locale")
  private java.lang.String locale;

  /** Constructor: DirectoryCountryRegionNameId. */
  public DirectoryCountryRegionNameId() {}

  /**
   * Constructor: DirectoryCountryRegionNameId.
   *
   * @param regionId - regionId.
   * @param locale - locale.
   */
  public DirectoryCountryRegionNameId(java.lang.Integer regionId, java.lang.String locale) {
    this.regionId = regionId;
    this.locale = locale;
  }

  public java.lang.Integer getRegionId() {
    return this.regionId;
  }

  public java.lang.String getLocale() {
    return this.locale;
  }

  public void setRegionId(java.lang.Integer regionId) {
    this.regionId = regionId;
  }

  public void setLocale(java.lang.String locale) {
    this.locale = locale;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((regionId == null) ? 0 : regionId.hashCode());
    result = prime * result + ((locale == null) ? 0 : locale.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    DirectoryCountryRegionNameId other = (DirectoryCountryRegionNameId) obj;

    if (regionId == null) {
      if (other.regionId != null) return false;
    } else if (!regionId.equals(other.regionId)) return false;

    if (locale == null) {
      if (other.locale != null) return false;
    } else if (!locale.equals(other.locale)) return false;

    return true;
  }
}
