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
@Table(name = "customer_group")
public class CustomerGroup implements Serializable {
  private static final long serialVersionUID = 163445090501957700L;

  /** Description: customer_group_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "customer_group_id")
  private java.lang.Integer customerGroupId;

  /** Description: customer_group_code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "customer_group_code", length = 32)
  private java.lang.String customerGroupCode;
  /** Description: tax_class_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "tax_class_id")
  private java.lang.Integer taxClassId;

  public CustomerGroup() {}

  public java.lang.Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public void setCustomerGroupId(java.lang.Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public java.lang.String getCustomerGroupCode() {
    return this.customerGroupCode;
  }

  public java.lang.Integer getTaxClassId() {
    return this.taxClassId;
  }

  public void setCustomerGroupCode(java.lang.String customerGroupCode) {
    this.customerGroupCode = customerGroupCode;
  }

  public void setTaxClassId(java.lang.Integer taxClassId) {
    this.taxClassId = taxClassId;
  }
}
