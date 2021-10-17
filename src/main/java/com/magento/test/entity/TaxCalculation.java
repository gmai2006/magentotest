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
@Table(name = "tax_calculation")
public class TaxCalculation implements Serializable {
  private static final long serialVersionUID = 163445090695321870L;

  /** Description: tax_calculation_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "tax_calculation_id")
  private java.lang.Integer taxCalculationId;

  /** Description: tax_calculation_rate_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "tax_calculation_rate_id")
  private java.lang.Integer taxCalculationRateId;
  /** Description: tax_calculation_rule_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "tax_calculation_rule_id")
  private java.lang.Integer taxCalculationRuleId;
  /** Description: customer_tax_class_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "customer_tax_class_id")
  private java.lang.Integer customerTaxClassId;
  /** Description: product_tax_class_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_tax_class_id")
  private java.lang.Integer productTaxClassId;

  public TaxCalculation() {}

  public java.lang.Integer getTaxCalculationId() {
    return this.taxCalculationId;
  }

  public void setTaxCalculationId(java.lang.Integer taxCalculationId) {
    this.taxCalculationId = taxCalculationId;
  }

  public java.lang.Integer getTaxCalculationRateId() {
    return this.taxCalculationRateId;
  }

  public java.lang.Integer getTaxCalculationRuleId() {
    return this.taxCalculationRuleId;
  }

  public java.lang.Integer getCustomerTaxClassId() {
    return this.customerTaxClassId;
  }

  public java.lang.Integer getProductTaxClassId() {
    return this.productTaxClassId;
  }

  public void setTaxCalculationRateId(java.lang.Integer taxCalculationRateId) {
    this.taxCalculationRateId = taxCalculationRateId;
  }

  public void setTaxCalculationRuleId(java.lang.Integer taxCalculationRuleId) {
    this.taxCalculationRuleId = taxCalculationRuleId;
  }

  public void setCustomerTaxClassId(java.lang.Integer customerTaxClassId) {
    this.customerTaxClassId = customerTaxClassId;
  }

  public void setProductTaxClassId(java.lang.Integer productTaxClassId) {
    this.productTaxClassId = productTaxClassId;
  }
}
