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

/** embeddable class Id for CustomerEntity. generated on 10/16/2021 from a schema. */
public class CustomerEntityId implements Serializable {
  private static final long serialVersionUID = 163445090489813573L;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  @Column(name = "email")
  private java.lang.String email;

  /** Constructor: CustomerEntityId. */
  public CustomerEntityId() {}

  /**
   * Constructor: CustomerEntityId.
   *
   * @param entityId - entityId.
   * @param websiteId - websiteId.
   * @param email - email.
   */
  public CustomerEntityId(
      java.lang.Integer entityId, java.lang.Integer websiteId, java.lang.String email) {
    this.entityId = entityId;
    this.websiteId = websiteId;
    this.email = email;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((websiteId == null) ? 0 : websiteId.hashCode());
    result = prime * result + ((email == null) ? 0 : email.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CustomerEntityId other = (CustomerEntityId) obj;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (websiteId == null) {
      if (other.websiteId != null) return false;
    } else if (!websiteId.equals(other.websiteId)) return false;

    if (email == null) {
      if (other.email != null) return false;
    } else if (!email.equals(other.email)) return false;

    return true;
  }
}
