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

/** embeddable class Id for OauthConsumer. generated on 10/16/2021 from a schema. */
public class OauthConsumerId implements Serializable {
  private static final long serialVersionUID = 163445090573654207L;

  @Column(name = "secret")
  private java.lang.String secret;

  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  @Column(name = "key")
  private java.lang.String key;

  /** Constructor: OauthConsumerId. */
  public OauthConsumerId() {}

  /**
   * Constructor: OauthConsumerId.
   *
   * @param secret - secret.
   * @param entityId - entityId.
   * @param key - key.
   */
  public OauthConsumerId(
      java.lang.String secret, java.lang.Integer entityId, java.lang.String key) {
    this.secret = secret;
    this.entityId = entityId;
    this.key = key;
  }

  public java.lang.String getSecret() {
    return this.secret;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.String getKey() {
    return this.key;
  }

  public void setSecret(java.lang.String secret) {
    this.secret = secret;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setKey(java.lang.String key) {
    this.key = key;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((secret == null) ? 0 : secret.hashCode());
    result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
    result = prime * result + ((key == null) ? 0 : key.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    OauthConsumerId other = (OauthConsumerId) obj;

    if (secret == null) {
      if (other.secret != null) return false;
    } else if (!secret.equals(other.secret)) return false;

    if (entityId == null) {
      if (other.entityId != null) return false;
    } else if (!entityId.equals(other.entityId)) return false;

    if (key == null) {
      if (other.key != null) return false;
    } else if (!key.equals(other.key)) return false;

    return true;
  }
}
