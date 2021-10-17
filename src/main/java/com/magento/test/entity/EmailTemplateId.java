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

/** embeddable class Id for EmailTemplate. generated on 10/16/2021 from a schema. */
public class EmailTemplateId implements Serializable {
  private static final long serialVersionUID = 163445090546679332L;

  @Column(name = "template_id")
  private java.lang.Integer templateId;

  @Column(name = "template_code")
  private java.lang.String templateCode;

  /** Constructor: EmailTemplateId. */
  public EmailTemplateId() {}

  /**
   * Constructor: EmailTemplateId.
   *
   * @param templateId - templateId.
   * @param templateCode - templateCode.
   */
  public EmailTemplateId(java.lang.Integer templateId, java.lang.String templateCode) {
    this.templateId = templateId;
    this.templateCode = templateCode;
  }

  public java.lang.Integer getTemplateId() {
    return this.templateId;
  }

  public java.lang.String getTemplateCode() {
    return this.templateCode;
  }

  public void setTemplateId(java.lang.Integer templateId) {
    this.templateId = templateId;
  }

  public void setTemplateCode(java.lang.String templateCode) {
    this.templateCode = templateCode;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((templateId == null) ? 0 : templateId.hashCode());
    result = prime * result + ((templateCode == null) ? 0 : templateCode.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    EmailTemplateId other = (EmailTemplateId) obj;

    if (templateId == null) {
      if (other.templateId != null) return false;
    } else if (!templateId.equals(other.templateId)) return false;

    if (templateCode == null) {
      if (other.templateCode != null) return false;
    } else if (!templateCode.equals(other.templateCode)) return false;

    return true;
  }
}
