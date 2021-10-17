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
@Table(name = "msp_tfa_country_codes")
public class MspTfaCountryCodes implements Serializable {
  private static final long serialVersionUID = 163445090567327787L;

  /** Description: msp_tfa_country_codes_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "msp_tfa_country_codes_id")
  private java.lang.Integer mspTfaCountryCodesId;

  /** Description: code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "code", length = 0)
  private java.lang.String code;
  /** Description: name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "name", length = 0)
  private java.lang.String name;
  /** Description: dial_code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "dial_code", length = 0)
  private java.lang.String dialCode;

  public MspTfaCountryCodes() {}

  public java.lang.Integer getMspTfaCountryCodesId() {
    return this.mspTfaCountryCodesId;
  }

  public void setMspTfaCountryCodesId(java.lang.Integer mspTfaCountryCodesId) {
    this.mspTfaCountryCodesId = mspTfaCountryCodesId;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getDialCode() {
    return this.dialCode;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setDialCode(java.lang.String dialCode) {
    this.dialCode = dialCode;
  }
}
