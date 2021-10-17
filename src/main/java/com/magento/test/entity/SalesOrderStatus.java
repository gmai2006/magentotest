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
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "sales_order_status")
public class SalesOrderStatus implements Serializable {
  private static final long serialVersionUID = 163445090658632924L;

  /** Description: status. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "status")
  private java.lang.String status;

  /** Description: label. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "label", length = 128)
  private java.lang.String label;

  public SalesOrderStatus() {}

  public java.lang.String getStatus() {
    return this.status;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public java.lang.String getLabel() {
    return this.label;
  }

  public void setLabel(java.lang.String label) {
    this.label = label;
  }
}
