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

/** embeddable class Id for Rating. generated on 10/16/2021 from a schema. */
public class RatingId implements Serializable {
  private static final long serialVersionUID = 163445090603745802L;

  @Column(name = "rating_id")
  private java.lang.Integer ratingId;

  @Column(name = "rating_code")
  private java.lang.String ratingCode;

  /** Constructor: RatingId. */
  public RatingId() {}

  /**
   * Constructor: RatingId.
   *
   * @param ratingId - ratingId.
   * @param ratingCode - ratingCode.
   */
  public RatingId(java.lang.Integer ratingId, java.lang.String ratingCode) {
    this.ratingId = ratingId;
    this.ratingCode = ratingCode;
  }

  public java.lang.Integer getRatingId() {
    return this.ratingId;
  }

  public java.lang.String getRatingCode() {
    return this.ratingCode;
  }

  public void setRatingId(java.lang.Integer ratingId) {
    this.ratingId = ratingId;
  }

  public void setRatingCode(java.lang.String ratingCode) {
    this.ratingCode = ratingCode;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((ratingId == null) ? 0 : ratingId.hashCode());
    result = prime * result + ((ratingCode == null) ? 0 : ratingCode.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    RatingId other = (RatingId) obj;

    if (ratingId == null) {
      if (other.ratingId != null) return false;
    } else if (!ratingId.equals(other.ratingId)) return false;

    if (ratingCode == null) {
      if (other.ratingCode != null) return false;
    } else if (!ratingCode.equals(other.ratingCode)) return false;

    return true;
  }
}
