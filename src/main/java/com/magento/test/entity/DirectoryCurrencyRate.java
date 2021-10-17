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
@IdClass(DirectoryCurrencyRateId.class)
@Table(name = "directory_currency_rate")
public class DirectoryCurrencyRate implements Serializable {
  private static final long serialVersionUID = 163445090508798337L;

  /** Description: currency_to. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "currency_to")
  private java.lang.String currencyTo;
  /** Description: currency_from. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "currency_from")
  private java.lang.String currencyFrom;

  /** Description: rate. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "rate")
  private java.math.BigDecimal rate;

  public DirectoryCurrencyRate() {}

  public java.lang.String getCurrencyTo() {
    return this.currencyTo;
  }

  public java.lang.String getCurrencyFrom() {
    return this.currencyFrom;
  }

  public void setCurrencyTo(java.lang.String currencyTo) {
    this.currencyTo = currencyTo;
  }

  public void setCurrencyFrom(java.lang.String currencyFrom) {
    this.currencyFrom = currencyFrom;
  }

  public java.math.BigDecimal getRate() {
    return this.rate;
  }

  public void setRate(java.math.BigDecimal rate) {
    this.rate = rate;
  }
}
