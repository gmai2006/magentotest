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

/** embeddable class Id for PersistentSession. generated on 10/16/2021 from a schema. */
public class PersistentSessionId implements Serializable {
  private static final long serialVersionUID = 163445090583838984L;

  @Column(name = "persistent_id")
  private java.lang.Integer persistentId;

  @Column(name = "customer_id")
  private java.lang.Integer customerId;

  @Column(name = "key")
  private java.lang.String key;

  /** Constructor: PersistentSessionId. */
  public PersistentSessionId() {}

  /**
   * Constructor: PersistentSessionId.
   *
   * @param persistentId - persistentId.
   * @param customerId - customerId.
   * @param key - key.
   */
  public PersistentSessionId(
      java.lang.Integer persistentId, java.lang.Integer customerId, java.lang.String key) {
    this.persistentId = persistentId;
    this.customerId = customerId;
    this.key = key;
  }

  public java.lang.Integer getPersistentId() {
    return this.persistentId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getKey() {
    return this.key;
  }

  public void setPersistentId(java.lang.Integer persistentId) {
    this.persistentId = persistentId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setKey(java.lang.String key) {
    this.key = key;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((persistentId == null) ? 0 : persistentId.hashCode());
    result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
    result = prime * result + ((key == null) ? 0 : key.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    PersistentSessionId other = (PersistentSessionId) obj;

    if (persistentId == null) {
      if (other.persistentId != null) return false;
    } else if (!persistentId.equals(other.persistentId)) return false;

    if (customerId == null) {
      if (other.customerId != null) return false;
    } else if (!customerId.equals(other.customerId)) return false;

    if (key == null) {
      if (other.key != null) return false;
    } else if (!key.equals(other.key)) return false;

    return true;
  }
}
