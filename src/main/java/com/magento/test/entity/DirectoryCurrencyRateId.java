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

/** embeddable class Id for DirectoryCurrencyRate. generated on 10/16/2021 from a schema. */
public class DirectoryCurrencyRateId implements Serializable {
  private static final long serialVersionUID = 163445090508119336L;

  @Column(name = "currency_to")
  private java.lang.String currencyTo;

  @Column(name = "currency_from")
  private java.lang.String currencyFrom;

  /** Constructor: DirectoryCurrencyRateId. */
  public DirectoryCurrencyRateId() {}

  /**
   * Constructor: DirectoryCurrencyRateId.
   *
   * @param currencyTo - currencyTo.
   * @param currencyFrom - currencyFrom.
   */
  public DirectoryCurrencyRateId(java.lang.String currencyTo, java.lang.String currencyFrom) {
    this.currencyTo = currencyTo;
    this.currencyFrom = currencyFrom;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((currencyTo == null) ? 0 : currencyTo.hashCode());
    result = prime * result + ((currencyFrom == null) ? 0 : currencyFrom.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    DirectoryCurrencyRateId other = (DirectoryCurrencyRateId) obj;

    if (currencyTo == null) {
      if (other.currencyTo != null) return false;
    } else if (!currencyTo.equals(other.currencyTo)) return false;

    if (currencyFrom == null) {
      if (other.currencyFrom != null) return false;
    } else if (!currencyFrom.equals(other.currencyFrom)) return false;

    return true;
  }
}
