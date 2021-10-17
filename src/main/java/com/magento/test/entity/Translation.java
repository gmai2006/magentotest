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
@IdClass(TranslationId.class)
@Table(name = "translation")
public class Translation implements Serializable {
  private static final long serialVersionUID = 163445090709485530L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: string. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "string")
  private java.lang.String string;
  /** Description: key_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "key_id")
  private java.lang.Integer keyId;
  /** Description: crc_string. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "crc_string")
  private java.lang.Long crcString;
  /** Description: locale. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "locale")
  private java.lang.String locale;

  /** Description: translate. */
  @Basic
  @Column(name = "translate", length = 255)
  private java.lang.String translate;

  public Translation() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getString() {
    return this.string;
  }

  public java.lang.Integer getKeyId() {
    return this.keyId;
  }

  public java.lang.Long getCrcString() {
    return this.crcString;
  }

  public java.lang.String getLocale() {
    return this.locale;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setString(java.lang.String string) {
    this.string = string;
  }

  public void setKeyId(java.lang.Integer keyId) {
    this.keyId = keyId;
  }

  public void setCrcString(java.lang.Long crcString) {
    this.crcString = crcString;
  }

  public void setLocale(java.lang.String locale) {
    this.locale = locale;
  }

  public java.lang.String getTranslate() {
    return this.translate;
  }

  public void setTranslate(java.lang.String translate) {
    this.translate = translate;
  }
}
