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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(SalesOrderStatusStateId.class)
@Table(name = "sales_order_status_state")
public class SalesOrderStatusState implements Serializable {
  private static final long serialVersionUID = 16344509066114250L;

  /** Description: state. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "state")
  private java.lang.String state;
  /** Description: status. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "status")
  private java.lang.String status;

  /** Description: is_default. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_default")
  private java.lang.Integer isDefault;
  /** Description: visible_on_front. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "visible_on_front")
  private java.lang.Integer visibleOnFront;

  public SalesOrderStatusState() {}

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

  public java.lang.Integer getIsDefault() {
    return this.isDefault;
  }

  public java.lang.Integer getVisibleOnFront() {
    return this.visibleOnFront;
  }

  public void setIsDefault(java.lang.Integer isDefault) {
    this.isDefault = isDefault;
  }

  public void setVisibleOnFront(java.lang.Integer visibleOnFront) {
    this.visibleOnFront = visibleOnFront;
  }
}
