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
@Table(name = "tax_calculation_rule")
public class TaxCalculationRule implements Serializable {
  private static final long serialVersionUID = 163445090697343998L;

  /** Description: tax_calculation_rule_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "tax_calculation_rule_id")
  private java.lang.Integer taxCalculationRuleId;

  /** Description: code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "code", length = 255)
  private java.lang.String code;
  /** Description: priority. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "priority")
  private java.lang.Integer priority;
  /** Description: position. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "position")
  private java.lang.Integer position;
  /** Description: calculate_subtotal. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "calculate_subtotal")
  private java.lang.Integer calculateSubtotal;

  public TaxCalculationRule() {}

  public java.lang.Integer getTaxCalculationRuleId() {
    return this.taxCalculationRuleId;
  }

  public void setTaxCalculationRuleId(java.lang.Integer taxCalculationRuleId) {
    this.taxCalculationRuleId = taxCalculationRuleId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.Integer getPriority() {
    return this.priority;
  }

  public java.lang.Integer getPosition() {
    return this.position;
  }

  public java.lang.Integer getCalculateSubtotal() {
    return this.calculateSubtotal;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setPriority(java.lang.Integer priority) {
    this.priority = priority;
  }

  public void setPosition(java.lang.Integer position) {
    this.position = position;
  }

  public void setCalculateSubtotal(java.lang.Integer calculateSubtotal) {
    this.calculateSubtotal = calculateSubtotal;
  }
}
