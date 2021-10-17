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

/** embeddable class Id for SalesSequenceProfile. generated on 10/16/2021 from a schema. */
public class SalesSequenceProfileId implements Serializable {
  private static final long serialVersionUID = 163445090668545175L;

  @Column(name = "meta_id")
  private java.lang.Integer metaId;

  @Column(name = "profile_id")
  private java.lang.Integer profileId;

  @Column(name = "prefix")
  private java.lang.String prefix;

  @Column(name = "suffix")
  private java.lang.String suffix;

  /** Constructor: SalesSequenceProfileId. */
  public SalesSequenceProfileId() {}

  /**
   * Constructor: SalesSequenceProfileId.
   *
   * @param metaId - metaId.
   * @param profileId - profileId.
   * @param prefix - prefix.
   * @param suffix - suffix.
   */
  public SalesSequenceProfileId(
      java.lang.Integer metaId,
      java.lang.Integer profileId,
      java.lang.String prefix,
      java.lang.String suffix) {
    this.metaId = metaId;
    this.profileId = profileId;
    this.prefix = prefix;
    this.suffix = suffix;
  }

  public java.lang.Integer getMetaId() {
    return this.metaId;
  }

  public java.lang.Integer getProfileId() {
    return this.profileId;
  }

  public java.lang.String getPrefix() {
    return this.prefix;
  }

  public java.lang.String getSuffix() {
    return this.suffix;
  }

  public void setMetaId(java.lang.Integer metaId) {
    this.metaId = metaId;
  }

  public void setProfileId(java.lang.Integer profileId) {
    this.profileId = profileId;
  }

  public void setPrefix(java.lang.String prefix) {
    this.prefix = prefix;
  }

  public void setSuffix(java.lang.String suffix) {
    this.suffix = suffix;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((metaId == null) ? 0 : metaId.hashCode());
    result = prime * result + ((profileId == null) ? 0 : profileId.hashCode());
    result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
    result = prime * result + ((suffix == null) ? 0 : suffix.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    SalesSequenceProfileId other = (SalesSequenceProfileId) obj;

    if (metaId == null) {
      if (other.metaId != null) return false;
    } else if (!metaId.equals(other.metaId)) return false;

    if (profileId == null) {
      if (other.profileId != null) return false;
    } else if (!profileId.equals(other.profileId)) return false;

    if (prefix == null) {
      if (other.prefix != null) return false;
    } else if (!prefix.equals(other.prefix)) return false;

    if (suffix == null) {
      if (other.suffix != null) return false;
    } else if (!suffix.equals(other.suffix)) return false;

    return true;
  }
}
