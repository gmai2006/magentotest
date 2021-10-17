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

/** embeddable class Id for SalesOrderStatusState. generated on 10/16/2021 from a schema. */
public class SalesOrderStatusStateId implements Serializable {
  private static final long serialVersionUID = 163445090660693997L;

  @Column(name = "state")
  private java.lang.String state;

  @Column(name = "status")
  private java.lang.String status;

  /** Constructor: SalesOrderStatusStateId. */
  public SalesOrderStatusStateId() {}

  /**
   * Constructor: SalesOrderStatusStateId.
   *
   * @param state - state.
   * @param status - status.
   */
  public SalesOrderStatusStateId(java.lang.String state, java.lang.String status) {
    this.state = state;
    this.status = status;
  }

  public java.lang.String getState() {
    return this.state;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public void setState(java.lang.String state) {
    this.state = state;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((state == null) ? 0 : state.hashCode());
    result = prime * result + ((status == null) ? 0 : status.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    SalesOrderStatusStateId other = (SalesOrderStatusStateId) obj;

    if (state == null) {
      if (other.state != null) return false;
    } else if (!state.equals(other.state)) return false;

    if (status == null) {
      if (other.status != null) return false;
    } else if (!status.equals(other.status)) return false;

    return true;
  }
}
