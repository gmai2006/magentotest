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

/** embeddable class Id for CacheTag. generated on 10/16/2021 from a schema. */
public class CacheTagId implements Serializable {
  private static final long serialVersionUID = 163445090329039696L;

  @Column(name = "cache_id")
  private java.lang.String cacheId;

  @Column(name = "tag")
  private java.lang.String tag;

  /** Constructor: CacheTagId. */
  public CacheTagId() {}

  /**
   * Constructor: CacheTagId.
   *
   * @param cacheId - cacheId.
   * @param tag - tag.
   */
  public CacheTagId(java.lang.String cacheId, java.lang.String tag) {
    this.cacheId = cacheId;
    this.tag = tag;
  }

  public java.lang.String getCacheId() {
    return this.cacheId;
  }

  public java.lang.String getTag() {
    return this.tag;
  }

  public void setCacheId(java.lang.String cacheId) {
    this.cacheId = cacheId;
  }

  public void setTag(java.lang.String tag) {
    this.tag = tag;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cacheId == null) ? 0 : cacheId.hashCode());
    result = prime * result + ((tag == null) ? 0 : tag.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CacheTagId other = (CacheTagId) obj;

    if (cacheId == null) {
      if (other.cacheId != null) return false;
    } else if (!cacheId.equals(other.cacheId)) return false;

    if (tag == null) {
      if (other.tag != null) return false;
    } else if (!tag.equals(other.tag)) return false;

    return true;
  }
}
