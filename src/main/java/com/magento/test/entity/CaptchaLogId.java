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

/** embeddable class Id for CaptchaLog. generated on 10/16/2021 from a schema. */
public class CaptchaLogId implements Serializable {
  private static final long serialVersionUID = 163445090330925997L;

  @Column(name = "type")
  private java.lang.String type;

  @Column(name = "value")
  private java.lang.String value;

  /** Constructor: CaptchaLogId. */
  public CaptchaLogId() {}

  /**
   * Constructor: CaptchaLogId.
   *
   * @param type - type.
   * @param value - value.
   */
  public CaptchaLogId(java.lang.String type, java.lang.String value) {
    this.type = type;
    this.value = value;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    result = prime * result + ((value == null) ? 0 : value.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CaptchaLogId other = (CaptchaLogId) obj;

    if (type == null) {
      if (other.type != null) return false;
    } else if (!type.equals(other.type)) return false;

    if (value == null) {
      if (other.value != null) return false;
    } else if (!value.equals(other.value)) return false;

    return true;
  }
}
