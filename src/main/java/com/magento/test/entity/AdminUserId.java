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

/** embeddable class Id for AdminUser. generated on 10/16/2021 from a schema. */
public class AdminUserId implements Serializable {
  private static final long serialVersionUID = 163445090307350790L;

  @Column(name = "user_id")
  private java.lang.Integer userId;

  @Column(name = "username")
  private java.lang.String username;

  /** Constructor: AdminUserId. */
  public AdminUserId() {}

  /**
   * Constructor: AdminUserId.
   *
   * @param userId - userId.
   * @param username - username.
   */
  public AdminUserId(java.lang.Integer userId, java.lang.String username) {
    this.userId = userId;
    this.username = username;
  }

  public java.lang.Integer getUserId() {
    return this.userId;
  }

  public java.lang.String getUsername() {
    return this.username;
  }

  public void setUserId(java.lang.Integer userId) {
    this.userId = userId;
  }

  public void setUsername(java.lang.String username) {
    this.username = username;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((userId == null) ? 0 : userId.hashCode());
    result = prime * result + ((username == null) ? 0 : username.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    AdminUserId other = (AdminUserId) obj;

    if (userId == null) {
      if (other.userId != null) return false;
    } else if (!userId.equals(other.userId)) return false;

    if (username == null) {
      if (other.username != null) return false;
    } else if (!username.equals(other.username)) return false;

    return true;
  }
}
