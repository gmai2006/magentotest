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

/** embeddable class Id for Translation. generated on 10/16/2021 from a schema. */
public class TranslationId implements Serializable {
  private static final long serialVersionUID = 163445090708368302L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "string")
  private java.lang.String string;

  @Column(name = "key_id")
  private java.lang.Integer keyId;

  @Column(name = "crc_string")
  private java.lang.Long crcString;

  @Column(name = "locale")
  private java.lang.String locale;

  /** Constructor: TranslationId. */
  public TranslationId() {}

  /**
   * Constructor: TranslationId.
   *
   * @param storeId - storeId.
   * @param string - string.
   * @param keyId - keyId.
   * @param crcString - crcString.
   * @param locale - locale.
   */
  public TranslationId(
      java.lang.Integer storeId,
      java.lang.String string,
      java.lang.Integer keyId,
      java.lang.Long crcString,
      java.lang.String locale) {
    this.storeId = storeId;
    this.string = string;
    this.keyId = keyId;
    this.crcString = crcString;
    this.locale = locale;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((string == null) ? 0 : string.hashCode());
    result = prime * result + ((keyId == null) ? 0 : keyId.hashCode());
    result = prime * result + ((crcString == null) ? 0 : crcString.hashCode());
    result = prime * result + ((locale == null) ? 0 : locale.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    TranslationId other = (TranslationId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (string == null) {
      if (other.string != null) return false;
    } else if (!string.equals(other.string)) return false;

    if (keyId == null) {
      if (other.keyId != null) return false;
    } else if (!keyId.equals(other.keyId)) return false;

    if (crcString == null) {
      if (other.crcString != null) return false;
    } else if (!crcString.equals(other.crcString)) return false;

    if (locale == null) {
      if (other.locale != null) return false;
    } else if (!locale.equals(other.locale)) return false;

    return true;
  }
}
