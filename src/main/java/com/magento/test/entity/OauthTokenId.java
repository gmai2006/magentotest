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

/** embeddable class Id for OauthToken. generated on 10/16/2021 from a schema. */
public class OauthTokenId implements Serializable {
  private static final long serialVersionUID = 163445090575980211L;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "token")
  private java.lang.String token;

  /** Constructor: OauthTokenId. */
  public OauthTokenId() {}

  /**
   * Constructor: OauthTokenId.
   *
   * @param entityId - entityId.
   * @param token - token.
   */
  public OauthTokenId(java.lang.Integer entityId, java.lang.String token) {
    this.entityId = entityId;
    this.token = token;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.String getToken() {
    return this.token;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setToken(java.lang.String token) {
    this.token = token;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((token == null) ? 0 : token.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    OauthTokenId other = (OauthTokenId) obj;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (token == null) {
      if (other.token != null) return false;
    } else if (!token.equals(other.token)) return false;

    return true;
  }
}
