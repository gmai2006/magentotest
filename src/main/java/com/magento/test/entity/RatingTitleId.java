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

/** embeddable class Id for RatingTitle. generated on 10/16/2021 from a schema. */
public class RatingTitleId implements Serializable {
  private static final long serialVersionUID = 163445090608327669L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "rating_id")
  private java.lang.Integer ratingId;

  /** Constructor: RatingTitleId. */
  public RatingTitleId() {}

  /**
   * Constructor: RatingTitleId.
   *
   * @param storeId - storeId.
   * @param ratingId - ratingId.
   */
  public RatingTitleId(java.lang.Integer storeId, java.lang.Integer ratingId) {
    this.storeId = storeId;
    this.ratingId = ratingId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getRatingId() {
    return this.ratingId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setRatingId(java.lang.Integer ratingId) {
    this.ratingId = ratingId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((ratingId == null) ? 0 : ratingId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    RatingTitleId other = (RatingTitleId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (ratingId == null) {
      if (other.ratingId != null) return false;
    } else if (!ratingId.equals(other.ratingId)) return false;

    return true;
  }
}
